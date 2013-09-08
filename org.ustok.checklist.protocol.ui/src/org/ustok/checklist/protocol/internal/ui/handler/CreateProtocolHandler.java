/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.handler;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.ustok.checklist.cfg.checklist.Model;
import org.ustok.checklist.core.io.ChecklistIoFactory;
import org.ustok.checklist.core.io.DslFileReader;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.protocol.core.model.ProtocolModelFactory;
import org.ustok.checklist.protocol.internal.ui.PlatformConstants;
import org.ustok.checklist.protocol.internal.ui.edit.ProtocolEditingDomainProvider;
import org.ustok.checklist.protocol.internal.ui.util.ResourceUtil;
import org.ustok.checklist.protocol.ui.ChecklistProtocolUIActivator;

/**
 * Handler to create new protocol files.
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public class CreateProtocolHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent pEvent) throws ExecutionException {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			Object firstElement = sel.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile checklistFile = (IFile) firstElement;
				String name = ResourceUtil.extractName(checklistFile);

				IContainer folder = checklistFile.getParent();
				IFile protocolFile = folder.getFile(new Path(name + ".protocol"));
				if (protocolFile.exists()) {
					String message = "There already is a protocol named \"" + protocolFile.getName() + "\" in this folder.";
					MessageDialog.openError(null, "Create Protocol", message);
				}

				try {
					doCreateProtocolForChecklist(protocolFile, checklistFile);
					doOpenInEditor(protocolFile);
				} catch (Exception ex) {
					ILog log = ChecklistProtocolUIActivator.getDefault().getLog();
					String message = "Error creating \"" + protocolFile.getName() + "\".";
					log.log(new Status(IStatus.ERROR, ChecklistProtocolUIActivator.bundleID(), message, ex));
				}
			}

		}
		return null;
	}

	private void doCreateProtocolForChecklist(IFile pProtocolFile, IFile pChecklistFile) throws IOException, CoreException {
		DslFileReader reader = ChecklistIoFactory.INSTANCE.createDslReader();
		Model checklist = reader.readTextFile(pChecklistFile);

		ProtocolModelFactory factory = new ProtocolModelFactory();
		final Protocol protocol = factory.createProtocol(checklist);

		TransactionalEditingDomain domain = ProtocolEditingDomainProvider.getDomain();
		final Resource res = domain.getResourceSet().createResource(URI.createURI(pProtocolFile.getFullPath().toString()));
		domain.getCommandStack().execute(new ChangeCommand(res) {
			@Override
			protected void doExecute() {
				res.getContents().add(protocol);
			}
		});
		res.save(null);
	}

	private void doOpenInEditor(IFile pProtocolFile) {
		IFileEditorInput input = new FileEditorInput(pProtocolFile);
		try {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			page.openEditor(input, PlatformConstants.EXTENSION_EDITOR_PROTOCOL);
		} catch (PartInitException exInit) {
			ILog log = ChecklistProtocolUIActivator.getDefault().getLog();
			String message = "Error opening \"" + pProtocolFile.getName() + "\" in its editor";
			log.log(new Status(IStatus.ERROR, ChecklistProtocolUIActivator.bundleID(), message, exInit));
		}
	}

}

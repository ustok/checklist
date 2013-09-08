/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.internal.io;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.ustok.checklist.core.io.DslFileReader;

/**
 * DSL file reader.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class DslFileReaderImpl implements DslFileReader {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends EObject> T readTextFile(IFile pFile) throws IOException, CoreException {

		Assert.isNotNull(pFile);

		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(pFile.getLocationURI().toString()), true);
		return (T) resource.getContents().get(0);
	}
}

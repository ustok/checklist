/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.internal.io;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.ustok.checklist.core.io.EmfFileWriter;

/**
 * Implementation for {@link EmfFileWriter}.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class EmfFileWriterImpl implements EmfFileWriter {

	@Override
	public void write(EObject pModel, IFile pFile) throws IOException {
		Assert.isNotNull(pModel);
		Assert.isNotNull(pFile);

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(pFile.getFullPath().toString(), true);
		Resource resource = resourceSet.createResource(uri);

		resource.getContents().add(pModel);
		resource.save(Collections.emptyMap());
	}

}

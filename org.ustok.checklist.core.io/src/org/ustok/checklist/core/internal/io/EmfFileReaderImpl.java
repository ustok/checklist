/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.internal.io;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.ustok.checklist.core.io.EmfFileReader;

/**
 * Implementation for {@link EmfFileReader}.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class EmfFileReaderImpl implements EmfFileReader {

	@Override
	public EObject read(IFile pFile) {
		Assert.isNotNull(pFile);

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(pFile.getFullPath().toString(), true);
		Resource ecoreResource = resourceSet.getResource(uri, true);

		return ecoreResource.getContents().get(0);
	}
}

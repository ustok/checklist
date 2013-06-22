/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.io;

import org.ustok.checklist.core.internal.io.EmfFileReaderImpl;
import org.ustok.checklist.core.internal.io.EmfFileWriterImpl;

/**
 * IO factory for EMF - workspace file - handling.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public interface EmfFileIoFactory {

	/**
	 * Factory instance.
	 */
	public static final EmfFileIoFactory INSTANCE = new EmfFileIoFactory() {

		@Override
		public EmfFileWriter createWriter() {
			return new EmfFileWriterImpl();
		}

		@Override
		public EmfFileReader createReader() {
			return new EmfFileReaderImpl();
		}
	};

	/**
	 * Creates a new reader.
	 * 
	 * @return new reader. Never <code>null</code>.
	 */
	public EmfFileReader createReader();

	/**
	 * Creates a new writer.
	 * 
	 * @return new reader. Never <code>null</code>.
	 */
	public EmfFileWriter createWriter();

}

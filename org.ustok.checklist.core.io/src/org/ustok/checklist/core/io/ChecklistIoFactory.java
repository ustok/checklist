/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.io;

import org.ustok.checklist.core.internal.io.DslFileReaderImpl;
import org.ustok.checklist.core.internal.io.EmfFileReaderImpl;
import org.ustok.checklist.core.internal.io.EmfFileWriterImpl;

/**
 * IO factory for EMF - workspace file - handling. Supports XMI and XText based text files.
 * <p>
 * Clients use the {@link #INSTANCE} of the factory.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public interface ChecklistIoFactory {

	/**
	 * Default instance of the Checklist I/O factoyr.
	 */
	public static final ChecklistIoFactory INSTANCE = new ChecklistIoFactory() {

		@Override
		public EmfFileWriter createWriter() {
			return new EmfFileWriterImpl();
		}

		@Override
		public EmfFileReader createReader() {
			return new EmfFileReaderImpl();
		}

		@Override
		public DslFileReader createDslReader() {
			return new DslFileReaderImpl();
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

	/**
	 * Creates a new DSL reader.
	 * 
	 * @return new dsl reader. Never <code>null</code>.
	 */
	public DslFileReader createDslReader();

}

/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.core.export;

import java.io.StringWriter;

import org.ustok.checklist.cfg.checklist.Step;
import org.ustok.checklist.cfg.checklist.StepType;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.Status;

/**
 * Default exporter for Protocol models.
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public class DefaultProtocolExporter {

	/**
	 * Returns the exported protocol text.
	 * 
	 * @param pProtocol
	 *        protocol to export.
	 * @return text. <code>null</code> if protocol is <code>null</code>.
	 */
	public String export(Protocol pProtocol) {
		if (pProtocol != null) {
			StringWriter writer = new StringWriter();
			writeLn(writer, 0, "Protocol", false);
			writeLn(writer, 0, "========", false);

			for (ProtocolNode node : pProtocol.getNodes()) {
				writeNode(writer, node, 0);
			}

			return writer.toString();
		}
		return null;
	}

	private void writeNode(StringWriter pWriter, ProtocolNode pNode, int pOffset) {
		Step step = pNode.getStep();

		String status = pNode.getStatus().getName();
		if (step.getType() == StepType.CONTAINER && pNode.getStatus() == Status.SKIPPED) {
			status = "NO";
		}

		writeLn(pWriter, pOffset, step.getTitle() + ": " + status, true);

		final int nextOffset = pOffset + 4;

		if (pNode.getInfo() != null && pNode.getInfo().length() > 0) {
			writeLn(pWriter, nextOffset, "Notes: " + pNode.getInfo(), false);
		}

		if (step.getType() == StepType.CONTAINER && pNode.getStatus() == Status.OK) {
			for (ProtocolNode child : pNode.getChildren()) {
				writeNode(pWriter, child, nextOffset);
			}
		}
	}

	private void writeLn(StringWriter pWriter, int pOffset, String pText, boolean pStartWithMinus) {
		for (int i = 1; i <= pOffset; i++) {
			pWriter.write(" ");
		}
		String txt = pText + "\n";

		if (pStartWithMinus) {
			txt = "- " + txt;
		}

		pWriter.write(txt);
	}

}

/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.core.model;

import org.eclipse.core.runtime.Assert;
import org.ustok.checklist.cfg.checklist.Model;
import org.ustok.checklist.cfg.checklist.Step;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolFactory;
import org.ustok.checklist.core.model.protocol.ProtocolNode;

/**
 * Factory to create the default models.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class ProtocolModelFactory {

	/**
	 * Creates a new protocol model for the given checklist model.
	 * 
	 * @param pModel
	 *        the checklist model to use. Cannot be <code>null</code>.
	 * @return default model. Never <code>null</code>.
	 */
	public Protocol createProtocol(Model pModel) {
		Assert.isNotNull(pModel, "Checklist model cannot be null.");

		Protocol protocol = ProtocolFactory.eINSTANCE.createProtocol();
		protocol.setChecklistModel(pModel);

		for (Step step : pModel.getSteps()) {
			ProtocolNode node = ProtocolFactory.eINSTANCE.createProtocolNode();
			node.setStep(step);
			protocol.getNodes().add(node);

			for (Step subStep : step.getChildren()) {
				ProtocolNode subNode = ProtocolFactory.eINSTANCE.createProtocolNode();
				subNode.setStep(subStep);
				node.getChildren().add(subNode);
			}
		}

		return protocol;
	}

}

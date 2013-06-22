/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui;

import org.ustok.checklist.model.checklistcfg.CLCfg;
import org.ustok.checklist.model.checklistcfg.CLNode;
import org.ustok.checklist.model.checklistcfg.ChecklistcfgFactory;
import org.ustok.checklist.model.protocol.Protocol;
import org.ustok.checklist.model.protocol.ProtocolFactory;
import org.ustok.checklist.model.protocol.ProtocolNode;

/**
 * Factory to create the default models.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class DefaultModelFactory {

	/**
	 * Creates the default model.
	 * 
	 * @return new default model. Never <code>null</code>.
	 */
	public Protocol create() {
		Protocol newModel = ProtocolFactory.eINSTANCE.createProtocol();
		CLCfg cfg = createCfg();
		newModel.setCfgModel(cfg);

		ProtocolNode rootNode = ProtocolFactory.eINSTANCE.createProtocolNode();
		CLNode cfgRoot = cfg.getRoot();
		rootNode.setNode(cfgRoot);
		newModel.setRoot(rootNode);

		ProtocolNode node1 = ProtocolFactory.eINSTANCE.createProtocolNode();
		CLNode cfgNode1 = cfgRoot.getChildren().get(0);
		node1.setNode(cfgNode1);
		rootNode.getChildren().add(node1);

		return newModel;
	}

	/**
	 * Creates the default cfg model.
	 * 
	 * @return new default cfg model. Never <code>null</code>.
	 */
	public CLCfg createCfg() {
		CLCfg cfg = ChecklistcfgFactory.eINSTANCE.createCLCfg();
		cfg.setRoot(ChecklistcfgFactory.eINSTANCE.createCLNode());

		CLNode node = ChecklistcfgFactory.eINSTANCE.createCLNode();
		node.setText("A checklist entry");
		node.setDescription("This is a sample checklist entry.");

		cfg.getRoot().getChildren().add(node);

		return cfg;
	}

}

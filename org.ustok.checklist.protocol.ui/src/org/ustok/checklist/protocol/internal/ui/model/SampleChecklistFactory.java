/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.model;

import org.ustok.checklist.cfg.checklist.ChecklistFactory;
import org.ustok.checklist.cfg.checklist.Model;
import org.ustok.checklist.cfg.checklist.Step;
import org.ustok.checklist.cfg.checklist.StepType;
import org.ustok.checklist.cfg.checklist.Title;

/**
 * Creates a sample checklist model.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class SampleChecklistFactory {

	/**
	 * Creates a sample checklist model.
	 * 
	 * @return sample checklist model. Never <code>null</code>.
	 */
	public Model createSampleChecklist() {
		Model model = ChecklistFactory.eINSTANCE.createModel();

		Title title = ChecklistFactory.eINSTANCE.createTitle();
		title.setTitle("Welcome to the checklist protocols.");

		model.setTitle(title);

		model.getSteps().add(
				createStep("clickOK", StepType.SIMPLE, "Click OK to let this step pass.",
						"If you click OK, the corresponding step will be considered to be passed."));

		model.getSteps()
				.add(createStep("clickFail", StepType.SIMPLE, "Click 'Failed' to indicate there's a problem with this step.",
						"Great! Now, some steps cannot be finished successfully. Click 'Failed' to indicate that there's a problem with this step."));

		model.getSteps()
				.add(createStep(
						"clickSkipped",
						StepType.SIMPLE,
						"Click 'Skipped' to mark this step as 'unprocessed'.",
						"You're doing very well at protocols! Now, sometimes you cannot clearly specify whether a step is passed or failed. Sometimes, you might want to skip a step completely. You can click 'Skipped' for those steps."));

		model.getSteps()
				.add(createStep("addNote", StepType.SIMPLE, "Add a note.",
						"Adding some notes can be a good thing to make unclear things clearer. Try adding some notes. It's fun!"));

		model.getSteps().add(
				createStep("done", StepType.SIMPLE, "You did it!",
						"You're a real protocol-pro now! Congratulations! And have fun using protocols!"));

		return model;
	}

	private Step createStep(String pId, StepType pStepType, String pTitle, String pDescription) {
		return createStep((Step) null, pId, pStepType, pTitle, pDescription);
	}

	private Step createStep(Step pParent, String pId, StepType pStepType, String pTitle, String pDescription) {
		Step step = ChecklistFactory.eINSTANCE.createStep();
		step.setStepId(pId);
		step.setType(pStepType);
		step.setTitle(pTitle);
		step.setDescription(pDescription);

		if (pParent != null) {
			pParent.getChildren().add(step);
		}

		return step;
	}

}

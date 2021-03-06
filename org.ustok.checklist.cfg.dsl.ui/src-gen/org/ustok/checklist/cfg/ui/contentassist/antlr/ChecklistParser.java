/*
* generated by Xtext
*/
package org.ustok.checklist.cfg.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.ustok.checklist.cfg.services.ChecklistGrammarAccess;

public class ChecklistParser extends AbstractContentAssistParser {
	
	@Inject
	private ChecklistGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ustok.checklist.cfg.ui.contentassist.antlr.internal.InternalChecklistParser createParser() {
		org.ustok.checklist.cfg.ui.contentassist.antlr.internal.InternalChecklistParser result = new org.ustok.checklist.cfg.ui.contentassist.antlr.internal.InternalChecklistParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStepTypeAccess().getAlternatives(), "rule__StepType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTitleAccess().getGroup(), "rule__Title__Group__0");
					put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
					put(grammarAccess.getStepAccess().getGroup_7(), "rule__Step__Group_7__0");
					put(grammarAccess.getStepAccess().getGroup_8(), "rule__Step__Group_8__0");
					put(grammarAccess.getModelAccess().getTitleAssignment_0(), "rule__Model__TitleAssignment_0");
					put(grammarAccess.getModelAccess().getStepsAssignment_1(), "rule__Model__StepsAssignment_1");
					put(grammarAccess.getTitleAccess().getTitleAssignment_1(), "rule__Title__TitleAssignment_1");
					put(grammarAccess.getStepAccess().getStepIdAssignment_1(), "rule__Step__StepIdAssignment_1");
					put(grammarAccess.getStepAccess().getTypeAssignment_4(), "rule__Step__TypeAssignment_4");
					put(grammarAccess.getStepAccess().getTitleAssignment_6(), "rule__Step__TitleAssignment_6");
					put(grammarAccess.getStepAccess().getDescriptionAssignment_7_1(), "rule__Step__DescriptionAssignment_7_1");
					put(grammarAccess.getStepAccess().getChildrenAssignment_8_2(), "rule__Step__ChildrenAssignment_8_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ustok.checklist.cfg.ui.contentassist.antlr.internal.InternalChecklistParser typedParser = (org.ustok.checklist.cfg.ui.contentassist.antlr.internal.InternalChecklistParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ChecklistGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ChecklistGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

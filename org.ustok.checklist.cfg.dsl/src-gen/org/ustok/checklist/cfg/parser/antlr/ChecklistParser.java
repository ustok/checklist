/*
* generated by Xtext
*/
package org.ustok.checklist.cfg.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.ustok.checklist.cfg.services.ChecklistGrammarAccess;

public class ChecklistParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ChecklistGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.ustok.checklist.cfg.parser.antlr.internal.InternalChecklistParser createParser(XtextTokenStream stream) {
		return new org.ustok.checklist.cfg.parser.antlr.internal.InternalChecklistParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ChecklistGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ChecklistGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

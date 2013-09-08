package org.ustok.checklist.cfg.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ustok.checklist.cfg.services.ChecklistGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChecklistParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title:'", "';'", "'step:'", "'{'", "'type:'", "'description:'", "'children:'", "'}'", "'simple'", "'container'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalChecklistParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChecklistParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChecklistParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g"; }



     	private ChecklistGrammarAccess grammarAccess;
     	
        public InternalChecklistParser(TokenStream input, ChecklistGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ChecklistGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:80:28: ( ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_steps_1_0= ruleStep ) )* ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:81:1: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_steps_1_0= ruleStep ) )* )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:81:1: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_steps_1_0= ruleStep ) )* )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:81:2: ( (lv_title_0_0= ruleTitle ) ) ( (lv_steps_1_0= ruleStep ) )*
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:81:2: ( (lv_title_0_0= ruleTitle ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:82:1: (lv_title_0_0= ruleTitle )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:82:1: (lv_title_0_0= ruleTitle )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:83:3: lv_title_0_0= ruleTitle
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getTitleTitleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTitle_in_ruleModel131);
            lv_title_0_0=ruleTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_0_0, 
                    		"Title");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:99:2: ( (lv_steps_1_0= ruleStep ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:100:1: (lv_steps_1_0= ruleStep )
            	    {
            	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:100:1: (lv_steps_1_0= ruleStep )
            	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:101:3: lv_steps_1_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStepsStepParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleModel152);
            	    lv_steps_1_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_1_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTitle"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:125:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:126:2: (iv_ruleTitle= ruleTitle EOF )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:127:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle189);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:134:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:137:28: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:138:1: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:138:1: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:138:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTitle236); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
                
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:142:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:143:1: (lv_title_1_0= RULE_STRING )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:143:1: (lv_title_1_0= RULE_STRING )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:144:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitle253); 

            			newLeafNode(lv_title_1_0, grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTitleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTitle270); 

                	newLeafNode(otherlv_2, grammarAccess.getTitleAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleStep"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:172:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:173:2: (iv_ruleStep= ruleStep EOF )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:174:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep306);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:181:1: ruleStep returns [EObject current=null] : (otherlv_0= 'step:' ( (lv_stepId_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleStepType ) ) otherlv_5= 'title:' ( (lv_title_6_0= RULE_STRING ) ) (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stepId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_children_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:184:28: ( (otherlv_0= 'step:' ( (lv_stepId_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleStepType ) ) otherlv_5= 'title:' ( (lv_title_6_0= RULE_STRING ) ) (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:185:1: (otherlv_0= 'step:' ( (lv_stepId_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleStepType ) ) otherlv_5= 'title:' ( (lv_title_6_0= RULE_STRING ) ) (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:185:1: (otherlv_0= 'step:' ( (lv_stepId_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleStepType ) ) otherlv_5= 'title:' ( (lv_title_6_0= RULE_STRING ) ) (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:185:3: otherlv_0= 'step:' ( (lv_stepId_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleStepType ) ) otherlv_5= 'title:' ( (lv_title_6_0= RULE_STRING ) ) (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleStep353); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:189:1: ( (lv_stepId_1_0= RULE_ID ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:190:1: (lv_stepId_1_0= RULE_ID )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:190:1: (lv_stepId_1_0= RULE_ID )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:191:3: lv_stepId_1_0= RULE_ID
            {
            lv_stepId_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep370); 

            			newLeafNode(lv_stepId_1_0, grammarAccess.getStepAccess().getStepIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"stepId",
                    		lv_stepId_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleStep387); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStep399); 

                	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getTypeKeyword_3());
                
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:215:1: ( (lv_type_4_0= ruleStepType ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:216:1: (lv_type_4_0= ruleStepType )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:216:1: (lv_type_4_0= ruleStepType )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:217:3: lv_type_4_0= ruleStepType
            {
             
            	        newCompositeNode(grammarAccess.getStepAccess().getTypeStepTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStepType_in_ruleStep420);
            lv_type_4_0=ruleStepType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"StepType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleStep432); 

                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getTitleKeyword_5());
                
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:237:1: ( (lv_title_6_0= RULE_STRING ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:238:1: (lv_title_6_0= RULE_STRING )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:238:1: (lv_title_6_0= RULE_STRING )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:239:3: lv_title_6_0= RULE_STRING
            {
            lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep449); 

            			newLeafNode(lv_title_6_0, grammarAccess.getStepAccess().getTitleSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:255:2: (otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:255:4: otherlv_7= 'description:' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleStep467); 

                        	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getDescriptionKeyword_7_0());
                        
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:259:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:260:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:260:1: (lv_description_8_0= RULE_STRING )
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:261:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep484); 

                    			newLeafNode(lv_description_8_0, grammarAccess.getStepAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:277:4: (otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:277:6: otherlv_9= 'children:' otherlv_10= '{' ( (lv_children_11_0= ruleStep ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleStep504); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getChildrenKeyword_8_0());
                        
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleStep516); 

                        	newLeafNode(otherlv_10, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:285:1: ( (lv_children_11_0= ruleStep ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:286:1: (lv_children_11_0= ruleStep )
                    	    {
                    	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:286:1: (lv_children_11_0= ruleStep )
                    	    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:287:3: lv_children_11_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStepAccess().getChildrenStepParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleStep537);
                    	    lv_children_11_0=ruleStep();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStepRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_11_0, 
                    	            		"Step");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleStep550); 

                        	newLeafNode(otherlv_12, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleStep564); 

                	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleStepType"
    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:319:1: ruleStepType returns [Enumerator current=null] : ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'container' ) ) ;
    public final Enumerator ruleStepType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:321:28: ( ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'container' ) ) )
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:322:1: ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'container' ) )
            {
            // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:322:1: ( (enumLiteral_0= 'simple' ) | (enumLiteral_1= 'container' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:322:2: (enumLiteral_0= 'simple' )
                    {
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:322:2: (enumLiteral_0= 'simple' )
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:322:4: enumLiteral_0= 'simple'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleStepType614); 

                            current = grammarAccess.getStepTypeAccess().getSimpleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStepTypeAccess().getSimpleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:328:6: (enumLiteral_1= 'container' )
                    {
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:328:6: (enumLiteral_1= 'container' )
                    // ../org.ustok.checklist.cfg.dsl/src-gen/org/ustok/checklist/cfg/parser/antlr/internal/InternalChecklist.g:328:8: enumLiteral_1= 'container'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleStepType631); 

                            current = grammarAccess.getStepTypeAccess().getContainerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStepTypeAccess().getContainerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleModel131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleModel152 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTitle236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitle253 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTitle270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStep353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStep387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStep399 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleStepType_in_ruleStep420 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStep432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep449 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_16_in_ruleStep467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep484 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStep504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStep516 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleStep537 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleStep550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStep564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStepType614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStepType631 = new BitSet(new long[]{0x0000000000000002L});

}
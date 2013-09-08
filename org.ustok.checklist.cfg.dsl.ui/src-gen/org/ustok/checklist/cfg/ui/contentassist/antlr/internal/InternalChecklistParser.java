package org.ustok.checklist.cfg.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.ustok.checklist.cfg.services.ChecklistGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChecklistParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'simple'", "'container'", "'title:'", "';'", "'step:'", "'{'", "'type:'", "'}'", "'description:'", "'children:'"
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
    public String getGrammarFileName() { return "../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g"; }


     
     	private ChecklistGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ChecklistGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:61:1: ( ruleModel EOF )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:76:1: ( rule__Model__Group__0 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTitle"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:88:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:89:1: ( ruleTitle EOF )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:90:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle121);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:97:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:101:2: ( ( ( rule__Title__Group__0 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:102:1: ( ( rule__Title__Group__0 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:102:1: ( ( rule__Title__Group__0 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:103:1: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:104:1: ( rule__Title__Group__0 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:104:2: rule__Title__Group__0
            {
            pushFollow(FOLLOW_rule__Title__Group__0_in_ruleTitle154);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleStep"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:116:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:117:1: ( ruleStep EOF )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:118:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep181);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:125:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:129:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:130:1: ( ( rule__Step__Group__0 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:130:1: ( ( rule__Step__Group__0 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:131:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:132:1: ( rule__Step__Group__0 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:132:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep214);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "ruleStepType"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:145:1: ruleStepType : ( ( rule__StepType__Alternatives ) ) ;
    public final void ruleStepType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:149:1: ( ( ( rule__StepType__Alternatives ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:150:1: ( ( rule__StepType__Alternatives ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:150:1: ( ( rule__StepType__Alternatives ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:151:1: ( rule__StepType__Alternatives )
            {
             before(grammarAccess.getStepTypeAccess().getAlternatives()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:152:1: ( rule__StepType__Alternatives )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:152:2: rule__StepType__Alternatives
            {
            pushFollow(FOLLOW_rule__StepType__Alternatives_in_ruleStepType251);
            rule__StepType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepType"


    // $ANTLR start "rule__StepType__Alternatives"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:163:1: rule__StepType__Alternatives : ( ( ( 'simple' ) ) | ( ( 'container' ) ) );
    public final void rule__StepType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:167:1: ( ( ( 'simple' ) ) | ( ( 'container' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:168:1: ( ( 'simple' ) )
                    {
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:168:1: ( ( 'simple' ) )
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:169:1: ( 'simple' )
                    {
                     before(grammarAccess.getStepTypeAccess().getSimpleEnumLiteralDeclaration_0()); 
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:170:1: ( 'simple' )
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:170:3: 'simple'
                    {
                    match(input,11,FOLLOW_11_in_rule__StepType__Alternatives287); 

                    }

                     after(grammarAccess.getStepTypeAccess().getSimpleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:175:6: ( ( 'container' ) )
                    {
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:175:6: ( ( 'container' ) )
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:176:1: ( 'container' )
                    {
                     before(grammarAccess.getStepTypeAccess().getContainerEnumLiteralDeclaration_1()); 
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:177:1: ( 'container' )
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:177:3: 'container'
                    {
                    match(input,12,FOLLOW_12_in_rule__StepType__Alternatives308); 

                    }

                     after(grammarAccess.getStepTypeAccess().getContainerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:189:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:193:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:194:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0341);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0344);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:201:1: rule__Model__Group__0__Impl : ( ( rule__Model__TitleAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:205:1: ( ( ( rule__Model__TitleAssignment_0 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:206:1: ( ( rule__Model__TitleAssignment_0 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:206:1: ( ( rule__Model__TitleAssignment_0 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:207:1: ( rule__Model__TitleAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getTitleAssignment_0()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:208:1: ( rule__Model__TitleAssignment_0 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:208:2: rule__Model__TitleAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__TitleAssignment_0_in_rule__Model__Group__0__Impl371);
            rule__Model__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:218:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:222:1: ( rule__Model__Group__1__Impl )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:223:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1401);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:229:1: rule__Model__Group__1__Impl : ( ( rule__Model__StepsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:233:1: ( ( ( rule__Model__StepsAssignment_1 )* ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:234:1: ( ( rule__Model__StepsAssignment_1 )* )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:234:1: ( ( rule__Model__StepsAssignment_1 )* )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:235:1: ( rule__Model__StepsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getStepsAssignment_1()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:236:1: ( rule__Model__StepsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:236:2: rule__Model__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__StepsAssignment_1_in_rule__Model__Group__1__Impl428);
            	    rule__Model__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStepsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:250:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:254:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:255:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__0463);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Title__Group__1_in_rule__Title__Group__0466);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:262:1: rule__Title__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:266:1: ( ( 'title:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:267:1: ( 'title:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:267:1: ( 'title:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:268:1: 'title:'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Title__Group__0__Impl494); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:281:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:285:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:286:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__1525);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Title__Group__2_in_rule__Title__Group__1528);
            rule__Title__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:293:1: rule__Title__Group__1__Impl : ( ( rule__Title__TitleAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:297:1: ( ( ( rule__Title__TitleAssignment_1 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:298:1: ( ( rule__Title__TitleAssignment_1 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:298:1: ( ( rule__Title__TitleAssignment_1 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:299:1: ( rule__Title__TitleAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getTitleAssignment_1()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:300:1: ( rule__Title__TitleAssignment_1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:300:2: rule__Title__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Title__TitleAssignment_1_in_rule__Title__Group__1__Impl555);
            rule__Title__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:310:1: rule__Title__Group__2 : rule__Title__Group__2__Impl ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:314:1: ( rule__Title__Group__2__Impl )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:315:2: rule__Title__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Title__Group__2__Impl_in_rule__Title__Group__2585);
            rule__Title__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:321:1: rule__Title__Group__2__Impl : ( ';' ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:325:1: ( ( ';' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:326:1: ( ';' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:326:1: ( ';' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:327:1: ';'
            {
             before(grammarAccess.getTitleAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Title__Group__2__Impl613); 
             after(grammarAccess.getTitleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:346:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:350:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:351:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__0650);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__0653);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:358:1: rule__Step__Group__0__Impl : ( 'step:' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:362:1: ( ( 'step:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:363:1: ( 'step:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:363:1: ( 'step:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:364:1: 'step:'
            {
             before(grammarAccess.getStepAccess().getStepKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Step__Group__0__Impl681); 
             after(grammarAccess.getStepAccess().getStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:377:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:381:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:382:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__1712);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__1715);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:389:1: rule__Step__Group__1__Impl : ( ( rule__Step__StepIdAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:393:1: ( ( ( rule__Step__StepIdAssignment_1 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:394:1: ( ( rule__Step__StepIdAssignment_1 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:394:1: ( ( rule__Step__StepIdAssignment_1 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:395:1: ( rule__Step__StepIdAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getStepIdAssignment_1()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:396:1: ( rule__Step__StepIdAssignment_1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:396:2: rule__Step__StepIdAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__StepIdAssignment_1_in_rule__Step__Group__1__Impl742);
            rule__Step__StepIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getStepIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:406:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:410:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:411:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__2772);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__3_in_rule__Step__Group__2775);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:418:1: rule__Step__Group__2__Impl : ( '{' ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:422:1: ( ( '{' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:423:1: ( '{' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:423:1: ( '{' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:424:1: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Step__Group__2__Impl803); 
             after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:437:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:441:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:442:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__3834);
            rule__Step__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__4_in_rule__Step__Group__3837);
            rule__Step__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:449:1: rule__Step__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:453:1: ( ( 'type:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:454:1: ( 'type:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:454:1: ( 'type:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:455:1: 'type:'
            {
             before(grammarAccess.getStepAccess().getTypeKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Step__Group__3__Impl865); 
             after(grammarAccess.getStepAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__4"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:468:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:472:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:473:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_rule__Step__Group__4__Impl_in_rule__Step__Group__4896);
            rule__Step__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__5_in_rule__Step__Group__4899);
            rule__Step__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:480:1: rule__Step__Group__4__Impl : ( ( rule__Step__TypeAssignment_4 ) ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:484:1: ( ( ( rule__Step__TypeAssignment_4 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:485:1: ( ( rule__Step__TypeAssignment_4 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:485:1: ( ( rule__Step__TypeAssignment_4 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:486:1: ( rule__Step__TypeAssignment_4 )
            {
             before(grammarAccess.getStepAccess().getTypeAssignment_4()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:487:1: ( rule__Step__TypeAssignment_4 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:487:2: rule__Step__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Step__TypeAssignment_4_in_rule__Step__Group__4__Impl926);
            rule__Step__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:497:1: rule__Step__Group__5 : rule__Step__Group__5__Impl rule__Step__Group__6 ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:501:1: ( rule__Step__Group__5__Impl rule__Step__Group__6 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:502:2: rule__Step__Group__5__Impl rule__Step__Group__6
            {
            pushFollow(FOLLOW_rule__Step__Group__5__Impl_in_rule__Step__Group__5956);
            rule__Step__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__6_in_rule__Step__Group__5959);
            rule__Step__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:509:1: rule__Step__Group__5__Impl : ( 'title:' ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:513:1: ( ( 'title:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:514:1: ( 'title:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:514:1: ( 'title:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:515:1: 'title:'
            {
             before(grammarAccess.getStepAccess().getTitleKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Step__Group__5__Impl987); 
             after(grammarAccess.getStepAccess().getTitleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__6"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:528:1: rule__Step__Group__6 : rule__Step__Group__6__Impl rule__Step__Group__7 ;
    public final void rule__Step__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:532:1: ( rule__Step__Group__6__Impl rule__Step__Group__7 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:533:2: rule__Step__Group__6__Impl rule__Step__Group__7
            {
            pushFollow(FOLLOW_rule__Step__Group__6__Impl_in_rule__Step__Group__61018);
            rule__Step__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__7_in_rule__Step__Group__61021);
            rule__Step__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6"


    // $ANTLR start "rule__Step__Group__6__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:540:1: rule__Step__Group__6__Impl : ( ( rule__Step__TitleAssignment_6 ) ) ;
    public final void rule__Step__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:544:1: ( ( ( rule__Step__TitleAssignment_6 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:545:1: ( ( rule__Step__TitleAssignment_6 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:545:1: ( ( rule__Step__TitleAssignment_6 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:546:1: ( rule__Step__TitleAssignment_6 )
            {
             before(grammarAccess.getStepAccess().getTitleAssignment_6()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:547:1: ( rule__Step__TitleAssignment_6 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:547:2: rule__Step__TitleAssignment_6
            {
            pushFollow(FOLLOW_rule__Step__TitleAssignment_6_in_rule__Step__Group__6__Impl1048);
            rule__Step__TitleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTitleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__6__Impl"


    // $ANTLR start "rule__Step__Group__7"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:557:1: rule__Step__Group__7 : rule__Step__Group__7__Impl rule__Step__Group__8 ;
    public final void rule__Step__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:561:1: ( rule__Step__Group__7__Impl rule__Step__Group__8 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:562:2: rule__Step__Group__7__Impl rule__Step__Group__8
            {
            pushFollow(FOLLOW_rule__Step__Group__7__Impl_in_rule__Step__Group__71078);
            rule__Step__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__8_in_rule__Step__Group__71081);
            rule__Step__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7"


    // $ANTLR start "rule__Step__Group__7__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:569:1: rule__Step__Group__7__Impl : ( ( rule__Step__Group_7__0 )? ) ;
    public final void rule__Step__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:573:1: ( ( ( rule__Step__Group_7__0 )? ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:574:1: ( ( rule__Step__Group_7__0 )? )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:574:1: ( ( rule__Step__Group_7__0 )? )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:575:1: ( rule__Step__Group_7__0 )?
            {
             before(grammarAccess.getStepAccess().getGroup_7()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:576:1: ( rule__Step__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:576:2: rule__Step__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_7__0_in_rule__Step__Group__7__Impl1108);
                    rule__Step__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__7__Impl"


    // $ANTLR start "rule__Step__Group__8"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:586:1: rule__Step__Group__8 : rule__Step__Group__8__Impl rule__Step__Group__9 ;
    public final void rule__Step__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:590:1: ( rule__Step__Group__8__Impl rule__Step__Group__9 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:591:2: rule__Step__Group__8__Impl rule__Step__Group__9
            {
            pushFollow(FOLLOW_rule__Step__Group__8__Impl_in_rule__Step__Group__81139);
            rule__Step__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__9_in_rule__Step__Group__81142);
            rule__Step__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8"


    // $ANTLR start "rule__Step__Group__8__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:598:1: rule__Step__Group__8__Impl : ( ( rule__Step__Group_8__0 )? ) ;
    public final void rule__Step__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:602:1: ( ( ( rule__Step__Group_8__0 )? ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:603:1: ( ( rule__Step__Group_8__0 )? )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:603:1: ( ( rule__Step__Group_8__0 )? )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:604:1: ( rule__Step__Group_8__0 )?
            {
             before(grammarAccess.getStepAccess().getGroup_8()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:605:1: ( rule__Step__Group_8__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:605:2: rule__Step__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Step__Group_8__0_in_rule__Step__Group__8__Impl1169);
                    rule__Step__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__8__Impl"


    // $ANTLR start "rule__Step__Group__9"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:615:1: rule__Step__Group__9 : rule__Step__Group__9__Impl ;
    public final void rule__Step__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:619:1: ( rule__Step__Group__9__Impl )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:620:2: rule__Step__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__9__Impl_in_rule__Step__Group__91200);
            rule__Step__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__9"


    // $ANTLR start "rule__Step__Group__9__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:626:1: rule__Step__Group__9__Impl : ( '}' ) ;
    public final void rule__Step__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:630:1: ( ( '}' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:631:1: ( '}' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:631:1: ( '}' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:632:1: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Step__Group__9__Impl1228); 
             after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__9__Impl"


    // $ANTLR start "rule__Step__Group_7__0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:665:1: rule__Step__Group_7__0 : rule__Step__Group_7__0__Impl rule__Step__Group_7__1 ;
    public final void rule__Step__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:669:1: ( rule__Step__Group_7__0__Impl rule__Step__Group_7__1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:670:2: rule__Step__Group_7__0__Impl rule__Step__Group_7__1
            {
            pushFollow(FOLLOW_rule__Step__Group_7__0__Impl_in_rule__Step__Group_7__01279);
            rule__Step__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_7__1_in_rule__Step__Group_7__01282);
            rule__Step__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_7__0"


    // $ANTLR start "rule__Step__Group_7__0__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:677:1: rule__Step__Group_7__0__Impl : ( 'description:' ) ;
    public final void rule__Step__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:681:1: ( ( 'description:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:682:1: ( 'description:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:682:1: ( 'description:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:683:1: 'description:'
            {
             before(grammarAccess.getStepAccess().getDescriptionKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Step__Group_7__0__Impl1310); 
             after(grammarAccess.getStepAccess().getDescriptionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_7__0__Impl"


    // $ANTLR start "rule__Step__Group_7__1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:696:1: rule__Step__Group_7__1 : rule__Step__Group_7__1__Impl ;
    public final void rule__Step__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:700:1: ( rule__Step__Group_7__1__Impl )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:701:2: rule__Step__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_7__1__Impl_in_rule__Step__Group_7__11341);
            rule__Step__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_7__1"


    // $ANTLR start "rule__Step__Group_7__1__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:707:1: rule__Step__Group_7__1__Impl : ( ( rule__Step__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Step__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:711:1: ( ( ( rule__Step__DescriptionAssignment_7_1 ) ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:712:1: ( ( rule__Step__DescriptionAssignment_7_1 ) )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:712:1: ( ( rule__Step__DescriptionAssignment_7_1 ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:713:1: ( rule__Step__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getStepAccess().getDescriptionAssignment_7_1()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:714:1: ( rule__Step__DescriptionAssignment_7_1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:714:2: rule__Step__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Step__DescriptionAssignment_7_1_in_rule__Step__Group_7__1__Impl1368);
            rule__Step__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getDescriptionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_7__1__Impl"


    // $ANTLR start "rule__Step__Group_8__0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:728:1: rule__Step__Group_8__0 : rule__Step__Group_8__0__Impl rule__Step__Group_8__1 ;
    public final void rule__Step__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:732:1: ( rule__Step__Group_8__0__Impl rule__Step__Group_8__1 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:733:2: rule__Step__Group_8__0__Impl rule__Step__Group_8__1
            {
            pushFollow(FOLLOW_rule__Step__Group_8__0__Impl_in_rule__Step__Group_8__01402);
            rule__Step__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_8__1_in_rule__Step__Group_8__01405);
            rule__Step__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__0"


    // $ANTLR start "rule__Step__Group_8__0__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:740:1: rule__Step__Group_8__0__Impl : ( 'children:' ) ;
    public final void rule__Step__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:744:1: ( ( 'children:' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:745:1: ( 'children:' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:745:1: ( 'children:' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:746:1: 'children:'
            {
             before(grammarAccess.getStepAccess().getChildrenKeyword_8_0()); 
            match(input,20,FOLLOW_20_in_rule__Step__Group_8__0__Impl1433); 
             after(grammarAccess.getStepAccess().getChildrenKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__0__Impl"


    // $ANTLR start "rule__Step__Group_8__1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:759:1: rule__Step__Group_8__1 : rule__Step__Group_8__1__Impl rule__Step__Group_8__2 ;
    public final void rule__Step__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:763:1: ( rule__Step__Group_8__1__Impl rule__Step__Group_8__2 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:764:2: rule__Step__Group_8__1__Impl rule__Step__Group_8__2
            {
            pushFollow(FOLLOW_rule__Step__Group_8__1__Impl_in_rule__Step__Group_8__11464);
            rule__Step__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_8__2_in_rule__Step__Group_8__11467);
            rule__Step__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__1"


    // $ANTLR start "rule__Step__Group_8__1__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:771:1: rule__Step__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Step__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:775:1: ( ( '{' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:776:1: ( '{' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:776:1: ( '{' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:777:1: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,16,FOLLOW_16_in_rule__Step__Group_8__1__Impl1495); 
             after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__1__Impl"


    // $ANTLR start "rule__Step__Group_8__2"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:790:1: rule__Step__Group_8__2 : rule__Step__Group_8__2__Impl rule__Step__Group_8__3 ;
    public final void rule__Step__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:794:1: ( rule__Step__Group_8__2__Impl rule__Step__Group_8__3 )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:795:2: rule__Step__Group_8__2__Impl rule__Step__Group_8__3
            {
            pushFollow(FOLLOW_rule__Step__Group_8__2__Impl_in_rule__Step__Group_8__21526);
            rule__Step__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group_8__3_in_rule__Step__Group_8__21529);
            rule__Step__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__2"


    // $ANTLR start "rule__Step__Group_8__2__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:802:1: rule__Step__Group_8__2__Impl : ( ( rule__Step__ChildrenAssignment_8_2 )* ) ;
    public final void rule__Step__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:806:1: ( ( ( rule__Step__ChildrenAssignment_8_2 )* ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:807:1: ( ( rule__Step__ChildrenAssignment_8_2 )* )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:807:1: ( ( rule__Step__ChildrenAssignment_8_2 )* )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:808:1: ( rule__Step__ChildrenAssignment_8_2 )*
            {
             before(grammarAccess.getStepAccess().getChildrenAssignment_8_2()); 
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:809:1: ( rule__Step__ChildrenAssignment_8_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:809:2: rule__Step__ChildrenAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Step__ChildrenAssignment_8_2_in_rule__Step__Group_8__2__Impl1556);
            	    rule__Step__ChildrenAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getChildrenAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__2__Impl"


    // $ANTLR start "rule__Step__Group_8__3"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:819:1: rule__Step__Group_8__3 : rule__Step__Group_8__3__Impl ;
    public final void rule__Step__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:823:1: ( rule__Step__Group_8__3__Impl )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:824:2: rule__Step__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group_8__3__Impl_in_rule__Step__Group_8__31587);
            rule__Step__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__3"


    // $ANTLR start "rule__Step__Group_8__3__Impl"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:830:1: rule__Step__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Step__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:834:1: ( ( '}' ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:835:1: ( '}' )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:835:1: ( '}' )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:836:1: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,18,FOLLOW_18_in_rule__Step__Group_8__3__Impl1615); 
             after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_8__3__Impl"


    // $ANTLR start "rule__Model__TitleAssignment_0"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:858:1: rule__Model__TitleAssignment_0 : ( ruleTitle ) ;
    public final void rule__Model__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:862:1: ( ( ruleTitle ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:863:1: ( ruleTitle )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:863:1: ( ruleTitle )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:864:1: ruleTitle
            {
             before(grammarAccess.getModelAccess().getTitleTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Model__TitleAssignment_01659);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTitleTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TitleAssignment_0"


    // $ANTLR start "rule__Model__StepsAssignment_1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:873:1: rule__Model__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Model__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:877:1: ( ( ruleStep ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:878:1: ( ruleStep )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:878:1: ( ruleStep )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:879:1: ruleStep
            {
             before(grammarAccess.getModelAccess().getStepsStepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Model__StepsAssignment_11690);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStepsStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StepsAssignment_1"


    // $ANTLR start "rule__Title__TitleAssignment_1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:888:1: rule__Title__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Title__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:892:1: ( ( RULE_STRING ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:893:1: ( RULE_STRING )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:893:1: ( RULE_STRING )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:894:1: RULE_STRING
            {
             before(grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Title__TitleAssignment_11721); 
             after(grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__TitleAssignment_1"


    // $ANTLR start "rule__Step__StepIdAssignment_1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:903:1: rule__Step__StepIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Step__StepIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:907:1: ( ( RULE_ID ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:908:1: ( RULE_ID )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:908:1: ( RULE_ID )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:909:1: RULE_ID
            {
             before(grammarAccess.getStepAccess().getStepIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Step__StepIdAssignment_11752); 
             after(grammarAccess.getStepAccess().getStepIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__StepIdAssignment_1"


    // $ANTLR start "rule__Step__TypeAssignment_4"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:918:1: rule__Step__TypeAssignment_4 : ( ruleStepType ) ;
    public final void rule__Step__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:922:1: ( ( ruleStepType ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:923:1: ( ruleStepType )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:923:1: ( ruleStepType )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:924:1: ruleStepType
            {
             before(grammarAccess.getStepAccess().getTypeStepTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStepType_in_rule__Step__TypeAssignment_41783);
            ruleStepType();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTypeStepTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TypeAssignment_4"


    // $ANTLR start "rule__Step__TitleAssignment_6"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:933:1: rule__Step__TitleAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Step__TitleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:937:1: ( ( RULE_STRING ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:938:1: ( RULE_STRING )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:938:1: ( RULE_STRING )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:939:1: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getTitleSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Step__TitleAssignment_61814); 
             after(grammarAccess.getStepAccess().getTitleSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TitleAssignment_6"


    // $ANTLR start "rule__Step__DescriptionAssignment_7_1"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:948:1: rule__Step__DescriptionAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Step__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:952:1: ( ( RULE_STRING ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:953:1: ( RULE_STRING )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:953:1: ( RULE_STRING )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:954:1: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Step__DescriptionAssignment_7_11845); 
             after(grammarAccess.getStepAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__DescriptionAssignment_7_1"


    // $ANTLR start "rule__Step__ChildrenAssignment_8_2"
    // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:963:1: rule__Step__ChildrenAssignment_8_2 : ( ruleStep ) ;
    public final void rule__Step__ChildrenAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:967:1: ( ( ruleStep ) )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:968:1: ( ruleStep )
            {
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:968:1: ( ruleStep )
            // ../org.ustok.checklist.cfg.dsl.ui/src-gen/org/ustok/checklist/cfg/ui/contentassist/antlr/internal/InternalChecklist.g:969:1: ruleStep
            {
             before(grammarAccess.getStepAccess().getChildrenStepParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Step__ChildrenAssignment_8_21876);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepAccess().getChildrenStepParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ChildrenAssignment_8_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__0_in_ruleTitle154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepType__Alternatives_in_ruleStepType251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StepType__Alternatives287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StepType__Alternatives308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0341 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TitleAssignment_0_in_rule__Model__Group__0__Impl371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StepsAssignment_1_in_rule__Model__Group__1__Impl428 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__0463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Title__Group__1_in_rule__Title__Group__0466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Title__Group__0__Impl494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__1525 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Title__Group__2_in_rule__Title__Group__1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__TitleAssignment_1_in_rule__Title__Group__1__Impl555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__2__Impl_in_rule__Title__Group__2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Title__Group__2__Impl613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__0650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__0653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Step__Group__0__Impl681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__1712 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__StepIdAssignment_1_in_rule__Step__Group__1__Impl742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__2772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Step__Group__3_in_rule__Step__Group__2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Step__Group__2__Impl803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__3834 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Step__Group__4_in_rule__Step__Group__3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Step__Group__3__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__4__Impl_in_rule__Step__Group__4896 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Step__Group__5_in_rule__Step__Group__4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__TypeAssignment_4_in_rule__Step__Group__4__Impl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__5__Impl_in_rule__Step__Group__5956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group__6_in_rule__Step__Group__5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Step__Group__5__Impl987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__6__Impl_in_rule__Step__Group__61018 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Step__Group__7_in_rule__Step__Group__61021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__TitleAssignment_6_in_rule__Step__Group__6__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__7__Impl_in_rule__Step__Group__71078 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Step__Group__8_in_rule__Step__Group__71081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_7__0_in_rule__Step__Group__7__Impl1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__8__Impl_in_rule__Step__Group__81139 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Step__Group__9_in_rule__Step__Group__81142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_8__0_in_rule__Step__Group__8__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__9__Impl_in_rule__Step__Group__91200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Step__Group__9__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_7__0__Impl_in_rule__Step__Group_7__01279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Step__Group_7__1_in_rule__Step__Group_7__01282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Step__Group_7__0__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_7__1__Impl_in_rule__Step__Group_7__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__DescriptionAssignment_7_1_in_rule__Step__Group_7__1__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_8__0__Impl_in_rule__Step__Group_8__01402 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Step__Group_8__1_in_rule__Step__Group_8__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Step__Group_8__0__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_8__1__Impl_in_rule__Step__Group_8__11464 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Step__Group_8__2_in_rule__Step__Group_8__11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Step__Group_8__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group_8__2__Impl_in_rule__Step__Group_8__21526 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Step__Group_8__3_in_rule__Step__Group_8__21529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__ChildrenAssignment_8_2_in_rule__Step__Group_8__2__Impl1556 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Step__Group_8__3__Impl_in_rule__Step__Group_8__31587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Step__Group_8__3__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Model__TitleAssignment_01659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Model__StepsAssignment_11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Title__TitleAssignment_11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Step__StepIdAssignment_11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepType_in_rule__Step__TypeAssignment_41783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Step__TitleAssignment_61814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Step__DescriptionAssignment_7_11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Step__ChildrenAssignment_8_21876 = new BitSet(new long[]{0x0000000000000002L});

}
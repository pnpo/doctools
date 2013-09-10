// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g 2013-09-10 17:28:13

	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.cp.model.graph.*;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FuzzyPatternViewReoLang extends Lexer {
    public static final int PORT_DEFINITION1=14;
    public static final int JOINS=16;
    public static final int PORT_DEFINITION2=15;
    public static final int INSTANCES=12;
    public static final int UNICODE_ESC=22;
    public static final int OCTAL_ESC=23;
    public static final int HEX_DIGIT=21;
    public static final int INT=18;
    public static final int PORTS_OUT=10;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int DECIDES=17;
    public static final int WS=4;
    public static final int ESC_SEQ=19;
    public static final int IN=6;
    public static final int USES=11;
    public static final int QUALQUEROUTRACOISA=24;
    public static final int PATTERN_NAME=8;
    public static final int USE=5;
    public static final int PORT_ACCESS=13;
    public static final int STRING=20;
    public static final int PORTS_IN=9;


    	private ArchPatternAbstractGraph graph;
    	private HashMap<String, String> replacements = new HashMap<String, String>();
    	private ArrayList<String> current_instance_in_ports;
    	private ArrayList<String> current_instance_out_ports;
    	private String current_type, complete_type;

    	private EContext context;
    	private SimpleSymbol table;
    	
    	private String file;
    	
    	
    	//Constructor
    	public FuzzyPatternViewReoLang(CharStream input, SimpleSymbol global_table) {
            this(input, new RecognizerSharedState());
            this.table = global_table;
            this.graph = new ArchPatternAbstractGraph();
        }
    	
    		
    	public void setFile(String name){
    		this.file = name;
    	}
    	
    	public ArchPatternAbstractGraph getGraph(){
    		return this.graph;
    	}
    	
    	
    	public HashMap<String, String> getReplacements(){
    		return this.replacements;
    	}

    	


    // delegates
    // delegators

    public FuzzyPatternViewReoLang() {;} 
    public FuzzyPatternViewReoLang(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyPatternViewReoLang(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g"; }

    public Token nextToken() {
        while (true) {
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            state.token = null;
    	state.channel = Token.DEFAULT_CHANNEL;
            state.tokenStartCharIndex = input.index();
            state.tokenStartCharPositionInLine = input.getCharPositionInLine();
            state.tokenStartLine = input.getLine();
    	state.text = null;
            try {
                int m = input.mark();
                state.backtracking=1; 
                state.failed=false;
                mTokens();
                state.backtracking=0;

                if ( state.failed ) {
                    input.rewind(m);
                    input.consume(); 
                }
                else {
                    emit();
                    return state.token;
                }
            }
            catch (RecognitionException re) {
                // shouldn't happen in backtracking mode, but...
                reportError(re);
                recover(re);
            }
        }
    }

    public void memoize(IntStream input,
    		int ruleIndex,
    		int ruleStartIndex)
    {
    if ( state.backtracking>1 ) super.memoize(input, ruleIndex, ruleStartIndex);
    }

    public boolean alreadyParsedRule(IntStream input, int ruleIndex) {
    if ( state.backtracking>1 ) return super.alreadyParsedRule(input, ruleIndex);
    return false;
    }// $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:62:2: ( 'use' ( WS )? ':' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:62:4: 'use' ( WS )? ':'
            {
            match("use"); if (state.failed) return ;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:62:10: ( WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:62:10: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.PATTERN_USE;
            }    }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:68:2: ({...}? => 'in' ( WS )? ':' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:68:4: {...}? => 'in' ( WS )? ':'
            {
            if ( !((context==EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "IN", "context==EContext.PATTERN_USE");
            }
            match("in"); if (state.failed) return ;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:69:8: ( WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:69:8: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.PATTERN_IN;
            }    }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "PATTERN_NAME"
    public final void mPATTERN_NAME() throws RecognitionException {
        try {
            int _type = PATTERN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken pat_name=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:80:2: ( 'pattern' WS pat_name= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:80:4: 'pattern' WS pat_name= ID
            {
            match("pattern"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int pat_nameStart111 = getCharIndex();
            mID(); if (state.failed) return ;
            pat_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pat_nameStart111, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		graph.setGraphName(pat_name.getText());		
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.PATTERN;
            }    }
        finally {
        }
    }
    // $ANTLR end "PATTERN_NAME"

    // $ANTLR start "PORTS_IN"
    public final void mPORTS_IN() throws RecognitionException {
        try {
            int _type = PORTS_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port1=null;
            CommonToken port2=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:91:2: ({...}? => '(' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:91:6: {...}? => '(' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )?
            {
            if ( !((context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORTS_IN", "context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION ");
            }
            match('('); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:92:7: ( WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:92:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int port1Start146 = getCharIndex();
            mID(); if (state.failed) return ;
            port1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port1Start146, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(context == EContext.PATTERN) {
              			graph.addInNode(new Node(port1.getText()));
              		}
              		else {
              			current_instance_in_ports.add(port1.getText());
              		}
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:3: ( ( WS )? ',' ( WS )? port2= ID )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:4: ( WS )? ',' ( WS )? port2= ID
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:4: ( WS )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:12: ( WS )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:103:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int port2Start173 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    port2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port2Start173, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(context == EContext.PATTERN) {
            	      			graph.addInNode(new Node(port2.getText()));
            	      		}
            	      		else {
            	      			current_instance_in_ports.add(port2.getText());
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:114:6: ( WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:114:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORTS_IN"

    // $ANTLR start "PORTS_OUT"
    public final void mPORTS_OUT() throws RecognitionException {
        try {
            int _type = PORTS_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port1=null;
            CommonToken port2=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:120:2: ({...}? => ':' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:120:4: {...}? => ':' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )?
            {
            if ( !((context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORTS_OUT", "context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION");
            }
            match(':'); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:121:7: ( WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:121:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int port1Start216 = getCharIndex();
            mID(); if (state.failed) return ;
            port1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port1Start216, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(context == EContext.PATTERN) {
              			graph.addOutNode(new Node(port1.getText()));
              		}
              		else {
              			current_instance_out_ports.add(port1.getText());
              		}
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:3: ( ( WS )? ',' ( WS )? port2= ID )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:4: ( WS )? ',' ( WS )? port2= ID
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:4: ( WS )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:12: ( WS )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:132:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int port2Start241 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    port2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port2Start241, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(context == EContext.PATTERN) {
            	      			graph.addOutNode(new Node(port2.getText()));
            	      		}
            	      		else {
            	      			current_instance_out_ports.add(port2.getText());
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:143:6: ( WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:143:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORTS_OUT"

    // $ANTLR start "USES"
    public final void mUSES() throws RecognitionException {
        try {
            int _type = USES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken obs=null;
            CommonToken type=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:151:2: ({...}? => ( '(' ( WS )? obs= ID ( WS )? ')' )? type= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:151:4: {...}? => ( '(' ( WS )? obs= ID ( WS )? ')' )? type= ID
            {
            if ( !((context == EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "USES", "context == EContext.PATTERN_USE");
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:3: ( '(' ( WS )? obs= ID ( WS )? ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='(') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:4: '(' ( WS )? obs= ID ( WS )? ')'
                    {
                    match('('); if (state.failed) return ;
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:8: ( WS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:8: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    int obsStart296 = getCharIndex();
                    mID(); if (state.failed) return ;
                    obs = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, obsStart296, getCharIndex()-1);
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:19: ( WS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:152:19: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    match(')'); if (state.failed) return ;

                    }
                    break;

            }

            int typeStart307 = getCharIndex();
            mID(); if (state.failed) return ;
            type = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, typeStart307, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		
              		current_type = type.getText() ;
              			complete_type = obs!=null? type.getText()+"(" + obs.getText() + ")" : current_type;
              		
              		this.current_instance_in_ports = new ArrayList<String>(2); 
              		this.current_instance_out_ports = new ArrayList<String>(2); 
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.PATTERN_INSTANCE_DEFINITION;
            }    }
        finally {
        }
    }
    // $ANTLR end "USES"

    // $ANTLR start "INSTANCES"
    public final void mINSTANCES() throws RecognitionException {
        try {
            int _type = INSTANCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken inst1=null;
            CommonToken inst2=null;

            	
            	SimpleSymbol s = table.getScope().getSymbols().get(current_type); 
            	Type type =  s != null ? s.getType() : Type.NULL;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:170:2: ({...}? => 'as' WS inst1= ID ( ( WS )? ',' ( WS )? inst2= ID )* ( WS )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:170:4: {...}? => 'as' WS inst1= ID ( ( WS )? ',' ( WS )? inst2= ID )* ( WS )?
            {
            if ( !((context == EContext.PATTERN_INSTANCE_DEFINITION)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "INSTANCES", "context == EContext.PATTERN_INSTANCE_DEFINITION");
            }
            match("as"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int inst1Start348 = getCharIndex();
            mID(); if (state.failed) return ;
            inst1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, inst1Start348, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		
              		if(type==Type.CHANNEL){
              			switch(current_instance_in_ports.size()){
              				case 1 : {graph.addEdge(new Edge(inst1.getText() + "." + current_instance_in_ports.get(0), inst1.getText() + "." + current_instance_out_ports.get(0), true, inst1.getText() + "::" + complete_type)); } break;		
              				case 2 : break;
              				case 0 : break;
              				default : break;
              			}
              		}
              		else {
              			ArrayList<String> ports = new ArrayList<String>();
              			ports.addAll(current_instance_in_ports);
              			ports.addAll(current_instance_out_ports);
              			for(String port : ports){
              				replacements.put(inst1.getText() + "." + port, inst1.getText()+"::"+complete_type);
              			}
              		}
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:3: ( ( WS )? ',' ( WS )? inst2= ID )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:4: ( WS )? ',' ( WS )? inst2= ID
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:4: ( WS )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:12: ( WS )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:193:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int inst2Start372 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    inst2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, inst2Start372, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(type==Type.CHANNEL){
            	      			switch(current_instance_in_ports.size()){
            	      				case 1 : {graph.addEdge(new Edge(inst2.getText() + "." + current_instance_in_ports.get(0), inst2.getText() + "." + current_instance_out_ports.get(0), true, inst2.getText() + "::" + current_type)); } break;		
            	      				case 2 : break;
            	      				case 0 : break;
            	      				default : break;
            	      			}
            	      		}
            	      		else {
            	      				ArrayList<String> ports = new ArrayList<String>();
            	      				ports.addAll(current_instance_in_ports);
            	      				ports.addAll(current_instance_out_ports);
            	      				for(String port : ports){
            	      					replacements.put(inst2.getText() + "." + port, inst2.getText() + "::" + complete_type);
            	      				}
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:214:6: ( WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:214:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context=EContext.PATTERN_USE;
            }    }
        finally {
        }
    }
    // $ANTLR end "INSTANCES"

    // $ANTLR start "PORT_DEFINITION1"
    public final void mPORT_DEFINITION1() throws RecognitionException {
        try {
            int _type = PORT_DEFINITION1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port=null;
            CommonToken p=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:222:2: ({...}? =>port= ID ( WS )? '=' ( WS )? p= PORT_ACCESS )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:222:4: {...}? =>port= ID ( WS )? '=' ( WS )? p= PORT_ACCESS
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORT_DEFINITION1", "context==EContext.PATTERN_IN");
            }
            int portStart417 = getCharIndex();
            mID(); if (state.failed) return ;
            port = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, portStart417, getCharIndex()-1);
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:223:11: ( WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:223:11: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('='); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:223:19: ( WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:223:19: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int pStart429 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart429, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(! replacements.containsKey(p.getText())){
              			replacements.put(p.getText(), port.getText());
              		}
              		else {
              			graph.addEdge(new Edge(port.getText(), replacements.get(p.getText()) , false, "" ));
              		}
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORT_DEFINITION1"

    // $ANTLR start "PORT_DEFINITION2"
    public final void mPORT_DEFINITION2() throws RecognitionException {
        try {
            int _type = PORT_DEFINITION2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port=null;
            CommonToken p1=null;
            CommonToken p2=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:238:2: ({...}? =>port= ID ( WS )? '=' ( WS )? 'join' ( WS )? '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:238:4: {...}? =>port= ID ( WS )? '=' ( WS )? 'join' ( WS )? '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']'
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORT_DEFINITION2", "context==EContext.PATTERN_IN");
            }
            int portStart460 = getCharIndex();
            mID(); if (state.failed) return ;
            port = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, portStart460, getCharIndex()-1);
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:11: ( WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:11: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('='); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:19: ( WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:19: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match("join"); if (state.failed) return ;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:30: ( WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:30: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('['); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:38: ( WS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:239:38: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int p1Start482 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p1Start482, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(! replacements.containsKey(p1.getText())){
              			replacements.put(p1.getText(), port.getText());
              		}
              		else {
              			graph.addEdge(new Edge(port.getText(), replacements.get(p1.getText()) , false, "" ));
              		}
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:3: ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:4: ( WS )? ',' ( WS )? p2= PORT_ACCESS
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:4: ( WS )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:12: ( WS )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:250:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int p2Start508 = getCharIndex();
            	    mPORT_ACCESS(); if (state.failed) return ;
            	    p2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p2Start508, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(! replacements.containsKey(p2.getText())){
            	      			replacements.put(p2.getText(), port.getText());
            	      		}
            	      		else {
            	      			graph.addEdge(new Edge(port.getText(), replacements.get(p2.getText()) , false, "" ));
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:261:6: ( WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:261:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORT_DEFINITION2"

    // $ANTLR start "JOINS"
    public final void mJOINS() throws RecognitionException {
        try {
            int _type = JOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken p1=null;
            CommonToken p2=null;
            CommonToken node=null;

            ArrayList<String> accesses = new ArrayList<String>();
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:267:2: ({...}? => 'join' ( WS )? ( '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']' ) WS 'as' WS node= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:267:4: {...}? => 'join' ( WS )? ( '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']' ) WS 'as' WS node= ID
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "JOINS", "context==EContext.PATTERN_IN");
            }
            match("join"); if (state.failed) return ;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:10: ( WS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:10: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:14: ( '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:15: '[' ( WS )? p1= PORT_ACCESS ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )* ( WS )? ']'
            {
            match('['); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:19: ( WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:268:19: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int p1Start565 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p1Start565, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		accesses.add(p1.getText());
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:3: ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:4: ( WS )? ',' ( WS )? p2= PORT_ACCESS
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:4: ( WS )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:12: ( WS )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:274:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int p2Start591 = getCharIndex();
            	    mPORT_ACCESS(); if (state.failed) return ;
            	    p2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p2Start591, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		accesses.add(p2.getText());
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:280:6: ( WS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:280:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(']'); if (state.failed) return ;

            }

            mWS(); if (state.failed) return ;
            match("as"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int nodeStart621 = getCharIndex();
            mID(); if (state.failed) return ;
            node = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nodeStart621, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		for(String s : accesses) {
              			if(! replacements.containsKey(s)){
              				replacements.put(s, node.getText());
              			}
              			else {
              				graph.addEdge(new Edge(node.getText(), replacements.get(s) , false, "" ));
              			}
              		}
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOINS"

    // $ANTLR start "DECIDES"
    public final void mDECIDES() throws RecognitionException {
        try {
            int _type = DECIDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken p1=null;
            CommonToken p2=null;
            CommonToken p3=null;
            CommonToken p4=null;
            CommonToken node=null;

            ArrayList<String> accesses = new ArrayList<String>();
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:298:2: ({...}? => 'decide' ( WS )? ( '[' ( WS )? p1= PORT_ACCESS ( WS )? ':' ( WS )? p2= PORT_ACCESS ( WS )? ',' ( WS )? p3= PORT_ACCESS ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )* ( WS )? ']' ) WS 'as' WS node= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:298:4: {...}? => 'decide' ( WS )? ( '[' ( WS )? p1= PORT_ACCESS ( WS )? ':' ( WS )? p2= PORT_ACCESS ( WS )? ',' ( WS )? p3= PORT_ACCESS ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )* ( WS )? ']' ) WS 'as' WS node= ID
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "DECIDES", "context==EContext.PATTERN_IN");
            }
            match("decide"); if (state.failed) return ;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:12: ( WS )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:12: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:16: ( '[' ( WS )? p1= PORT_ACCESS ( WS )? ':' ( WS )? p2= PORT_ACCESS ( WS )? ',' ( WS )? p3= PORT_ACCESS ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )* ( WS )? ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:17: '[' ( WS )? p1= PORT_ACCESS ( WS )? ':' ( WS )? p2= PORT_ACCESS ( WS )? ',' ( WS )? p3= PORT_ACCESS ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )* ( WS )? ']'
            {
            match('['); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:21: ( WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:21: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int p1Start666 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p1Start666, getCharIndex()-1);
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:40: ( WS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>='\t' && LA38_0<='\n')||LA38_0=='\r'||LA38_0==' ') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:299:40: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==1 ) {

              		accesses.add(p1.getText());
              	
            }
            match(':'); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:303:7: ( WS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>='\t' && LA39_0<='\n')||LA39_0=='\r'||LA39_0==' ') ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:303:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int p2Start685 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p2Start685, getCharIndex()-1);
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:303:26: ( WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>='\t' && LA40_0<='\n')||LA40_0=='\r'||LA40_0==' ') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:303:26: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==1 ) {

              		accesses.add(p2.getText());
              	
            }
            match(','); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:307:7: ( WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>='\t' && LA41_0<='\n')||LA41_0=='\r'||LA41_0==' ') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:307:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int p3Start704 = getCharIndex();
            mPORT_ACCESS(); if (state.failed) return ;
            p3 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p3Start704, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		accesses.add(p3.getText());
              	
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:3: ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:4: ( WS )? ',' ( WS )? p4= PORT_ACCESS
            	    {
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:4: ( WS )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:12: ( WS )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:311:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int p4Start724 = getCharIndex();
            	    mPORT_ACCESS(); if (state.failed) return ;
            	    p4 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p4Start724, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		accesses.add(p4.getText());
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:315:6: ( WS )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:315:6: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(']'); if (state.failed) return ;

            }

            mWS(); if (state.failed) return ;
            match("as"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int nodeStart749 = getCharIndex();
            mID(); if (state.failed) return ;
            node = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nodeStart749, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		for(String s : accesses) {
              			if(! replacements.containsKey(s)){
              				replacements.put(s, node.getText());
              			}
              			else {
              				graph.addEdge(new Edge(node.getText(), replacements.get(s) , false, "" ));
              			}
              		}
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIDES"

    // $ANTLR start "PORT_ACCESS"
    public final void mPORT_ACCESS() throws RecognitionException {
        try {
            CommonToken pat=null;
            CommonToken port=null;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:334:2: (pat= ID '.' port= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:334:4: pat= ID '.' port= ID
            {
            int patStart778 = getCharIndex();
            mID(); if (state.failed) return ;
            pat = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, patStart778, getCharIndex()-1);
            match('.'); if (state.failed) return ;
            int portStart784 = getCharIndex();
            mID(); if (state.failed) return ;
            port = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, portStart784, getCharIndex()-1);

            }

        }
        finally {
        }
    }
    // $ANTLR end "PORT_ACCESS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:342:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:342:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:342:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='0' && LA46_0<='9')||(LA46_0>='A' && LA46_0<='Z')||LA46_0=='_'||(LA46_0>='a' && LA46_0<='z')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:350:5: ( ( '0' .. '9' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:350:7: ( '0' .. '9' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:350:7: ( '0' .. '9' )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:350:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:358:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:358:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:358:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( (LA48_0=='\\') ) {
                    alt48=1;
                }
                else if ( ((LA48_0>='\u0000' && LA48_0<='!')||(LA48_0>='#' && LA48_0<='[')||(LA48_0>=']' && LA48_0<='\uFFFF')) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:358:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:358:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:362:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:362:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:366:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt49=1;
                    }
                    break;
                case 'u':
                    {
                    alt49=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt49=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:366:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); if (state.failed) return ;
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:367:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:368:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='\\') ) {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>='0' && LA50_1<='3')) ) {
                    int LA50_2 = input.LA(3);

                    if ( ((LA50_2>='0' && LA50_2<='7')) ) {
                        int LA50_4 = input.LA(4);

                        if ( ((LA50_4>='0' && LA50_4<='7')) ) {
                            alt50=1;
                        }
                        else {
                            alt50=2;}
                    }
                    else {
                        alt50=3;}
                }
                else if ( ((LA50_1>='4' && LA50_1<='7')) ) {
                    int LA50_3 = input.LA(3);

                    if ( ((LA50_3>='0' && LA50_3<='7')) ) {
                        alt50=2;
                    }
                    else {
                        alt50=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:14: ( '0' .. '3' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:15: '0' .. '3'
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:36: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:373:37: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:374:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:374:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:374:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:374:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:374:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:375:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:375:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:375:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:380:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:380:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); if (state.failed) return ;
            match('u'); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:386:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:386:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:386:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>='\t' && LA51_0<='\n')||LA51_0=='\r'||LA51_0==' ') ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "QUALQUEROUTRACOISA"
    public final void mQUALQUEROUTRACOISA() throws RecognitionException {
        try {
            int _type = QUALQUEROUTRACOISA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:399:2: ( . )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:399:4: .
            {
            matchAny(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUALQUEROUTRACOISA"

    public void mTokens() throws RecognitionException {
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:39: ( USE | IN | PATTERN_NAME | PORTS_IN | PORTS_OUT | USES | INSTANCES | PORT_DEFINITION1 | PORT_DEFINITION2 | JOINS | DECIDES | WS | QUALQUEROUTRACOISA )
        int alt52=13;
        alt52 = dfa52.predict(input);
        switch (alt52) {
            case 1 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:41: USE
                {
                mUSE(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:45: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:48: PATTERN_NAME
                {
                mPATTERN_NAME(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:61: PORTS_IN
                {
                mPORTS_IN(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:70: PORTS_OUT
                {
                mPORTS_OUT(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:80: USES
                {
                mUSES(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:85: INSTANCES
                {
                mINSTANCES(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:95: PORT_DEFINITION1
                {
                mPORT_DEFINITION1(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:112: PORT_DEFINITION2
                {
                mPORT_DEFINITION2(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:129: JOINS
                {
                mJOINS(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:135: DECIDES
                {
                mDECIDES(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:143: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:146: QUALQUEROUTRACOISA
                {
                mQUALQUEROUTRACOISA(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_FuzzyPatternViewReoLang
    public final void synpred1_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:41: ( USE )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:41: USE
        {
        mUSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_FuzzyPatternViewReoLang

    // $ANTLR start synpred2_FuzzyPatternViewReoLang
    public final void synpred2_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:45: ( IN )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:45: IN
        {
        mIN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_FuzzyPatternViewReoLang

    // $ANTLR start synpred3_FuzzyPatternViewReoLang
    public final void synpred3_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:48: ( PATTERN_NAME )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:48: PATTERN_NAME
        {
        mPATTERN_NAME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_FuzzyPatternViewReoLang

    // $ANTLR start synpred4_FuzzyPatternViewReoLang
    public final void synpred4_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:61: ( PORTS_IN )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:61: PORTS_IN
        {
        mPORTS_IN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_FuzzyPatternViewReoLang

    // $ANTLR start synpred5_FuzzyPatternViewReoLang
    public final void synpred5_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:70: ( PORTS_OUT )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:70: PORTS_OUT
        {
        mPORTS_OUT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_FuzzyPatternViewReoLang

    // $ANTLR start synpred6_FuzzyPatternViewReoLang
    public final void synpred6_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:80: ( USES )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:80: USES
        {
        mUSES(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_FuzzyPatternViewReoLang

    // $ANTLR start synpred7_FuzzyPatternViewReoLang
    public final void synpred7_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:85: ( INSTANCES )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:85: INSTANCES
        {
        mINSTANCES(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_FuzzyPatternViewReoLang

    // $ANTLR start synpred8_FuzzyPatternViewReoLang
    public final void synpred8_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:95: ( PORT_DEFINITION1 )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:95: PORT_DEFINITION1
        {
        mPORT_DEFINITION1(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_FuzzyPatternViewReoLang

    // $ANTLR start synpred9_FuzzyPatternViewReoLang
    public final void synpred9_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:112: ( PORT_DEFINITION2 )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:112: PORT_DEFINITION2
        {
        mPORT_DEFINITION2(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_FuzzyPatternViewReoLang

    // $ANTLR start synpred10_FuzzyPatternViewReoLang
    public final void synpred10_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:129: ( JOINS )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:129: JOINS
        {
        mJOINS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_FuzzyPatternViewReoLang

    // $ANTLR start synpred11_FuzzyPatternViewReoLang
    public final void synpred11_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:135: ( DECIDES )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:135: DECIDES
        {
        mDECIDES(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_FuzzyPatternViewReoLang

    // $ANTLR start synpred12_FuzzyPatternViewReoLang
    public final void synpred12_FuzzyPatternViewReoLang_fragment() throws RecognitionException {   
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:143: ( WS )
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/FuzzyPatternViewReoLang.g:1:143: WS
        {
        mWS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_FuzzyPatternViewReoLang

    public final boolean synpred12_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_FuzzyPatternViewReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FuzzyPatternViewReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA6_eotS =
        "\2\2\2\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\11\2\uffff";
    static final String DFA6_maxS =
        "\2\54\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 103:3: ( ( WS )? ',' ( WS )? port2= ID )*";
        }
    }
    static final String DFA11_eotS =
        "\2\2\2\uffff";
    static final String DFA11_eofS =
        "\4\uffff";
    static final String DFA11_minS =
        "\2\11\2\uffff";
    static final String DFA11_maxS =
        "\2\54\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 132:3: ( ( WS )? ',' ( WS )? port2= ID )*";
        }
    }
    static final String DFA18_eotS =
        "\2\2\2\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\2\11\2\uffff";
    static final String DFA18_maxS =
        "\2\54\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 193:3: ( ( WS )? ',' ( WS )? inst2= ID )*";
        }
    }
    static final String DFA28_eotS =
        "\4\uffff";
    static final String DFA28_eofS =
        "\4\uffff";
    static final String DFA28_minS =
        "\2\11\2\uffff";
    static final String DFA28_maxS =
        "\2\135\2\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA28_specialS =
        "\4\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 250:3: ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )*";
        }
    }
    static final String DFA34_eotS =
        "\4\uffff";
    static final String DFA34_eofS =
        "\4\uffff";
    static final String DFA34_minS =
        "\2\11\2\uffff";
    static final String DFA34_maxS =
        "\2\135\2\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA34_specialS =
        "\4\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 274:3: ( ( WS )? ',' ( WS )? p2= PORT_ACCESS )*";
        }
    }
    static final String DFA44_eotS =
        "\4\uffff";
    static final String DFA44_eofS =
        "\4\uffff";
    static final String DFA44_minS =
        "\2\11\2\uffff";
    static final String DFA44_maxS =
        "\2\135\2\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA44_specialS =
        "\4\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\60\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 311:3: ( ( WS )? ',' ( WS )? p4= PORT_ACCESS )*";
        }
    }
    static final String DFA52_eotS =
        "\30\uffff";
    static final String DFA52_eofS =
        "\30\uffff";
    static final String DFA52_minS =
        "\13\0\15\uffff";
    static final String DFA52_maxS =
        "\1\uffff\12\0\15\uffff";
    static final String DFA52_acceptS =
        "\13\uffff\1\15\1\1\1\6\1\10\1\11\1\2\1\3\1\4\1\5\1\7\1\12\1\13\1"+
        "\14";
    static final String DFA52_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\15\uffff}>";
    static final String[] DFA52_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\7\13\1\4\21\13\1\5\6\13\32"+
            "\11\4\13\1\11\1\13\1\6\2\11\1\10\4\11\1\2\1\7\5\11\1\3\4\11"+
            "\1\1\5\11\uff85\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "1:1: Tokens options {k=1; backtrack=true; } : ( USE | IN | PATTERN_NAME | PORTS_IN | PORTS_OUT | USES | INSTANCES | PORT_DEFINITION1 | PORT_DEFINITION2 | JOINS | DECIDES | WS | QUALQUEROUTRACOISA );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                        s = -1;
                        if ( (LA52_0=='u') ) {s = 1;}

                        else if ( (LA52_0=='i') ) {s = 2;}

                        else if ( (LA52_0=='p') ) {s = 3;}

                        else if ( (LA52_0=='(') ) {s = 4;}

                        else if ( (LA52_0==':') ) {s = 5;}

                        else if ( (LA52_0=='a') ) {s = 6;}

                        else if ( (LA52_0=='j') ) {s = 7;}

                        else if ( (LA52_0=='d') ) {s = 8;}

                        else if ( ((LA52_0>='A' && LA52_0<='Z')||LA52_0=='_'||(LA52_0>='b' && LA52_0<='c')||(LA52_0>='e' && LA52_0<='h')||(LA52_0>='k' && LA52_0<='o')||(LA52_0>='q' && LA52_0<='t')||(LA52_0>='v' && LA52_0<='z')) ) {s = 9;}

                        else if ( ((LA52_0>='\t' && LA52_0<='\n')||LA52_0=='\r'||LA52_0==' ') ) {s = 10;}

                        else if ( ((LA52_0>='\u0000' && LA52_0<='\b')||(LA52_0>='\u000B' && LA52_0<='\f')||(LA52_0>='\u000E' && LA52_0<='\u001F')||(LA52_0>='!' && LA52_0<='\'')||(LA52_0>=')' && LA52_0<='9')||(LA52_0>=';' && LA52_0<='@')||(LA52_0>='[' && LA52_0<='^')||LA52_0=='`'||(LA52_0>='{' && LA52_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_FuzzyPatternViewReoLang()) ) {s = 12;}

                        else if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 16;}

                        else if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_FuzzyPatternViewReoLang()) ) {s = 17;}

                        else if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_4 = input.LA(1);

                         
                        int index52_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION ))) ) {s = 18;}

                        else if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_5 = input.LA(1);

                         
                        int index52_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred5_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION))) ) {s = 19;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred7_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_INSTANCE_DEFINITION))) ) {s = 20;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( ((synpred10_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 21;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( ((synpred11_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred6_FuzzyPatternViewReoLang()&&(context == EContext.PATTERN_USE))) ) {s = 13;}

                        else if ( ((synpred8_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 14;}

                        else if ( ((synpred9_FuzzyPatternViewReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 15;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_FuzzyPatternViewReoLang()) ) {s = 23;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
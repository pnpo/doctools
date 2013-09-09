// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g 2012-05-04 21:27:51

	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FuzzyParserReoLang extends Lexer {
    public static final int PORTS_OUT=21;
    public static final int STATE=14;
    public static final int UNICODE_ESC=33;
    public static final int OBSERVERS=15;
    public static final int QUALQUEROUTRACOISA=35;
    public static final int CHANNEL_NAME=12;
    public static final int JOINS=29;
    public static final int STRUCTURE=18;
    public static final int FLOW_REQUESTS=22;
    public static final int WS=4;
    public static final int STRING=30;
    public static final int EXIT_TO_DEFAULT_CONTEXT=8;
    public static final int FILE_PATH=9;
    public static final int FLOW=23;
    public static final int PATTERN_NAME=24;
    public static final int ESC_SEQ=31;
    public static final int IMPORT=10;
    public static final int USES=25;
    public static final int PORTS_IN=20;
    public static final int IN=6;
    public static final int INSTANCES=26;
    public static final int TIME=17;
    public static final int INT=16;
    public static final int EOF=-1;
    public static final int CONDITION=19;
    public static final int USE=5;
    public static final int PORT_DEFINITION=27;
    public static final int HEX_DIGIT=32;
    public static final int JOIN=7;
    public static final int PORT_ACCESS=28;
    public static final int EXTENSION=13;
    public static final int OCTAL_ESC=34;
    public static final int ID=11;

    	//private boolean importMode = false;
    	private SimpleSymbol global_symbol = new SimpleSymbol("#GLOBAL#", Type.NULL, 0, 0, "", null, null);
    	private SimpleSymbolsTable global_table = global_symbol.getScope();
    	private SimpleSymbolsTable current_scope;
    	private SimpleSymbolsTable current_instance_type;
    	private String current_id;
    	private SimpleSymbol instance_type;
    	
    	
    	private EContext context;
    	private String file;
    	
    	public SimpleSymbol getGlobalSymbol(){
    		return this.global_symbol;
    	}

    	public SimpleSymbolsTable getGlobalTable(){
    		return this.global_table;
    	}
    	
    	public void setFile(String name){
    		this.file = name;
    	}
    	
    	private void flush_symbols() {
    		if(this.current_scope != null){
    			((SimpleSymbol)this.global_table.getSymbols().get(this.current_id)).setScope(this.current_scope);
    			this.current_scope = null;
    		}
    	}


    // delegates
    // delegators

    public FuzzyParserReoLang() {;} 
    public FuzzyParserReoLang(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyParserReoLang(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g"; }

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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:58:2: ( 'use' ( WS )? ':' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:58:4: 'use' ( WS )? ':'
            {
            match("use"); if (state.failed) return ;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:58:10: ( WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:58:10: WS
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:64:2: ( 'in' ( WS )? ':' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:64:4: 'in' ( WS )? ':'
            {
            match("in"); if (state.failed) return ;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:64:9: ( WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:64:9: WS
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

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:69:2: ( 'join' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:69:4: 'join'
            {
            match("join"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "EXIT_TO_DEFAULT_CONTEXT"
    public final void mEXIT_TO_DEFAULT_CONTEXT() throws RecognitionException {
        try {
            int _type = EXIT_TO_DEFAULT_CONTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:76:2: ( '}' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:76:4: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.NONE; flush_symbols(); this.current_instance_type = null; 
            }    }
        finally {
        }
    }
    // $ANTLR end "EXIT_TO_DEFAULT_CONTEXT"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken file=null;

            context = EContext.IMPORT;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:87:2: ( 'import' WS file= FILE_PATH )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:87:5: 'import' WS file= FILE_PATH
            {
            match("import"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int fileStart145 = getCharIndex();
            mFILE_PATH(); if (state.failed) return ;
            file = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fileStart145, getCharIndex()-1);
            if ( state.backtracking==1 ) {
              System.out.println("IMPORT: " + file.getText());
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context = EContext.NONE;
            }    }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "CHANNEL_NAME"
    public final void mCHANNEL_NAME() throws RecognitionException {
        try {
            int _type = CHANNEL_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken channel_name=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:96:2: ( 'channel' WS channel_name= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:96:4: 'channel' WS channel_name= ID
            {
            match("channel"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int channel_nameStart176 = getCharIndex();
            mID(); if (state.failed) return ;
            channel_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, channel_nameStart176, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("CANAL: " + channel_name.getText());
              		//set the symbols table to the global element and erase the current scope
              		flush_symbols();

              		SimpleSymbol current_symbol = new SimpleSymbol(channel_name.getText(),Type.CHANNEL,channel_name.getStartIndex(),channel_name.getStopIndex(),this.file, null, global_symbol);
              		global_table.put(channel_name.getText(), current_symbol);

              		this.current_id = channel_name.getText();
              		//set a new symbol table for use
              		current_scope = current_symbol.getScope();
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context=EContext.CHANNEL; 
            }    }
        finally {
        }
    }
    // $ANTLR end "CHANNEL_NAME"

    // $ANTLR start "EXTENSION"
    public final void mEXTENSION() throws RecognitionException {
        try {
            int _type = EXTENSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken channel_name=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:115:2: ({...}? => 'extends' WS channel_name= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:115:4: {...}? => 'extends' WS channel_name= ID
            {
            if ( !((context==EContext.CHANNEL)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "EXTENSION", "context==EContext.CHANNEL");
            }
            match("extends"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int channel_nameStart208 = getCharIndex();
            mID(); if (state.failed) return ;
            channel_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, channel_nameStart208, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("EXTENSAO: " + channel_name.getText());
              		current_scope.put(channel_name.getText(), new SimpleSymbol(channel_name.getText(), Type.EXTENSION, channel_name.getStartIndex(), channel_name.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)) );
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENSION"

    // $ANTLR start "STATE"
    public final void mSTATE() throws RecognitionException {
        try {
            int _type = STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken state_name=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:125:2: ({...}? => 'state' ( WS )? ':' ( WS )? state_name= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:125:4: {...}? => 'state' ( WS )? ':' ( WS )? state_name= ID
            {
            if ( !((context==EContext.CHANNEL)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STATE", "context==EContext.CHANNEL");
            }
            match("state"); if (state.failed) return ;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:126:11: ( WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:126:11: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(':'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:126:19: ( WS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:126:19: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int state_nameStart244 = getCharIndex();
            mID(); if (state.failed) return ;
            state_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, state_nameStart244, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("ESTADO: " + state_name.getText());
              		current_scope.put( state_name.getText(), new SimpleSymbol( state_name.getText(), Type.STATE, state_name.getStartIndex(), state_name.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)) );
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATE"

    // $ANTLR start "OBSERVERS"
    public final void mOBSERVERS() throws RecognitionException {
        try {
            int _type = OBSERVERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken obs_name1=null;
            CommonToken obs_name2=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:134:2: ({...}? => 'observers' ( WS )? ':' ( WS )? obs_name1= ID ( WS )? ( ',' ( WS )? obs_name2= ID ( WS )? )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:134:4: {...}? => 'observers' ( WS )? ':' ( WS )? obs_name1= ID ( WS )? ( ',' ( WS )? obs_name2= ID ( WS )? )*
            {
            if ( !((context==EContext.CHANNEL)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "OBSERVERS", "context==EContext.CHANNEL");
            }
            match("observers"); if (state.failed) return ;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:135:15: ( WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:135:15: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match(':'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:135:23: ( WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:135:23: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int obs_name1Start278 = getCharIndex();
            mID(); if (state.failed) return ;
            obs_name1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, obs_name1Start278, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		current_scope.put(obs_name1.getText(), new SimpleSymbol(obs_name1.getText(), Type.OBSERVER, obs_name1.getStartIndex(), obs_name1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              	
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:3: ( WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:3: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:7: ( ',' ( WS )? obs_name2= ID ( WS )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==',') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:8: ',' ( WS )? obs_name2= ID ( WS )?
            	    {
            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:12: ( WS )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:141:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int obs_name2Start301 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    obs_name2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, obs_name2Start301, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		current_scope.put(obs_name2.getText(), new SimpleSymbol(obs_name2.getText(), Type.OBSERVER, obs_name2.getStartIndex(), obs_name2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
            	      	
            	    }
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:147:3: ( WS )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:147:3: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBSERVERS"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken time=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:153:2: ({...}? => '@' ( WS )? (time= ID | INT ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:153:4: {...}? => '@' ( WS )? (time= ID | INT )
            {
            if ( !((context==EContext.CHANNEL || context==EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "TIME", "context==EContext.CHANNEL || context==EContext.PATTERN_USE");
            }
            match('@'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:154:7: ( WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:154:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:154:11: (time= ID | INT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                alt12=1;
            }
            else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:154:12: time= ID
                    {
                    int timeStart349 = getCharIndex();
                    mID(); if (state.failed) return ;
                    time = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, timeStart349, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:154:20: INT
                    {
                    mINT(); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==1 ) {

              	//System.out.println("TEMPO");
              		if(time!=null){
              			current_scope.put(time.getText(), new SimpleSymbol(time.getText(), Type.TIME, time.getStartIndex(), time.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              		}
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "STRUCTURE"
    public final void mSTRUCTURE() throws RecognitionException {
        try {
            int _type = STRUCTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken dim1=null;
            CommonToken dim2=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:164:2: ({...}? => '~' ( WS )? (dim1= ID | INT ) ( WS )? ( ',' ( WS )? (dim2= ID | INT ) ( WS )? )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:164:4: {...}? => '~' ( WS )? (dim1= ID | INT ) ( WS )? ( ',' ( WS )? (dim2= ID | INT ) ( WS )? )*
            {
            if ( !((context==EContext.CHANNEL || context==EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "STRUCTURE", "context==EContext.CHANNEL || context==EContext.PATTERN_USE");
            }
            match('~'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:166:7: ( WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:166:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:166:11: (dim1= ID | INT )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:166:12: dim1= ID
                    {
                    int dim1Start386 = getCharIndex();
                    mID(); if (state.failed) return ;
                    dim1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dim1Start386, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:166:20: INT
                    {
                    mINT(); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==1 ) {

              		if(dim1!=null){
              			current_scope.put(dim1.getText(), new SimpleSymbol(dim1.getText(), Type.STRUCTURE, dim1.getStartIndex(), dim1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              		}
              	
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:3: ( WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:3: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:7: ( ',' ( WS )? (dim2= ID | INT ) ( WS )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==',') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:9: ',' ( WS )? (dim2= ID | INT ) ( WS )?
            	    {
            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:13: ( WS )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:13: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:17: (dim2= ID | INT )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
            	        alt17=1;
            	    }
            	    else if ( ((LA17_0>='0' && LA17_0<='9')) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:18: dim2= ID
            	            {
            	            int dim2Start417 = getCharIndex();
            	            mID(); if (state.failed) return ;
            	            dim2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dim2Start417, getCharIndex()-1);

            	            }
            	            break;
            	        case 2 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:174:26: INT
            	            {
            	            mINT(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==1 ) {

            	      		if(dim2!=null){
            	      			current_scope.put( dim2.getText(), new SimpleSymbol(dim2.getText(), Type.STRUCTURE, dim2.getStartIndex(), dim2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
            	      		}
            	      	
            	    }
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:182:3: ( WS )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:182:3: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCTURE"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken cond_name=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:187:2: ({...}? => ':' ( WS )? cond_name= ID ( WS )? '=' ( WS )? '<' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:187:4: {...}? => ':' ( WS )? cond_name= ID ( WS )? '=' ( WS )? '<'
            {
            if ( !((context==EContext.CHANNEL || context==EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "CONDITION", "context==EContext.CHANNEL || context==EContext.PATTERN_USE");
            }
            match(':'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:7: ( WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int cond_nameStart466 = getCharIndex();
            mID(); if (state.failed) return ;
            cond_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, cond_nameStart466, getCharIndex()-1);
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:24: ( WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:24: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('='); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:32: ( WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:188:32: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('<'); if (state.failed) return ;
            if ( state.backtracking==1 ) {

              		//System.out.println("CONDICAO: " + cond_name.getText());
              		current_scope.put( cond_name.getText(), new SimpleSymbol(cond_name.getText(), Type.CONDITION, cond_name.getStartIndex(), cond_name.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONDITION"

    // $ANTLR start "PORTS_IN"
    public final void mPORTS_IN() throws RecognitionException {
        try {
            int _type = PORTS_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port1=null;
            CommonToken port2=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:198:2: ({...}? => '(' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )? )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:198:5: {...}? => '(' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )?
            {
            if ( !((context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORTS_IN", "context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION");
            }
            match('('); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:199:7: ( WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:199:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int port1Start508 = getCharIndex();
            mID(); if (state.failed) return ;
            port1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port1Start508, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
              			current_instance_type.put( port1.getText(), new SimpleSymbol(port1.getText(), Type.IN_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, instance_type));
              		}
              		else{
              			current_scope.put( port1.getText(), new SimpleSymbol(port1.getText(), Type.IN_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              		}	
              	
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:3: ( ( WS )? ',' ( WS )? port2= ID )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:4: ( WS )? ',' ( WS )? port2= ID
            	    {
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:4: ( WS )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:12: ( WS )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:210:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int port2Start534 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    port2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port2Start534, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
            	      			current_instance_type.put( port2.getText(), new SimpleSymbol(port2.getText(), Type.IN_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, instance_type));
            	      		}
            	      		else{
            	      			current_scope.put( port2.getText(), new SimpleSymbol(port2.getText(), Type.IN_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:221:6: ( WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:221:6: WS
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

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:228:2: ({...}? => ':' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )? )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:228:4: {...}? => ':' ( WS )? port1= ID ( ( WS )? ',' ( WS )? port2= ID )* ( WS )?
            {
            if ( !((context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORTS_OUT", "context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION");
            }
            match(':'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:229:7: ( WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:229:7: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            int port1Start581 = getCharIndex();
            mID(); if (state.failed) return ;
            port1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port1Start581, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
              			current_instance_type.put(port1.getText(), new SimpleSymbol(port1.getText(), Type.OUT_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, instance_type));
              		}
              		else{
              			current_scope.put(port1.getText(), new SimpleSymbol(port1.getText(), Type.OUT_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
              		}	
              	
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:3: ( ( WS )? ',' ( WS )? port2= ID )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:4: ( WS )? ',' ( WS )? port2= ID
            	    {
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:4: ( WS )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:12: ( WS )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:240:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int port2Start607 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    port2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, port2Start607, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
            	      			current_instance_type.put(port2.getText(), new SimpleSymbol(port2.getText(), Type.OUT_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, instance_type)	);
            	      		}
            	      		else{
            	      			current_scope.put(port2.getText(), new SimpleSymbol(port2.getText(), Type.OUT_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
            	      		}
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:251:6: ( WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:251:6: WS
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

    // $ANTLR start "FLOW_REQUESTS"
    public final void mFLOW_REQUESTS() throws RecognitionException {
        try {
            int _type = FLOW_REQUESTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken req=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:258:2: ({...}? => ( '!' ( WS )? )? req= ID ( ( WS )? ',' ( WS )? ( '!' ( WS )? )? ID )* ( WS )? '->' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:258:4: {...}? => ( '!' ( WS )? )? req= ID ( ( WS )? ',' ( WS )? ( '!' ( WS )? )? ID )* ( WS )? '->'
            {
            if ( !((context==EContext.CHANNEL)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "FLOW_REQUESTS", "context==EContext.CHANNEL");
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:3: ( '!' ( WS )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='!') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:4: '!' ( WS )?
                    {
                    match('!'); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:8: ( WS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:8: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            int reqStart660 = getCharIndex();
            mID(); if (state.failed) return ;
            req = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, reqStart660, getCharIndex()-1);
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:21: ( ( WS )? ',' ( WS )? ( '!' ( WS )? )? ID )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:22: ( WS )? ',' ( WS )? ( '!' ( WS )? )? ID
            	    {
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:22: ( WS )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:22: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:30: ( WS )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:30: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:34: ( '!' ( WS )? )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0=='!') ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:35: '!' ( WS )?
            	            {
            	            match('!'); if (state.failed) return ;
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:39: ( WS )?
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
            	                alt37=1;
            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:39: WS
            	                    {
            	                    mWS(); if (state.failed) return ;

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    mID(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:50: ( WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>='\t' && LA40_0<='\n')||LA40_0=='\r'||LA40_0==' ') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:259:50: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match("->"); if (state.failed) return ;

            if ( state.backtracking==1 ) {

              		//System.out.println("REQUESTS 1a: " + req.getText());
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              flush_symbols(); context=EContext.FLOW_DEFS;
            }    }
        finally {
        }
    }
    // $ANTLR end "FLOW_REQUESTS"

    // $ANTLR start "FLOW"
    public final void mFLOW() throws RecognitionException {
        try {
            int _type = FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken p1=null;
            CommonToken time=null;
            CommonToken p2=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:267:2: ({...}? => 'flow' WS p1= ID WS 'to' ( ( WS )? '@' ( WS )? (time= ID | time= INT ) )? WS p2= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:267:4: {...}? => 'flow' WS p1= ID WS 'to' ( ( WS )? '@' ( WS )? (time= ID | time= INT ) )? WS p2= ID
            {
            if ( !((context==EContext.FLOW_DEFS)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "FLOW", "context==EContext.FLOW_DEFS");
            }
            match("flow"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int p1Start717 = getCharIndex();
            mID(); if (state.failed) return ;
            p1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p1Start717, getCharIndex()-1);
            mWS(); if (state.failed) return ;
            match("to"); if (state.failed) return ;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:27: ( ( WS )? '@' ( WS )? (time= ID | time= INT ) )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:28: ( WS )? '@' ( WS )? (time= ID | time= INT )
                    {
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:28: ( WS )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>='\t' && LA41_0<='\n')||LA41_0=='\r'||LA41_0==' ') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:28: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    match('@'); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:36: ( WS )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:36: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:40: (time= ID | time= INT )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>='A' && LA43_0<='Z')||LA43_0=='_'||(LA43_0>='a' && LA43_0<='z')) ) {
                        alt43=1;
                    }
                    else if ( ((LA43_0>='0' && LA43_0<='9')) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:41: time= ID
                            {
                            int timeStart735 = getCharIndex();
                            mID(); if (state.failed) return ;
                            time = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, timeStart735, getCharIndex()-1);

                            }
                            break;
                        case 2 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:268:49: time= INT
                            {
                            int timeStart739 = getCharIndex();
                            mINT(); if (state.failed) return ;
                            time = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, timeStart739, getCharIndex()-1);

                            }
                            break;

                    }


                    }
                    break;

            }

            mWS(); if (state.failed) return ;
            int p2Start748 = getCharIndex();
            mID(); if (state.failed) return ;
            p2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, p2Start748, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("FLOW: " +p1.getText() + " to " + p2.getText() + (time!=null? " by " + time.getText() : "") );
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              flush_symbols();
            }    }
        finally {
        }
    }
    // $ANTLR end "FLOW"

    // $ANTLR start "PATTERN_NAME"
    public final void mPATTERN_NAME() throws RecognitionException {
        try {
            int _type = PATTERN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken pat_name=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:283:2: ( 'pattern' WS pat_name= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:283:4: 'pattern' WS pat_name= ID
            {
            match("pattern"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int pat_nameStart786 = getCharIndex();
            mID(); if (state.failed) return ;
            pat_name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pat_nameStart786, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("PATTERN: " + pat_name.getText());
              		//set the symbols table to the global element and erase the current scope
              		flush_symbols();
              		SimpleSymbol current_symbol = new SimpleSymbol(pat_name.getText(),Type.PATTERN,pat_name.getStartIndex(),pat_name.getStopIndex(),this.file, null, global_symbol);
              		this.global_table.put(pat_name.getText(), current_symbol );
              		this.current_id = pat_name.getText();
              		//set a new symbol table for use
              		current_scope = current_symbol.getScope();
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context=EContext.PATTERN; 
            }    }
        finally {
        }
    }
    // $ANTLR end "PATTERN_NAME"

    // $ANTLR start "USES"
    public final void mUSES() throws RecognitionException {
        try {
            int _type = USES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken obs=null;
            CommonToken type=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:300:2: ({...}? => ( '(' ( WS )? obs= ID ( WS )? ')' )? type= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:300:5: {...}? => ( '(' ( WS )? obs= ID ( WS )? ')' )? type= ID
            {
            if ( !((context==EContext.PATTERN_USE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "USES", "context==EContext.PATTERN_USE");
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:3: ( '(' ( WS )? obs= ID ( WS )? ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='(') ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:4: '(' ( WS )? obs= ID ( WS )? ')'
                    {
                    match('('); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:8: ( WS )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:8: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    int obsStart825 = getCharIndex();
                    mID(); if (state.failed) return ;
                    obs = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, obsStart825, getCharIndex()-1);
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:19: ( WS )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:301:19: WS
                            {
                            mWS(); if (state.failed) return ;

                            }
                            break;

                    }

                    match(')'); if (state.failed) return ;

                    }
                    break;

            }

            int typeStart836 = getCharIndex();
            mID(); if (state.failed) return ;
            type = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, typeStart836, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("TYPE: " + type.getText() + (obs!=null? " OBS: " + obs.getText() : "" ));
              		current_instance_type = new SimpleSymbolsTable();
              		if(obs!=null){
              			current_instance_type.put(obs.getText(), new SimpleSymbol(obs.getText(), Type.OBSERVER, obs.getStartIndex(), obs.getStopIndex(), this.file,null,null));
              		}
              		current_instance_type.put(type.getText(), new SimpleSymbol(type.getText(), Type.TYPE, type.getStartIndex(), type.getStopIndex(), this.file,null, null));
              		
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==1 ) {
              context=EContext.PATTERN_INSTANCE_DEFINITION;
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

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:316:2: ({...}? => 'as' WS inst1= ID ( ( WS )? ',' ( WS )? inst2= ID )* ( WS )? )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:316:4: {...}? => 'as' WS inst1= ID ( ( WS )? ',' ( WS )? inst2= ID )* ( WS )?
            {
            if ( !((context==EContext.PATTERN_INSTANCE_DEFINITION)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "INSTANCES", "context==EContext.PATTERN_INSTANCE_DEFINITION");
            }
            match("as"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int inst1Start872 = getCharIndex();
            mID(); if (state.failed) return ;
            inst1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, inst1Start872, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		current_scope.put(inst1.getText(), new SimpleSymbol(inst1.getText(), Type.INSTANCE, inst1.getStartIndex(), inst1.getStopIndex(), this.file, new SimpleSymbolsTable(this.current_instance_type), (SimpleSymbol)global_table.getSymbols().get(current_id)));
              	
            }
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:3: ( ( WS )? ',' ( WS )? inst2= ID )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:4: ( WS )? ',' ( WS )? inst2= ID
            	    {
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:4: ( WS )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>='\t' && LA48_0<='\n')||LA48_0=='\r'||LA48_0==' ') ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:4: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match(','); if (state.failed) return ;
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:12: ( WS )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( ((LA49_0>='\t' && LA49_0<='\n')||LA49_0=='\r'||LA49_0==' ') ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:323:12: WS
            	            {
            	            mWS(); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    int inst2Start898 = getCharIndex();
            	    mID(); if (state.failed) return ;
            	    inst2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, inst2Start898, getCharIndex()-1);
            	    if ( state.backtracking==1 ) {

            	      		current_scope.put(inst2.getText(), new SimpleSymbol(inst2.getText(), Type.INSTANCE, inst2.getStartIndex(), inst2.getStopIndex(), this.file, new SimpleSymbolsTable(this.current_instance_type), (SimpleSymbol)global_table.getSymbols().get(current_id)));
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:329:6: ( WS )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>='\t' && LA51_0<='\n')||LA51_0=='\r'||LA51_0==' ') ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:329:6: WS
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

    // $ANTLR start "PORT_DEFINITION"
    public final void mPORT_DEFINITION() throws RecognitionException {
        try {
            int _type = PORT_DEFINITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken port=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:338:2: ({...}? =>port= ID ( WS )? '=' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:338:4: {...}? =>port= ID ( WS )? '='
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORT_DEFINITION", "context==EContext.PATTERN_IN");
            }
            int portStart949 = getCharIndex();
            mID(); if (state.failed) return ;
            port = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, portStart949, getCharIndex()-1);
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:339:11: ( WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>='\t' && LA52_0<='\n')||LA52_0=='\r'||LA52_0==' ') ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:339:11: WS
                    {
                    mWS(); if (state.failed) return ;

                    }
                    break;

            }

            match('='); if (state.failed) return ;
            if ( state.backtracking==1 ) {

              		//System.out.println("DEFINING PORT: " + port.getText() );
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORT_DEFINITION"

    // $ANTLR start "PORT_ACCESS"
    public final void mPORT_ACCESS() throws RecognitionException {
        try {
            int _type = PORT_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken pat=null;
            CommonToken port=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:346:2: ({...}? =>pat= ID '.' port= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:346:4: {...}? =>pat= ID '.' port= ID
            {
            if ( !((context==EContext.PATTERN_IN)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "PORT_ACCESS", "context==EContext.PATTERN_IN");
            }
            int patStart977 = getCharIndex();
            mID(); if (state.failed) return ;
            pat = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, patStart977, getCharIndex()-1);
            match('.'); if (state.failed) return ;
            int portStart983 = getCharIndex();
            mID(); if (state.failed) return ;
            port = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, portStart983, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("PORT ACCESS: " + pat.getText() + "." + port.getText());
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORT_ACCESS"

    // $ANTLR start "JOINS"
    public final void mJOINS() throws RecognitionException {
        try {
            int _type = JOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken node=null;

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:354:2: ( ( ']' | 'remaining' ) WS 'as' WS node= ID )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:354:4: ( ']' | 'remaining' ) WS 'as' WS node= ID
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:354:4: ( ']' | 'remaining' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==']') ) {
                alt53=1;
            }
            else if ( (LA53_0=='r') ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:354:5: ']'
                    {
                    match(']'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:354:11: 'remaining'
                    {
                    match("remaining"); if (state.failed) return ;


                    }
                    break;

            }

            mWS(); if (state.failed) return ;
            match("as"); if (state.failed) return ;

            mWS(); if (state.failed) return ;
            int nodeStart1014 = getCharIndex();
            mID(); if (state.failed) return ;
            node = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nodeStart1014, getCharIndex()-1);
            if ( state.backtracking==1 ) {

              		//System.out.println("INTERNAL NODE: " + node.getText());
              	
              		current_scope.put(node.getText(), new SimpleSymbol(node.getText(), Type.NODE, node.getStartIndex(), node.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)));		
              	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOINS"

    // $ANTLR start "FILE_PATH"
    public final void mFILE_PATH() throws RecognitionException {
        try {
            int _type = FILE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:368:2: ({...}? => STRING )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:368:4: {...}? => STRING
            {
            if ( !((context==EContext.IMPORT)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "FILE_PATH", "context==EContext.IMPORT");
            }
            mSTRING(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE_PATH"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:376:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:376:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:376:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>='0' && LA54_0<='9')||(LA54_0>='A' && LA54_0<='Z')||LA54_0=='_'||(LA54_0>='a' && LA54_0<='z')) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:
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
            	    break loop54;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:384:5: ( ( '0' .. '9' )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:384:7: ( '0' .. '9' )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:384:7: ( '0' .. '9' )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>='0' && LA55_0<='9')) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:384:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:392:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:392:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:392:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop56:
            do {
                int alt56=3;
                int LA56_0 = input.LA(1);

                if ( (LA56_0=='\\') ) {
                    alt56=1;
                }
                else if ( ((LA56_0>='\u0000' && LA56_0<='!')||(LA56_0>='#' && LA56_0<='[')||(LA56_0>=']' && LA56_0<='\uFFFF')) ) {
                    alt56=2;
                }


                switch (alt56) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:392:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:392:24: ~ ( '\\\\' | '\"' )
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
            	    break loop56;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:396:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:396:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:400:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0=='\\') ) {
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
                    alt57=1;
                    }
                    break;
                case 'u':
                    {
                    alt57=2;
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
                    alt57=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:400:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:401:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:402:9: OCTAL_ESC
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0=='\\') ) {
                int LA58_1 = input.LA(2);

                if ( ((LA58_1>='0' && LA58_1<='3')) ) {
                    int LA58_2 = input.LA(3);

                    if ( ((LA58_2>='0' && LA58_2<='7')) ) {
                        int LA58_5 = input.LA(4);

                        if ( ((LA58_5>='0' && LA58_5<='7')) ) {
                            alt58=1;
                        }
                        else {
                            alt58=2;}
                    }
                    else {
                        alt58=3;}
                }
                else if ( ((LA58_1>='4' && LA58_1<='7')) ) {
                    int LA58_3 = input.LA(3);

                    if ( ((LA58_3>='0' && LA58_3<='7')) ) {
                        alt58=2;
                    }
                    else {
                        alt58=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:14: ( '0' .. '3' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:15: '0' .. '3'
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:25: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:36: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:407:37: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:408:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:408:14: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:408:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:408:25: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:408:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:409:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:409:14: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:409:15: '0' .. '7'
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:414:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:414:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:420:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:420:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:420:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>='\t' && LA59_0<='\n')||LA59_0=='\r'||LA59_0==' ') ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:
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
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:433:2: ( . )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:433:4: .
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
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:39: ( USE | IN | JOIN | EXIT_TO_DEFAULT_CONTEXT | IMPORT | CHANNEL_NAME | EXTENSION | STATE | OBSERVERS | TIME | STRUCTURE | CONDITION | PORTS_IN | PORTS_OUT | FLOW_REQUESTS | FLOW | PATTERN_NAME | USES | INSTANCES | PORT_DEFINITION | PORT_ACCESS | JOINS | FILE_PATH | WS | QUALQUEROUTRACOISA )
        int alt60=25;
        alt60 = dfa60.predict(input);
        switch (alt60) {
            case 1 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:41: USE
                {
                mUSE(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:45: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:48: JOIN
                {
                mJOIN(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:53: EXIT_TO_DEFAULT_CONTEXT
                {
                mEXIT_TO_DEFAULT_CONTEXT(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:77: IMPORT
                {
                mIMPORT(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:84: CHANNEL_NAME
                {
                mCHANNEL_NAME(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:97: EXTENSION
                {
                mEXTENSION(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:107: STATE
                {
                mSTATE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:113: OBSERVERS
                {
                mOBSERVERS(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:123: TIME
                {
                mTIME(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:128: STRUCTURE
                {
                mSTRUCTURE(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:138: CONDITION
                {
                mCONDITION(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:148: PORTS_IN
                {
                mPORTS_IN(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:157: PORTS_OUT
                {
                mPORTS_OUT(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:167: FLOW_REQUESTS
                {
                mFLOW_REQUESTS(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:181: FLOW
                {
                mFLOW(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:186: PATTERN_NAME
                {
                mPATTERN_NAME(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:199: USES
                {
                mUSES(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:204: INSTANCES
                {
                mINSTANCES(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:214: PORT_DEFINITION
                {
                mPORT_DEFINITION(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:230: PORT_ACCESS
                {
                mPORT_ACCESS(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:242: JOINS
                {
                mJOINS(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:248: FILE_PATH
                {
                mFILE_PATH(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:258: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:261: QUALQUEROUTRACOISA
                {
                mQUALQUEROUTRACOISA(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_FuzzyParserReoLang
    public final void synpred1_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:41: ( USE )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:41: USE
        {
        mUSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_FuzzyParserReoLang

    // $ANTLR start synpred2_FuzzyParserReoLang
    public final void synpred2_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:45: ( IN )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:45: IN
        {
        mIN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_FuzzyParserReoLang

    // $ANTLR start synpred3_FuzzyParserReoLang
    public final void synpred3_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:48: ( JOIN )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:48: JOIN
        {
        mJOIN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_FuzzyParserReoLang

    // $ANTLR start synpred4_FuzzyParserReoLang
    public final void synpred4_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:53: ( EXIT_TO_DEFAULT_CONTEXT )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:53: EXIT_TO_DEFAULT_CONTEXT
        {
        mEXIT_TO_DEFAULT_CONTEXT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_FuzzyParserReoLang

    // $ANTLR start synpred5_FuzzyParserReoLang
    public final void synpred5_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:77: ( IMPORT )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:77: IMPORT
        {
        mIMPORT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_FuzzyParserReoLang

    // $ANTLR start synpred6_FuzzyParserReoLang
    public final void synpred6_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:84: ( CHANNEL_NAME )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:84: CHANNEL_NAME
        {
        mCHANNEL_NAME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_FuzzyParserReoLang

    // $ANTLR start synpred7_FuzzyParserReoLang
    public final void synpred7_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:97: ( EXTENSION )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:97: EXTENSION
        {
        mEXTENSION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_FuzzyParserReoLang

    // $ANTLR start synpred8_FuzzyParserReoLang
    public final void synpred8_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:107: ( STATE )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:107: STATE
        {
        mSTATE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_FuzzyParserReoLang

    // $ANTLR start synpred9_FuzzyParserReoLang
    public final void synpred9_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:113: ( OBSERVERS )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:113: OBSERVERS
        {
        mOBSERVERS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_FuzzyParserReoLang

    // $ANTLR start synpred10_FuzzyParserReoLang
    public final void synpred10_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:123: ( TIME )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:123: TIME
        {
        mTIME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_FuzzyParserReoLang

    // $ANTLR start synpred11_FuzzyParserReoLang
    public final void synpred11_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:128: ( STRUCTURE )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:128: STRUCTURE
        {
        mSTRUCTURE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_FuzzyParserReoLang

    // $ANTLR start synpred12_FuzzyParserReoLang
    public final void synpred12_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:138: ( CONDITION )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:138: CONDITION
        {
        mCONDITION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_FuzzyParserReoLang

    // $ANTLR start synpred13_FuzzyParserReoLang
    public final void synpred13_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:148: ( PORTS_IN )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:148: PORTS_IN
        {
        mPORTS_IN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_FuzzyParserReoLang

    // $ANTLR start synpred14_FuzzyParserReoLang
    public final void synpred14_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:157: ( PORTS_OUT )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:157: PORTS_OUT
        {
        mPORTS_OUT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_FuzzyParserReoLang

    // $ANTLR start synpred15_FuzzyParserReoLang
    public final void synpred15_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:167: ( FLOW_REQUESTS )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:167: FLOW_REQUESTS
        {
        mFLOW_REQUESTS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_FuzzyParserReoLang

    // $ANTLR start synpred16_FuzzyParserReoLang
    public final void synpred16_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:181: ( FLOW )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:181: FLOW
        {
        mFLOW(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_FuzzyParserReoLang

    // $ANTLR start synpred17_FuzzyParserReoLang
    public final void synpred17_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:186: ( PATTERN_NAME )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:186: PATTERN_NAME
        {
        mPATTERN_NAME(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_FuzzyParserReoLang

    // $ANTLR start synpred18_FuzzyParserReoLang
    public final void synpred18_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:199: ( USES )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:199: USES
        {
        mUSES(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_FuzzyParserReoLang

    // $ANTLR start synpred19_FuzzyParserReoLang
    public final void synpred19_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:204: ( INSTANCES )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:204: INSTANCES
        {
        mINSTANCES(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_FuzzyParserReoLang

    // $ANTLR start synpred20_FuzzyParserReoLang
    public final void synpred20_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:214: ( PORT_DEFINITION )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:214: PORT_DEFINITION
        {
        mPORT_DEFINITION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_FuzzyParserReoLang

    // $ANTLR start synpred21_FuzzyParserReoLang
    public final void synpred21_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:230: ( PORT_ACCESS )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:230: PORT_ACCESS
        {
        mPORT_ACCESS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_FuzzyParserReoLang

    // $ANTLR start synpred22_FuzzyParserReoLang
    public final void synpred22_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:242: ( JOINS )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:242: JOINS
        {
        mJOINS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_FuzzyParserReoLang

    // $ANTLR start synpred23_FuzzyParserReoLang
    public final void synpred23_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:248: ( FILE_PATH )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:248: FILE_PATH
        {
        mFILE_PATH(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_FuzzyParserReoLang

    // $ANTLR start synpred24_FuzzyParserReoLang
    public final void synpred24_FuzzyParserReoLang_fragment() throws RecognitionException {   
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:258: ( WS )
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyParserReoLang.g:1:258: WS
        {
        mWS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_FuzzyParserReoLang

    public final boolean synpred20_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FuzzyParserReoLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FuzzyParserReoLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA26_eotS =
        "\2\2\2\uffff";
    static final String DFA26_eofS =
        "\4\uffff";
    static final String DFA26_minS =
        "\2\11\2\uffff";
    static final String DFA26_maxS =
        "\2\54\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA26_specialS =
        "\4\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 210:3: ( ( WS )? ',' ( WS )? port2= ID )*";
        }
    }
    static final String DFA31_eotS =
        "\2\2\2\uffff";
    static final String DFA31_eofS =
        "\4\uffff";
    static final String DFA31_minS =
        "\2\11\2\uffff";
    static final String DFA31_maxS =
        "\2\54\2\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA31_specialS =
        "\4\uffff}>";
    static final String[] DFA31_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 240:3: ( ( WS )? ',' ( WS )? port2= ID )*";
        }
    }
    static final String DFA39_eotS =
        "\4\uffff";
    static final String DFA39_eofS =
        "\4\uffff";
    static final String DFA39_minS =
        "\2\11\2\uffff";
    static final String DFA39_maxS =
        "\2\55\2\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA39_specialS =
        "\4\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\1\2",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 259:21: ( ( WS )? ',' ( WS )? ( '!' ( WS )? )? ID )*";
        }
    }
    static final String DFA44_eotS =
        "\4\uffff";
    static final String DFA44_eofS =
        "\4\uffff";
    static final String DFA44_minS =
        "\2\11\2\uffff";
    static final String DFA44_maxS =
        "\1\100\1\172\2\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA44_specialS =
        "\4\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\37\uffff\1\2",
            "\2\1\2\uffff\1\1\22\uffff\1\1\37\uffff\1\2\32\3\4\uffff\1\3"+
            "\1\uffff\32\3",
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
            return "268:27: ( ( WS )? '@' ( WS )? (time= ID | time= INT ) )?";
        }
    }
    static final String DFA50_eotS =
        "\2\2\2\uffff";
    static final String DFA50_eofS =
        "\4\uffff";
    static final String DFA50_minS =
        "\2\11\2\uffff";
    static final String DFA50_maxS =
        "\2\54\2\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA50_specialS =
        "\4\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "\2\1\2\uffff\1\1\22\uffff\1\1\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 323:3: ( ( WS )? ',' ( WS )? inst2= ID )*";
        }
    }
    static final String DFA60_eotS =
        "\57\uffff";
    static final String DFA60_eofS =
        "\57\uffff";
    static final String DFA60_minS =
        "\26\0\31\uffff";
    static final String DFA60_maxS =
        "\1\uffff\25\0\31\uffff";
    static final String DFA60_acceptS =
        "\26\uffff\1\31\1\1\1\17\1\22\1\24\1\25\1\2\1\5\1\3\1\4\1\6\1\7\1"+
        "\10\1\11\1\12\1\13\1\14\1\16\1\15\1\20\1\21\1\23\1\26\1\27\1\30";
    static final String DFA60_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\31\uffff}>";
    static final String[] DFA60_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\15\1\24\5\26\1\14\21\26\1"+
            "\13\5\26\1\11\32\23\2\26\1\22\1\26\1\23\1\26\1\20\1\23\1\5\1"+
            "\23\1\6\1\16\2\23\1\2\1\3\4\23\1\10\1\17\1\23\1\21\1\7\1\23"+
            "\1\1\5\23\2\26\1\4\1\12\uff81\26",
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

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "1:1: Tokens options {k=1; backtrack=true; } : ( USE | IN | JOIN | EXIT_TO_DEFAULT_CONTEXT | IMPORT | CHANNEL_NAME | EXTENSION | STATE | OBSERVERS | TIME | STRUCTURE | CONDITION | PORTS_IN | PORTS_OUT | FLOW_REQUESTS | FLOW | PATTERN_NAME | USES | INSTANCES | PORT_DEFINITION | PORT_ACCESS | JOINS | FILE_PATH | WS | QUALQUEROUTRACOISA );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_0 = input.LA(1);

                        s = -1;
                        if ( (LA60_0=='u') ) {s = 1;}

                        else if ( (LA60_0=='i') ) {s = 2;}

                        else if ( (LA60_0=='j') ) {s = 3;}

                        else if ( (LA60_0=='}') ) {s = 4;}

                        else if ( (LA60_0=='c') ) {s = 5;}

                        else if ( (LA60_0=='e') ) {s = 6;}

                        else if ( (LA60_0=='s') ) {s = 7;}

                        else if ( (LA60_0=='o') ) {s = 8;}

                        else if ( (LA60_0=='@') ) {s = 9;}

                        else if ( (LA60_0=='~') ) {s = 10;}

                        else if ( (LA60_0==':') ) {s = 11;}

                        else if ( (LA60_0=='(') ) {s = 12;}

                        else if ( (LA60_0=='!') ) {s = 13;}

                        else if ( (LA60_0=='f') ) {s = 14;}

                        else if ( (LA60_0=='p') ) {s = 15;}

                        else if ( (LA60_0=='a') ) {s = 16;}

                        else if ( (LA60_0=='r') ) {s = 17;}

                        else if ( (LA60_0==']') ) {s = 18;}

                        else if ( ((LA60_0>='A' && LA60_0<='Z')||LA60_0=='_'||LA60_0=='b'||LA60_0=='d'||(LA60_0>='g' && LA60_0<='h')||(LA60_0>='k' && LA60_0<='n')||LA60_0=='q'||LA60_0=='t'||(LA60_0>='v' && LA60_0<='z')) ) {s = 19;}

                        else if ( (LA60_0=='\"') ) {s = 20;}

                        else if ( ((LA60_0>='\t' && LA60_0<='\n')||LA60_0=='\r'||LA60_0==' ') ) {s = 21;}

                        else if ( ((LA60_0>='\u0000' && LA60_0<='\b')||(LA60_0>='\u000B' && LA60_0<='\f')||(LA60_0>='\u000E' && LA60_0<='\u001F')||(LA60_0>='#' && LA60_0<='\'')||(LA60_0>=')' && LA60_0<='9')||(LA60_0>=';' && LA60_0<='?')||(LA60_0>='[' && LA60_0<='\\')||LA60_0=='^'||LA60_0=='`'||(LA60_0>='{' && LA60_0<='|')||(LA60_0>='\u007F' && LA60_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_FuzzyParserReoLang()) ) {s = 23;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_FuzzyParserReoLang()) ) {s = 28;}

                        else if ( (synpred5_FuzzyParserReoLang()) ) {s = 29;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_FuzzyParserReoLang()) ) {s = 30;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_FuzzyParserReoLang()) ) {s = 31;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_FuzzyParserReoLang()) ) {s = 32;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred7_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 33;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred8_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 34;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred9_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 35;}

                        else if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred10_FuzzyParserReoLang()&&(context==EContext.CHANNEL || context==EContext.PATTERN_USE))) ) {s = 36;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred11_FuzzyParserReoLang()&&(context==EContext.CHANNEL || context==EContext.PATTERN_USE))) ) {s = 37;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_11 = input.LA(1);

                         
                        int index60_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred12_FuzzyParserReoLang()&&(context==EContext.CHANNEL || context==EContext.PATTERN_USE))) ) {s = 38;}

                        else if ( ((synpred14_FuzzyParserReoLang()&&(context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION))) ) {s = 39;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_12 = input.LA(1);

                         
                        int index60_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred13_FuzzyParserReoLang()&&(context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION))) ) {s = 40;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_13 = input.LA(1);

                         
                        int index60_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_14 = input.LA(1);

                         
                        int index60_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred16_FuzzyParserReoLang()&&(context==EContext.FLOW_DEFS))) ) {s = 41;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_15 = input.LA(1);

                         
                        int index60_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( (synpred17_FuzzyParserReoLang()) ) {s = 42;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_16 = input.LA(1);

                         
                        int index60_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred19_FuzzyParserReoLang()&&(context==EContext.PATTERN_INSTANCE_DEFINITION))) ) {s = 43;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_17 = input.LA(1);

                         
                        int index60_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (synpred22_FuzzyParserReoLang()) ) {s = 44;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_17);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_18 = input.LA(1);

                         
                        int index60_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_FuzzyParserReoLang()) ) {s = 44;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_18);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_19 = input.LA(1);

                         
                        int index60_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred15_FuzzyParserReoLang()&&(context==EContext.CHANNEL))) ) {s = 24;}

                        else if ( ((synpred18_FuzzyParserReoLang()&&(context==EContext.PATTERN_USE))) ) {s = 25;}

                        else if ( ((synpred20_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 26;}

                        else if ( ((synpred21_FuzzyParserReoLang()&&(context==EContext.PATTERN_IN))) ) {s = 27;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_19);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_20 = input.LA(1);

                         
                        int index60_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred23_FuzzyParserReoLang()&&(context==EContext.IMPORT))) ) {s = 45;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA60_21 = input.LA(1);

                         
                        int index60_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_FuzzyParserReoLang()) ) {s = 46;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index60_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
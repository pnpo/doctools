// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g 2013-09-10 15:09:53

	package pt.uminho.di.reolang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReoLangLexer extends Lexer {
    public static final int RW_PATTERN=11;
    public static final int RW_OF=7;
    public static final int OCTAL_ESC=49;
    public static final int PORTS_CLOSE=26;
    public static final int EQUALS=21;
    public static final int FLOAT=43;
    public static final int RW_USE=8;
    public static final int RW_FLOW=13;
    public static final int ID=41;
    public static final int EOF=-1;
    public static final int RW_CHANNEL=17;
    public static final int LABEL_MARK=33;
    public static final int ARROW_MARK=32;
    public static final int ESC_SEQ=46;
    public static final int RW_TO=14;
    public static final int COND_OPEN=37;
    public static final int RW_JOIN=5;
    public static final int ACCESS_MARK=29;
    public static final int COMMA=23;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=30;
    public static final int RW_IMPORT=18;
    public static final int LIST_OPEN=19;
    public static final int RW_EXTENDS=12;
    public static final int COMMENT=44;
    public static final int PORTS_OPEN=25;
    public static final int RW_OBSERVERS=15;
    public static final int BODY_OPEN=27;
    public static final int COND_CLOSE=38;
    public static final int UNICODE_ESC=48;
    public static final int HEX_DIGIT=47;
    public static final int TIME_MARK=35;
    public static final int SEMICOLON=22;
    public static final int INT=42;
    public static final int RW_AS=6;
    public static final int OP_SYNC=36;
    public static final int LIST_CLOSE=20;
    public static final int COLON=24;
    public static final int WS=45;
    public static final int NOT_MARK=31;
    public static final int STRUCTURE_MARK=34;
    public static final int RW_STATE=16;
    public static final int BODY_CLOSE=28;
    public static final int RW_DECIDE=4;
    public static final int RW_IN=9;
    public static final int FILE_PATH=40;
    public static final int STRING=39;

    	boolean importMode = false;	


    // delegates
    // delegators

    public ReoLangLexer() {;} 
    public ReoLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ReoLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g"; }

    // $ANTLR start "RW_DECIDE"
    public final void mRW_DECIDE() throws RecognitionException {
        try {
            int _type = RW_DECIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:16:2: ( 'decide' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:16:4: 'decide'
            {
            match("decide"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_DECIDE"

    // $ANTLR start "RW_JOIN"
    public final void mRW_JOIN() throws RecognitionException {
        try {
            int _type = RW_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:24:2: ( 'join' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:24:4: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_JOIN"

    // $ANTLR start "RW_AS"
    public final void mRW_AS() throws RecognitionException {
        try {
            int _type = RW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:28:2: ( 'as' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:28:4: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_AS"

    // $ANTLR start "RW_OF"
    public final void mRW_OF() throws RecognitionException {
        try {
            int _type = RW_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:32:2: ( 'of' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:32:4: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_OF"

    // $ANTLR start "RW_USE"
    public final void mRW_USE() throws RecognitionException {
        try {
            int _type = RW_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:36:2: ( 'use' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:36:4: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_USE"

    // $ANTLR start "RW_IN"
    public final void mRW_IN() throws RecognitionException {
        try {
            int _type = RW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:40:2: ( 'in' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:40:4: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_IN"

    // $ANTLR start "RW_NULL"
    public final void mRW_NULL() throws RecognitionException {
        try {
            int _type = RW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:44:2: ( 'NULL' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:44:4: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_NULL"

    // $ANTLR start "RW_PATTERN"
    public final void mRW_PATTERN() throws RecognitionException {
        try {
            int _type = RW_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:48:2: ( 'pattern' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:48:4: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_PATTERN"

    // $ANTLR start "RW_EXTENDS"
    public final void mRW_EXTENDS() throws RecognitionException {
        try {
            int _type = RW_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:52:2: ( 'extends' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:52:4: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_EXTENDS"

    // $ANTLR start "RW_FLOW"
    public final void mRW_FLOW() throws RecognitionException {
        try {
            int _type = RW_FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:56:2: ( 'flow' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:56:4: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_FLOW"

    // $ANTLR start "RW_TO"
    public final void mRW_TO() throws RecognitionException {
        try {
            int _type = RW_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:60:2: ( 'to' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:60:4: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_TO"

    // $ANTLR start "RW_OBSERVERS"
    public final void mRW_OBSERVERS() throws RecognitionException {
        try {
            int _type = RW_OBSERVERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:64:2: ( 'observers' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:64:4: 'observers'
            {
            match("observers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_OBSERVERS"

    // $ANTLR start "RW_STATE"
    public final void mRW_STATE() throws RecognitionException {
        try {
            int _type = RW_STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:68:2: ( 'state' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:68:4: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_STATE"

    // $ANTLR start "RW_CHANNEL"
    public final void mRW_CHANNEL() throws RecognitionException {
        try {
            int _type = RW_CHANNEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:72:2: ( 'channel' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:72:4: 'channel'
            {
            match("channel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_CHANNEL"

    // $ANTLR start "RW_IMPORT"
    public final void mRW_IMPORT() throws RecognitionException {
        try {
            int _type = RW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:76:2: ( 'import' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:76:4: 'import'
            {
            match("import"); 

            importMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_IMPORT"

    // $ANTLR start "LIST_OPEN"
    public final void mLIST_OPEN() throws RecognitionException {
        try {
            int _type = LIST_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:83:2: ( '[' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:83:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST_OPEN"

    // $ANTLR start "LIST_CLOSE"
    public final void mLIST_CLOSE() throws RecognitionException {
        try {
            int _type = LIST_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:87:2: ( ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:87:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST_CLOSE"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:91:2: ( '=' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:91:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:95:2: ( ';' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:95:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:99:2: ( ',' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:99:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:103:2: ( ':' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:103:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "PORTS_OPEN"
    public final void mPORTS_OPEN() throws RecognitionException {
        try {
            int _type = PORTS_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:107:2: ( '(' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:107:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORTS_OPEN"

    // $ANTLR start "PORTS_CLOSE"
    public final void mPORTS_CLOSE() throws RecognitionException {
        try {
            int _type = PORTS_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:111:2: ( ')' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:111:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORTS_CLOSE"

    // $ANTLR start "BODY_OPEN"
    public final void mBODY_OPEN() throws RecognitionException {
        try {
            int _type = BODY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:115:2: ( '{' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:115:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BODY_OPEN"

    // $ANTLR start "BODY_CLOSE"
    public final void mBODY_CLOSE() throws RecognitionException {
        try {
            int _type = BODY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:119:2: ( '}' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:119:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BODY_CLOSE"

    // $ANTLR start "ACCESS_MARK"
    public final void mACCESS_MARK() throws RecognitionException {
        try {
            int _type = ACCESS_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:123:2: ( '.' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:123:4: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCESS_MARK"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:127:2: ( '?' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:127:4: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "NOT_MARK"
    public final void mNOT_MARK() throws RecognitionException {
        try {
            int _type = NOT_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:131:2: ( '!' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:131:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_MARK"

    // $ANTLR start "ARROW_MARK"
    public final void mARROW_MARK() throws RecognitionException {
        try {
            int _type = ARROW_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:135:2: ( '->' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:135:4: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW_MARK"

    // $ANTLR start "LABEL_MARK"
    public final void mLABEL_MARK() throws RecognitionException {
        try {
            int _type = LABEL_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:139:2: ( '#' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:139:4: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LABEL_MARK"

    // $ANTLR start "STRUCTURE_MARK"
    public final void mSTRUCTURE_MARK() throws RecognitionException {
        try {
            int _type = STRUCTURE_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:143:2: ( '~' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:143:4: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCTURE_MARK"

    // $ANTLR start "TIME_MARK"
    public final void mTIME_MARK() throws RecognitionException {
        try {
            int _type = TIME_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:147:2: ( '@' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:147:4: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME_MARK"

    // $ANTLR start "OP_SYNC"
    public final void mOP_SYNC() throws RecognitionException {
        try {
            int _type = OP_SYNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:151:2: ( '|' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:151:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SYNC"

    // $ANTLR start "COND_OPEN"
    public final void mCOND_OPEN() throws RecognitionException {
        try {
            int _type = COND_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:156:2: ( '<' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:156:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COND_OPEN"

    // $ANTLR start "COND_CLOSE"
    public final void mCOND_CLOSE() throws RecognitionException {
        try {
            int _type = COND_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:160:2: ( '>' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:160:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COND_CLOSE"

    // $ANTLR start "FILE_PATH"
    public final void mFILE_PATH() throws RecognitionException {
        try {
            int _type = FILE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:181:2: ({...}? => STRING )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:181:4: {...}? => STRING
            {
            if ( !((importMode)) ) {
                throw new FailedPredicateException(input, "FILE_PATH", "importMode");
            }
            mSTRING(); 
            importMode=false;

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
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:193:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:193:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:193:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:197:5: ( ( '0' .. '9' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:197:7: ( '0' .. '9' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:197:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:197:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:201:7: ( ( INT )? '.' INT )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:201:9: ( INT )? '.' INT
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:201:9: ( INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:201:9: INT
                    {
                    mINT(); 

                    }
                    break;

            }

            match('.'); 
            mINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='/') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='*') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:14: (~ ( '\\n' | '\\r' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:28: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:206:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:207:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:207:14: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:207:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:210:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:210:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:219:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:219:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:219:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:219:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:219:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:223:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:223:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:227:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
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
                    alt9=1;
                    }
                    break;
                case 'u':
                    {
                    alt9=2;
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
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:227:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:228:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:229:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='3')) ) {
                    int LA10_2 = input.LA(3);

                    if ( ((LA10_2>='0' && LA10_2<='7')) ) {
                        int LA10_4 = input.LA(4);

                        if ( ((LA10_4>='0' && LA10_4<='7')) ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else {
                        alt10=3;}
                }
                else if ( ((LA10_1>='4' && LA10_1<='7')) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>='0' && LA10_3<='7')) ) {
                        alt10=2;
                    }
                    else {
                        alt10=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:14: ( '0' .. '3' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:36: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:234:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:235:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:235:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:235:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:235:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:235:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:236:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:236:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:236:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:241:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:241:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:8: ( RW_DECIDE | RW_JOIN | RW_AS | RW_OF | RW_USE | RW_IN | RW_NULL | RW_PATTERN | RW_EXTENDS | RW_FLOW | RW_TO | RW_OBSERVERS | RW_STATE | RW_CHANNEL | RW_IMPORT | LIST_OPEN | LIST_CLOSE | EQUALS | SEMICOLON | COMMA | COLON | PORTS_OPEN | PORTS_CLOSE | BODY_OPEN | BODY_CLOSE | ACCESS_MARK | QUESTION_MARK | NOT_MARK | ARROW_MARK | LABEL_MARK | STRUCTURE_MARK | TIME_MARK | OP_SYNC | COND_OPEN | COND_CLOSE | FILE_PATH | ID | INT | FLOAT | COMMENT | WS )
        int alt11=41;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:10: RW_DECIDE
                {
                mRW_DECIDE(); 

                }
                break;
            case 2 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:20: RW_JOIN
                {
                mRW_JOIN(); 

                }
                break;
            case 3 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:28: RW_AS
                {
                mRW_AS(); 

                }
                break;
            case 4 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:34: RW_OF
                {
                mRW_OF(); 

                }
                break;
            case 5 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:40: RW_USE
                {
                mRW_USE(); 

                }
                break;
            case 6 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:47: RW_IN
                {
                mRW_IN(); 

                }
                break;
            case 7 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:53: RW_NULL
                {
                mRW_NULL(); 

                }
                break;
            case 8 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:61: RW_PATTERN
                {
                mRW_PATTERN(); 

                }
                break;
            case 9 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:72: RW_EXTENDS
                {
                mRW_EXTENDS(); 

                }
                break;
            case 10 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:83: RW_FLOW
                {
                mRW_FLOW(); 

                }
                break;
            case 11 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:91: RW_TO
                {
                mRW_TO(); 

                }
                break;
            case 12 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:97: RW_OBSERVERS
                {
                mRW_OBSERVERS(); 

                }
                break;
            case 13 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:110: RW_STATE
                {
                mRW_STATE(); 

                }
                break;
            case 14 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:119: RW_CHANNEL
                {
                mRW_CHANNEL(); 

                }
                break;
            case 15 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:130: RW_IMPORT
                {
                mRW_IMPORT(); 

                }
                break;
            case 16 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:140: LIST_OPEN
                {
                mLIST_OPEN(); 

                }
                break;
            case 17 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:150: LIST_CLOSE
                {
                mLIST_CLOSE(); 

                }
                break;
            case 18 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:161: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 19 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:168: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 20 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:178: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 21 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:184: COLON
                {
                mCOLON(); 

                }
                break;
            case 22 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:190: PORTS_OPEN
                {
                mPORTS_OPEN(); 

                }
                break;
            case 23 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:201: PORTS_CLOSE
                {
                mPORTS_CLOSE(); 

                }
                break;
            case 24 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:213: BODY_OPEN
                {
                mBODY_OPEN(); 

                }
                break;
            case 25 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:223: BODY_CLOSE
                {
                mBODY_CLOSE(); 

                }
                break;
            case 26 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:234: ACCESS_MARK
                {
                mACCESS_MARK(); 

                }
                break;
            case 27 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:246: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 28 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:260: NOT_MARK
                {
                mNOT_MARK(); 

                }
                break;
            case 29 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:269: ARROW_MARK
                {
                mARROW_MARK(); 

                }
                break;
            case 30 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:280: LABEL_MARK
                {
                mLABEL_MARK(); 

                }
                break;
            case 31 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:291: STRUCTURE_MARK
                {
                mSTRUCTURE_MARK(); 

                }
                break;
            case 32 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:306: TIME_MARK
                {
                mTIME_MARK(); 

                }
                break;
            case 33 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:316: OP_SYNC
                {
                mOP_SYNC(); 

                }
                break;
            case 34 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:324: COND_OPEN
                {
                mCOND_OPEN(); 

                }
                break;
            case 35 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:334: COND_CLOSE
                {
                mCOND_CLOSE(); 

                }
                break;
            case 36 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:345: FILE_PATH
                {
                mFILE_PATH(); 

                }
                break;
            case 37 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:355: ID
                {
                mID(); 

                }
                break;
            case 38 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:358: INT
                {
                mINT(); 

                }
                break;
            case 39 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:362: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 40 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:368: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 41 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangLexer.g:1:376: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\15\43\12\uffff\1\67\13\uffff\1\70\2\uffff\2\43\1\73\1\74"+
        "\2\43\1\77\5\43\1\105\2\43\3\uffff\2\43\2\uffff\1\43\1\113\1\uffff"+
        "\5\43\1\uffff\3\43\1\124\1\43\1\uffff\1\43\1\127\2\43\1\132\3\43"+
        "\1\uffff\2\43\1\uffff\2\43\1\uffff\1\142\1\43\1\144\1\43\1\146\2"+
        "\43\1\uffff\1\43\1\uffff\1\43\1\uffff\1\153\1\154\1\155\1\43\3\uffff"+
        "\1\157\1\uffff";
    static final String DFA11_eofS =
        "\160\uffff";
    static final String DFA11_minS =
        "\1\11\1\145\1\157\1\163\1\142\1\163\1\155\1\125\1\141\1\170\1\154"+
        "\1\157\1\164\1\150\12\uffff\1\60\13\uffff\1\56\2\uffff\1\143\1\151"+
        "\2\60\1\163\1\145\1\60\1\160\1\114\2\164\1\157\1\60\2\141\3\uffff"+
        "\1\151\1\156\2\uffff\1\145\1\60\1\uffff\1\157\1\114\1\164\1\145"+
        "\1\167\1\uffff\1\164\1\156\1\144\1\60\1\162\1\uffff\1\162\1\60\1"+
        "\145\1\156\1\60\1\145\1\156\1\145\1\uffff\1\166\1\164\1\uffff\1"+
        "\162\1\144\1\uffff\1\60\1\145\1\60\1\145\1\60\1\156\1\163\1\uffff"+
        "\1\154\1\uffff\1\162\1\uffff\3\60\1\163\3\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\176\1\145\1\157\1\163\1\146\1\163\1\156\1\125\1\141\1\170\1\154"+
        "\1\157\1\164\1\150\12\uffff\1\71\13\uffff\1\71\2\uffff\1\143\1\151"+
        "\2\172\1\163\1\145\1\172\1\160\1\114\2\164\1\157\1\172\2\141\3\uffff"+
        "\1\151\1\156\2\uffff\1\145\1\172\1\uffff\1\157\1\114\1\164\1\145"+
        "\1\167\1\uffff\1\164\1\156\1\144\1\172\1\162\1\uffff\1\162\1\172"+
        "\1\145\1\156\1\172\1\145\1\156\1\145\1\uffff\1\166\1\164\1\uffff"+
        "\1\162\1\144\1\uffff\1\172\1\145\1\172\1\145\1\172\1\156\1\163\1"+
        "\uffff\1\154\1\uffff\1\162\1\uffff\3\172\1\163\3\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\16\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\uffff"+
        "\1\50\1\51\17\uffff\1\47\1\32\1\46\2\uffff\1\3\1\4\2\uffff\1\6\5"+
        "\uffff\1\13\5\uffff\1\5\10\uffff\1\2\2\uffff\1\7\2\uffff\1\12\7"+
        "\uffff\1\15\1\uffff\1\1\1\uffff\1\17\4\uffff\1\10\1\11\1\16\1\uffff"+
        "\1\14";
    static final String DFA11_specialS =
        "\1\0\157\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\32\1\42\1\34\4\uffff\1\24"+
            "\1\25\2\uffff\1\22\1\33\1\30\1\45\12\44\1\23\1\21\1\40\1\20"+
            "\1\41\1\31\1\36\15\43\1\7\14\43\1\16\1\uffff\1\17\1\uffff\1"+
            "\43\1\uffff\1\3\1\43\1\15\1\1\1\11\1\12\2\43\1\6\1\2\4\43\1"+
            "\4\1\10\2\43\1\14\1\13\1\5\5\43\1\26\1\37\1\27\1\35",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53\3\uffff\1\52",
            "\1\54",
            "\1\56\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
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
            "\12\66",
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
            "\1\66\1\uffff\12\44",
            "",
            "",
            "\1\71",
            "\1\72",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\75",
            "\1\76",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\112",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\125",
            "",
            "\1\126",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\130",
            "\1\131",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\143",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\145",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "",
            "\1\152",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\156",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            return "1:1: Tokens : ( RW_DECIDE | RW_JOIN | RW_AS | RW_OF | RW_USE | RW_IN | RW_NULL | RW_PATTERN | RW_EXTENDS | RW_FLOW | RW_TO | RW_OBSERVERS | RW_STATE | RW_CHANNEL | RW_IMPORT | LIST_OPEN | LIST_CLOSE | EQUALS | SEMICOLON | COMMA | COLON | PORTS_OPEN | PORTS_CLOSE | BODY_OPEN | BODY_CLOSE | ACCESS_MARK | QUESTION_MARK | NOT_MARK | ARROW_MARK | LABEL_MARK | STRUCTURE_MARK | TIME_MARK | OP_SYNC | COND_OPEN | COND_CLOSE | FILE_PATH | ID | INT | FLOAT | COMMENT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0=='d') ) {s = 1;}

                        else if ( (LA11_0=='j') ) {s = 2;}

                        else if ( (LA11_0=='a') ) {s = 3;}

                        else if ( (LA11_0=='o') ) {s = 4;}

                        else if ( (LA11_0=='u') ) {s = 5;}

                        else if ( (LA11_0=='i') ) {s = 6;}

                        else if ( (LA11_0=='N') ) {s = 7;}

                        else if ( (LA11_0=='p') ) {s = 8;}

                        else if ( (LA11_0=='e') ) {s = 9;}

                        else if ( (LA11_0=='f') ) {s = 10;}

                        else if ( (LA11_0=='t') ) {s = 11;}

                        else if ( (LA11_0=='s') ) {s = 12;}

                        else if ( (LA11_0=='c') ) {s = 13;}

                        else if ( (LA11_0=='[') ) {s = 14;}

                        else if ( (LA11_0==']') ) {s = 15;}

                        else if ( (LA11_0=='=') ) {s = 16;}

                        else if ( (LA11_0==';') ) {s = 17;}

                        else if ( (LA11_0==',') ) {s = 18;}

                        else if ( (LA11_0==':') ) {s = 19;}

                        else if ( (LA11_0=='(') ) {s = 20;}

                        else if ( (LA11_0==')') ) {s = 21;}

                        else if ( (LA11_0=='{') ) {s = 22;}

                        else if ( (LA11_0=='}') ) {s = 23;}

                        else if ( (LA11_0=='.') ) {s = 24;}

                        else if ( (LA11_0=='?') ) {s = 25;}

                        else if ( (LA11_0=='!') ) {s = 26;}

                        else if ( (LA11_0=='-') ) {s = 27;}

                        else if ( (LA11_0=='#') ) {s = 28;}

                        else if ( (LA11_0=='~') ) {s = 29;}

                        else if ( (LA11_0=='@') ) {s = 30;}

                        else if ( (LA11_0=='|') ) {s = 31;}

                        else if ( (LA11_0=='<') ) {s = 32;}

                        else if ( (LA11_0=='>') ) {s = 33;}

                        else if ( (LA11_0=='\"') && ((importMode))) {s = 34;}

                        else if ( ((LA11_0>='A' && LA11_0<='M')||(LA11_0>='O' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='b'||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='k' && LA11_0<='n')||(LA11_0>='q' && LA11_0<='r')||(LA11_0>='v' && LA11_0<='z')) ) {s = 35;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 36;}

                        else if ( (LA11_0=='/') ) {s = 37;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 38;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g 2012-06-12 16:07:50

	package pt.uminho.di.reolang.reclang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecLexer extends Lexer {
    public static final int SEP_LIST_END=38;
    public static final int UNICODE_ESC=51;
    public static final int OP_INTERSECTION=25;
    public static final int DT_TRIPLE=13;
    public static final int SEP_ACCESSOR=41;
    public static final int DT_NODE=10;
    public static final int SEP_ARGS_END=34;
    public static final int OP_UPDATE=19;
    public static final int OP_FST=20;
    public static final int SEP_BLOCK_START=28;
    public static final int DT_PATTERN=7;
    public static final int OP_SND=21;
    public static final int OP_EQUAL=27;
    public static final int INT=45;
    public static final int DT_PAIR=12;
    public static final int OP_APPLY=23;
    public static final int OP_TRD=22;
    public static final int SEP_OPTIONAL=35;
    public static final int CONS_PAIR=42;
    public static final int OP_PATH=18;
    public static final int RW_FORALL=5;
    public static final int HEX_DIGIT=50;
    public static final int OP_PAR=14;
    public static final int SEP_COMMA=30;
    public static final int OCTAL_ESC=52;
    public static final int OP_REMOVE=17;
    public static final int ID=44;
    public static final int DT_NAME=9;
    public static final int WS=47;
    public static final int DT_CHANNEL=8;
    public static final int STRING=49;
    public static final int RW_IMPORT=6;
    public static final int CONS_TRIPLE=43;
    public static final int COMMENT=46;
    public static final int SEP_LIST_START=37;
    public static final int ESC_SEQ=48;
    public static final int OP_UNION=24;
    public static final int SEP_COLON=32;
    public static final int SEP_ARGS_START=33;
    public static final int SEP_TRIGGER=36;
    public static final int SEP_SEMICOLON=31;
    public static final int OP_MINUS=26;
    public static final int EOF=-1;
    public static final int OP_JOIN=15;
    public static final int SEP_BLOCK_END=29;
    public static final int SEP_SUBTYPE_END=40;
    public static final int DT_LIST=11;
    public static final int RW_RECONFIGURATION=4;
    public static final int SEP_SUBTYPE_START=39;
    public static final int OP_SPLIT=16;

    // delegates
    // delegators

    public RecLexer() {;} 
    public RecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g"; }

    // $ANTLR start "RW_RECONFIGURATION"
    public final void mRW_RECONFIGURATION() throws RecognitionException {
        try {
            int _type = RW_RECONFIGURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:11:2: ( 'reconfiguration' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:11:4: 'reconfiguration'
            {
            match("reconfiguration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_RECONFIGURATION"

    // $ANTLR start "RW_FORALL"
    public final void mRW_FORALL() throws RecognitionException {
        try {
            int _type = RW_FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:15:2: ( 'forall' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:15:4: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_FORALL"

    // $ANTLR start "RW_IMPORT"
    public final void mRW_IMPORT() throws RecognitionException {
        try {
            int _type = RW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:19:2: ( 'import' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:19:4: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RW_IMPORT"

    // $ANTLR start "DT_PATTERN"
    public final void mDT_PATTERN() throws RecognitionException {
        try {
            int _type = DT_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:28:2: ( 'Pattern' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:28:4: 'Pattern'
            {
            match("Pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_PATTERN"

    // $ANTLR start "DT_CHANNEL"
    public final void mDT_CHANNEL() throws RecognitionException {
        try {
            int _type = DT_CHANNEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:32:2: ( 'Channel' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:32:4: 'Channel'
            {
            match("Channel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_CHANNEL"

    // $ANTLR start "DT_NAME"
    public final void mDT_NAME() throws RecognitionException {
        try {
            int _type = DT_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:36:2: ( 'Name' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:36:4: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_NAME"

    // $ANTLR start "DT_NODE"
    public final void mDT_NODE() throws RecognitionException {
        try {
            int _type = DT_NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:40:2: ( 'Node' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:40:5: 'Node'
            {
            match("Node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_NODE"

    // $ANTLR start "DT_LIST"
    public final void mDT_LIST() throws RecognitionException {
        try {
            int _type = DT_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:44:2: ( 'List' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:44:4: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_LIST"

    // $ANTLR start "DT_PAIR"
    public final void mDT_PAIR() throws RecognitionException {
        try {
            int _type = DT_PAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:48:2: ( 'Pair' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:48:4: 'Pair'
            {
            match("Pair"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_PAIR"

    // $ANTLR start "DT_TRIPLE"
    public final void mDT_TRIPLE() throws RecognitionException {
        try {
            int _type = DT_TRIPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:52:2: ( 'Triple' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:52:4: 'Triple'
            {
            match("Triple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_TRIPLE"

    // $ANTLR start "OP_PAR"
    public final void mOP_PAR() throws RecognitionException {
        try {
            int _type = OP_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:60:2: ( 'par' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:60:4: 'par'
            {
            match("par"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_PAR"

    // $ANTLR start "OP_JOIN"
    public final void mOP_JOIN() throws RecognitionException {
        try {
            int _type = OP_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:64:2: ( 'join' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:64:4: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_JOIN"

    // $ANTLR start "OP_SPLIT"
    public final void mOP_SPLIT() throws RecognitionException {
        try {
            int _type = OP_SPLIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:68:2: ( 'split' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:68:4: 'split'
            {
            match("split"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SPLIT"

    // $ANTLR start "OP_REMOVE"
    public final void mOP_REMOVE() throws RecognitionException {
        try {
            int _type = OP_REMOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:72:2: ( 'remove' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:72:4: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_REMOVE"

    // $ANTLR start "OP_PATH"
    public final void mOP_PATH() throws RecognitionException {
        try {
            int _type = OP_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:76:2: ( 'path' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:76:4: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_PATH"

    // $ANTLR start "OP_UPDATE"
    public final void mOP_UPDATE() throws RecognitionException {
        try {
            int _type = OP_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:80:2: ( 'update' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:80:4: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_UPDATE"

    // $ANTLR start "OP_FST"
    public final void mOP_FST() throws RecognitionException {
        try {
            int _type = OP_FST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:84:2: ( 'fst' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:84:4: 'fst'
            {
            match("fst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_FST"

    // $ANTLR start "OP_SND"
    public final void mOP_SND() throws RecognitionException {
        try {
            int _type = OP_SND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:88:2: ( 'snd' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:88:4: 'snd'
            {
            match("snd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SND"

    // $ANTLR start "OP_TRD"
    public final void mOP_TRD() throws RecognitionException {
        try {
            int _type = OP_TRD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:92:2: ( 'trd' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:92:4: 'trd'
            {
            match("trd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_TRD"

    // $ANTLR start "OP_APPLY"
    public final void mOP_APPLY() throws RecognitionException {
        try {
            int _type = OP_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:98:2: ( '@' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:98:4: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_APPLY"

    // $ANTLR start "OP_UNION"
    public final void mOP_UNION() throws RecognitionException {
        try {
            int _type = OP_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:102:2: ( '+' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:102:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_UNION"

    // $ANTLR start "OP_INTERSECTION"
    public final void mOP_INTERSECTION() throws RecognitionException {
        try {
            int _type = OP_INTERSECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:106:2: ( '&' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:106:4: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_INTERSECTION"

    // $ANTLR start "OP_MINUS"
    public final void mOP_MINUS() throws RecognitionException {
        try {
            int _type = OP_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:110:2: ( '\\\\' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:110:4: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MINUS"

    // $ANTLR start "OP_EQUAL"
    public final void mOP_EQUAL() throws RecognitionException {
        try {
            int _type = OP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:114:2: ( '=' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:114:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_EQUAL"

    // $ANTLR start "SEP_BLOCK_START"
    public final void mSEP_BLOCK_START() throws RecognitionException {
        try {
            int _type = SEP_BLOCK_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:121:2: ( '{' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:121:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_BLOCK_START"

    // $ANTLR start "SEP_BLOCK_END"
    public final void mSEP_BLOCK_END() throws RecognitionException {
        try {
            int _type = SEP_BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:125:2: ( '}' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:125:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_BLOCK_END"

    // $ANTLR start "SEP_COMMA"
    public final void mSEP_COMMA() throws RecognitionException {
        try {
            int _type = SEP_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:129:2: ( ',' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:129:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_COMMA"

    // $ANTLR start "SEP_SEMICOLON"
    public final void mSEP_SEMICOLON() throws RecognitionException {
        try {
            int _type = SEP_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:133:2: ( ';' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:133:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_SEMICOLON"

    // $ANTLR start "SEP_COLON"
    public final void mSEP_COLON() throws RecognitionException {
        try {
            int _type = SEP_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:137:2: ( ':' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:137:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_COLON"

    // $ANTLR start "SEP_ARGS_START"
    public final void mSEP_ARGS_START() throws RecognitionException {
        try {
            int _type = SEP_ARGS_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:141:2: ( '(' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:141:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_ARGS_START"

    // $ANTLR start "SEP_ARGS_END"
    public final void mSEP_ARGS_END() throws RecognitionException {
        try {
            int _type = SEP_ARGS_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:145:2: ( ')' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:145:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_ARGS_END"

    // $ANTLR start "SEP_OPTIONAL"
    public final void mSEP_OPTIONAL() throws RecognitionException {
        try {
            int _type = SEP_OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:149:2: ( '!' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:149:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_OPTIONAL"

    // $ANTLR start "SEP_TRIGGER"
    public final void mSEP_TRIGGER() throws RecognitionException {
        try {
            int _type = SEP_TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:153:2: ( '#' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:153:4: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_TRIGGER"

    // $ANTLR start "SEP_LIST_START"
    public final void mSEP_LIST_START() throws RecognitionException {
        try {
            int _type = SEP_LIST_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:157:2: ( '[' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:157:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_LIST_START"

    // $ANTLR start "SEP_LIST_END"
    public final void mSEP_LIST_END() throws RecognitionException {
        try {
            int _type = SEP_LIST_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:161:2: ( ']' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:161:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_LIST_END"

    // $ANTLR start "SEP_SUBTYPE_START"
    public final void mSEP_SUBTYPE_START() throws RecognitionException {
        try {
            int _type = SEP_SUBTYPE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:165:2: ( '<' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:165:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_SUBTYPE_START"

    // $ANTLR start "SEP_SUBTYPE_END"
    public final void mSEP_SUBTYPE_END() throws RecognitionException {
        try {
            int _type = SEP_SUBTYPE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:169:2: ( '>' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:169:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_SUBTYPE_END"

    // $ANTLR start "SEP_ACCESSOR"
    public final void mSEP_ACCESSOR() throws RecognitionException {
        try {
            int _type = SEP_ACCESSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:173:2: ( '.' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:173:4: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_ACCESSOR"

    // $ANTLR start "CONS_PAIR"
    public final void mCONS_PAIR() throws RecognitionException {
        try {
            int _type = CONS_PAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:179:2: ( 'P' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:179:4: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS_PAIR"

    // $ANTLR start "CONS_TRIPLE"
    public final void mCONS_TRIPLE() throws RecognitionException {
        try {
            int _type = CONS_TRIPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:183:2: ( 'T' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:183:4: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS_TRIPLE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:188:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:188:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:188:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:191:5: ( ( '0' .. '9' )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:191:7: ( '0' .. '9' )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:191:7: ( '0' .. '9' )+
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
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:191:7: '0' .. '9'
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop3;
                        }
                    } while (true);

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:195:28: '\\r'
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:196:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:196:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:196:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:199:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:199:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:208:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:208:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:208:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:208:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:208:24: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:212:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:212:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:216:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
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
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
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
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:216:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:217:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:218:9: OCTAL_ESC
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>='0' && LA9_5<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:14: ( '0' .. '3' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:25: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:36: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:223:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:224:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:224:14: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:224:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:224:25: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:224:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:225:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:225:14: ( '0' .. '7' )
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:225:15: '0' .. '7'
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:230:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:230:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:8: ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_LIST | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | CONS_PAIR | CONS_TRIPLE | ID | INT | COMMENT | WS | STRING )
        int alt10=45;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:10: RW_RECONFIGURATION
                {
                mRW_RECONFIGURATION(); 

                }
                break;
            case 2 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:29: RW_FORALL
                {
                mRW_FORALL(); 

                }
                break;
            case 3 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:39: RW_IMPORT
                {
                mRW_IMPORT(); 

                }
                break;
            case 4 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:49: DT_PATTERN
                {
                mDT_PATTERN(); 

                }
                break;
            case 5 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:60: DT_CHANNEL
                {
                mDT_CHANNEL(); 

                }
                break;
            case 6 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:71: DT_NAME
                {
                mDT_NAME(); 

                }
                break;
            case 7 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:79: DT_NODE
                {
                mDT_NODE(); 

                }
                break;
            case 8 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:87: DT_LIST
                {
                mDT_LIST(); 

                }
                break;
            case 9 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:95: DT_PAIR
                {
                mDT_PAIR(); 

                }
                break;
            case 10 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:103: DT_TRIPLE
                {
                mDT_TRIPLE(); 

                }
                break;
            case 11 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:113: OP_PAR
                {
                mOP_PAR(); 

                }
                break;
            case 12 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:120: OP_JOIN
                {
                mOP_JOIN(); 

                }
                break;
            case 13 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:128: OP_SPLIT
                {
                mOP_SPLIT(); 

                }
                break;
            case 14 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:137: OP_REMOVE
                {
                mOP_REMOVE(); 

                }
                break;
            case 15 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:147: OP_PATH
                {
                mOP_PATH(); 

                }
                break;
            case 16 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:155: OP_UPDATE
                {
                mOP_UPDATE(); 

                }
                break;
            case 17 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:165: OP_FST
                {
                mOP_FST(); 

                }
                break;
            case 18 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:172: OP_SND
                {
                mOP_SND(); 

                }
                break;
            case 19 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:179: OP_TRD
                {
                mOP_TRD(); 

                }
                break;
            case 20 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:186: OP_APPLY
                {
                mOP_APPLY(); 

                }
                break;
            case 21 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:195: OP_UNION
                {
                mOP_UNION(); 

                }
                break;
            case 22 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:204: OP_INTERSECTION
                {
                mOP_INTERSECTION(); 

                }
                break;
            case 23 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:220: OP_MINUS
                {
                mOP_MINUS(); 

                }
                break;
            case 24 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:229: OP_EQUAL
                {
                mOP_EQUAL(); 

                }
                break;
            case 25 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:238: SEP_BLOCK_START
                {
                mSEP_BLOCK_START(); 

                }
                break;
            case 26 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:254: SEP_BLOCK_END
                {
                mSEP_BLOCK_END(); 

                }
                break;
            case 27 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:268: SEP_COMMA
                {
                mSEP_COMMA(); 

                }
                break;
            case 28 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:278: SEP_SEMICOLON
                {
                mSEP_SEMICOLON(); 

                }
                break;
            case 29 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:292: SEP_COLON
                {
                mSEP_COLON(); 

                }
                break;
            case 30 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:302: SEP_ARGS_START
                {
                mSEP_ARGS_START(); 

                }
                break;
            case 31 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:317: SEP_ARGS_END
                {
                mSEP_ARGS_END(); 

                }
                break;
            case 32 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:330: SEP_OPTIONAL
                {
                mSEP_OPTIONAL(); 

                }
                break;
            case 33 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:343: SEP_TRIGGER
                {
                mSEP_TRIGGER(); 

                }
                break;
            case 34 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:355: SEP_LIST_START
                {
                mSEP_LIST_START(); 

                }
                break;
            case 35 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:370: SEP_LIST_END
                {
                mSEP_LIST_END(); 

                }
                break;
            case 36 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:383: SEP_SUBTYPE_START
                {
                mSEP_SUBTYPE_START(); 

                }
                break;
            case 37 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:401: SEP_SUBTYPE_END
                {
                mSEP_SUBTYPE_END(); 

                }
                break;
            case 38 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:417: SEP_ACCESSOR
                {
                mSEP_ACCESSOR(); 

                }
                break;
            case 39 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:430: CONS_PAIR
                {
                mCONS_PAIR(); 

                }
                break;
            case 40 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:440: CONS_TRIPLE
                {
                mCONS_TRIPLE(); 

                }
                break;
            case 41 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:452: ID
                {
                mID(); 

                }
                break;
            case 42 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:455: INT
                {
                mINT(); 

                }
                break;
            case 43 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:459: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 44 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:467: WS
                {
                mWS(); 

                }
                break;
            case 45 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecLexer.g:1:470: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\3\41\1\53\3\41\1\61\5\41\30\uffff\5\41\1\uffff\5\41\1\uffff"+
        "\11\41\1\116\10\41\1\127\3\41\1\133\1\41\1\135\3\41\1\uffff\2\41"+
        "\1\143\1\41\1\145\1\146\1\147\1\41\1\uffff\1\151\1\152\1\41\1\uffff"+
        "\1\41\1\uffff\5\41\1\uffff\1\41\3\uffff\1\41\2\uffff\1\164\2\41"+
        "\1\167\1\170\1\171\2\41\1\174\1\uffff\1\175\1\41\3\uffff\1\177\1"+
        "\u0080\2\uffff\1\41\2\uffff\6\41\1\u0088\1\uffff";
    static final String DFA10_eofS =
        "\u0089\uffff";
    static final String DFA10_minS =
        "\1\11\1\145\1\157\1\155\1\60\1\150\1\141\1\151\1\60\1\141\1\157"+
        "\1\156\1\160\1\162\30\uffff\1\143\1\162\1\164\1\160\1\151\1\uffff"+
        "\1\141\1\155\1\144\1\163\1\151\1\uffff\1\162\1\151\1\154\3\144\2"+
        "\157\1\141\1\60\1\157\1\164\1\162\1\156\2\145\1\164\1\160\1\60\1"+
        "\150\1\156\1\151\1\60\1\141\1\60\1\156\1\166\1\154\1\uffff\1\162"+
        "\1\145\1\60\1\156\3\60\1\154\1\uffff\2\60\1\164\1\uffff\1\164\1"+
        "\uffff\1\146\1\145\1\154\1\164\1\162\1\uffff\1\145\3\uffff\1\145"+
        "\2\uffff\1\60\1\145\1\151\3\60\1\156\1\154\1\60\1\uffff\1\60\1\147"+
        "\3\uffff\2\60\2\uffff\1\165\2\uffff\1\162\1\141\1\164\1\151\1\157"+
        "\1\156\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\145\1\163\1\155\1\172\1\150\1\157\1\151\1\172\1\141\1\157"+
        "\2\160\1\162\30\uffff\1\155\1\162\1\164\1\160\1\164\1\uffff\1\141"+
        "\1\155\1\144\1\163\1\151\1\uffff\1\164\1\151\1\154\3\144\2\157\1"+
        "\141\1\172\1\157\1\164\1\162\1\156\2\145\1\164\1\160\1\172\1\150"+
        "\1\156\1\151\1\172\1\141\1\172\1\156\1\166\1\154\1\uffff\1\162\1"+
        "\145\1\172\1\156\3\172\1\154\1\uffff\2\172\1\164\1\uffff\1\164\1"+
        "\uffff\1\146\1\145\1\154\1\164\1\162\1\uffff\1\145\3\uffff\1\145"+
        "\2\uffff\1\172\1\145\1\151\3\172\1\156\1\154\1\172\1\uffff\1\172"+
        "\1\147\3\uffff\2\172\2\uffff\1\165\2\uffff\1\162\1\141\1\164\1\151"+
        "\1\157\1\156\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\16\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
        "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\51\1\52\1\53\1\54\1\55"+
        "\5\uffff\1\47\5\uffff\1\50\34\uffff\1\21\10\uffff\1\13\3\uffff\1"+
        "\22\1\uffff\1\23\5\uffff\1\11\1\uffff\1\6\1\7\1\10\1\uffff\1\17"+
        "\1\14\11\uffff\1\15\2\uffff\1\16\1\2\1\3\2\uffff\1\12\1\20\1\uffff"+
        "\1\4\1\5\7\uffff\1\1";
    static final String DFA10_specialS =
        "\u0089\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\32\1\45\1\33\2\uffff\1\20"+
            "\1\uffff\1\30\1\31\1\uffff\1\17\1\25\1\uffff\1\40\1\43\12\42"+
            "\1\27\1\26\1\36\1\22\1\37\1\uffff\1\16\2\41\1\5\10\41\1\7\1"+
            "\41\1\6\1\41\1\4\3\41\1\10\6\41\1\34\1\21\1\35\1\uffff\1\41"+
            "\1\uffff\5\41\1\2\2\41\1\3\1\12\5\41\1\11\1\41\1\1\1\13\1\15"+
            "\1\14\5\41\1\23\1\uffff\1\24",
            "\1\46",
            "\1\47\3\uffff\1\50",
            "\1\51",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\52\31\41",
            "\1\54",
            "\1\55\15\uffff\1\56",
            "\1\57",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\21\41\1\60\10\41",
            "\1\62",
            "\1\63",
            "\1\65\1\uffff\1\64",
            "\1\66",
            "\1\67",
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
            "\1\70\11\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76\12\uffff\1\75",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104\1\uffff\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\150",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "",
            "",
            "",
            "\1\163",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\165",
            "\1\166",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\172",
            "\1\173",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\176",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_LIST | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | CONS_PAIR | CONS_TRIPLE | ID | INT | COMMENT | WS | STRING );";
        }
    }
 

}
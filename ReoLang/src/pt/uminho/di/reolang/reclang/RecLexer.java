// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g 2013-12-05 21:21:02

	package pt.uminho.di.reolang.reclang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecLexer extends Lexer {
    public static final int OP_NODES=28;
    public static final int CONS_PAIR=51;
    public static final int SEP_OPTIONAL=43;
    public static final int SEP_SUBTYPE_END=48;
    public static final int SEP_COLON=40;
    public static final int OP_TRD=24;
    public static final int OCTAL_ESC=62;
    public static final int OP_JOIN=15;
    public static final int DT_PAIR=12;
    public static final int ID=54;
    public static final int OP_INTERSECTION=33;
    public static final int EOF=-1;
    public static final int DT_NODE=10;
    public static final int DT_SET=11;
    public static final int OP_ID=19;
    public static final int ESC_SEQ=58;
    public static final int SEP_ACCESSOR=49;
    public static final int OP_MINUS=34;
    public static final int RW_FORALL=5;
    public static final int SEP_LIST_START=45;
    public static final int RW_RECONFIGURATION=4;
    public static final int SEP_ARGS_END=42;
    public static final int OP_FST=22;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=30;
    public static final int OP_APPLY=31;
    public static final int COMMENT=56;
    public static final int OP_PATH=20;
    public static final int OP_SND=23;
    public static final int SEP_LIST_END=46;
    public static final int SEP_STRUCTURE=50;
    public static final int OP_SPLIT=16;
    public static final int OP_OUT=26;
    public static final int CONS_SET=53;
    public static final int OP_NAMES=29;
    public static final int SEP_COMMA=38;
    public static final int DT_TRIPLE=13;
    public static final int SEP_ARGS_START=41;
    public static final int OP_UPDATE=21;
    public static final int SEP_BLOCK_START=36;
    public static final int UNICODE_ESC=61;
    public static final int OP_REMOVE=17;
    public static final int OP_PAR=14;
    public static final int HEX_DIGIT=60;
    public static final int INT=55;
    public static final int OP_IN=25;
    public static final int WS=57;
    public static final int CONS_TRIPLE=52;
    public static final int SEP_SUBTYPE_START=47;
    public static final int SEP_SEMICOLON=39;
    public static final int SEP_BLOCK_END=37;
    public static final int OP_CONST=18;
    public static final int DT_PATTERN=7;
    public static final int OP_EQUAL=35;
    public static final int OP_NAME=27;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=32;
    public static final int SEP_TRIGGER=44;
    public static final int STRING=59;
    public static final int DT_NAME=9;

    // delegates
    // delegators

    public RecLexer() {;} 
    public RecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g"; }

    // $ANTLR start "RW_RECONFIGURATION"
    public final void mRW_RECONFIGURATION() throws RecognitionException {
        try {
            int _type = RW_RECONFIGURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:11:2: ( 'reconfiguration' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:11:4: 'reconfiguration'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:15:2: ( 'forall' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:15:4: 'forall'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:19:2: ( 'import' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:19:4: 'import'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:28:2: ( 'Pattern' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:28:4: 'Pattern'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:32:2: ( 'Channel' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:32:4: 'Channel'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:36:2: ( 'Name' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:36:4: 'Name'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:40:2: ( 'Node' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:40:5: 'Node'
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

    // $ANTLR start "DT_SET"
    public final void mDT_SET() throws RecognitionException {
        try {
            int _type = DT_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:44:2: ( 'Set' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:44:4: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_SET"

    // $ANTLR start "DT_PAIR"
    public final void mDT_PAIR() throws RecognitionException {
        try {
            int _type = DT_PAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:48:2: ( 'Pair' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:48:4: 'Pair'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:52:2: ( 'Triple' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:52:4: 'Triple'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:60:2: ( 'par' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:60:4: 'par'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:64:2: ( 'join' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:64:4: 'join'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:68:2: ( 'split' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:68:4: 'split'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:72:2: ( 'remove' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:72:5: 'remove'
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

    // $ANTLR start "OP_CONST"
    public final void mOP_CONST() throws RecognitionException {
        try {
            int _type = OP_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:76:2: ( 'const' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:76:5: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CONST"

    // $ANTLR start "OP_ID"
    public final void mOP_ID() throws RecognitionException {
        try {
            int _type = OP_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:80:2: ( 'id' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:80:5: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ID"

    // $ANTLR start "OP_PATH"
    public final void mOP_PATH() throws RecognitionException {
        try {
            int _type = OP_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:84:2: ( 'path' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:84:4: 'path'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:88:2: ( 'update' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:88:4: 'update'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:92:2: ( 'fst' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:92:4: 'fst'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:96:2: ( 'snd' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:96:4: 'snd'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:100:2: ( 'trd' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:100:4: 'trd'
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

    // $ANTLR start "OP_IN"
    public final void mOP_IN() throws RecognitionException {
        try {
            int _type = OP_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:104:2: ( 'in' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:104:4: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_IN"

    // $ANTLR start "OP_OUT"
    public final void mOP_OUT() throws RecognitionException {
        try {
            int _type = OP_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:108:2: ( 'out' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:108:4: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_OUT"

    // $ANTLR start "OP_NAME"
    public final void mOP_NAME() throws RecognitionException {
        try {
            int _type = OP_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:112:2: ( 'name' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:112:4: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NAME"

    // $ANTLR start "OP_NODES"
    public final void mOP_NODES() throws RecognitionException {
        try {
            int _type = OP_NODES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:116:2: ( 'nodes' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:116:4: 'nodes'
            {
            match("nodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NODES"

    // $ANTLR start "OP_NAMES"
    public final void mOP_NAMES() throws RecognitionException {
        try {
            int _type = OP_NAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:120:2: ( 'names' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:120:4: 'names'
            {
            match("names"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_NAMES"

    // $ANTLR start "OP_ENDS"
    public final void mOP_ENDS() throws RecognitionException {
        try {
            int _type = OP_ENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:124:2: ( 'ends' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:124:4: 'ends'
            {
            match("ends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ENDS"

    // $ANTLR start "OP_APPLY"
    public final void mOP_APPLY() throws RecognitionException {
        try {
            int _type = OP_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:131:2: ( '@' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:131:4: '@'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:135:2: ( '+' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:135:5: '+'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:139:2: ( '&' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:139:4: '&'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:143:2: ( '-' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:143:4: '-'
            {
            match('-'); 

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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:147:2: ( '=' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:147:4: '='
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:154:2: ( '{' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:154:4: '{'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:158:2: ( '}' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:158:4: '}'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:162:2: ( ',' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:162:4: ','
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:166:2: ( ';' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:166:4: ';'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:170:2: ( ':' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:170:4: ':'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:174:2: ( '(' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:174:4: '('
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:178:2: ( ')' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:178:4: ')'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:182:2: ( '!' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:182:4: '!'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:186:2: ( '$' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:186:4: '$'
            {
            match('$'); 

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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:190:2: ( '[' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:190:4: '['
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:194:2: ( ']' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:194:4: ']'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:198:2: ( '<' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:198:5: '<'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:202:2: ( '>' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:202:4: '>'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:206:2: ( '.' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:206:4: '.'
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

    // $ANTLR start "SEP_STRUCTURE"
    public final void mSEP_STRUCTURE() throws RecognitionException {
        try {
            int _type = SEP_STRUCTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:210:2: ( '#' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:210:4: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEP_STRUCTURE"

    // $ANTLR start "CONS_PAIR"
    public final void mCONS_PAIR() throws RecognitionException {
        try {
            int _type = CONS_PAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:216:2: ( 'P' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:216:4: 'P'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:220:2: ( 'T' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:220:4: 'T'
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

    // $ANTLR start "CONS_SET"
    public final void mCONS_SET() throws RecognitionException {
        try {
            int _type = CONS_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:224:2: ( 'S' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:224:4: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS_SET"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:228:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:228:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:228:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:231:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:231:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:231:7: ( '0' .. '9' )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:231:7: '0' .. '9'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:14: ~ ( '\\n' | '\\r' )
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

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:235:28: '\\r'
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:236:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:236:14: ( options {greedy=false; } : . )*
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
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:236:42: .
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:239:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:239:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:24: ~ ( '\\\\' | '\"' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:252:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:252:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:256:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:256:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:257:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:258:9: OCTAL_ESC
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4>='0' && LA9_4<='7')) ) {
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:14: ( '0' .. '3' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:25: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:36: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:264:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:264:14: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:264:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:264:25: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:264:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:265:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:265:14: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:265:15: '0' .. '7'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:270:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:270:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:8: ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_NODES | OP_NAMES | OP_ENDS | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | ID | INT | COMMENT | WS | STRING )
        int alt10=55;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:10: RW_RECONFIGURATION
                {
                mRW_RECONFIGURATION(); 

                }
                break;
            case 2 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:29: RW_FORALL
                {
                mRW_FORALL(); 

                }
                break;
            case 3 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:39: RW_IMPORT
                {
                mRW_IMPORT(); 

                }
                break;
            case 4 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:49: DT_PATTERN
                {
                mDT_PATTERN(); 

                }
                break;
            case 5 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:60: DT_CHANNEL
                {
                mDT_CHANNEL(); 

                }
                break;
            case 6 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:71: DT_NAME
                {
                mDT_NAME(); 

                }
                break;
            case 7 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:79: DT_NODE
                {
                mDT_NODE(); 

                }
                break;
            case 8 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:87: DT_SET
                {
                mDT_SET(); 

                }
                break;
            case 9 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:94: DT_PAIR
                {
                mDT_PAIR(); 

                }
                break;
            case 10 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:102: DT_TRIPLE
                {
                mDT_TRIPLE(); 

                }
                break;
            case 11 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:112: OP_PAR
                {
                mOP_PAR(); 

                }
                break;
            case 12 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:119: OP_JOIN
                {
                mOP_JOIN(); 

                }
                break;
            case 13 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:127: OP_SPLIT
                {
                mOP_SPLIT(); 

                }
                break;
            case 14 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:136: OP_REMOVE
                {
                mOP_REMOVE(); 

                }
                break;
            case 15 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:146: OP_CONST
                {
                mOP_CONST(); 

                }
                break;
            case 16 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:155: OP_ID
                {
                mOP_ID(); 

                }
                break;
            case 17 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:161: OP_PATH
                {
                mOP_PATH(); 

                }
                break;
            case 18 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:169: OP_UPDATE
                {
                mOP_UPDATE(); 

                }
                break;
            case 19 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:179: OP_FST
                {
                mOP_FST(); 

                }
                break;
            case 20 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:186: OP_SND
                {
                mOP_SND(); 

                }
                break;
            case 21 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:193: OP_TRD
                {
                mOP_TRD(); 

                }
                break;
            case 22 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:200: OP_IN
                {
                mOP_IN(); 

                }
                break;
            case 23 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:206: OP_OUT
                {
                mOP_OUT(); 

                }
                break;
            case 24 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:213: OP_NAME
                {
                mOP_NAME(); 

                }
                break;
            case 25 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:221: OP_NODES
                {
                mOP_NODES(); 

                }
                break;
            case 26 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:230: OP_NAMES
                {
                mOP_NAMES(); 

                }
                break;
            case 27 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:239: OP_ENDS
                {
                mOP_ENDS(); 

                }
                break;
            case 28 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:247: OP_APPLY
                {
                mOP_APPLY(); 

                }
                break;
            case 29 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:256: OP_UNION
                {
                mOP_UNION(); 

                }
                break;
            case 30 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:265: OP_INTERSECTION
                {
                mOP_INTERSECTION(); 

                }
                break;
            case 31 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:281: OP_MINUS
                {
                mOP_MINUS(); 

                }
                break;
            case 32 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:290: OP_EQUAL
                {
                mOP_EQUAL(); 

                }
                break;
            case 33 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:299: SEP_BLOCK_START
                {
                mSEP_BLOCK_START(); 

                }
                break;
            case 34 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:315: SEP_BLOCK_END
                {
                mSEP_BLOCK_END(); 

                }
                break;
            case 35 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:329: SEP_COMMA
                {
                mSEP_COMMA(); 

                }
                break;
            case 36 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:339: SEP_SEMICOLON
                {
                mSEP_SEMICOLON(); 

                }
                break;
            case 37 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:353: SEP_COLON
                {
                mSEP_COLON(); 

                }
                break;
            case 38 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:363: SEP_ARGS_START
                {
                mSEP_ARGS_START(); 

                }
                break;
            case 39 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:378: SEP_ARGS_END
                {
                mSEP_ARGS_END(); 

                }
                break;
            case 40 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:391: SEP_OPTIONAL
                {
                mSEP_OPTIONAL(); 

                }
                break;
            case 41 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:404: SEP_TRIGGER
                {
                mSEP_TRIGGER(); 

                }
                break;
            case 42 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:416: SEP_LIST_START
                {
                mSEP_LIST_START(); 

                }
                break;
            case 43 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:431: SEP_LIST_END
                {
                mSEP_LIST_END(); 

                }
                break;
            case 44 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:444: SEP_SUBTYPE_START
                {
                mSEP_SUBTYPE_START(); 

                }
                break;
            case 45 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:462: SEP_SUBTYPE_END
                {
                mSEP_SUBTYPE_END(); 

                }
                break;
            case 46 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:478: SEP_ACCESSOR
                {
                mSEP_ACCESSOR(); 

                }
                break;
            case 47 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:491: SEP_STRUCTURE
                {
                mSEP_STRUCTURE(); 

                }
                break;
            case 48 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:505: CONS_PAIR
                {
                mCONS_PAIR(); 

                }
                break;
            case 49 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:515: CONS_TRIPLE
                {
                mCONS_TRIPLE(); 

                }
                break;
            case 50 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:527: CONS_SET
                {
                mCONS_SET(); 

                }
                break;
            case 51 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:536: ID
                {
                mID(); 

                }
                break;
            case 52 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:539: INT
                {
                mINT(); 

                }
                break;
            case 53 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:543: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 54 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:551: WS
                {
                mWS(); 

                }
                break;
            case 55 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:554: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\3\46\1\62\2\46\1\67\1\71\11\46\31\uffff\4\46\1\112\1\113"+
        "\1\46\1\uffff\4\46\1\uffff\1\46\1\uffff\16\46\1\142\1\46\2\uffff"+
        "\5\46\1\151\1\46\1\153\3\46\1\157\2\46\1\162\1\163\6\46\1\uffff"+
        "\2\46\1\174\1\46\1\176\1\177\1\uffff\1\46\1\uffff\1\u0081\1\u0082"+
        "\1\46\1\uffff\2\46\2\uffff\1\u0087\1\46\1\u0089\5\46\1\uffff\1\46"+
        "\2\uffff\1\46\2\uffff\1\u0091\1\u0092\1\46\1\u0094\1\uffff\1\u0095"+
        "\1\uffff\1\46\1\u0097\1\u0098\1\u0099\2\46\1\u009c\2\uffff\1\u009d"+
        "\2\uffff\1\46\3\uffff\1\u009f\1\u00a0\2\uffff\1\46\2\uffff\6\46"+
        "\1\u00a8\1\uffff";
    static final String DFA10_eofS =
        "\u00a9\uffff";
    static final String DFA10_minS =
        "\1\11\1\145\1\157\1\144\1\60\1\150\1\141\2\60\1\141\1\157\1\156"+
        "\1\157\1\160\1\162\1\165\1\141\1\156\31\uffff\1\143\1\162\1\164"+
        "\1\160\2\60\1\151\1\uffff\1\141\1\155\1\144\1\164\1\uffff\1\151"+
        "\1\uffff\1\162\1\151\1\154\1\144\1\156\2\144\1\164\1\155\2\144\2"+
        "\157\1\141\1\60\1\157\2\uffff\1\164\1\162\1\156\2\145\1\60\1\160"+
        "\1\60\1\150\1\156\1\151\1\60\1\163\1\141\2\60\2\145\1\163\1\156"+
        "\1\166\1\154\1\uffff\1\162\1\145\1\60\1\156\2\60\1\uffff\1\154\1"+
        "\uffff\2\60\1\164\1\uffff\2\164\2\uffff\1\60\1\163\1\60\1\146\1"+
        "\145\1\154\1\164\1\162\1\uffff\1\145\2\uffff\1\145\2\uffff\2\60"+
        "\1\145\1\60\1\uffff\1\60\1\uffff\1\151\3\60\1\156\1\154\1\60\2\uffff"+
        "\1\60\2\uffff\1\147\3\uffff\2\60\2\uffff\1\165\2\uffff\1\162\1\141"+
        "\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\145\1\163\1\156\1\172\1\150\1\157\2\172\1\141\1\157\1"+
        "\160\1\157\1\160\1\162\1\165\1\157\1\156\31\uffff\1\155\1\162\1"+
        "\164\1\160\2\172\1\164\1\uffff\1\141\1\155\1\144\1\164\1\uffff\1"+
        "\151\1\uffff\1\164\1\151\1\154\1\144\1\156\2\144\1\164\1\155\2\144"+
        "\2\157\1\141\1\172\1\157\2\uffff\1\164\1\162\1\156\2\145\1\172\1"+
        "\160\1\172\1\150\1\156\1\151\1\172\1\163\1\141\2\172\2\145\1\163"+
        "\1\156\1\166\1\154\1\uffff\1\162\1\145\1\172\1\156\2\172\1\uffff"+
        "\1\154\1\uffff\2\172\1\164\1\uffff\2\164\2\uffff\1\172\1\163\1\172"+
        "\1\146\1\145\1\154\1\164\1\162\1\uffff\1\145\2\uffff\1\145\2\uffff"+
        "\2\172\1\145\1\172\1\uffff\1\172\1\uffff\1\151\3\172\1\156\1\154"+
        "\1\172\2\uffff\1\172\2\uffff\1\147\3\uffff\2\172\2\uffff\1\165\2"+
        "\uffff\1\162\1\141\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\22\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\63\1\64\1\65\1\66"+
        "\1\67\7\uffff\1\60\4\uffff\1\62\1\uffff\1\61\20\uffff\1\20\1\26"+
        "\26\uffff\1\23\6\uffff\1\10\1\uffff\1\13\3\uffff\1\24\2\uffff\1"+
        "\25\1\27\10\uffff\1\11\1\uffff\1\6\1\7\1\uffff\1\21\1\14\4\uffff"+
        "\1\30\1\uffff\1\33\7\uffff\1\15\1\17\1\uffff\1\32\1\31\1\uffff\1"+
        "\16\1\2\1\3\2\uffff\1\12\1\22\1\uffff\1\4\1\5\7\uffff\1\1";
    static final String DFA10_specialS =
        "\u00a9\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\36\1\52\1\45\1\37\1\uffff"+
            "\1\24\1\uffff\1\34\1\35\1\uffff\1\23\1\31\1\25\1\44\1\50\12"+
            "\47\1\33\1\32\1\42\1\26\1\43\1\uffff\1\22\2\46\1\5\12\46\1\6"+
            "\1\46\1\4\2\46\1\7\1\10\6\46\1\40\1\uffff\1\41\1\uffff\1\46"+
            "\1\uffff\2\46\1\14\1\46\1\21\1\2\2\46\1\3\1\12\3\46\1\20\1\17"+
            "\1\11\1\46\1\1\1\13\1\16\1\15\5\46\1\27\1\uffff\1\30",
            "\1\53",
            "\1\54\3\uffff\1\55",
            "\1\57\10\uffff\1\56\1\60",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\61\31\46",
            "\1\63",
            "\1\64\15\uffff\1\65",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\66\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\70\10\46",
            "\1\72",
            "\1\73",
            "\1\75\1\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\15\uffff\1\103",
            "\1\104",
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
            "",
            "\1\105\11\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\115\12\uffff\1\114",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "",
            "\1\123\1\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\152",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\160",
            "\1\161",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\175",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0080",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u0086\7"+
            "\46",
            "\1\u0088",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0093",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0096",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009a",
            "\1\u009b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            return "1:1: Tokens : ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_NODES | OP_NAMES | OP_ENDS | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | ID | INT | COMMENT | WS | STRING );";
        }
    }
 

}
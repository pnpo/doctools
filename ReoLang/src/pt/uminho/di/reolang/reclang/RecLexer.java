// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g 2014-04-07 22:34:42

	package pt.uminho.di.reolang.reclang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecLexer extends Lexer {
    public static final int OP_NODES=30;
    public static final int CONS_PAIR=55;
    public static final int SEP_OPTIONAL=47;
    public static final int CONS_NODE=58;
    public static final int SEP_SUBTYPE_END=52;
    public static final int SEP_COLON=44;
    public static final int OP_TRD=25;
    public static final int OCTAL_ESC=68;
    public static final int OP_JOIN=16;
    public static final int DT_PAIR=13;
    public static final int ID=60;
    public static final int OP_INTERSECTION=37;
    public static final int EOF=-1;
    public static final int DT_NODE=10;
    public static final int DT_SET=12;
    public static final int OP_ID=20;
    public static final int ESC_SEQ=64;
    public static final int SEP_ACCESSOR=53;
    public static final int OP_MINUS=38;
    public static final int DT_XOR=11;
    public static final int RW_FORALL=5;
    public static final int SEP_LIST_START=49;
    public static final int RW_RECONFIGURATION=4;
    public static final int SEP_ARGS_END=46;
    public static final int OP_FST=23;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=29;
    public static final int OP_APPLY=35;
    public static final int COMMENT=62;
    public static final int OP_PATH=21;
    public static final int OP_SND=24;
    public static final int SEP_LIST_END=50;
    public static final int SEP_STRUCTURE=54;
    public static final int OP_SPLIT=17;
    public static final int OP_OUT=27;
    public static final int CONS_SET=57;
    public static final int OP_NAMES=31;
    public static final int SEP_COMMA=42;
    public static final int SEP_ARGS_START=45;
    public static final int DT_TRIPLE=14;
    public static final int OP_UPDATE=22;
    public static final int SEP_BLOCK_START=40;
    public static final int UNICODE_ESC=67;
    public static final int OP_REMOVE=18;
    public static final int OP_PAR=15;
    public static final int HEX_DIGIT=66;
    public static final int INT=61;
    public static final int OP_IN=26;
    public static final int OP_WRITE=34;
    public static final int CONS_XOR=59;
    public static final int OP_READ=33;
    public static final int WS=63;
    public static final int OP_CHANNELS=32;
    public static final int CONS_TRIPLE=56;
    public static final int SEP_SUBTYPE_START=51;
    public static final int SEP_SEMICOLON=43;
    public static final int SEP_BLOCK_END=41;
    public static final int OP_CONST=19;
    public static final int DT_PATTERN=7;
    public static final int OP_EQUAL=39;
    public static final int OP_NAME=28;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=36;
    public static final int SEP_TRIGGER=48;
    public static final int STRING=65;
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

    // $ANTLR start "DT_XOR"
    public final void mDT_XOR() throws RecognitionException {
        try {
            int _type = DT_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:44:2: ( 'Xor' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:44:5: 'Xor'
            {
            match("Xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DT_XOR"

    // $ANTLR start "DT_SET"
    public final void mDT_SET() throws RecognitionException {
        try {
            int _type = DT_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:48:2: ( 'Set' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:48:4: 'Set'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:52:2: ( 'Pair' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:52:4: 'Pair'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:56:2: ( 'Triple' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:56:4: 'Triple'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:64:2: ( 'par' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:64:4: 'par'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:68:2: ( 'join' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:68:4: 'join'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:72:2: ( 'split' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:72:4: 'split'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:76:2: ( 'remove' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:76:5: 'remove'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:80:2: ( 'const' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:80:5: 'const'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:84:2: ( 'id' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:84:5: 'id'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:88:2: ( 'path' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:88:4: 'path'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:92:2: ( 'update' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:92:4: 'update'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:96:2: ( 'fst' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:96:4: 'fst'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:100:2: ( 'snd' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:100:4: 'snd'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:104:2: ( 'trd' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:104:4: 'trd'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:108:2: ( 'in' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:108:4: 'in'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:112:2: ( 'out' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:112:4: 'out'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:116:2: ( 'name' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:116:4: 'name'
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

    // $ANTLR start "OP_ENDS"
    public final void mOP_ENDS() throws RecognitionException {
        try {
            int _type = OP_ENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:120:2: ( 'ends' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:120:4: 'ends'
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

    // $ANTLR start "OP_NODES"
    public final void mOP_NODES() throws RecognitionException {
        try {
            int _type = OP_NODES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:124:2: ( 'nodes' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:124:4: 'nodes'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:128:2: ( 'names' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:128:4: 'names'
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

    // $ANTLR start "OP_CHANNELS"
    public final void mOP_CHANNELS() throws RecognitionException {
        try {
            int _type = OP_CHANNELS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:132:2: ( 'channels' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:132:4: 'channels'
            {
            match("channels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CHANNELS"

    // $ANTLR start "OP_READ"
    public final void mOP_READ() throws RecognitionException {
        try {
            int _type = OP_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:136:2: ( 'read' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:136:4: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_READ"

    // $ANTLR start "OP_WRITE"
    public final void mOP_WRITE() throws RecognitionException {
        try {
            int _type = OP_WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:140:2: ( 'write' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:140:4: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_WRITE"

    // $ANTLR start "OP_APPLY"
    public final void mOP_APPLY() throws RecognitionException {
        try {
            int _type = OP_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:147:2: ( '@' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:147:4: '@'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:151:2: ( '+' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:151:5: '+'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:155:2: ( '&' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:155:4: '&'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:159:2: ( '-' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:159:4: '-'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:163:2: ( '=' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:163:4: '='
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:170:2: ( '{' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:170:4: '{'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:174:2: ( '}' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:174:4: '}'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:178:2: ( ',' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:178:4: ','
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:182:2: ( ';' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:182:4: ';'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:186:2: ( ':' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:186:4: ':'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:190:2: ( '(' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:190:4: '('
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:194:2: ( ')' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:194:4: ')'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:198:2: ( '!' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:198:4: '!'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:202:2: ( '$' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:202:4: '$'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:206:2: ( '[' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:206:4: '['
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:210:2: ( ']' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:210:4: ']'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:214:2: ( '<' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:214:5: '<'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:218:2: ( '>' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:218:4: '>'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:222:2: ( '.' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:222:4: '.'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:226:2: ( '#' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:226:4: '#'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:232:2: ( 'P' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:232:4: 'P'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:236:2: ( 'T' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:236:4: 'T'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:240:2: ( 'S' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:240:4: 'S'
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

    // $ANTLR start "CONS_NODE"
    public final void mCONS_NODE() throws RecognitionException {
        try {
            int _type = CONS_NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:244:2: ( 'N' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:244:4: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS_NODE"

    // $ANTLR start "CONS_XOR"
    public final void mCONS_XOR() throws RecognitionException {
        try {
            int _type = CONS_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:2: ( 'X' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:248:4: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS_XOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:252:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:252:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:252:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:255:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:255:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:255:7: ( '0' .. '9' )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:255:7: '0' .. '9'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:14: ~ ( '\\n' | '\\r' )
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

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:259:28: '\\r'
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:260:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:260:14: ( options {greedy=false; } : . )*
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
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:260:42: .
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:263:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:272:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:272:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:272:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:272:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:272:24: ~ ( '\\\\' | '\"' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:276:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:276:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:280:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:280:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:281:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:282:9: OCTAL_ESC
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:14: ( '0' .. '3' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:25: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:36: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:287:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:288:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:288:14: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:288:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:288:25: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:288:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:289:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:289:14: ( '0' .. '7' )
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:289:15: '0' .. '7'
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:294:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:294:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:8: ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_ENDS | OP_NODES | OP_NAMES | OP_CHANNELS | OP_READ | OP_WRITE | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | CONS_NODE | CONS_XOR | ID | INT | COMMENT | WS | STRING )
        int alt10=61;
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
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:87: DT_XOR
                {
                mDT_XOR(); 

                }
                break;
            case 9 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:94: DT_SET
                {
                mDT_SET(); 

                }
                break;
            case 10 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:101: DT_PAIR
                {
                mDT_PAIR(); 

                }
                break;
            case 11 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:109: DT_TRIPLE
                {
                mDT_TRIPLE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:119: OP_PAR
                {
                mOP_PAR(); 

                }
                break;
            case 13 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:126: OP_JOIN
                {
                mOP_JOIN(); 

                }
                break;
            case 14 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:134: OP_SPLIT
                {
                mOP_SPLIT(); 

                }
                break;
            case 15 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:143: OP_REMOVE
                {
                mOP_REMOVE(); 

                }
                break;
            case 16 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:153: OP_CONST
                {
                mOP_CONST(); 

                }
                break;
            case 17 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:162: OP_ID
                {
                mOP_ID(); 

                }
                break;
            case 18 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:168: OP_PATH
                {
                mOP_PATH(); 

                }
                break;
            case 19 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:176: OP_UPDATE
                {
                mOP_UPDATE(); 

                }
                break;
            case 20 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:186: OP_FST
                {
                mOP_FST(); 

                }
                break;
            case 21 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:193: OP_SND
                {
                mOP_SND(); 

                }
                break;
            case 22 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:200: OP_TRD
                {
                mOP_TRD(); 

                }
                break;
            case 23 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:207: OP_IN
                {
                mOP_IN(); 

                }
                break;
            case 24 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:213: OP_OUT
                {
                mOP_OUT(); 

                }
                break;
            case 25 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:220: OP_NAME
                {
                mOP_NAME(); 

                }
                break;
            case 26 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:228: OP_ENDS
                {
                mOP_ENDS(); 

                }
                break;
            case 27 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:236: OP_NODES
                {
                mOP_NODES(); 

                }
                break;
            case 28 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:245: OP_NAMES
                {
                mOP_NAMES(); 

                }
                break;
            case 29 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:254: OP_CHANNELS
                {
                mOP_CHANNELS(); 

                }
                break;
            case 30 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:266: OP_READ
                {
                mOP_READ(); 

                }
                break;
            case 31 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:274: OP_WRITE
                {
                mOP_WRITE(); 

                }
                break;
            case 32 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:283: OP_APPLY
                {
                mOP_APPLY(); 

                }
                break;
            case 33 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:292: OP_UNION
                {
                mOP_UNION(); 

                }
                break;
            case 34 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:301: OP_INTERSECTION
                {
                mOP_INTERSECTION(); 

                }
                break;
            case 35 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:317: OP_MINUS
                {
                mOP_MINUS(); 

                }
                break;
            case 36 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:326: OP_EQUAL
                {
                mOP_EQUAL(); 

                }
                break;
            case 37 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:335: SEP_BLOCK_START
                {
                mSEP_BLOCK_START(); 

                }
                break;
            case 38 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:351: SEP_BLOCK_END
                {
                mSEP_BLOCK_END(); 

                }
                break;
            case 39 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:365: SEP_COMMA
                {
                mSEP_COMMA(); 

                }
                break;
            case 40 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:375: SEP_SEMICOLON
                {
                mSEP_SEMICOLON(); 

                }
                break;
            case 41 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:389: SEP_COLON
                {
                mSEP_COLON(); 

                }
                break;
            case 42 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:399: SEP_ARGS_START
                {
                mSEP_ARGS_START(); 

                }
                break;
            case 43 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:414: SEP_ARGS_END
                {
                mSEP_ARGS_END(); 

                }
                break;
            case 44 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:427: SEP_OPTIONAL
                {
                mSEP_OPTIONAL(); 

                }
                break;
            case 45 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:440: SEP_TRIGGER
                {
                mSEP_TRIGGER(); 

                }
                break;
            case 46 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:452: SEP_LIST_START
                {
                mSEP_LIST_START(); 

                }
                break;
            case 47 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:467: SEP_LIST_END
                {
                mSEP_LIST_END(); 

                }
                break;
            case 48 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:480: SEP_SUBTYPE_START
                {
                mSEP_SUBTYPE_START(); 

                }
                break;
            case 49 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:498: SEP_SUBTYPE_END
                {
                mSEP_SUBTYPE_END(); 

                }
                break;
            case 50 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:514: SEP_ACCESSOR
                {
                mSEP_ACCESSOR(); 

                }
                break;
            case 51 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:527: SEP_STRUCTURE
                {
                mSEP_STRUCTURE(); 

                }
                break;
            case 52 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:541: CONS_PAIR
                {
                mCONS_PAIR(); 

                }
                break;
            case 53 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:551: CONS_TRIPLE
                {
                mCONS_TRIPLE(); 

                }
                break;
            case 54 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:563: CONS_SET
                {
                mCONS_SET(); 

                }
                break;
            case 55 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:572: CONS_NODE
                {
                mCONS_NODE(); 

                }
                break;
            case 56 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:582: CONS_XOR
                {
                mCONS_XOR(); 

                }
                break;
            case 57 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:591: ID
                {
                mID(); 

                }
                break;
            case 58 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:594: INT
                {
                mINT(); 

                }
                break;
            case 59 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:598: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 60 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:606: WS
                {
                mWS(); 

                }
                break;
            case 61 :
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecLexer.g:1:609: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\3\50\1\64\1\50\1\70\1\72\1\74\1\76\12\50\31\uffff\4\50"+
        "\1\122\1\123\1\50\1\uffff\3\50\1\uffff\1\50\1\uffff\1\50\1\uffff"+
        "\1\50\1\uffff\21\50\1\156\1\50\2\uffff\5\50\1\165\1\166\1\50\1\170"+
        "\3\50\1\174\3\50\1\u0080\1\u0081\6\50\1\u0088\1\50\1\uffff\2\50"+
        "\1\u008c\1\50\1\u008e\1\u008f\2\uffff\1\50\1\uffff\1\u0091\1\u0092"+
        "\1\50\1\uffff\3\50\2\uffff\1\u0098\1\50\1\u009a\3\50\1\uffff\3\50"+
        "\1\uffff\1\50\2\uffff\1\50\2\uffff\1\u00a3\1\u00a4\2\50\1\u00a7"+
        "\1\uffff\1\u00a8\1\uffff\1\u00a9\1\50\1\u00ab\1\u00ac\1\u00ad\2"+
        "\50\1\u00b0\2\uffff\1\50\1\u00b2\3\uffff\1\50\3\uffff\1\u00b4\1"+
        "\u00b5\1\uffff\1\50\1\uffff\1\50\2\uffff\1\u00b8\1\50\1\uffff\5"+
        "\50\1\u00bf\1\uffff";
    static final String DFA10_eofS =
        "\u00c0\uffff";
    static final String DFA10_minS =
        "\1\11\1\145\1\157\1\144\1\60\1\150\4\60\1\141\1\157\1\156\1\150"+
        "\1\160\1\162\1\165\1\141\1\156\1\162\31\uffff\1\141\1\162\1\164"+
        "\1\160\2\60\1\151\1\uffff\1\141\1\155\1\144\1\uffff\1\162\1\uffff"+
        "\1\164\1\uffff\1\151\1\uffff\1\162\1\151\1\154\1\144\1\156\1\141"+
        "\2\144\1\164\1\155\2\144\1\151\2\157\1\144\1\141\1\60\1\157\2\uffff"+
        "\1\164\1\162\1\156\2\145\2\60\1\160\1\60\1\150\1\156\1\151\1\60"+
        "\1\163\1\156\1\141\2\60\2\145\1\163\1\164\1\156\1\166\1\60\1\154"+
        "\1\uffff\1\162\1\145\1\60\1\156\2\60\2\uffff\1\154\1\uffff\2\60"+
        "\1\164\1\uffff\1\164\1\156\1\164\2\uffff\1\60\1\163\1\60\1\145\1"+
        "\146\1\145\1\uffff\1\154\1\164\1\162\1\uffff\1\145\2\uffff\1\145"+
        "\2\uffff\2\60\2\145\1\60\1\uffff\1\60\1\uffff\1\60\1\151\3\60\1"+
        "\156\1\154\1\60\2\uffff\1\154\1\60\3\uffff\1\147\3\uffff\2\60\1"+
        "\uffff\1\163\1\uffff\1\165\2\uffff\1\60\1\162\1\uffff\1\141\1\164"+
        "\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\145\1\163\1\156\1\172\1\150\4\172\1\141\1\157\1\160\1"+
        "\157\1\160\1\162\1\165\1\157\1\156\1\162\31\uffff\1\155\1\162\1"+
        "\164\1\160\2\172\1\164\1\uffff\1\141\1\155\1\144\1\uffff\1\162\1"+
        "\uffff\1\164\1\uffff\1\151\1\uffff\1\164\1\151\1\154\1\144\1\156"+
        "\1\141\2\144\1\164\1\155\2\144\1\151\2\157\1\144\1\141\1\172\1\157"+
        "\2\uffff\1\164\1\162\1\156\2\145\2\172\1\160\1\172\1\150\1\156\1"+
        "\151\1\172\1\163\1\156\1\141\2\172\2\145\1\163\1\164\1\156\1\166"+
        "\1\172\1\154\1\uffff\1\162\1\145\1\172\1\156\2\172\2\uffff\1\154"+
        "\1\uffff\2\172\1\164\1\uffff\1\164\1\156\1\164\2\uffff\1\172\1\163"+
        "\1\172\1\145\1\146\1\145\1\uffff\1\154\1\164\1\162\1\uffff\1\145"+
        "\2\uffff\1\145\2\uffff\2\172\2\145\1\172\1\uffff\1\172\1\uffff\1"+
        "\172\1\151\3\172\1\156\1\154\1\172\2\uffff\1\154\1\172\3\uffff\1"+
        "\147\3\uffff\2\172\1\uffff\1\163\1\uffff\1\165\2\uffff\1\172\1\162"+
        "\1\uffff\1\141\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\24\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
        "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\71\1\72\1\73\1\74"+
        "\1\75\7\uffff\1\64\3\uffff\1\67\1\uffff\1\70\1\uffff\1\66\1\uffff"+
        "\1\65\23\uffff\1\21\1\27\32\uffff\1\24\6\uffff\1\10\1\11\1\uffff"+
        "\1\14\3\uffff\1\25\3\uffff\1\26\1\30\6\uffff\1\36\3\uffff\1\12\1"+
        "\uffff\1\6\1\7\1\uffff\1\22\1\15\5\uffff\1\31\1\uffff\1\32\10\uffff"+
        "\1\16\1\20\2\uffff\1\34\1\33\1\37\1\uffff\1\17\1\2\1\3\2\uffff\1"+
        "\13\1\uffff\1\23\1\uffff\1\4\1\5\2\uffff\1\35\6\uffff\1\1";
    static final String DFA10_specialS =
        "\u00c0\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\40\1\54\1\47\1\41\1\uffff"+
            "\1\26\1\uffff\1\36\1\37\1\uffff\1\25\1\33\1\27\1\46\1\52\12"+
            "\51\1\35\1\34\1\44\1\30\1\45\1\uffff\1\24\2\50\1\5\12\50\1\6"+
            "\1\50\1\4\2\50\1\10\1\11\3\50\1\7\2\50\1\42\1\uffff\1\43\1\uffff"+
            "\1\50\1\uffff\2\50\1\15\1\50\1\22\1\2\2\50\1\3\1\13\3\50\1\21"+
            "\1\20\1\12\1\50\1\1\1\14\1\17\1\16\1\50\1\23\3\50\1\31\1\uffff"+
            "\1\32",
            "\1\55",
            "\1\56\3\uffff\1\57",
            "\1\61\10\uffff\1\60\1\62",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\63\31\50",
            "\1\65",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\66\15\50\1\67"+
            "\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\71\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\73\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\75\10\50",
            "\1\77",
            "\1\100",
            "\1\102\1\uffff\1\101",
            "\1\104\6\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\15\uffff\1\111",
            "\1\112",
            "\1\113",
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
            "\1\116\1\uffff\1\114\11\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\125\12\uffff\1\124",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "",
            "\1\132",
            "",
            "\1\133",
            "",
            "\1\134\1\uffff\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\167",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0090",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u0097\7"+
            "\50",
            "\1\u0099",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a5",
            "\1\u00a6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00aa",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ae",
            "\1\u00af",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00b1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00b3",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            return "1:1: Tokens : ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_ENDS | OP_NODES | OP_NAMES | OP_CHANNELS | OP_READ | OP_WRITE | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | CONS_NODE | CONS_XOR | ID | INT | COMMENT | WS | STRING );";
        }
    }
 

}
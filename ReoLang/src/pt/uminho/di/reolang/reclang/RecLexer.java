// $ANTLR 3.5.1 /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g 2014-08-11 20:45:30

	package pt.uminho.di.reolang.reclang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int CONS_NODE=5;
	public static final int CONS_PAIR=6;
	public static final int CONS_SET=7;
	public static final int CONS_TRIPLE=8;
	public static final int CONS_XOR=9;
	public static final int DT_CHANNEL=10;
	public static final int DT_NAME=11;
	public static final int DT_NODE=12;
	public static final int DT_PAIR=13;
	public static final int DT_PATTERN=14;
	public static final int DT_SET=15;
	public static final int DT_TRIPLE=16;
	public static final int DT_XOR=17;
	public static final int ESC_SEQ=18;
	public static final int HEX_DIGIT=19;
	public static final int ID=20;
	public static final int INT=21;
	public static final int OCTAL_ESC=22;
	public static final int OP_APPLY=23;
	public static final int OP_CHANNELS=24;
	public static final int OP_CONST=25;
	public static final int OP_ENDS=26;
	public static final int OP_EQUAL=27;
	public static final int OP_FST=28;
	public static final int OP_ID=29;
	public static final int OP_IN=30;
	public static final int OP_INTERSECTION=31;
	public static final int OP_JOIN=32;
	public static final int OP_MINUS=33;
	public static final int OP_NAME=34;
	public static final int OP_NAMES=35;
	public static final int OP_NODES=36;
	public static final int OP_OUT=37;
	public static final int OP_PAR=38;
	public static final int OP_PATH=39;
	public static final int OP_READ=40;
	public static final int OP_REMOVE=41;
	public static final int OP_SND=42;
	public static final int OP_SPLIT=43;
	public static final int OP_TRD=44;
	public static final int OP_UNION=45;
	public static final int OP_UPDATE=46;
	public static final int OP_WRITE=47;
	public static final int RW_FORALL=48;
	public static final int RW_IMPORT=49;
	public static final int RW_MAIN=50;
	public static final int RW_RECONFIGURATION=51;
	public static final int SEP_ACCESSOR=52;
	public static final int SEP_ARGS_END=53;
	public static final int SEP_ARGS_START=54;
	public static final int SEP_BLOCK_END=55;
	public static final int SEP_BLOCK_START=56;
	public static final int SEP_COLON=57;
	public static final int SEP_COMMA=58;
	public static final int SEP_LIST_END=59;
	public static final int SEP_LIST_START=60;
	public static final int SEP_OPTIONAL=61;
	public static final int SEP_SEMICOLON=62;
	public static final int SEP_STRUCTURE=63;
	public static final int SEP_SUBTYPE_END=64;
	public static final int SEP_SUBTYPE_START=65;
	public static final int SEP_TRIGGER=66;
	public static final int STRING=67;
	public static final int UNICODE_ESC=68;
	public static final int WS=69;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RecLexer() {} 
	public RecLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g"; }

	// $ANTLR start "RW_RECONFIGURATION"
	public final void mRW_RECONFIGURATION() throws RecognitionException {
		try {
			int _type = RW_RECONFIGURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:11:2: ( 'reconfiguration' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:11:4: 'reconfiguration'
			{
			match("reconfiguration"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RW_RECONFIGURATION"

	// $ANTLR start "RW_FORALL"
	public final void mRW_FORALL() throws RecognitionException {
		try {
			int _type = RW_FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:15:2: ( 'forall' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:15:4: 'forall'
			{
			match("forall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RW_FORALL"

	// $ANTLR start "RW_IMPORT"
	public final void mRW_IMPORT() throws RecognitionException {
		try {
			int _type = RW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:19:2: ( 'import' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:19:4: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RW_IMPORT"

	// $ANTLR start "RW_MAIN"
	public final void mRW_MAIN() throws RecognitionException {
		try {
			int _type = RW_MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:23:2: ( 'main' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:23:4: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RW_MAIN"

	// $ANTLR start "DT_PATTERN"
	public final void mDT_PATTERN() throws RecognitionException {
		try {
			int _type = DT_PATTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:31:2: ( 'Pattern' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:31:4: 'Pattern'
			{
			match("Pattern"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_PATTERN"

	// $ANTLR start "DT_CHANNEL"
	public final void mDT_CHANNEL() throws RecognitionException {
		try {
			int _type = DT_CHANNEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:35:2: ( 'Channel' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:35:4: 'Channel'
			{
			match("Channel"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_CHANNEL"

	// $ANTLR start "DT_NAME"
	public final void mDT_NAME() throws RecognitionException {
		try {
			int _type = DT_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:39:2: ( 'Name' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:39:4: 'Name'
			{
			match("Name"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_NAME"

	// $ANTLR start "DT_NODE"
	public final void mDT_NODE() throws RecognitionException {
		try {
			int _type = DT_NODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:43:2: ( 'Node' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:43:5: 'Node'
			{
			match("Node"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_NODE"

	// $ANTLR start "DT_XOR"
	public final void mDT_XOR() throws RecognitionException {
		try {
			int _type = DT_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:47:2: ( 'Xor' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:47:5: 'Xor'
			{
			match("Xor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_XOR"

	// $ANTLR start "DT_SET"
	public final void mDT_SET() throws RecognitionException {
		try {
			int _type = DT_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:51:2: ( 'Set' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:51:4: 'Set'
			{
			match("Set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_SET"

	// $ANTLR start "DT_PAIR"
	public final void mDT_PAIR() throws RecognitionException {
		try {
			int _type = DT_PAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:55:2: ( 'Pair' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:55:4: 'Pair'
			{
			match("Pair"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_PAIR"

	// $ANTLR start "DT_TRIPLE"
	public final void mDT_TRIPLE() throws RecognitionException {
		try {
			int _type = DT_TRIPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:59:2: ( 'Triple' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:59:4: 'Triple'
			{
			match("Triple"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DT_TRIPLE"

	// $ANTLR start "OP_PAR"
	public final void mOP_PAR() throws RecognitionException {
		try {
			int _type = OP_PAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:67:2: ( 'par' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:67:4: 'par'
			{
			match("par"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_PAR"

	// $ANTLR start "OP_JOIN"
	public final void mOP_JOIN() throws RecognitionException {
		try {
			int _type = OP_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:71:2: ( 'join' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:71:4: 'join'
			{
			match("join"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_JOIN"

	// $ANTLR start "OP_SPLIT"
	public final void mOP_SPLIT() throws RecognitionException {
		try {
			int _type = OP_SPLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:75:2: ( 'split' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:75:4: 'split'
			{
			match("split"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SPLIT"

	// $ANTLR start "OP_REMOVE"
	public final void mOP_REMOVE() throws RecognitionException {
		try {
			int _type = OP_REMOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:79:2: ( 'remove' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:79:5: 'remove'
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_REMOVE"

	// $ANTLR start "OP_CONST"
	public final void mOP_CONST() throws RecognitionException {
		try {
			int _type = OP_CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:83:2: ( 'const' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:83:5: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_CONST"

	// $ANTLR start "OP_ID"
	public final void mOP_ID() throws RecognitionException {
		try {
			int _type = OP_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:87:2: ( 'id' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:87:5: 'id'
			{
			match("id"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ID"

	// $ANTLR start "OP_PATH"
	public final void mOP_PATH() throws RecognitionException {
		try {
			int _type = OP_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:91:2: ( 'path' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:91:4: 'path'
			{
			match("path"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_PATH"

	// $ANTLR start "OP_UPDATE"
	public final void mOP_UPDATE() throws RecognitionException {
		try {
			int _type = OP_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:95:2: ( 'update' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:95:4: 'update'
			{
			match("update"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_UPDATE"

	// $ANTLR start "OP_FST"
	public final void mOP_FST() throws RecognitionException {
		try {
			int _type = OP_FST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:99:2: ( 'fst' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:99:4: 'fst'
			{
			match("fst"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_FST"

	// $ANTLR start "OP_SND"
	public final void mOP_SND() throws RecognitionException {
		try {
			int _type = OP_SND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:103:2: ( 'snd' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:103:4: 'snd'
			{
			match("snd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SND"

	// $ANTLR start "OP_TRD"
	public final void mOP_TRD() throws RecognitionException {
		try {
			int _type = OP_TRD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:107:2: ( 'trd' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:107:4: 'trd'
			{
			match("trd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_TRD"

	// $ANTLR start "OP_IN"
	public final void mOP_IN() throws RecognitionException {
		try {
			int _type = OP_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:111:2: ( 'in' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:111:4: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_IN"

	// $ANTLR start "OP_OUT"
	public final void mOP_OUT() throws RecognitionException {
		try {
			int _type = OP_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:115:2: ( 'out' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:115:4: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_OUT"

	// $ANTLR start "OP_NAME"
	public final void mOP_NAME() throws RecognitionException {
		try {
			int _type = OP_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:119:2: ( 'name' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:119:4: 'name'
			{
			match("name"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NAME"

	// $ANTLR start "OP_ENDS"
	public final void mOP_ENDS() throws RecognitionException {
		try {
			int _type = OP_ENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:123:2: ( 'ends' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:123:4: 'ends'
			{
			match("ends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ENDS"

	// $ANTLR start "OP_NODES"
	public final void mOP_NODES() throws RecognitionException {
		try {
			int _type = OP_NODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:127:2: ( 'nodes' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:127:4: 'nodes'
			{
			match("nodes"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NODES"

	// $ANTLR start "OP_NAMES"
	public final void mOP_NAMES() throws RecognitionException {
		try {
			int _type = OP_NAMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:131:2: ( 'names' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:131:4: 'names'
			{
			match("names"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NAMES"

	// $ANTLR start "OP_CHANNELS"
	public final void mOP_CHANNELS() throws RecognitionException {
		try {
			int _type = OP_CHANNELS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:135:2: ( 'channels' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:135:4: 'channels'
			{
			match("channels"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_CHANNELS"

	// $ANTLR start "OP_READ"
	public final void mOP_READ() throws RecognitionException {
		try {
			int _type = OP_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:139:2: ( 'read' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:139:4: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_READ"

	// $ANTLR start "OP_WRITE"
	public final void mOP_WRITE() throws RecognitionException {
		try {
			int _type = OP_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:143:2: ( 'write' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:143:4: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_WRITE"

	// $ANTLR start "OP_APPLY"
	public final void mOP_APPLY() throws RecognitionException {
		try {
			int _type = OP_APPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:150:2: ( '@' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:150:4: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_APPLY"

	// $ANTLR start "OP_UNION"
	public final void mOP_UNION() throws RecognitionException {
		try {
			int _type = OP_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:154:2: ( '+' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:154:5: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_UNION"

	// $ANTLR start "OP_INTERSECTION"
	public final void mOP_INTERSECTION() throws RecognitionException {
		try {
			int _type = OP_INTERSECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:158:2: ( '&' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:158:4: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_INTERSECTION"

	// $ANTLR start "OP_MINUS"
	public final void mOP_MINUS() throws RecognitionException {
		try {
			int _type = OP_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:162:2: ( '-' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:162:4: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MINUS"

	// $ANTLR start "OP_EQUAL"
	public final void mOP_EQUAL() throws RecognitionException {
		try {
			int _type = OP_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:166:2: ( '=' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:166:4: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_EQUAL"

	// $ANTLR start "SEP_BLOCK_START"
	public final void mSEP_BLOCK_START() throws RecognitionException {
		try {
			int _type = SEP_BLOCK_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:173:2: ( '{' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:173:4: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_BLOCK_START"

	// $ANTLR start "SEP_BLOCK_END"
	public final void mSEP_BLOCK_END() throws RecognitionException {
		try {
			int _type = SEP_BLOCK_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:177:2: ( '}' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:177:4: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_BLOCK_END"

	// $ANTLR start "SEP_COMMA"
	public final void mSEP_COMMA() throws RecognitionException {
		try {
			int _type = SEP_COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:181:2: ( ',' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:181:4: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_COMMA"

	// $ANTLR start "SEP_SEMICOLON"
	public final void mSEP_SEMICOLON() throws RecognitionException {
		try {
			int _type = SEP_SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:185:2: ( ';' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:185:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_SEMICOLON"

	// $ANTLR start "SEP_COLON"
	public final void mSEP_COLON() throws RecognitionException {
		try {
			int _type = SEP_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:189:2: ( ':' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:189:4: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_COLON"

	// $ANTLR start "SEP_ARGS_START"
	public final void mSEP_ARGS_START() throws RecognitionException {
		try {
			int _type = SEP_ARGS_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:193:2: ( '(' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:193:4: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_ARGS_START"

	// $ANTLR start "SEP_ARGS_END"
	public final void mSEP_ARGS_END() throws RecognitionException {
		try {
			int _type = SEP_ARGS_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:197:2: ( ')' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:197:4: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_ARGS_END"

	// $ANTLR start "SEP_OPTIONAL"
	public final void mSEP_OPTIONAL() throws RecognitionException {
		try {
			int _type = SEP_OPTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:201:2: ( '!' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:201:4: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_OPTIONAL"

	// $ANTLR start "SEP_TRIGGER"
	public final void mSEP_TRIGGER() throws RecognitionException {
		try {
			int _type = SEP_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:205:2: ( '$' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:205:4: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_TRIGGER"

	// $ANTLR start "SEP_LIST_START"
	public final void mSEP_LIST_START() throws RecognitionException {
		try {
			int _type = SEP_LIST_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:209:2: ( '[' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:209:4: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_LIST_START"

	// $ANTLR start "SEP_LIST_END"
	public final void mSEP_LIST_END() throws RecognitionException {
		try {
			int _type = SEP_LIST_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:213:2: ( ']' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:213:4: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_LIST_END"

	// $ANTLR start "SEP_SUBTYPE_START"
	public final void mSEP_SUBTYPE_START() throws RecognitionException {
		try {
			int _type = SEP_SUBTYPE_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:217:2: ( '<' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:217:5: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_SUBTYPE_START"

	// $ANTLR start "SEP_SUBTYPE_END"
	public final void mSEP_SUBTYPE_END() throws RecognitionException {
		try {
			int _type = SEP_SUBTYPE_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:221:2: ( '>' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:221:4: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_SUBTYPE_END"

	// $ANTLR start "SEP_ACCESSOR"
	public final void mSEP_ACCESSOR() throws RecognitionException {
		try {
			int _type = SEP_ACCESSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:225:2: ( '.' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:225:4: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_ACCESSOR"

	// $ANTLR start "SEP_STRUCTURE"
	public final void mSEP_STRUCTURE() throws RecognitionException {
		try {
			int _type = SEP_STRUCTURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:229:2: ( '#' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:229:4: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP_STRUCTURE"

	// $ANTLR start "CONS_PAIR"
	public final void mCONS_PAIR() throws RecognitionException {
		try {
			int _type = CONS_PAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:235:2: ( 'P' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:235:4: 'P'
			{
			match('P'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONS_PAIR"

	// $ANTLR start "CONS_TRIPLE"
	public final void mCONS_TRIPLE() throws RecognitionException {
		try {
			int _type = CONS_TRIPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:239:2: ( 'T' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:239:4: 'T'
			{
			match('T'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONS_TRIPLE"

	// $ANTLR start "CONS_SET"
	public final void mCONS_SET() throws RecognitionException {
		try {
			int _type = CONS_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:243:2: ( 'S' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:243:4: 'S'
			{
			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONS_SET"

	// $ANTLR start "CONS_NODE"
	public final void mCONS_NODE() throws RecognitionException {
		try {
			int _type = CONS_NODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:247:2: ( 'N' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:247:4: 'N'
			{
			match('N'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONS_NODE"

	// $ANTLR start "CONS_XOR"
	public final void mCONS_XOR() throws RecognitionException {
		try {
			int _type = CONS_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:251:2: ( 'X' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:251:4: 'X'
			{
			match('X'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONS_XOR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:255:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:255:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:255:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:258:5: ( ( '0' .. '9' )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:258:7: ( '0' .. '9' )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:258:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:262:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:262:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:262:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:262:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:262:28: '\\r'
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:263:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:263:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:263:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:266:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:266:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:275:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:275:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:275:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:275:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:275:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:279:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:283:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:283:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:284:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:285:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:290:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				int LA9_1 = input.LA(2);
				if ( ((LA9_1 >= '0' && LA9_1 <= '3')) ) {
					int LA9_2 = input.LA(3);
					if ( ((LA9_2 >= '0' && LA9_2 <= '7')) ) {
						int LA9_4 = input.LA(4);
						if ( ((LA9_4 >= '0' && LA9_4 <= '7')) ) {
							alt9=1;
						}

						else {
							alt9=2;
						}

					}

					else {
						alt9=3;
					}

				}
				else if ( ((LA9_1 >= '4' && LA9_1 <= '7')) ) {
					int LA9_3 = input.LA(3);
					if ( ((LA9_3 >= '0' && LA9_3 <= '7')) ) {
						alt9=2;
					}

					else {
						alt9=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:290:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:291:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:292:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:297:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:297:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:8: ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | RW_MAIN | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_ENDS | OP_NODES | OP_NAMES | OP_CHANNELS | OP_READ | OP_WRITE | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | CONS_NODE | CONS_XOR | ID | INT | COMMENT | WS | STRING )
		int alt10=62;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:10: RW_RECONFIGURATION
				{
				mRW_RECONFIGURATION(); 

				}
				break;
			case 2 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:29: RW_FORALL
				{
				mRW_FORALL(); 

				}
				break;
			case 3 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:39: RW_IMPORT
				{
				mRW_IMPORT(); 

				}
				break;
			case 4 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:49: RW_MAIN
				{
				mRW_MAIN(); 

				}
				break;
			case 5 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:57: DT_PATTERN
				{
				mDT_PATTERN(); 

				}
				break;
			case 6 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:68: DT_CHANNEL
				{
				mDT_CHANNEL(); 

				}
				break;
			case 7 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:79: DT_NAME
				{
				mDT_NAME(); 

				}
				break;
			case 8 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:87: DT_NODE
				{
				mDT_NODE(); 

				}
				break;
			case 9 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:95: DT_XOR
				{
				mDT_XOR(); 

				}
				break;
			case 10 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:102: DT_SET
				{
				mDT_SET(); 

				}
				break;
			case 11 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:109: DT_PAIR
				{
				mDT_PAIR(); 

				}
				break;
			case 12 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:117: DT_TRIPLE
				{
				mDT_TRIPLE(); 

				}
				break;
			case 13 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:127: OP_PAR
				{
				mOP_PAR(); 

				}
				break;
			case 14 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:134: OP_JOIN
				{
				mOP_JOIN(); 

				}
				break;
			case 15 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:142: OP_SPLIT
				{
				mOP_SPLIT(); 

				}
				break;
			case 16 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:151: OP_REMOVE
				{
				mOP_REMOVE(); 

				}
				break;
			case 17 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:161: OP_CONST
				{
				mOP_CONST(); 

				}
				break;
			case 18 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:170: OP_ID
				{
				mOP_ID(); 

				}
				break;
			case 19 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:176: OP_PATH
				{
				mOP_PATH(); 

				}
				break;
			case 20 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:184: OP_UPDATE
				{
				mOP_UPDATE(); 

				}
				break;
			case 21 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:194: OP_FST
				{
				mOP_FST(); 

				}
				break;
			case 22 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:201: OP_SND
				{
				mOP_SND(); 

				}
				break;
			case 23 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:208: OP_TRD
				{
				mOP_TRD(); 

				}
				break;
			case 24 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:215: OP_IN
				{
				mOP_IN(); 

				}
				break;
			case 25 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:221: OP_OUT
				{
				mOP_OUT(); 

				}
				break;
			case 26 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:228: OP_NAME
				{
				mOP_NAME(); 

				}
				break;
			case 27 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:236: OP_ENDS
				{
				mOP_ENDS(); 

				}
				break;
			case 28 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:244: OP_NODES
				{
				mOP_NODES(); 

				}
				break;
			case 29 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:253: OP_NAMES
				{
				mOP_NAMES(); 

				}
				break;
			case 30 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:262: OP_CHANNELS
				{
				mOP_CHANNELS(); 

				}
				break;
			case 31 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:274: OP_READ
				{
				mOP_READ(); 

				}
				break;
			case 32 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:282: OP_WRITE
				{
				mOP_WRITE(); 

				}
				break;
			case 33 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:291: OP_APPLY
				{
				mOP_APPLY(); 

				}
				break;
			case 34 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:300: OP_UNION
				{
				mOP_UNION(); 

				}
				break;
			case 35 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:309: OP_INTERSECTION
				{
				mOP_INTERSECTION(); 

				}
				break;
			case 36 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:325: OP_MINUS
				{
				mOP_MINUS(); 

				}
				break;
			case 37 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:334: OP_EQUAL
				{
				mOP_EQUAL(); 

				}
				break;
			case 38 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:343: SEP_BLOCK_START
				{
				mSEP_BLOCK_START(); 

				}
				break;
			case 39 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:359: SEP_BLOCK_END
				{
				mSEP_BLOCK_END(); 

				}
				break;
			case 40 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:373: SEP_COMMA
				{
				mSEP_COMMA(); 

				}
				break;
			case 41 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:383: SEP_SEMICOLON
				{
				mSEP_SEMICOLON(); 

				}
				break;
			case 42 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:397: SEP_COLON
				{
				mSEP_COLON(); 

				}
				break;
			case 43 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:407: SEP_ARGS_START
				{
				mSEP_ARGS_START(); 

				}
				break;
			case 44 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:422: SEP_ARGS_END
				{
				mSEP_ARGS_END(); 

				}
				break;
			case 45 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:435: SEP_OPTIONAL
				{
				mSEP_OPTIONAL(); 

				}
				break;
			case 46 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:448: SEP_TRIGGER
				{
				mSEP_TRIGGER(); 

				}
				break;
			case 47 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:460: SEP_LIST_START
				{
				mSEP_LIST_START(); 

				}
				break;
			case 48 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:475: SEP_LIST_END
				{
				mSEP_LIST_END(); 

				}
				break;
			case 49 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:488: SEP_SUBTYPE_START
				{
				mSEP_SUBTYPE_START(); 

				}
				break;
			case 50 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:506: SEP_SUBTYPE_END
				{
				mSEP_SUBTYPE_END(); 

				}
				break;
			case 51 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:522: SEP_ACCESSOR
				{
				mSEP_ACCESSOR(); 

				}
				break;
			case 52 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:535: SEP_STRUCTURE
				{
				mSEP_STRUCTURE(); 

				}
				break;
			case 53 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:549: CONS_PAIR
				{
				mCONS_PAIR(); 

				}
				break;
			case 54 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:559: CONS_TRIPLE
				{
				mCONS_TRIPLE(); 

				}
				break;
			case 55 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:571: CONS_SET
				{
				mCONS_SET(); 

				}
				break;
			case 56 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:580: CONS_NODE
				{
				mCONS_NODE(); 

				}
				break;
			case 57 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:590: CONS_XOR
				{
				mCONS_XOR(); 

				}
				break;
			case 58 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:599: ID
				{
				mID(); 

				}
				break;
			case 59 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:602: INT
				{
				mINT(); 

				}
				break;
			case 60 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:606: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 61 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:614: WS
				{
				mWS(); 

				}
				break;
			case 62 :
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecLexer.g:1:617: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\1\uffff\4\51\1\66\1\51\1\72\1\74\1\76\1\100\12\51\31\uffff\4\51\1\124"+
		"\1\125\2\51\1\uffff\3\51\1\uffff\1\51\1\uffff\1\51\1\uffff\1\51\1\uffff"+
		"\21\51\1\161\1\51\2\uffff\6\51\1\171\1\172\1\51\1\174\3\51\1\u0080\3\51"+
		"\1\u0084\1\u0085\6\51\1\u008c\1\51\1\uffff\1\51\1\u008f\1\51\1\u0091\1"+
		"\51\1\u0093\1\u0094\2\uffff\1\51\1\uffff\1\u0096\1\u0097\1\51\1\uffff"+
		"\3\51\2\uffff\1\u009d\1\51\1\u009f\3\51\1\uffff\2\51\1\uffff\1\51\1\uffff"+
		"\1\51\2\uffff\1\51\2\uffff\1\u00a8\1\u00a9\2\51\1\u00ac\1\uffff\1\u00ad"+
		"\1\uffff\1\u00ae\1\51\1\u00b0\1\u00b1\1\u00b2\2\51\1\u00b5\2\uffff\1\51"+
		"\1\u00b7\3\uffff\1\51\3\uffff\1\u00b9\1\u00ba\1\uffff\1\51\1\uffff\1\51"+
		"\2\uffff\1\u00bd\1\51\1\uffff\5\51\1\u00c4\1\uffff";
	static final String DFA10_eofS =
		"\u00c5\uffff";
	static final String DFA10_minS =
		"\1\11\1\145\1\157\1\144\1\141\1\60\1\150\4\60\1\141\1\157\1\156\1\150"+
		"\1\160\1\162\1\165\1\141\1\156\1\162\31\uffff\1\141\1\162\1\164\1\160"+
		"\2\60\2\151\1\uffff\1\141\1\155\1\144\1\uffff\1\162\1\uffff\1\164\1\uffff"+
		"\1\151\1\uffff\1\162\1\151\1\154\1\144\1\156\1\141\2\144\1\164\1\155\2"+
		"\144\1\151\2\157\1\144\1\141\1\60\1\157\2\uffff\1\156\1\164\1\162\1\156"+
		"\2\145\2\60\1\160\1\60\1\150\1\156\1\151\1\60\1\163\1\156\1\141\2\60\2"+
		"\145\1\163\1\164\1\156\1\166\1\60\1\154\1\uffff\1\162\1\60\1\145\1\60"+
		"\1\156\2\60\2\uffff\1\154\1\uffff\2\60\1\164\1\uffff\1\164\1\156\1\164"+
		"\2\uffff\1\60\1\163\1\60\1\145\1\146\1\145\1\uffff\1\154\1\164\1\uffff"+
		"\1\162\1\uffff\1\145\2\uffff\1\145\2\uffff\2\60\2\145\1\60\1\uffff\1\60"+
		"\1\uffff\1\60\1\151\3\60\1\156\1\154\1\60\2\uffff\1\154\1\60\3\uffff\1"+
		"\147\3\uffff\2\60\1\uffff\1\163\1\uffff\1\165\2\uffff\1\60\1\162\1\uffff"+
		"\1\141\1\164\1\151\1\157\1\156\1\60\1\uffff";
	static final String DFA10_maxS =
		"\1\175\1\145\1\163\1\156\1\141\1\172\1\150\4\172\1\141\1\157\1\160\1\157"+
		"\1\160\1\162\1\165\1\157\1\156\1\162\31\uffff\1\155\1\162\1\164\1\160"+
		"\2\172\1\151\1\164\1\uffff\1\141\1\155\1\144\1\uffff\1\162\1\uffff\1\164"+
		"\1\uffff\1\151\1\uffff\1\164\1\151\1\154\1\144\1\156\1\141\2\144\1\164"+
		"\1\155\2\144\1\151\2\157\1\144\1\141\1\172\1\157\2\uffff\1\156\1\164\1"+
		"\162\1\156\2\145\2\172\1\160\1\172\1\150\1\156\1\151\1\172\1\163\1\156"+
		"\1\141\2\172\2\145\1\163\1\164\1\156\1\166\1\172\1\154\1\uffff\1\162\1"+
		"\172\1\145\1\172\1\156\2\172\2\uffff\1\154\1\uffff\2\172\1\164\1\uffff"+
		"\1\164\1\156\1\164\2\uffff\1\172\1\163\1\172\1\145\1\146\1\145\1\uffff"+
		"\1\154\1\164\1\uffff\1\162\1\uffff\1\145\2\uffff\1\145\2\uffff\2\172\2"+
		"\145\1\172\1\uffff\1\172\1\uffff\1\172\1\151\3\172\1\156\1\154\1\172\2"+
		"\uffff\1\154\1\172\3\uffff\1\147\3\uffff\2\172\1\uffff\1\163\1\uffff\1"+
		"\165\2\uffff\1\172\1\162\1\uffff\1\141\1\164\1\151\1\157\1\156\1\172\1"+
		"\uffff";
	static final String DFA10_acceptS =
		"\25\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
		"\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\72\1\73\1\74\1\75\1\76\10\uffff"+
		"\1\65\3\uffff\1\70\1\uffff\1\71\1\uffff\1\67\1\uffff\1\66\23\uffff\1\22"+
		"\1\30\33\uffff\1\25\7\uffff\1\11\1\12\1\uffff\1\15\3\uffff\1\26\3\uffff"+
		"\1\27\1\31\6\uffff\1\37\2\uffff\1\4\1\uffff\1\13\1\uffff\1\7\1\10\1\uffff"+
		"\1\23\1\16\5\uffff\1\32\1\uffff\1\33\10\uffff\1\17\1\21\2\uffff\1\35\1"+
		"\34\1\40\1\uffff\1\20\1\2\1\3\2\uffff\1\14\1\uffff\1\24\1\uffff\1\5\1"+
		"\6\2\uffff\1\36\6\uffff\1\1";
	static final String DFA10_specialS =
		"\u00c5\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\54\2\uffff\1\54\22\uffff\1\54\1\41\1\55\1\50\1\42\1\uffff\1\27\1\uffff"+
			"\1\37\1\40\1\uffff\1\26\1\34\1\30\1\47\1\53\12\52\1\36\1\35\1\45\1\31"+
			"\1\46\1\uffff\1\25\2\51\1\6\12\51\1\7\1\51\1\5\2\51\1\11\1\12\3\51\1"+
			"\10\2\51\1\43\1\uffff\1\44\1\uffff\1\51\1\uffff\2\51\1\16\1\51\1\23\1"+
			"\2\2\51\1\3\1\14\2\51\1\4\1\22\1\21\1\13\1\51\1\1\1\15\1\20\1\17\1\51"+
			"\1\24\3\51\1\32\1\uffff\1\33",
			"\1\56",
			"\1\57\3\uffff\1\60",
			"\1\62\10\uffff\1\61\1\63",
			"\1\64",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\1\65\31\51",
			"\1\67",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\1\70\15\51\1\71\13\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\16\51\1\73\13\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\4\51\1\75\25\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\21\51\1\77\10\51",
			"\1\101",
			"\1\102",
			"\1\104\1\uffff\1\103",
			"\1\106\6\uffff\1\105",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112\15\uffff\1\113",
			"\1\114",
			"\1\115",
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
			"\1\120\1\uffff\1\116\11\uffff\1\117",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\126",
			"\1\130\12\uffff\1\127",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"\1\134",
			"",
			"\1\135",
			"",
			"\1\136",
			"",
			"\1\137\1\uffff\1\140",
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
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\162",
			"",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\173",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\175",
			"\1\176",
			"\1\177",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u008d",
			"",
			"\1\u008e",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0090",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0092",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"\1\u0095",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u0098",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u009c\7\51",
			"\1\u009e",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"",
			"\1\u00a5",
			"",
			"\1\u00a6",
			"",
			"",
			"\1\u00a7",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00aa",
			"\1\u00ab",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00af",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00b3",
			"\1\u00b4",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"\1\u00b6",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"",
			"\1\u00b8",
			"",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\u00bb",
			"",
			"\1\u00bc",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\u00be",
			"",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
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

	protected class DFA10 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( RW_RECONFIGURATION | RW_FORALL | RW_IMPORT | RW_MAIN | DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | DT_SET | DT_PAIR | DT_TRIPLE | OP_PAR | OP_JOIN | OP_SPLIT | OP_REMOVE | OP_CONST | OP_ID | OP_PATH | OP_UPDATE | OP_FST | OP_SND | OP_TRD | OP_IN | OP_OUT | OP_NAME | OP_ENDS | OP_NODES | OP_NAMES | OP_CHANNELS | OP_READ | OP_WRITE | OP_APPLY | OP_UNION | OP_INTERSECTION | OP_MINUS | OP_EQUAL | SEP_BLOCK_START | SEP_BLOCK_END | SEP_COMMA | SEP_SEMICOLON | SEP_COLON | SEP_ARGS_START | SEP_ARGS_END | SEP_OPTIONAL | SEP_TRIGGER | SEP_LIST_START | SEP_LIST_END | SEP_SUBTYPE_START | SEP_SUBTYPE_END | SEP_ACCESSOR | SEP_STRUCTURE | CONS_PAIR | CONS_TRIPLE | CONS_SET | CONS_NODE | CONS_XOR | ID | INT | COMMENT | WS | STRING );";
		}
	}

}

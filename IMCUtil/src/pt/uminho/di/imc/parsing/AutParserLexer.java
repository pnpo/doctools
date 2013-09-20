// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g 2013-09-20 17:05:33

		package pt.uminho.di.imc.parsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AutParserLexer extends Lexer {
    public static final int WS=10;
    public static final int ESC_SEQ=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int UNICODE_ESC=8;
    public static final int OCTAL_ESC=9;
    public static final int HEX_DIGIT=7;
    public static final int INT=4;
    public static final int EOF=-1;
    public static final int STRING=5;

    // delegates
    // delegators

    public AutParserLexer() {;} 
    public AutParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AutParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:7:7: ( 'des' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:7:9: 'des'
            {
            match("des"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:8:7: ( '(' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:9:7: ( ',' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:10:7: ( ')' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:11:7: ( 'i' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:11:9: 'i'
            {
            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:75:5: ( ( '0' .. '9' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:75:7: ( '0' .. '9' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:75:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:75:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:79:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:79:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:79:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:79:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:79:24: ~ ( '\\\\' | '\"' )
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
            	    break loop2;
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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:83:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:83:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:87:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
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
                    alt3=1;
                    }
                    break;
                case 'u':
                    {
                    alt3=2;
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
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:87:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:88:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:89:9: OCTAL_ESC
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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='3')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>='0' && LA4_2<='7')) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4>='0' && LA4_4<='7')) ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;}
                    }
                    else {
                        alt4=3;}
                }
                else if ( ((LA4_1>='4' && LA4_1<='7')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>='0' && LA4_3<='7')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:14: ( '0' .. '3' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:36: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:94:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:95:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:95:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:95:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:95:25: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:95:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:96:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:96:14: ( '0' .. '7' )
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:96:15: '0' .. '7'
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
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:101:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:101:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:104:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:104:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    public void mTokens() throws RecognitionException {
        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | INT | STRING | WS )
        int alt5=8;
        switch ( input.LA(1) ) {
        case 'd':
            {
            alt5=1;
            }
            break;
        case '(':
            {
            alt5=2;
            }
            break;
        case ',':
            {
            alt5=3;
            }
            break;
        case ')':
            {
            alt5=4;
            }
            break;
        case 'i':
            {
            alt5=5;
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
        case '8':
        case '9':
            {
            alt5=6;
            }
            break;
        case '\"':
            {
            alt5=7;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:40: INT
                {
                mINT(); 

                }
                break;
            case 7 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:44: STRING
                {
                mSTRING(); 

                }
                break;
            case 8 :
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:1:51: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}
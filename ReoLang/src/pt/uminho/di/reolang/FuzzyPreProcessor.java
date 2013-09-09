// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g 2012-04-10 11:48:50

	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FuzzyPreProcessor extends Lexer {
    public static final int REMAINING=5;
    public static final int COMMENT=4;
    public static final int EOF=-1;

    	private String pre_processed_text = "";
    	public String getPre_Processed_Text() {
    		return this.pre_processed_text;
    	}


    // delegates
    // delegators

    public FuzzyPreProcessor() {;} 
    public FuzzyPreProcessor(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyPreProcessor(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g"; }

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='/') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='/') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='*') ) {
                    alt4=2;
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:14: (~ ( '\\n' | '\\r' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop1;
                        }
                    } while (true);

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:28: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:17:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    this.pre_processed_text += getText().replaceAll("[^\t]", " ") + "\n";

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:18:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:18:14: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='*') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='/') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:18:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match("*/"); 

                    this.pre_processed_text += getText().replaceAll("[^\t\n\r]", " "); 

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

    // $ANTLR start "REMAINING"
    public final void mREMAINING() throws RecognitionException {
        try {
            int _type = REMAINING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:23:2: ( . )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:23:4: .
            {
            matchAny(); 
            this.pre_processed_text += getText() ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REMAINING"

    public void mTokens() throws RecognitionException {
        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:1:8: ( COMMENT | REMAINING )
        int alt5=2;
        int LA5_0 = input.LA(1);

        if ( (LA5_0=='/') ) {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='*'||LA5_1=='/') ) {
                alt5=1;
            }
            else {
                alt5=2;}
        }
        else if ( ((LA5_0>='\u0000' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='\uFFFF')) ) {
            alt5=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }
        switch (alt5) {
            case 1 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:1:10: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 2 :
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/FuzzyPreProcessor.g:1:18: REMAINING
                {
                mREMAINING(); 

                }
                break;

        }

    }


 

}
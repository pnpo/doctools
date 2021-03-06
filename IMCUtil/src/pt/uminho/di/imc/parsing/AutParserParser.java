// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g 2013-10-09 16:13:46

	package pt.uminho.di.imc.parsing;
	
	import pt.uminho.di.imc.*;
	import java.util.regex.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AutParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "STRING", "ID", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "WS", "'des'", "'('", "','", "')'"
    };
    public static final int WS=11;
    public static final int ESC_SEQ=7;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int UNICODE_ESC=9;
    public static final int OCTAL_ESC=10;
    public static final int HEX_DIGIT=8;
    public static final int INT=4;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int STRING=5;

    // delegates
    // delegators


        public AutParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public AutParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return AutParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g"; }


    	private IMC imc;
    	
    	public IMC getIMC() {
    		return this.imc;
    	}
    	



    // $ANTLR start "aut"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:26:1: aut : header body ;
    public final void aut() throws RecognitionException {

        	imc=new IMC();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:30:2: ( header body )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:30:4: header body
            {
            pushFollow(FOLLOW_header_in_aut39);
            header();

            state._fsp--;

            pushFollow(FOLLOW_body_in_aut41);
            body();

            state._fsp--;


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
    // $ANTLR end "aut"


    // $ANTLR start "header"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:33:1: header : 'des' '(' init= INT ',' n_trans= INT ',' n_states= INT ')' ;
    public final void header() throws RecognitionException {
        Token init=null;
        Token n_trans=null;
        Token n_states=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:33:8: ( 'des' '(' init= INT ',' n_trans= INT ',' n_states= INT ')' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:33:10: 'des' '(' init= INT ',' n_trans= INT ',' n_states= INT ')'
            {
            match(input,12,FOLLOW_12_in_header52); 
            match(input,13,FOLLOW_13_in_header54); 
            init=(Token)match(input,INT,FOLLOW_INT_in_header58); 
            this.imc.addInitialState( (init!=null?init.getText():null)) ;
            match(input,14,FOLLOW_14_in_header62); 
            n_trans=(Token)match(input,INT,FOLLOW_INT_in_header66); 
            match(input,14,FOLLOW_14_in_header68); 
            n_states=(Token)match(input,INT,FOLLOW_INT_in_header72); 
            match(input,15,FOLLOW_15_in_header73); 

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
    // $ANTLR end "header"


    // $ANTLR start "body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:36:1: body : ( '(' source= INT ',' label= ( STRING | ID ) ',' target= INT ')' )+ ;
    public final void body() throws RecognitionException {
        Token source=null;
        Token label=null;
        Token target=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:36:6: ( ( '(' source= INT ',' label= ( STRING | ID ) ',' target= INT ')' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:36:8: ( '(' source= INT ',' label= ( STRING | ID ) ',' target= INT ')' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:36:8: ( '(' source= INT ',' label= ( STRING | ID ) ',' target= INT ')' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/AutParser.g:36:9: '(' source= INT ',' label= ( STRING | ID ) ',' target= INT ')'
            	    {
            	    match(input,13,FOLLOW_13_in_body85); 
            	    source=(Token)match(input,INT,FOLLOW_INT_in_body89); 
            	    match(input,14,FOLLOW_14_in_body91); 
            	    label=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STRING && input.LA(1)<=ID) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    match(input,14,FOLLOW_14_in_body101); 
            	    target=(Token)match(input,INT,FOLLOW_INT_in_body105); 
            	    match(input,15,FOLLOW_15_in_body107); 

            	    		Transition t ;
            	    		if((label!=null?label.getText():null).equals("i") || ! (label!=null?label.getText():null).matches(".*\\s*rate\\s+\\d.*\"")) {
            	    			String _label = "" ;
            	    			if((label!=null?label.getText():null).equals("i"))
            	    			{
            	    				_label = "tau";
            	    			}
            	    			else {
            	    				if((label!=null?label.getText():null).contains("\"")){
            	    					_label = (label!=null?label.getText():null).substring(1,(label!=null?label.getText():null).length()-1);
            	    				}
            	    				else {
            	    					_label = (label!=null?label.getText():null);
            	    				}
            	    				
            	    			}
            	    			t = new InteractiveTransition((source!=null?source.getText():null), (target!=null?target.getText():null), _label);
            	    			//System.out.println(_label);
            	    		}
            	    		else {
            	    			Pattern pattern = Pattern.compile("rate\\s+(\\d.+)"); 
            	        			Matcher matcher = pattern.matcher((label!=null?label.getText():null));
            	        			matcher.find();
            	    			double _rate = Double.parseDouble(matcher.group(1).substring(0,matcher.group(1).length()-1));
            	    			int idx_semicolon = (label!=null?label.getText():null).indexOf(';');
            	    			String _label = "";
            	    			if(idx_semicolon!=-1){
            	    				_label = (label!=null?label.getText():null).substring(1,idx_semicolon);
            	    			}
            	    			t = new MarkovianTransition((source!=null?source.getText():null), (target!=null?target.getText():null), _rate, _label);
            	    		}
            	    		this.imc.addTransition(t);
            	    		this.imc.addState((source!=null?source.getText():null));
            	    		this.imc.addState((target!=null?target.getText():null));
            	    	

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "body"

    // Delegated rules


 

    public static final BitSet FOLLOW_header_in_aut39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_body_in_aut41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_header52 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_header54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_header58 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_header62 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_header66 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_header68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_header72 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_header73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_body85 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_body89 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_body91 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_body95 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_body101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_body105 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_body107 = new BitSet(new long[]{0x0000000000002002L});

}
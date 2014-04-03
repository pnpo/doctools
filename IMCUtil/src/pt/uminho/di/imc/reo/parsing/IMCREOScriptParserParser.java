// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g 2014-04-03 10:13:56

	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.composition.*;
	import pt.uminho.di.imc.reo.imc.*;
	import java.lang.reflect.*;
	import java.util.LinkedHashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IMCREOScriptParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "FLOAT", "LABEL", "EXPONENT", "COMMENT", "WS", "'sync'", "'drain'", "'lossy'", "'fifo1e'", "'fifo1f'", "'mer_rep'", "'mer_xor'", "'['", "']'", "'env'"
    };
    public static final int EXPONENT=8;
    public static final int T__20=20;
    public static final int NUMBER=5;
    public static final int FLOAT=6;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int LABEL=7;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int COMMENT=9;

    // delegates
    // delegators


        public IMCREOScriptParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IMCREOScriptParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return IMCREOScriptParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g"; }


    	private Composer2 composer;
    	
    	private IMCREOimc element2IMC(String method_name, ArrayList<String> str_args) {
    		Object[] args = new Object[str_args.size()];
    		str_args.toArray(args);
    		IMCREOimc imc = null;
    		String class_name = "pt.uminho.di.imc.reo.composition.Library";
    		Class<?>[] arg_types = new Class[args.length];
    			
    		//define the type of each argument (all of them are strings)
    		for(int i = 0 ; i < arg_types.length ; i ++) {   
    			arg_types[i] = String.class ;
    		}
    		//invoke the method dynamically and store the result in the
    		//structure_to_text map
    		try {
    			Class<?> cls = Class.forName(class_name);
    			Method mthd = cls.getMethod(method_name, arg_types);
    			String res = (String) mthd.invoke(null, args);
    			
    			imc = ReoMAParserFrontEnd.parse(res, false);					
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    		finally{
    			return imc;
    		}
    	}
    	



    // $ANTLR start "script"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:51:1: script : ( element )+ ( environment )+ ;
    public final void script() throws RecognitionException {

        	composer = new Composer2();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:2: ( ( element )+ ( environment )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:4: ( element )+ ( environment )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:4: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:4: element
            	    {
            	    pushFollow(FOLLOW_element_in_script37);
            	    element();

            	    state._fsp--;


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

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:13: ( environment )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:55:13: environment
            	    {
            	    pushFollow(FOLLOW_environment_in_script40);
            	    environment();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "script"


    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:58:1: element : ( channel | node );
    public final void element() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:58:9: ( channel | node )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:58:11: channel
                    {
                    pushFollow(FOLLOW_channel_in_element51);
                    channel();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:59:5: node
                    {
                    pushFollow(FOLLOW_node_in_element58);
                    node();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "element"


    // $ANTLR start "channel"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:62:1: channel : ( 'sync' identification[new ArrayList<String>()] stoch | 'drain' identification[new ArrayList<String>()] stoch | 'lossy' identification[new ArrayList<String>()] s1= stoch s2= stoch | 'fifo1e' identification[new ArrayList<String>()] s1= stoch s2= stoch | 'fifo1f' identification[new ArrayList<String>()] s1= stoch s2= stoch );
    public final void channel() throws RecognitionException {
        IMCREOScriptParserParser.stoch_return s1 = null;

        IMCREOScriptParserParser.stoch_return s2 = null;

        ArrayList<String> identification1 = null;

        IMCREOScriptParserParser.stoch_return stoch2 = null;

        ArrayList<String> identification3 = null;

        IMCREOScriptParserParser.stoch_return stoch4 = null;

        ArrayList<String> identification5 = null;

        ArrayList<String> identification6 = null;

        ArrayList<String> identification7 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:62:9: ( 'sync' identification[new ArrayList<String>()] stoch | 'drain' identification[new ArrayList<String>()] stoch | 'lossy' identification[new ArrayList<String>()] s1= stoch s2= stoch | 'fifo1e' identification[new ArrayList<String>()] s1= stoch s2= stoch | 'fifo1f' identification[new ArrayList<String>()] s1= stoch s2= stoch )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:62:11: 'sync' identification[new ArrayList<String>()] stoch
                    {
                    match(input,11,FOLLOW_11_in_channel69); 
                    pushFollow(FOLLOW_identification_in_channel71);
                    identification1=identification(new ArrayList<String>());

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel74);
                    stoch2=stoch();

                    state._fsp--;


                    		identification1.add((stoch2!=null?stoch2.rate:null));
                    		this.composer.getElements().add(this.element2IMC("sync_", identification1));
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:67:4: 'drain' identification[new ArrayList<String>()] stoch
                    {
                    match(input,12,FOLLOW_12_in_channel82); 
                    pushFollow(FOLLOW_identification_in_channel84);
                    identification3=identification(new ArrayList<String>());

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel87);
                    stoch4=stoch();

                    state._fsp--;


                    		identification3.add((stoch4!=null?stoch4.rate:null));
                    		this.composer.getElements().add(this.element2IMC("drain_", identification3));
                    	

                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:72:4: 'lossy' identification[new ArrayList<String>()] s1= stoch s2= stoch
                    {
                    match(input,13,FOLLOW_13_in_channel95); 
                    pushFollow(FOLLOW_identification_in_channel97);
                    identification5=identification(new ArrayList<String>());

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel102);
                    s1=stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel106);
                    s2=stoch();

                    state._fsp--;


                    		identification5.add((s1!=null?s1.rate:null));
                    		identification5.add((s2!=null?s2.rate:null));
                    		this.composer.getElements().add(this.element2IMC("lossy_", identification5));
                    	

                    }
                    break;
                case 4 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:78:4: 'fifo1e' identification[new ArrayList<String>()] s1= stoch s2= stoch
                    {
                    match(input,14,FOLLOW_14_in_channel114); 
                    pushFollow(FOLLOW_identification_in_channel116);
                    identification6=identification(new ArrayList<String>());

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel121);
                    s1=stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel125);
                    s2=stoch();

                    state._fsp--;


                    		identification6.add((s1!=null?s1.rate:null));
                    		identification6.add((s2!=null?s2.rate:null));
                    		this.composer.getElements().add(this.element2IMC("fifo1e_", identification6));
                    	

                    }
                    break;
                case 5 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:84:4: 'fifo1f' identification[new ArrayList<String>()] s1= stoch s2= stoch
                    {
                    match(input,15,FOLLOW_15_in_channel133); 
                    pushFollow(FOLLOW_identification_in_channel135);
                    identification7=identification(new ArrayList<String>());

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel140);
                    s1=stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel144);
                    s2=stoch();

                    state._fsp--;


                    		identification7.add((s1!=null?s1.rate:null));
                    		identification7.add((s2!=null?s2.rate:null));
                    		this.composer.getElements().add(this.element2IMC("fifo1f_", identification7));
                    	

                    }
                    break;

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
    // $ANTLR end "channel"


    // $ANTLR start "identification"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:92:1: identification[ArrayList<String> args_in] returns [ArrayList<String> args] : id= ID p1= ID p2= ID ;
    public final ArrayList<String> identification(ArrayList<String> args_in) throws RecognitionException {
        ArrayList<String> args = null;

        Token id=null;
        Token p1=null;
        Token p2=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:93:2: (id= ID p1= ID p2= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:93:5: id= ID p1= ID p2= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_identification168); 
            p1=(Token)match(input,ID,FOLLOW_ID_in_identification172); 
            p2=(Token)match(input,ID,FOLLOW_ID_in_identification176); 

            		args_in.add((id!=null?id.getText():null));
            		args_in.add((p1!=null?p1.getText():null));
            		args_in.add((p2!=null?p2.getText():null));
            		args = args_in;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "identification"

    public static class stoch_return extends ParserRuleReturnScope {
        public String rate;
        public double d_rate;
    };

    // $ANTLR start "stoch"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:102:1: stoch returns [String rate, double d_rate] : NUMBER ;
    public final IMCREOScriptParserParser.stoch_return stoch() throws RecognitionException {
        IMCREOScriptParserParser.stoch_return retval = new IMCREOScriptParserParser.stoch_return();
        retval.start = input.LT(1);

        Token NUMBER8=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:103:2: ( NUMBER )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:103:5: NUMBER
            {
            NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_stoch196); 

            		retval.rate = (NUMBER8!=null?NUMBER8.getText():null);
            		retval.d_rate = Double.parseDouble((NUMBER8!=null?NUMBER8.getText():null));
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stoch"


    // $ANTLR start "node"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:110:1: node : ( 'mer_rep' identification2 (s1= stoch s2= stoch )? | 'mer_xor' identification2 (s1= stoch s2= stoch )? );
    public final void node() throws RecognitionException {
        IMCREOScriptParserParser.stoch_return s1 = null;

        IMCREOScriptParserParser.stoch_return s2 = null;

        IMCREOScriptParserParser.identification2_return identification29 = null;

        IMCREOScriptParserParser.identification2_return identification210 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:110:6: ( 'mer_rep' identification2 (s1= stoch s2= stoch )? | 'mer_xor' identification2 (s1= stoch s2= stoch )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:110:8: 'mer_rep' identification2 (s1= stoch s2= stoch )?
                    {
                    match(input,16,FOLLOW_16_in_node211); 
                    pushFollow(FOLLOW_identification2_in_node213);
                    identification29=identification2();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:110:34: (s1= stoch s2= stoch )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==NUMBER) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:110:35: s1= stoch s2= stoch
                            {
                            pushFollow(FOLLOW_stoch_in_node218);
                            s1=stoch();

                            state._fsp--;

                            pushFollow(FOLLOW_stoch_in_node222);
                            s2=stoch();

                            state._fsp--;


                            }
                            break;

                    }


                    		IMCREOimc res = null;
                    		if((s1!=null?s1.rate:null) != null){
                    			res = Library.merger_replicator((s1!=null?s1.d_rate:0.0), (s2!=null?s2.d_rate:0.0), (identification29!=null?identification29.ins:null), (identification29!=null?identification29.outs:null));
                    		}
                    		else {
                    			res = Library.merger_replicator((identification29!=null?identification29.ins:null), (identification29!=null?identification29.outs:null));
                    		}
                    		this.composer.getElements().add(res);
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:121:4: 'mer_xor' identification2 (s1= stoch s2= stoch )?
                    {
                    match(input,17,FOLLOW_17_in_node232); 
                    pushFollow(FOLLOW_identification2_in_node234);
                    identification210=identification2();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:121:30: (s1= stoch s2= stoch )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NUMBER) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:121:31: s1= stoch s2= stoch
                            {
                            pushFollow(FOLLOW_stoch_in_node239);
                            s1=stoch();

                            state._fsp--;

                            pushFollow(FOLLOW_stoch_in_node243);
                            s2=stoch();

                            state._fsp--;


                            }
                            break;

                    }


                    		IMCREOimc res = null;
                    		if((s1!=null?s1.rate:null) !=null){
                    			res = Library.merger_router((s1!=null?s1.d_rate:0.0), (s2!=null?s2.d_rate:0.0), (identification210!=null?identification210.ins:null), (identification210!=null?identification210.outs:null));
                    		}
                    		else {
                    			res = Library.merger_router((identification210!=null?identification210.ins:null), (identification210!=null?identification210.outs:null));
                    		}
                    		this.composer.getElements().add(res);
                    	

                    }
                    break;

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
    // $ANTLR end "node"

    public static class identification2_return extends ParserRuleReturnScope {
        public LinkedHashSet<String> ins;
        public LinkedHashSet<String> outs;
    };

    // $ANTLR start "identification2"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:136:1: identification2 returns [LinkedHashSet<String> ins, LinkedHashSet<String> outs] : '[' (i1= ID )+ ']' '[' (i2= ID )+ ']' ;
    public final IMCREOScriptParserParser.identification2_return identification2() throws RecognitionException {
        IMCREOScriptParserParser.identification2_return retval = new IMCREOScriptParserParser.identification2_return();
        retval.start = input.LT(1);

        Token i1=null;
        Token i2=null;


        	LinkedHashSet<String> _ins = new LinkedHashSet<String>();
        	LinkedHashSet<String> _outs = new LinkedHashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:141:2: ( '[' (i1= ID )+ ']' '[' (i2= ID )+ ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:141:4: '[' (i1= ID )+ ']' '[' (i2= ID )+ ']'
            {
            match(input,18,FOLLOW_18_in_identification2270); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:141:8: (i1= ID )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:141:10: i1= ID
            	    {
            	    i1=(Token)match(input,ID,FOLLOW_ID_in_identification2276); 
            	     _ins.add((i1!=null?i1.getText():null)) ;

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,19,FOLLOW_19_in_identification2283); 
            match(input,18,FOLLOW_18_in_identification2288); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:142:7: (i2= ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:142:9: i2= ID
            	    {
            	    i2=(Token)match(input,ID,FOLLOW_ID_in_identification2294); 
            	     _outs.add((i2!=null?i2.getText():null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,19,FOLLOW_19_in_identification2301); 

            		retval.ins = _ins;
            		retval.outs = _outs;
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identification2"


    // $ANTLR start "environment"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:149:1: environment : 'env' ID stoch ;
    public final void environment() throws RecognitionException {
        Token ID11=null;
        IMCREOScriptParserParser.stoch_return stoch12 = null;



        	ArrayList<String> args = new ArrayList<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:153:2: ( 'env' ID stoch )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:153:4: 'env' ID stoch
            {
            match(input,20,FOLLOW_20_in_environment321); 
            ID11=(Token)match(input,ID,FOLLOW_ID_in_environment323); 
            pushFollow(FOLLOW_stoch_in_environment325);
            stoch12=stoch();

            state._fsp--;


            		args.add((ID11!=null?ID11.getText():null));
            		args.add((stoch12!=null?stoch12.rate:null));
            		this.composer.getElements().add(this.element2IMC("env_", args));
            	

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
    // $ANTLR end "environment"

    // Delegated rules


 

    public static final BitSet FOLLOW_element_in_script37 = new BitSet(new long[]{0x000000000013F800L});
    public static final BitSet FOLLOW_environment_in_script40 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_channel_in_element51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_element58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_channel69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_channel82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel84 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_channel95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel97 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_channel114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_channel133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identification168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_stoch196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_node211 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_identification2_in_node213 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_stoch_in_node218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_node222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_node232 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_identification2_in_node234 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_stoch_in_node239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_node243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_identification2270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification2276 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_identification2283 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_identification2288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification2294 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_identification2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_environment321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_environment323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_environment325 = new BitSet(new long[]{0x0000000000000002L});

}
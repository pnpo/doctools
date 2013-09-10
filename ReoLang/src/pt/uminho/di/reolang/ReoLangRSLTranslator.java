// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g 2013-09-10 23:34:59

	package pt.uminho.di.reolang;
	
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class ReoLangRSLTranslator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_DECIDE", "RW_JOIN", "RW_AS", "RW_OF", "RW_USE", "RW_IN", "RW_NULL", "RW_PATTERN", "RW_EXTENDS", "RW_FLOW", "RW_TO", "RW_OBSERVERS", "RW_STATE", "RW_CHANNEL", "RW_IMPORT", "RW_RUN", "LIST_OPEN", "LIST_CLOSE", "EQUALS", "SEMICOLON", "COMMA", "COLON", "PORTS_OPEN", "PORTS_CLOSE", "BODY_OPEN", "BODY_CLOSE", "ACCESS_MARK", "QUESTION_MARK", "NOT_MARK", "ARROW_MARK", "LABEL_MARK", "STRUCTURE_MARK", "TIME_MARK", "OP_SYNC", "COND_OPEN", "COND_CLOSE", "STRING", "FILE_PATH", "ID", "INT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "REO_LANG", "ELEMENT", "DIRECTIVE", "IMPORT", "CHANNEL", "SIGNATURE", "OPTION", "TIMED", "TIME", "STRUCTURED", "DIMENSION", "CHANNEL_PORTS", "IN_PORTS", "OUT_PORTS", "PORT", "CONDITION", "COND_ELEMENTS", "EXTENSION", "CHANNEL_BODY", "FLOWS", "CHANNEL_STATE", "STATE_REF", "STATE_OBS", "FLOW", "REQUESTS", "REQUEST", "FLOW_TYPE", "NORMAL_FLOW", "FLOW_POINT", "FLOW_OP", "IF_FLOW", "FLOW_TRUE", "FLOW_FALSE", "PATTERN", "PATTERN_SIGNATURE", "PATTERN_PORTS", "PATTERN_BODY", "PATTERN_DECLARATIONS", "DECLARATION", "INSTANCES", "DECLARATION_TYPE", "PATTERN_COMPOSITIONS", "PORT_DEFINITION", "PORT_ACTUAL_DEFINITION", "PORT_ACCESS", "JOIN_OP", "PORT_ACCESS_LIST", "STOCH"
    };
    public static final int PATTERN_PORTS=86;
    public static final int IN_PORTS=63;
    public static final int PORT_ACTUAL_DEFINITION=94;
    public static final int INSTANCES=90;
    public static final int STOCH=98;
    public static final int OCTAL_ESC=50;
    public static final int CONDITION=66;
    public static final int EQUALS=22;
    public static final int RW_USE=8;
    public static final int RW_FLOW=13;
    public static final int FLOW_TYPE=77;
    public static final int PATTERN_DECLARATIONS=88;
    public static final int EOF=-1;
    public static final int RW_CHANNEL=17;
    public static final int PATTERN_COMPOSITIONS=92;
    public static final int PATTERN=84;
    public static final int IMPORT=54;
    public static final int ARROW_MARK=33;
    public static final int RW_TO=14;
    public static final int COND_OPEN=38;
    public static final int RW_JOIN=5;
    public static final int ACCESS_MARK=30;
    public static final int STRUCTURED=60;
    public static final int FLOWS=70;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=31;
    public static final int CHANNEL=55;
    public static final int ELEMENT=52;
    public static final int DIMENSION=61;
    public static final int COND_ELEMENTS=67;
    public static final int FLOW_TRUE=82;
    public static final int RW_EXTENDS=12;
    public static final int LIST_OPEN=20;
    public static final int COMMENT=45;
    public static final int PORTS_OPEN=26;
    public static final int REO_LANG=51;
    public static final int IF_FLOW=81;
    public static final int REQUESTS=75;
    public static final int BODY_OPEN=28;
    public static final int PATTERN_BODY=87;
    public static final int INT=43;
    public static final int SEMICOLON=23;
    public static final int SIGNATURE=56;
    public static final int WS=46;
    public static final int NOT_MARK=32;
    public static final int FLOW=74;
    public static final int FLOW_FALSE=83;
    public static final int STRUCTURE_MARK=35;
    public static final int BODY_CLOSE=29;
    public static final int NORMAL_FLOW=78;
    public static final int RW_RUN=19;
    public static final int OPTION=57;
    public static final int RW_PATTERN=11;
    public static final int RW_OF=7;
    public static final int DECLARATION_TYPE=91;
    public static final int PORTS_CLOSE=27;
    public static final int FLOAT=44;
    public static final int ID=42;
    public static final int DIRECTIVE=53;
    public static final int DECLARATION=89;
    public static final int LABEL_MARK=34;
    public static final int TIME=59;
    public static final int ESC_SEQ=47;
    public static final int COMMA=24;
    public static final int CHANNEL_STATE=71;
    public static final int RW_IMPORT=18;
    public static final int RW_OBSERVERS=15;
    public static final int COND_CLOSE=39;
    public static final int PORT_DEFINITION=93;
    public static final int TIMED=58;
    public static final int UNICODE_ESC=49;
    public static final int HEX_DIGIT=48;
    public static final int PORT=65;
    public static final int TIME_MARK=36;
    public static final int RW_AS=6;
    public static final int STATE_REF=72;
    public static final int OP_SYNC=37;
    public static final int CHANNEL_BODY=69;
    public static final int LIST_CLOSE=21;
    public static final int JOIN_OP=96;
    public static final int CHANNEL_PORTS=62;
    public static final int FLOW_OP=80;
    public static final int COLON=25;
    public static final int OUT_PORTS=64;
    public static final int PATTERN_SIGNATURE=85;
    public static final int REQUEST=76;
    public static final int RW_STATE=16;
    public static final int STATE_OBS=73;
    public static final int PORT_ACCESS_LIST=97;
    public static final int FLOW_POINT=79;
    public static final int RW_DECIDE=4;
    public static final int RW_IN=9;
    public static final int PORT_ACCESS=95;
    public static final int EXTENSION=68;
    public static final int FILE_PATH=41;
    public static final int STRING=40;

    // delegates
    // delegators


        public ReoLangRSLTranslator(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoLangRSLTranslator(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ReoLangRSLTranslatorTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return ReoLangRSLTranslator.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g"; }

    	
    	private void pair_joins(List<StringTemplate> accesses, String id, StringTemplate st, List<StringTemplate> joins, List<String> _nodes_to_hide) {
    		String prev_name = "";
    		for(int i = 0; i < accesses.size() ; i++) {
    			List<StringTemplate> parts = new ArrayList<StringTemplate>();
    			if(i==0){
    	    			parts.add(accesses.get(i++));
    	    			parts.add(accesses.get(i));				
    	    			prev_name = id;
    	    			st = templateLib.getInstanceOf("rsl_join");
    	    			(st).setAttribute("join_name",id);
    			 	(st).setAttribute("join_body", parts);
    			 	
    			 	joins.add(st);
    		 	}
    		 	else {
    		 		parts.add(accesses.get(i));
    	    			parts.add(new StringTemplate(templateLib,prev_name));				
    	    			prev_name = id + "_" + i;
    		 		
    		 		st = templateLib.getInstanceOf("rsl_join");
    	    			(st).setAttribute("join_name", prev_name);  
    			 	(st).setAttribute("join_body", parts);

    			 	joins.add(st);
    			 	_nodes_to_hide.add(prev_name);
    		 	}
    		}
    	}
    	


    public static class reolang_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reolang"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:53:1: reolang : ^( REO_LANG ( directive_def )* (e+= element )* ) -> rsl_script(circuits=$e);
    public final ReoLangRSLTranslator.reolang_return reolang() throws RecognitionException {
        ReoLangRSLTranslator.reolang_return retval = new ReoLangRSLTranslator.reolang_return();
        retval.start = input.LT(1);

        List list_e=null;
        RuleReturnScope e = null;
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:2: ( ^( REO_LANG ( directive_def )* (e+= element )* ) -> rsl_script(circuits=$e))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:4: ^( REO_LANG ( directive_def )* (e+= element )* )
            {
            match(input,REO_LANG,FOLLOW_REO_LANG_in_reolang60); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:15: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DIRECTIVE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:15: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reolang62);
                	    directive_def();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:31: (e+= element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ELEMENT) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:54:31: e+= element
                	    {
                	    pushFollow(FOLLOW_element_in_reolang67);
                	    e=element();

                	    state._fsp--;

                	    if (list_e==null) list_e=new ArrayList();
                	    list_e.add(e.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 55:3: -> rsl_script(circuits=$e)
            {
                retval.st = templateLib.getInstanceOf("rsl_script",
              new STAttrMap().put("circuits", list_e));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reolang"

    public static class element_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:58:1: element : ( ^( ELEMENT channel_def ) -> {$channel_def.st} | ^( ELEMENT pattern_def ) -> {$pattern_def.st});
    public final ReoLangRSLTranslator.element_return element() throws RecognitionException {
        ReoLangRSLTranslator.element_return retval = new ReoLangRSLTranslator.element_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.channel_def_return channel_def1 = null;

        ReoLangRSLTranslator.pattern_def_return pattern_def2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:59:2: ( ^( ELEMENT channel_def ) -> {$channel_def.st} | ^( ELEMENT pattern_def ) -> {$pattern_def.st})
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELEMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==PATTERN) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==CHANNEL) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:59:4: ^( ELEMENT channel_def )
                    {
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_element94); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_channel_def_in_element96);
                    channel_def1=channel_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 59:27: -> {$channel_def.st}
                    {
                        retval.st = (channel_def1!=null?channel_def1.st:null);
                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:60:4: ^( ELEMENT pattern_def )
                    {
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_element107); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_pattern_def_in_element109);
                    pattern_def2=pattern_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 60:27: -> {$pattern_def.st}
                    {
                        retval.st = (pattern_def2!=null?pattern_def2.st:null);
                    }


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
        return retval;
    }
    // $ANTLR end "element"

    public static class directive_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "directive_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:67:1: directive_def : ^( DIRECTIVE directive_import ) ;
    public final ReoLangRSLTranslator.directive_def_return directive_def() throws RecognitionException {
        ReoLangRSLTranslator.directive_def_return retval = new ReoLangRSLTranslator.directive_def_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:68:2: ( ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:68:4: ^( DIRECTIVE directive_import )
            {
            match(input,DIRECTIVE,FOLLOW_DIRECTIVE_in_directive_def131); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_directive_import_in_directive_def133);
            directive_import();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive_def"

    public static class directive_import_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "directive_import"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:72:1: directive_import : ^( IMPORT FILE_PATH ) ;
    public final ReoLangRSLTranslator.directive_import_return directive_import() throws RecognitionException {
        ReoLangRSLTranslator.directive_import_return retval = new ReoLangRSLTranslator.directive_import_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:73:2: ( ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:73:4: ^( IMPORT FILE_PATH )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import148); 

            match(input, Token.DOWN, null); 
            match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import150); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive_import"

    public static class channel_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "channel_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:87:1: channel_def : ^( CHANNEL channel_signature[\"CHANNEL\"] ( extension )? channel_body ) ;
    public final ReoLangRSLTranslator.channel_def_return channel_def() throws RecognitionException {
        ReoLangRSLTranslator.channel_def_return retval = new ReoLangRSLTranslator.channel_def_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:88:2: ( ^( CHANNEL channel_signature[\"CHANNEL\"] ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:88:4: ^( CHANNEL channel_signature[\"CHANNEL\"] ( extension )? channel_body )
            {
            match(input,CHANNEL,FOLLOW_CHANNEL_in_channel_def175); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_channel_signature_in_channel_def177);
            channel_signature("CHANNEL");

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:88:43: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENSION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:88:43: extension
                    {
                    pushFollow(FOLLOW_extension_in_channel_def180);
                    extension();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_channel_body_in_channel_def183);
            channel_body();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "channel_def"

    public static class channel_signature_return extends TreeRuleReturnScope {
        public String id;
        public String structure;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "channel_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:93:1: channel_signature[String context] returns [String id, String structure] : ^( SIGNATURE name= ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS ports[\"IN\", $channel_signature.context] ) )? ( ^( OUT_PORTS ports[\"OUT\", $channel_signature.context] ) )? ) ( ^( CONDITION ID condition ) )? ) ;
    public final ReoLangRSLTranslator.channel_signature_return channel_signature(String context) throws RecognitionException {
        ReoLangRSLTranslator.channel_signature_return retval = new ReoLangRSLTranslator.channel_signature_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        ReoLangRSLTranslator.option_return option3 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:2: ( ^( SIGNATURE name= ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS ports[\"IN\", $channel_signature.context] ) )? ( ^( OUT_PORTS ports[\"OUT\", $channel_signature.context] ) )? ) ( ^( CONDITION ID condition ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:4: ^( SIGNATURE name= ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS ports[\"IN\", $channel_signature.context] ) )? ( ^( OUT_PORTS ports[\"OUT\", $channel_signature.context] ) )? ) ( ^( CONDITION ID condition ) )? )
            {
            match(input,SIGNATURE,FOLLOW_SIGNATURE_in_channel_signature205); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,ID,FOLLOW_ID_in_channel_signature209); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:24: ( option )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==OPTION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:24: option
                    {
                    pushFollow(FOLLOW_option_in_channel_signature211);
                    option3=option();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CHANNEL_PORTS,FOLLOW_CHANNEL_PORTS_in_channel_signature215); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:48: ( ^( IN_PORTS ports[\"IN\", $channel_signature.context] ) )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IN_PORTS) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:49: ^( IN_PORTS ports[\"IN\", $channel_signature.context] )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_channel_signature219); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature221);
                        ports("IN", context);

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:103: ( ^( OUT_PORTS ports[\"OUT\", $channel_signature.context] ) )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OUT_PORTS) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:104: ^( OUT_PORTS ports[\"OUT\", $channel_signature.context] )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_channel_signature229); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature231);
                        ports("OUT", context);

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:161: ( ^( CONDITION ID condition ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONDITION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:94:162: ^( CONDITION ID condition )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_channel_signature240); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_channel_signature242); 
                    pushFollow(FOLLOW_condition_in_channel_signature244);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }


            		retval.id = (name!=null?name.getText():null);
            		retval.structure = (option3!=null?option3.structure:null) != null ? (option3!=null?option3.structure:null) : "";
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "channel_signature"

    public static class option_return extends TreeRuleReturnScope {
        public String structure;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "option"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:103:1: option returns [String structure] : ( ^( OPTION timed ) | ^( OPTION structured ) );
    public final ReoLangRSLTranslator.option_return option() throws RecognitionException {
        ReoLangRSLTranslator.option_return retval = new ReoLangRSLTranslator.option_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.structured_return structured4 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:104:2: ( ^( OPTION timed ) | ^( OPTION structured ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OPTION) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==TIMED) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==STRUCTURED) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:104:4: ^( OPTION timed )
                    {
                    match(input,OPTION,FOLLOW_OPTION_in_option270); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timed_in_option272);
                    timed();

                    state._fsp--;

                    retval.structure = "" ; 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:105:4: ^( OPTION structured )
                    {
                    match(input,OPTION,FOLLOW_OPTION_in_option284); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_structured_in_option286);
                    structured4=structured();

                    state._fsp--;

                    retval.structure = (structured4!=null?structured4.dim:null) ; 

                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "option"

    public static class timed_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "timed"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:109:1: timed : ^( TIMED time ) ;
    public final ReoLangRSLTranslator.timed_return timed() throws RecognitionException {
        ReoLangRSLTranslator.timed_return retval = new ReoLangRSLTranslator.timed_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:110:2: ( ^( TIMED time ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:110:4: ^( TIMED time )
            {
            match(input,TIMED,FOLLOW_TIMED_in_timed303); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_time_in_timed305);
            time();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timed"

    public static class time_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "time"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:114:1: time : ( ^( TIME ID ) | ^( TIME INT ) );
    public final ReoLangRSLTranslator.time_return time() throws RecognitionException {
        ReoLangRSLTranslator.time_return retval = new ReoLangRSLTranslator.time_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:115:2: ( ^( TIME ID ) | ^( TIME INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TIME) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==ID) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==INT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:115:5: ^( TIME ID )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time321); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_time323); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:116:5: ^( TIME INT )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time331); 

                    match(input, Token.DOWN, null); 
                    match(input,INT,FOLLOW_INT_in_time333); 

                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "time"

    public static class structured_return extends TreeRuleReturnScope {
        public String dim;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "structured"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:120:1: structured returns [String dim] : ^( STRUCTURED ( structure_dimension )+ ) ;
    public final ReoLangRSLTranslator.structured_return structured() throws RecognitionException {
        ReoLangRSLTranslator.structured_return retval = new ReoLangRSLTranslator.structured_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.structure_dimension_return structure_dimension5 = null;



        	String d = "";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:124:2: ( ^( STRUCTURED ( structure_dimension )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:124:4: ^( STRUCTURED ( structure_dimension )+ )
            {
            match(input,STRUCTURED,FOLLOW_STRUCTURED_in_structured356); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:124:17: ( structure_dimension )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIMENSION) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:124:18: structure_dimension
            	    {
            	    pushFollow(FOLLOW_structure_dimension_in_structured359);
            	    structure_dimension5=structure_dimension();

            	    state._fsp--;


            	    		d+= (structure_dimension5!=null?structure_dimension5.dim:null) + " ";
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            		retval.dim = d.trim();
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structured"

    public static class structure_dimension_return extends TreeRuleReturnScope {
        public String dim;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "structure_dimension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:136:1: structure_dimension returns [String dim] : ( ^( DIMENSION ID ) | ^( DIMENSION INT ) );
    public final ReoLangRSLTranslator.structure_dimension_return structure_dimension() throws RecognitionException {
        ReoLangRSLTranslator.structure_dimension_return retval = new ReoLangRSLTranslator.structure_dimension_return();
        retval.start = input.LT(1);

        CommonTree ID6=null;
        CommonTree INT7=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:137:2: ( ^( DIMENSION ID ) | ^( DIMENSION INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DIMENSION) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==ID) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==INT) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:137:5: ^( DIMENSION ID )
                    {
                    match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension392); 

                    match(input, Token.DOWN, null); 
                    ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_structure_dimension394); 
                    retval.dim = (ID6!=null?ID6.getText():null);

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:138:5: ^( DIMENSION INT )
                    {
                    match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension405); 

                    match(input, Token.DOWN, null); 
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_structure_dimension407); 
                    retval.dim = (INT7!=null?INT7.getText():null);

                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "structure_dimension"

    public static class ports_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ports"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:142:1: ports[String type, String context] : ^( PORT ( ID )+ ) ;
    public final ReoLangRSLTranslator.ports_return ports(String type, String context) throws RecognitionException {
        ReoLangRSLTranslator.ports_return retval = new ReoLangRSLTranslator.ports_return();
        retval.start = input.LT(1);

        CommonTree ID8=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:143:2: ( ^( PORT ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:143:4: ^( PORT ( ID )+ )
            {
            match(input,PORT,FOLLOW_PORT_in_ports424); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:143:11: ( ID )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:143:12: ID
            	    {
            	    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_ports427); 

            	    		if(context.equals("PATTERN")) {
            	    			if(type.equals("IN")) {
            	    				((pattern_def_scope)pattern_def_stack.peek()).source.put((ID8!=null?ID8.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).source.size());
            	    			}
            	    			else {
            	    				((pattern_def_scope)pattern_def_stack.peek()).sink.put((ID8!=null?ID8.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).sink.size());
            	    			}
            	    		}
            	    		else {
            	    			if(context.equals("PATTERN.CHANNEL")){
            	    				
            	    				if(type.equals("IN")) {
            	    					((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_source.add((ID8!=null?ID8.getText():null));
            	    				}
            	    				else {
            	    					((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_sink.add((ID8!=null?ID8.getText():null));
            	    				}
            	    			}
            	    		}	
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ports"

    public static class condition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:169:1: condition : ^( COND_ELEMENTS ( ID )+ ) ;
    public final ReoLangRSLTranslator.condition_return condition() throws RecognitionException {
        ReoLangRSLTranslator.condition_return retval = new ReoLangRSLTranslator.condition_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:170:2: ( ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:170:4: ^( COND_ELEMENTS ( ID )+ )
            {
            match(input,COND_ELEMENTS,FOLLOW_COND_ELEMENTS_in_condition449); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:170:20: ( ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:170:20: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_condition451); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class extension_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:174:1: extension : ^( EXTENSION ID ) ;
    public final ReoLangRSLTranslator.extension_return extension() throws RecognitionException {
        ReoLangRSLTranslator.extension_return retval = new ReoLangRSLTranslator.extension_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:175:2: ( ^( EXTENSION ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:175:4: ^( EXTENSION ID )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension467); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_extension469); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extension"

    public static class channel_body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "channel_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:179:1: channel_body : ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) ;
    public final ReoLangRSLTranslator.channel_body_return channel_body() throws RecognitionException {
        ReoLangRSLTranslator.channel_body_return retval = new ReoLangRSLTranslator.channel_body_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:2: ( ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:4: ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
            {
            match(input,CHANNEL_BODY,FOLLOW_CHANNEL_BODY_in_channel_body484); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:19: ( state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CHANNEL_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:19: state_def
                    {
                    pushFollow(FOLLOW_state_def_in_channel_body486);
                    state_def();

                    state._fsp--;


                    }
                    break;

            }

            match(input,FLOWS,FOLLOW_FLOWS_in_channel_body491); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:39: ( flow_def )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==FLOW) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:180:39: flow_def
            	    {
            	    pushFollow(FOLLOW_flow_def_in_channel_body493);
            	    flow_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "channel_body"

    public static class state_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "state_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:184:1: state_def : ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) ;
    public final ReoLangRSLTranslator.state_def_return state_def() throws RecognitionException {
        ReoLangRSLTranslator.state_def_return retval = new ReoLangRSLTranslator.state_def_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:185:2: ( ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:185:4: ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
            {
            match(input,CHANNEL_STATE,FOLLOW_CHANNEL_STATE_in_state_def510); 

            match(input, Token.DOWN, null); 
            match(input,STATE_REF,FOLLOW_STATE_REF_in_state_def513); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_state_def515); 

            match(input, Token.UP, null); 
            match(input,STATE_OBS,FOLLOW_STATE_OBS_in_state_def519); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:185:48: ( ID )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:185:48: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_state_def521); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "state_def"

    public static class flow_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:189:1: flow_def : ^( FLOW requests flow_type ) ;
    public final ReoLangRSLTranslator.flow_def_return flow_def() throws RecognitionException {
        ReoLangRSLTranslator.flow_def_return retval = new ReoLangRSLTranslator.flow_def_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:190:2: ( ^( FLOW requests flow_type ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:190:4: ^( FLOW requests flow_type )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow_def539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_requests_in_flow_def541);
            requests();

            state._fsp--;

            pushFollow(FOLLOW_flow_type_in_flow_def543);
            flow_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_def"

    public static class requests_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "requests"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:195:1: requests : ^( REQUESTS ( request )+ ) ;
    public final ReoLangRSLTranslator.requests_return requests() throws RecognitionException {
        ReoLangRSLTranslator.requests_return retval = new ReoLangRSLTranslator.requests_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:196:2: ( ^( REQUESTS ( request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:196:4: ^( REQUESTS ( request )+ )
            {
            match(input,REQUESTS,FOLLOW_REQUESTS_in_requests559); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:196:15: ( request )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==REQUEST) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:196:15: request
            	    {
            	    pushFollow(FOLLOW_request_in_requests561);
            	    request();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requests"

    public static class request_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "request"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:200:1: request : ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) );
    public final ReoLangRSLTranslator.request_return request() throws RecognitionException {
        ReoLangRSLTranslator.request_return retval = new ReoLangRSLTranslator.request_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:201:2: ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==REQUEST) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==ID) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==NOT_MARK) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:201:4: ^( REQUEST ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request578); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_request580); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:202:4: ^( REQUEST NOT_MARK ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request587); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request589); 
                    match(input,ID,FOLLOW_ID_in_request591); 

                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "request"

    public static class flow_type_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow_type"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:206:1: flow_type : ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) );
    public final ReoLangRSLTranslator.flow_type_return flow_type() throws RecognitionException {
        ReoLangRSLTranslator.flow_type_return retval = new ReoLangRSLTranslator.flow_type_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:2: ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FLOW_TYPE) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==IF_FLOW) ) {
                        alt22=2;
                    }
                    else if ( (LA22_2==NORMAL_FLOW) ) {
                        alt22=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:4: ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type606); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_normal_flow_in_flow_type608);
                    normal_flow();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:28: ( flow_operation normal_flow )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==FLOW_OP) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:29: flow_operation normal_flow
                            {
                            pushFollow(FOLLOW_flow_operation_in_flow_type611);
                            flow_operation();

                            state._fsp--;

                            pushFollow(FOLLOW_normal_flow_in_flow_type613);
                            normal_flow();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:58: ( flow_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:207:58: flow_label
                            {
                            pushFollow(FOLLOW_flow_label_in_flow_type617);
                            flow_label();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:208:4: ^( FLOW_TYPE if_flow )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type625); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_if_flow_in_flow_type627);
                    if_flow();

                    state._fsp--;


                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "flow_type"

    public static class normal_flow_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "normal_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:212:1: normal_flow : ^( NORMAL_FLOW flow_point ( timed )? flow_point ) ;
    public final ReoLangRSLTranslator.normal_flow_return normal_flow() throws RecognitionException {
        ReoLangRSLTranslator.normal_flow_return retval = new ReoLangRSLTranslator.normal_flow_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:213:2: ( ^( NORMAL_FLOW flow_point ( timed )? flow_point ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:213:4: ^( NORMAL_FLOW flow_point ( timed )? flow_point )
            {
            match(input,NORMAL_FLOW,FOLLOW_NORMAL_FLOW_in_normal_flow642); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_point_in_normal_flow644);
            flow_point();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:213:29: ( timed )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIMED) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:213:29: timed
                    {
                    pushFollow(FOLLOW_timed_in_normal_flow646);
                    timed();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_flow_point_in_normal_flow649);
            flow_point();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "normal_flow"

    public static class flow_point_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow_point"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:217:1: flow_point : ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) );
    public final ReoLangRSLTranslator.flow_point_return flow_point() throws RecognitionException {
        ReoLangRSLTranslator.flow_point_return retval = new ReoLangRSLTranslator.flow_point_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:218:2: ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FLOW_POINT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==ID) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==RW_NULL) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:218:4: ^( FLOW_POINT ID )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point665); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_flow_point667); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:219:5: ^( FLOW_POINT RW_NULL )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point675); 

                    match(input, Token.DOWN, null); 
                    match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point677); 

                    match(input, Token.UP, null); 

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
        return retval;
    }
    // $ANTLR end "flow_point"

    public static class flow_operation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:222:1: flow_operation : ^( FLOW_OP OP_SYNC ) ;
    public final ReoLangRSLTranslator.flow_operation_return flow_operation() throws RecognitionException {
        ReoLangRSLTranslator.flow_operation_return retval = new ReoLangRSLTranslator.flow_operation_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:223:2: ( ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:223:4: ^( FLOW_OP OP_SYNC )
            {
            match(input,FLOW_OP,FOLLOW_FLOW_OP_in_flow_operation690); 

            match(input, Token.DOWN, null); 
            match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation692); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_operation"

    public static class if_flow_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "if_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:227:1: if_flow : ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) ;
    public final ReoLangRSLTranslator.if_flow_return if_flow() throws RecognitionException {
        ReoLangRSLTranslator.if_flow_return retval = new ReoLangRSLTranslator.if_flow_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:2: ( ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:4: ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) )
            {
            match(input,IF_FLOW,FOLLOW_IF_FLOW_in_if_flow707); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_if_flow709); 
            match(input,FLOW_TRUE,FOLLOW_FLOW_TRUE_in_if_flow712); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow714);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:39: ( flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:39: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow716);
                    flow_label();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            match(input,FLOW_FALSE,FOLLOW_FLOW_FALSE_in_if_flow721); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow723);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:75: ( flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:228:75: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow725);
                    flow_label();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_flow"

    public static class flow_label_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:233:1: flow_label : ID ;
    public final ReoLangRSLTranslator.flow_label_return flow_label() throws RecognitionException {
        ReoLangRSLTranslator.flow_label_return retval = new ReoLangRSLTranslator.flow_label_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:234:2: ( ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:234:4: ID
            {
            match(input,ID,FOLLOW_ID_in_flow_label744); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_label"

    protected static class pattern_def_scope {
        HashMap<String, Integer> source;
        HashMap<String, Integer> sink;
        HashMap<String, List<String>> inst_source;
        HashMap<String, List<String>> inst_sink;
        List<String> declaration_inst_source;
        List<String> declaration_inst_sink;
    }
    protected Stack pattern_def_stack = new Stack();

    public static class pattern_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:250:1: pattern_def : ^( PATTERN pattern_signature pattern_body ) -> rsl_circuit(name=$pattern_signature.namebody=$pattern_body.stsources=ports_to_export_sourcesinks=ports_to_export_sink);
    public final ReoLangRSLTranslator.pattern_def_return pattern_def() throws RecognitionException {
        pattern_def_stack.push(new pattern_def_scope());
        ReoLangRSLTranslator.pattern_def_return retval = new ReoLangRSLTranslator.pattern_def_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.pattern_signature_return pattern_signature9 = null;

        ReoLangRSLTranslator.pattern_body_return pattern_body10 = null;



        	((pattern_def_scope)pattern_def_stack.peek()).source = new HashMap<String, Integer>();
        	((pattern_def_scope)pattern_def_stack.peek()).sink = new HashMap<String, Integer>();
        	((pattern_def_scope)pattern_def_stack.peek()).inst_source = new HashMap<String, List<String>>();
        	((pattern_def_scope)pattern_def_stack.peek()).inst_sink = new HashMap<String, List<String>>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:265:2: ( ^( PATTERN pattern_signature pattern_body ) -> rsl_circuit(name=$pattern_signature.namebody=$pattern_body.stsources=ports_to_export_sourcesinks=ports_to_export_sink))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:265:4: ^( PATTERN pattern_signature pattern_body )
            {
            match(input,PATTERN,FOLLOW_PATTERN_in_pattern_def776); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_signature_in_pattern_def778);
            pattern_signature9=pattern_signature();

            state._fsp--;

            pushFollow(FOLLOW_pattern_body_in_pattern_def780);
            pattern_body10=pattern_body();

            state._fsp--;


            		List<String> ports_to_export_source = new ArrayList<String>();
            		for(String s : ((pattern_def_scope)pattern_def_stack.peek()).source.keySet()){
            			ports_to_export_source.add("source[" + ((pattern_def_scope)pattern_def_stack.peek()).source.get(s) + "] = " + s);
            		}
            		
            		List<String> ports_to_export_sink = new ArrayList<String>();
            		for(String s : ((pattern_def_scope)pattern_def_stack.peek()).sink.keySet()){
            			ports_to_export_sink.add("sink[" + ((pattern_def_scope)pattern_def_stack.peek()).sink.get(s) + "] = " + s);
            		}
            		
            	

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 279:3: -> rsl_circuit(name=$pattern_signature.namebody=$pattern_body.stsources=ports_to_export_sourcesinks=ports_to_export_sink)
            {
                retval.st = templateLib.getInstanceOf("rsl_circuit",
              new STAttrMap().put("name", (pattern_signature9!=null?pattern_signature9.name:null)).put("body", (pattern_body10!=null?pattern_body10.st:null)).put("sources", ports_to_export_source).put("sinks", ports_to_export_sink));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            pattern_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "pattern_def"

    public static class pattern_signature_return extends TreeRuleReturnScope {
        public String name;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:284:1: pattern_signature returns [String name] : ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS ports[\"IN\", \"PATTERN\"] ) )? ( ^( OUT_PORTS ports[\"OUT\", \"PATTERN\"] ) )? ) ) ;
    public final ReoLangRSLTranslator.pattern_signature_return pattern_signature() throws RecognitionException {
        ReoLangRSLTranslator.pattern_signature_return retval = new ReoLangRSLTranslator.pattern_signature_return();
        retval.start = input.LT(1);

        CommonTree ID11=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:2: ( ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS ports[\"IN\", \"PATTERN\"] ) )? ( ^( OUT_PORTS ports[\"OUT\", \"PATTERN\"] ) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:4: ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS ports[\"IN\", \"PATTERN\"] ) )? ( ^( OUT_PORTS ports[\"OUT\", \"PATTERN\"] ) )? ) )
            {
            match(input,PATTERN_SIGNATURE,FOLLOW_PATTERN_SIGNATURE_in_pattern_signature836); 

            match(input, Token.DOWN, null); 
            ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_pattern_signature838); 
            match(input,PATTERN_PORTS,FOLLOW_PATTERN_PORTS_in_pattern_signature841); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:43: ( ^( IN_PORTS ports[\"IN\", \"PATTERN\"] ) )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IN_PORTS) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:44: ^( IN_PORTS ports[\"IN\", \"PATTERN\"] )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_pattern_signature845); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature847);
                        ports("IN", "PATTERN");

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:81: ( ^( OUT_PORTS ports[\"OUT\", \"PATTERN\"] ) )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OUT_PORTS) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:286:82: ^( OUT_PORTS ports[\"OUT\", \"PATTERN\"] )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_pattern_signature855); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature857);
                        ports("OUT", "PATTERN");

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            		retval.name = (ID11!=null?ID11.getText():null);
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_signature"

    public static class pattern_body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:300:1: pattern_body : ^( PATTERN_BODY pattern_declarations pattern_compositions ) -> rsl_body(decls=$pattern_declarations.stcomps=$pattern_compositions.st);
    public final ReoLangRSLTranslator.pattern_body_return pattern_body() throws RecognitionException {
        ReoLangRSLTranslator.pattern_body_return retval = new ReoLangRSLTranslator.pattern_body_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.pattern_declarations_return pattern_declarations12 = null;

        ReoLangRSLTranslator.pattern_compositions_return pattern_compositions13 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:301:2: ( ^( PATTERN_BODY pattern_declarations pattern_compositions ) -> rsl_body(decls=$pattern_declarations.stcomps=$pattern_compositions.st))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:301:4: ^( PATTERN_BODY pattern_declarations pattern_compositions )
            {
            match(input,PATTERN_BODY,FOLLOW_PATTERN_BODY_in_pattern_body897); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_declarations_in_pattern_body899);
            pattern_declarations12=pattern_declarations();

            state._fsp--;

            pushFollow(FOLLOW_pattern_compositions_in_pattern_body901);
            pattern_compositions13=pattern_compositions();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 302:3: -> rsl_body(decls=$pattern_declarations.stcomps=$pattern_compositions.st)
            {
                retval.st = templateLib.getInstanceOf("rsl_body",
              new STAttrMap().put("decls", (pattern_declarations12!=null?pattern_declarations12.st:null)).put("comps", (pattern_compositions13!=null?pattern_compositions13.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_body"

    public static class pattern_declarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern_declarations"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:313:1: pattern_declarations : ^( PATTERN_DECLARATIONS (dec+= declaration )+ ) -> rsl_declarations(decls=$dec);
    public final ReoLangRSLTranslator.pattern_declarations_return pattern_declarations() throws RecognitionException {
        ReoLangRSLTranslator.pattern_declarations_return retval = new ReoLangRSLTranslator.pattern_declarations_return();
        retval.start = input.LT(1);

        List list_dec=null;
        RuleReturnScope dec = null;
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:314:2: ( ^( PATTERN_DECLARATIONS (dec+= declaration )+ ) -> rsl_declarations(decls=$dec))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:314:4: ^( PATTERN_DECLARATIONS (dec+= declaration )+ )
            {
            match(input,PATTERN_DECLARATIONS,FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations947); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:314:30: (dec+= declaration )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DECLARATION) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:314:30: dec+= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations951);
            	    dec=declaration();

            	    state._fsp--;

            	    if (list_dec==null) list_dec=new ArrayList();
            	    list_dec.add(dec.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 315:3: -> rsl_declarations(decls=$dec)
            {
                retval.st = templateLib.getInstanceOf("rsl_declarations",
              new STAttrMap().put("decls", list_dec));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_declarations"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:324:1: declaration : ^( DECLARATION reference_signature instances[$reference_signature.type_id] ) -> {$instances.st};
    public final ReoLangRSLTranslator.declaration_return declaration() throws RecognitionException {
        ReoLangRSLTranslator.declaration_return retval = new ReoLangRSLTranslator.declaration_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.reference_signature_return reference_signature14 = null;

        ReoLangRSLTranslator.instances_return instances15 = null;



        	((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_source = new ArrayList<String>();
        	((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_sink = new ArrayList<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:333:2: ( ^( DECLARATION reference_signature instances[$reference_signature.type_id] ) -> {$instances.st})
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:333:4: ^( DECLARATION reference_signature instances[$reference_signature.type_id] )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration998); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reference_signature_in_declaration1000);
            reference_signature14=reference_signature();

            state._fsp--;

            pushFollow(FOLLOW_instances_in_declaration1002);
            instances15=instances((reference_signature14!=null?reference_signature14.type_id:null));

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 334:3: -> {$instances.st}
            {
                retval.st = (instances15!=null?instances15.st:null);
            }


            }


            	((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_source = null;
            	((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_sink = null;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class reference_signature_return extends TreeRuleReturnScope {
        public String type_id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reference_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:344:1: reference_signature returns [String type_id] : ^( DECLARATION_TYPE ( ID )? channel_signature[\"PATTERN.CHANNEL\"] ) ;
    public final ReoLangRSLTranslator.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangRSLTranslator.reference_signature_return retval = new ReoLangRSLTranslator.reference_signature_return();
        retval.start = input.LT(1);

        CommonTree ID16=null;
        ReoLangRSLTranslator.channel_signature_return channel_signature17 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:345:2: ( ^( DECLARATION_TYPE ( ID )? channel_signature[\"PATTERN.CHANNEL\"] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:345:4: ^( DECLARATION_TYPE ( ID )? channel_signature[\"PATTERN.CHANNEL\"] )
            {
            match(input,DECLARATION_TYPE,FOLLOW_DECLARATION_TYPE_in_reference_signature1041); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:345:23: ( ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:345:23: ID
                    {
                    ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_reference_signature1043); 

                    }
                    break;

            }

            pushFollow(FOLLOW_channel_signature_in_reference_signature1046);
            channel_signature17=channel_signature("PATTERN.CHANNEL");

            state._fsp--;


            		
            		String state = ((ID16!=null?ID16.getText():null) != null) ? (((ID16!=null?ID16.getText():null).equals("F"))?  "_f": "" ) : "" ;
            		retval.type_id = (channel_signature17!=null?channel_signature17.id:null) + (channel_signature17!=null?channel_signature17.structure:null) + state;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference_signature"

    public static class instances_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instances"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:362:1: instances[String type] : ^( INSTANCES i1= ID ( stochastic_values )? (i2= ID ( stochastic_values )? )* ) -> rsl_declaration(ids=inststype=$instances.type);
    public final ReoLangRSLTranslator.instances_return instances(String type) throws RecognitionException {
        ReoLangRSLTranslator.instances_return retval = new ReoLangRSLTranslator.instances_return();
        retval.start = input.LT(1);

        CommonTree i1=null;
        CommonTree i2=null;


        	List<String> insts = new ArrayList<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:366:2: ( ^( INSTANCES i1= ID ( stochastic_values )? (i2= ID ( stochastic_values )? )* ) -> rsl_declaration(ids=inststype=$instances.type))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:366:4: ^( INSTANCES i1= ID ( stochastic_values )? (i2= ID ( stochastic_values )? )* )
            {
            match(input,INSTANCES,FOLLOW_INSTANCES_in_instances1088); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_instances1092); 

            		insts.add((i1!=null?i1.getText():null));
            		((pattern_def_scope)pattern_def_stack.peek()).inst_source.put((i1!=null?i1.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_source);
            		((pattern_def_scope)pattern_def_stack.peek()).inst_sink.put((i1!=null?i1.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_sink);
            	
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:372:3: ( stochastic_values )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==STOCH) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:372:3: stochastic_values
                    {
                    pushFollow(FOLLOW_stochastic_values_in_instances1100);
                    stochastic_values();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:372:22: (i2= ID ( stochastic_values )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:372:23: i2= ID ( stochastic_values )?
            	    {
            	    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_instances1106); 

            	    		insts.add((i2!=null?i2.getText():null));
            	    		((pattern_def_scope)pattern_def_stack.peek()).inst_source.put((i2!=null?i2.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_source);
            	    		((pattern_def_scope)pattern_def_stack.peek()).inst_sink.put((i2!=null?i2.getText():null), ((pattern_def_scope)pattern_def_stack.peek()).declaration_inst_sink);
            	    	
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:378:3: ( stochastic_values )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==STOCH) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:378:3: stochastic_values
            	            {
            	            pushFollow(FOLLOW_stochastic_values_in_instances1115);
            	            stochastic_values();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 380:3: -> rsl_declaration(ids=inststype=$instances.type)
            {
                retval.st = templateLib.getInstanceOf("rsl_declaration",
              new STAttrMap().put("ids", insts).put("type", type));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instances"

    public static class stochastic_values_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stochastic_values"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:392:1: stochastic_values : ^( STOCH ( ID FLOAT )+ ) ;
    public final ReoLangRSLTranslator.stochastic_values_return stochastic_values() throws RecognitionException {
        ReoLangRSLTranslator.stochastic_values_return retval = new ReoLangRSLTranslator.stochastic_values_return();
        retval.start = input.LT(1);

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:393:2: ( ^( STOCH ( ID FLOAT )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:393:4: ^( STOCH ( ID FLOAT )+ )
            {
            match(input,STOCH,FOLLOW_STOCH_in_stochastic_values1161); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:393:12: ( ID FLOAT )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:393:13: ID FLOAT
            	    {
            	    match(input,ID,FOLLOW_ID_in_stochastic_values1164); 
            	    match(input,FLOAT,FOLLOW_FLOAT_in_stochastic_values1166); 

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stochastic_values"

    public static class pattern_compositions_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern_compositions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:404:1: pattern_compositions : ^( PATTERN_COMPOSITIONS (pds+= port_definition )+ (js+= join_operation )* ) -> rsl_compositions(ports=$pdsjoins=$js);
    public final ReoLangRSLTranslator.pattern_compositions_return pattern_compositions() throws RecognitionException {
        ReoLangRSLTranslator.pattern_compositions_return retval = new ReoLangRSLTranslator.pattern_compositions_return();
        retval.start = input.LT(1);

        List list_pds=null;
        List list_js=null;
        RuleReturnScope pds = null;
        RuleReturnScope js = null;
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:2: ( ^( PATTERN_COMPOSITIONS (pds+= port_definition )+ (js+= join_operation )* ) -> rsl_compositions(ports=$pdsjoins=$js))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:5: ^( PATTERN_COMPOSITIONS (pds+= port_definition )+ (js+= join_operation )* )
            {
            match(input,PATTERN_COMPOSITIONS,FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1192); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:31: (pds+= port_definition )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==PORT_DEFINITION) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:31: pds+= port_definition
            	    {
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions1196);
            	    pds=port_definition();

            	    state._fsp--;

            	    if (list_pds==null) list_pds=new ArrayList();
            	    list_pds.add(pds.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:52: (js+= join_operation )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==JOIN_OP) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:405:52: js+= join_operation
            	    {
            	    pushFollow(FOLLOW_join_operation_in_pattern_compositions1201);
            	    js=join_operation();

            	    state._fsp--;

            	    if (list_js==null) list_js=new ArrayList();
            	    list_js.add(js.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 406:3: -> rsl_compositions(ports=$pdsjoins=$js)
            {
                retval.st = templateLib.getInstanceOf("rsl_compositions",
              new STAttrMap().put("ports", list_pds).put("joins", list_js));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_compositions"

    public static class port_definition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "port_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:417:1: port_definition : ^( PORT_DEFINITION ID port_actual_definition[$ID.text] ) -> {$port_actual_definition.st};
    public final ReoLangRSLTranslator.port_definition_return port_definition() throws RecognitionException {
        ReoLangRSLTranslator.port_definition_return retval = new ReoLangRSLTranslator.port_definition_return();
        retval.start = input.LT(1);

        CommonTree ID18=null;
        ReoLangRSLTranslator.port_actual_definition_return port_actual_definition19 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:418:2: ( ^( PORT_DEFINITION ID port_actual_definition[$ID.text] ) -> {$port_actual_definition.st})
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:418:4: ^( PORT_DEFINITION ID port_actual_definition[$ID.text] )
            {
            match(input,PORT_DEFINITION,FOLLOW_PORT_DEFINITION_in_port_definition1248); 

            match(input, Token.DOWN, null); 
            ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_port_definition1250); 
            pushFollow(FOLLOW_port_actual_definition_in_port_definition1252);
            port_actual_definition19=port_actual_definition((ID18!=null?ID18.getText():null));

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 419:3: -> {$port_actual_definition.st}
            {
                retval.st = (port_actual_definition19!=null?port_actual_definition19.st:null);
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_definition"

    public static class port_actual_definition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "port_actual_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:425:1: port_actual_definition[String id] : ( ^( PORT_ACTUAL_DEFINITION port_access ) -> rsl_port(node=$port_actual_definition.iddefinition=$port_access.st) | ^( PORT_ACTUAL_DEFINITION join_part ) -> rsl_paired_joins(joins=joinshide=_nodes_to_hide));
    public final ReoLangRSLTranslator.port_actual_definition_return port_actual_definition(String id) throws RecognitionException {
        ReoLangRSLTranslator.port_actual_definition_return retval = new ReoLangRSLTranslator.port_actual_definition_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.port_access_return port_access20 = null;

        ReoLangRSLTranslator.join_part_return join_part21 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:426:2: ( ^( PORT_ACTUAL_DEFINITION port_access ) -> rsl_port(node=$port_actual_definition.iddefinition=$port_access.st) | ^( PORT_ACTUAL_DEFINITION join_part ) -> rsl_paired_joins(joins=joinshide=_nodes_to_hide))
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==PORT_ACTUAL_DEFINITION) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==DOWN) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==PORT_ACCESS) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_2>=RW_DECIDE && LA37_2<=RW_JOIN)) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:426:5: ^( PORT_ACTUAL_DEFINITION port_access )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1279); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_in_port_actual_definition1281);
                    port_access20=port_access();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 427:3: -> rsl_port(node=$port_actual_definition.iddefinition=$port_access.st)
                    {
                        retval.st = templateLib.getInstanceOf("rsl_port",
                      new STAttrMap().put("node", id).put("definition", (port_access20!=null?port_access20.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:428:5: ^( PORT_ACTUAL_DEFINITION join_part )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1307); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_join_part_in_port_actual_definition1309);
                    join_part21=join_part();

                    state._fsp--;


                    		List<String> _nodes_to_hide = new ArrayList<String>();
                    		List<StringTemplate> joins = new ArrayList<StringTemplate>();
                    		pair_joins((join_part21!=null?join_part21.accesses:null), id, retval.st, joins, _nodes_to_hide);
                    	

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 435:3: -> rsl_paired_joins(joins=joinshide=_nodes_to_hide)
                    {
                        retval.st = templateLib.getInstanceOf("rsl_paired_joins",
                      new STAttrMap().put("joins", joins).put("hide", _nodes_to_hide));
                    }


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
        return retval;
    }
    // $ANTLR end "port_actual_definition"

    public static class port_access_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "port_access"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:440:1: port_access : ^( PORT_ACCESS comp= ID port= ID ) -> rsl_access(comp=$comp.textport=_access);
    public final ReoLangRSLTranslator.port_access_return port_access() throws RecognitionException {
        ReoLangRSLTranslator.port_access_return retval = new ReoLangRSLTranslator.port_access_return();
        retval.start = input.LT(1);

        CommonTree comp=null;
        CommonTree port=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:441:2: ( ^( PORT_ACCESS comp= ID port= ID ) -> rsl_access(comp=$comp.textport=_access))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:441:4: ^( PORT_ACCESS comp= ID port= ID )
            {
            match(input,PORT_ACCESS,FOLLOW_PORT_ACCESS_in_port_access1348); 

            match(input, Token.DOWN, null); 
            comp=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1352); 
            port=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1356); 

            		String _access ;
            		if(((pattern_def_scope)pattern_def_stack.peek()).inst_source.get((comp!=null?comp.getText():null)).contains((port!=null?port.getText():null))) {
            			_access = (((pattern_def_scope)pattern_def_stack.peek()).inst_source.get((comp!=null?comp.getText():null)).size() > 1) ? "source[" + ((pattern_def_scope)pattern_def_stack.peek()).inst_source.get((comp!=null?comp.getText():null)).indexOf((port!=null?port.getText():null)) + "]" : "source";
            		} 
            		else {
            			_access = (((pattern_def_scope)pattern_def_stack.peek()).inst_sink.get((comp!=null?comp.getText():null)).size() > 1) ? "sink[" + ((pattern_def_scope)pattern_def_stack.peek()).inst_sink.get((comp!=null?comp.getText():null)).indexOf((port!=null?port.getText():null)) + "]" : "sink";
            		}
            	

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 452:3: -> rsl_access(comp=$comp.textport=_access)
            {
                retval.st = templateLib.getInstanceOf("rsl_access",
              new STAttrMap().put("comp", (comp!=null?comp.getText():null)).put("port", _access));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_access"

    public static class join_operation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "join_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:455:1: join_operation : ^( JOIN_OP ID join_part ) -> rsl_paired_joins(joins=joinshide=_nodes_to_hide);
    public final ReoLangRSLTranslator.join_operation_return join_operation() throws RecognitionException {
        ReoLangRSLTranslator.join_operation_return retval = new ReoLangRSLTranslator.join_operation_return();
        retval.start = input.LT(1);

        CommonTree ID23=null;
        ReoLangRSLTranslator.join_part_return join_part22 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:456:2: ( ^( JOIN_OP ID join_part ) -> rsl_paired_joins(joins=joinshide=_nodes_to_hide))
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:456:4: ^( JOIN_OP ID join_part )
            {
            match(input,JOIN_OP,FOLLOW_JOIN_OP_in_join_operation1391); 

            match(input, Token.DOWN, null); 
            ID23=(CommonTree)match(input,ID,FOLLOW_ID_in_join_operation1393); 
            pushFollow(FOLLOW_join_part_in_join_operation1395);
            join_part22=join_part();

            state._fsp--;


            		
            		List<String> _nodes_to_hide = new ArrayList<String>();
            		List<StringTemplate> joins = new ArrayList<StringTemplate>();
            		pair_joins((join_part22!=null?join_part22.accesses:null), (ID23!=null?ID23.getText():null), retval.st, joins, _nodes_to_hide);
            			
            	

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 465:3: -> rsl_paired_joins(joins=joinshide=_nodes_to_hide)
            {
                retval.st = templateLib.getInstanceOf("rsl_paired_joins",
              new STAttrMap().put("joins", joins).put("hide", _nodes_to_hide));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_operation"

    public static class join_part_return extends TreeRuleReturnScope {
        public List<StringTemplate> accesses;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "join_part"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:468:1: join_part returns [List<StringTemplate> accesses] : ( ^( RW_JOIN port_access_list ) -> {$port_access_list.st} | ^( RW_DECIDE special_port_access_list ) -> {$special_port_access_list.st});
    public final ReoLangRSLTranslator.join_part_return join_part() throws RecognitionException {
        ReoLangRSLTranslator.join_part_return retval = new ReoLangRSLTranslator.join_part_return();
        retval.start = input.LT(1);

        ReoLangRSLTranslator.port_access_list_return port_access_list24 = null;

        ReoLangRSLTranslator.special_port_access_list_return special_port_access_list25 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:469:2: ( ^( RW_JOIN port_access_list ) -> {$port_access_list.st} | ^( RW_DECIDE special_port_access_list ) -> {$special_port_access_list.st})
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RW_JOIN) ) {
                alt38=1;
            }
            else if ( (LA38_0==RW_DECIDE) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:469:5: ^( RW_JOIN port_access_list )
                    {
                    match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part1436); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_list_in_join_part1438);
                    port_access_list24=port_access_list();

                    state._fsp--;


                    		retval.accesses = (port_access_list24!=null?port_access_list24.accesses:null) ;
                    	

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 474:3: -> {$port_access_list.st}
                    {
                        retval.st = (port_access_list24!=null?port_access_list24.st:null);
                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:475:5: ^( RW_DECIDE special_port_access_list )
                    {
                    match(input,RW_DECIDE,FOLLOW_RW_DECIDE_in_join_part1458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_special_port_access_list_in_join_part1460);
                    special_port_access_list25=special_port_access_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		retval.accesses = (special_port_access_list25!=null?special_port_access_list25.accesses:null) ;
                    	


                    // TEMPLATE REWRITE
                    // 479:3: -> {$special_port_access_list.st}
                    {
                        retval.st = (special_port_access_list25!=null?special_port_access_list25.st:null);
                    }


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
        return retval;
    }
    // $ANTLR end "join_part"

    public static class port_access_list_return extends TreeRuleReturnScope {
        public List<StringTemplate> accesses;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:482:1: port_access_list returns [List<StringTemplate> accesses] : ^( PORT_ACCESS_LIST (pa+= port_access )+ ) ;
    public final ReoLangRSLTranslator.port_access_list_return port_access_list() throws RecognitionException {
        ReoLangRSLTranslator.port_access_list_return retval = new ReoLangRSLTranslator.port_access_list_return();
        retval.start = input.LT(1);

        List list_pa=null;
        RuleReturnScope pa = null;
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:483:2: ( ^( PORT_ACCESS_LIST (pa+= port_access )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:483:4: ^( PORT_ACCESS_LIST (pa+= port_access )+ )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_port_access_list1489); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:483:25: (pa+= port_access )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==PORT_ACCESS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:483:25: pa+= port_access
            	    {
            	    pushFollow(FOLLOW_port_access_in_port_access_list1493);
            	    pa=port_access();

            	    state._fsp--;

            	    if (list_pa==null) list_pa=new ArrayList();
            	    list_pa.add(pa.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            		retval.accesses = list_pa;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_access_list"

    public static class special_port_access_list_return extends TreeRuleReturnScope {
        public List<StringTemplate> accesses;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "special_port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:492:1: special_port_access_list returns [List<StringTemplate> accesses] : ^( PORT_ACCESS_LIST p1= port_access p2= port_access p3= port_access (p4+= port_access )* ) ;
    public final ReoLangRSLTranslator.special_port_access_list_return special_port_access_list() throws RecognitionException {
        ReoLangRSLTranslator.special_port_access_list_return retval = new ReoLangRSLTranslator.special_port_access_list_return();
        retval.start = input.LT(1);

        List list_p4=null;
        ReoLangRSLTranslator.port_access_return p1 = null;

        ReoLangRSLTranslator.port_access_return p2 = null;

        ReoLangRSLTranslator.port_access_return p3 = null;

        RuleReturnScope p4 = null;
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:493:2: ( ^( PORT_ACCESS_LIST p1= port_access p2= port_access p3= port_access (p4+= port_access )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:493:5: ^( PORT_ACCESS_LIST p1= port_access p2= port_access p3= port_access (p4+= port_access )* )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1523); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_port_access_in_special_port_access_list1527);
            p1=port_access();

            state._fsp--;

            pushFollow(FOLLOW_port_access_in_special_port_access_list1531);
            p2=port_access();

            state._fsp--;

            pushFollow(FOLLOW_port_access_in_special_port_access_list1535);
            p3=port_access();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:493:71: (p4+= port_access )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==PORT_ACCESS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangRSLTranslator.g:493:71: p4+= port_access
            	    {
            	    pushFollow(FOLLOW_port_access_in_special_port_access_list1539);
            	    p4=port_access();

            	    state._fsp--;

            	    if (list_p4==null) list_p4=new ArrayList();
            	    list_p4.add(p4.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            		List<StringTemplate> accesses_aux = new ArrayList<StringTemplate>();
            		accesses_aux.add((p1!=null?p1.st:null));
            		accesses_aux.add((p2!=null?p2.st:null));
            		accesses_aux.add((p3!=null?p3.st:null));
            		accesses_aux.addAll(list_p4);
            		
            		retval.accesses = accesses_aux;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "special_port_access_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_REO_LANG_in_reolang60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reolang62 = new BitSet(new long[]{0x0030000000000008L});
    public static final BitSet FOLLOW_element_in_reolang67 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_def_in_element96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_def_in_element109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTIVE_in_directive_def131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_import_in_directive_def133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FILE_PATH_in_directive_import150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_in_channel_def175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_extension_in_channel_def180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_channel_body_in_channel_def183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNATURE_in_channel_signature205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature209 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_option_in_channel_signature211 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_CHANNEL_PORTS_in_channel_signature215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_channel_signature219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_channel_signature229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_channel_signature240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_condition_in_channel_signature244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timed_in_option272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structured_in_option286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMED_in_timed303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_time_in_timed305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_time323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCTURED_in_structured356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structure_dimension_in_structured359 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_structure_dimension394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_structure_dimension407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_in_ports424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ports427 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_COND_ELEMENTS_in_condition449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_condition451 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_BODY_in_channel_body484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_state_def_in_channel_body486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FLOWS_in_channel_body491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_def_in_channel_body493 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_CHANNEL_STATE_in_state_def510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATE_REF_in_state_def513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATE_OBS_in_state_def519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def521 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow_def539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_requests_in_flow_def541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUESTS_in_requests559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_request_in_requests561 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
    public static final BitSet FOLLOW_REQUEST_in_request578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_request580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUEST_in_request587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_MARK_in_request589 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_request591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type608 = new BitSet(new long[]{0x0000040000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type613 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_flow_type617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_flow_in_flow_type627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NORMAL_FLOW_in_normal_flow642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow644 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_timed_in_normal_flow646 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_flow_point667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_OP_in_flow_operation690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_FLOW_in_if_flow707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_if_flow709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FLOW_TRUE_in_if_flow712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow714 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_FALSE_in_if_flow721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow723 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_flow_label744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATTERN_in_pattern_def776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_SIGNATURE_in_pattern_signature836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pattern_signature838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PATTERN_PORTS_in_pattern_signature841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_pattern_signature845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_pattern_signature855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_BODY_in_pattern_body897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body899 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations951 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reference_signature_in_declaration1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_instances_in_declaration1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_TYPE_in_reference_signature1041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reference_signature1043 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature1046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCES_in_instances1088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instances1092 = new BitSet(new long[]{0x0000040000000008L,0x0000000400000000L});
    public static final BitSet FOLLOW_stochastic_values_in_instances1100 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_ID_in_instances1106 = new BitSet(new long[]{0x0000040000000008L,0x0000000400000000L});
    public static final BitSet FOLLOW_stochastic_values_in_instances1115 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_STOCH_in_stochastic_values1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stochastic_values1164 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stochastic_values1166 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1196 = new BitSet(new long[]{0x0000000000000008L,0x0000000120000000L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1201 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L});
    public static final BitSet FOLLOW_PORT_DEFINITION_in_port_definition1248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_definition1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition1281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition1309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_in_port_access1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_access1352 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_port_access1356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_OP_in_join_operation1391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join_operation1393 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_join_part_in_join_operation1395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part1436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_list_in_join_part1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_DECIDE_in_join_part1458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_special_port_access_list_in_join_part1460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_port_access_list1489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1493 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1527 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1531 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1535 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1539 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});

}
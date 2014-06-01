import java.util.*;
import pt.uminho.di.cp.model.*;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.*;

import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.parsing.CPBuilder;
import java.lang.reflect.*;

public class Main {
	
	private static LinkedHashMap<String, CPModelInternal> patterns;
	
	public static void main(String[] args){
	
		CPModelInternal $cpmi = null;
		CoordinationPattern2 $new_cp = null;
	
		String[] files = {
			"InputExamples/channels_and_patterns.cpla"
		};
		
		for (String file : files){
			CPBuilder cp_model_builder = new CPBuilder(file);
			ReoLangCP2 res = cp_model_builder.performModelConstruction( new LinkedHashMap<String, CPModelInternal>(), new SymbolsTable() );
			patterns = res.getPatterns() != null ? res.getPatterns() : patterns;
		}
		
		final CoordinationPattern2 _seq1 = new CoordinationPattern2(patterns.get("Sequencer").getSimplePattern());

		try {

			Class insertP = Class.forName( "InsertP" );
			Constructor insertP_constructor = insertP.getConstructor(CoordinationPattern2.class, Node.class, Node.class, Node.class);

			final CoordinationPattern2 _p1 = new CoordinationPattern2(patterns.get("Synchroniser").getSimplePattern());

			Object insertP0_obj = insertP_constructor.newInstance(_p1, _seq1.getChannel("s1").getIn(0), _p1.getChannel("s2").getOut(0), _p1.getChannel("s3").getIn(0));
			Method insertP0_apply = insertP.getMethod("apply", CoordinationPattern2.class);
			final CoordinationPattern2 _rep = (CoordinationPattern2) insertP0_apply.invoke(insertP0_obj, _seq1 );

			$new_cp = new CoordinationPattern2(_rep);
			$new_cp.setId("NewCP");
			$cpmi = new CPModelInternal();
			$cpmi.setSimplePattern($new_cp);
			patterns.put( "NewCP", $cpmi );

			Object insertP1_obj = insertP_constructor.newInstance(_p1, _seq1.getChannel("s1").getIn(0), _p1.getChannel("s2").getOut(0), _p1.getChannel("s3").getIn(0));
			Method insertP1_apply = insertP.getMethod("apply", CoordinationPattern2.class);
			final CoordinationPattern2 _ucp = (CoordinationPattern2) insertP1_apply.invoke(insertP1_obj, _seq1 );

			$new_cp = new CoordinationPattern2(_ucp);
			$new_cp.setId("UltraCP");
			$cpmi = new CPModelInternal();
			$cpmi.setSimplePattern($new_cp);
			patterns.put( "UltraCP", $cpmi );

		}  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
	}
}
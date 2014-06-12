import java.util.*;
import pt.uminho.di.cp.model.*;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.*;

public class ReplaceP extends Reconfiguration {

	final private CoordinationPattern2 _p;
 	final private LinkedHashSet<Pair<Node, Node>> _Xy;
 	final private LinkedHashSet<String> _Cs;
 
	public ReplaceP(CoordinationPattern2 _p, LinkedHashSet<Pair<Node, Node>> _Xy, LinkedHashSet<String> _Cs) {
		this._p = _p; 
		this._Xy = _Xy; 
		this._Cs = _Cs;
	}

	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 $cp) { 
		RemoveP removeP;
		OverlapP overlapP;
		removeP = new RemoveP(_Cs);
		removeP.apply($cp);
		overlapP = new OverlapP(_p, _Xy);
		overlapP.apply($cp);
		return new CoordinationPattern2($cp); 
	}
}
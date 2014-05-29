import java.util.*;
import pt.uminho.di.cp.model.*;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.*;

public class OverlapP extends Reconfiguration {

	final private CoordinationPattern2 _p;
 	final private LinkedHashSet<Pair<Node, Node>> _Xy;
 
	public OverlapP(CoordinationPattern2 _p, LinkedHashSet<Pair<Node, Node>> _Xy) {
		this._p = _p; 
		this._Xy = _Xy;
	}

	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 $cp) { 
		Join join;
		Par par;
		par = new Par(_p);
		par.apply($cp);
		for(Pair<Node, Node> _n : _Xy) {
			final Node _n1 = null;
			final Node _n2 = null;
			_n1 = _n.fst();
			_n2 = _n.snd();
			final LinkedHashSet<Node> _E = new LinkedHashSet<Node>() {{ 
				add(_n1); 
				add(_n2); 
			}};
			join = new Join(_E);
			join.apply($cp);
		}
		return new CoordinationPattern2($cp); 
	}
}
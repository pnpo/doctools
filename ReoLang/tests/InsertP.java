import java.util.*;
import pt.uminho.di.cp.model.*;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.*;

public class InsertP extends Reconfiguration {

	final private CoordinationPattern2 _p;
 	final private Node _n;
 	final private Node _mi;
 	final private Node _mo;
 
	public InsertP(CoordinationPattern2 _p, Node _n, Node _mi, Node _mo) {
		this._p = _p; 
		this._n = _n; 
		this._mi = _mi; 
		this._mo = _mo;
	}

	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 $cp) { 
		Join join;
		Par par;
		Split split;
		par = new Par(_p);
		final CoordinationPattern2 _p1 = par.apply($cp);

		split = new Split(_n);
		final CoordinationPattern2 _p2 = split.apply($cp);

		final LinkedHashSet<Node> _n1 = new LinkedHashSet<Node>(_p2.getIn()){{ 
			removeAll( _p1.getIn() );
		}};

		final LinkedHashSet<Node> _n2 = new LinkedHashSet<Node>(_p2.getOut()){{ 
			removeAll( _p1.getOut() );
		}};

		final LinkedHashSet<Node> _E1 = new LinkedHashSet<Node>(_n1){{ 
			addAll( new LinkedHashSet<Node>() {{ 
					add(_mi); 
				}}
			);
		}};

		join = new Join(_E1);
		join.apply($cp);
		final LinkedHashSet<Node> _E2 = new LinkedHashSet<Node>(_n2){{ 
			addAll( new LinkedHashSet<Node>() {{ 
					add(_mo); 
				}}
			);
		}};

		join = new Join(_E2);
		join.apply($cp);
		return new CoordinationPattern2($cp); 
	}
}
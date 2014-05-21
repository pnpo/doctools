import java.util.*;
import pt.uminho.di.cp.model.*;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.*;

public class RemoveP extends Reconfiguration {

	final private LinkedHashSet<String> _Cs;
 
	public RemoveP(LinkedHashSet<String> _Cs) {
		this._Cs = _Cs;
	}

	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 $cp) { 
		Remove remove;
		for(String _n : _Cs) {
			remove = new Remove(_n);
			remove.apply($cp);
		}
		return new CoordinationPattern2($cp); 
	}
}
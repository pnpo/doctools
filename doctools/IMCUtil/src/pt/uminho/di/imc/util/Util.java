/**
 * 
 */
package pt.uminho.di.imc.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nuno Oliveira
 * @date 1 de Fev de 2013
 *
 */
public final class Util {
	
	public static Set<ICopiable> copySet(Set<ICopiable> to_copy_set){
		Set<ICopiable> copied_set = new HashSet<ICopiable>();
		for(ICopiable c : to_copy_set){
			copied_set.add(c.copy());
		}
		return copied_set;
	}
	
}

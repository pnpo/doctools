/**
 * 
 */
package pt.uminho.di.reolang.parsing.util;

/**
 * @author Nuno Oliveira
 */

public enum EContext {
	NONE,
	IMPORT,
	CHANNEL,
		FLOW_DEFS,
	PATTERN,
		PATTERN_USE,
			PATTERN_INSTANCE_DEFINITION,
		PATTERN_IN,
}

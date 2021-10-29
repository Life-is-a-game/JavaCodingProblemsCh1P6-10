/**
 * 
 */
package javaBookCh1P610;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author NathanClarke
 *
 */
public class StringJoining {
	
	public static String stringJoin(List<String> s) {
		char delim = ' ';
		
		StringJoiner join = new StringJoiner(String.valueOf(delim));
		
		for(String str : s) {
			join.add(str);
		}
		return String.valueOf(join);
	}
}

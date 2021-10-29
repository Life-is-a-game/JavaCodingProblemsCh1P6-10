/**
 * Generates all unique permutations of a given String.
 * 
 */
package javaBookCh1P610;

import java.util.*;

/**
 * @author NathanClarke
 *
 */
public class StringPermutationGenerator {

	public static Set<String> permuteAndStore(String str){
		
		return permuteAndStore("", str);
	}
	
	private static Set<String> permuteAndStore(String prefix, String str){
		
		Set<String> permutations = new HashSet<>();
		int n = str.length();
		
		if(n == 0) {
			permutations.add(prefix);
		}
		else {
			for(int i = 0; i < n; i++) {
				permutations.addAll(permuteAndStore(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
				// Uses recursion to generate permutations by calling the same method with the prefix as the first character & the string as a combination of substrings. str.substring(i + 1, n) gets all characters between index(i + 1) [incl] & index(n) [excl].
			}
		}
		
		return permutations;
	}
}

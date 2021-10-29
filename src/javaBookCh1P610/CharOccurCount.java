/**
 * 
 */
package javaBookCh1P610;

/**
 * @author NathanClarke
 *
 */
public class CharOccurCount {

	public static int occurCount(String str, char ch){
		
		int initlen = str.length();
		int newlen = str.replace(String.valueOf(ch), "").length();
		
		return initlen - newlen;
	}
}
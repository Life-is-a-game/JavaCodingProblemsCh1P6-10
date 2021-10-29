/**
 * 
 */
package javaBookCh1P610;

/**
 * @author NathanClarke
 *
 */
public class StringtoNumConverter {
	
	public static int toInt(String str) {
		try {
			Integer i = Integer.valueOf(str);
			return i;
		}
		catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public static double toDouble(String str) {
		try {
			double d = Double.valueOf(str);
			return d;
		}
		catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public static long toLong(String str) {
		try {
			long l = Long.valueOf(str);
			return l;
		}
		catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public static float toFloat(String str) {
		try {
			float f = Float.valueOf(str);
			return f;
		}
		catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}

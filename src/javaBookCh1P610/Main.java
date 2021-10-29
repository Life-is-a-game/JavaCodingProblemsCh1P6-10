/**
 * 
 */
package javaBookCh1P610;

/**
 * @author NathanClarke
 *
 */

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b = true;
		while(b) {
			Scanner scnr = new Scanner(System.in);
			String s = "";
			System.out.println("Please input the string to test");
			if(scnr.hasNextLine()) {
				s = scnr.nextLine();
			}
			char c = 'a';
			
			System.out.println("\nEnter the character to search for");
			
			if(scnr.hasNext() && !s.equals("")) {
				c = scnr.next().charAt(0);
				scnr.nextLine();
				System.out.println(c + " occurs " + CharOccurCount.occurCount(s, c) + " times.");
//				scnr.close();
//				break;
			}
			else {
				continue;
			}
			
			System.out.println("\n\nPlease input a string to convert to a number");
			s = "";
			
			if(scnr.hasNextLine()) {
				s = scnr.nextLine();
			}
			System.out.println("\nConvert to int, double, float or long? Input the number corresponding to the answer. E.g. 1 is int conversion");
			Integer i = 0;
			if(scnr.hasNextInt()) {
				i = scnr.nextInt();
				scnr.nextLine();
			}
			switch(i) {
				default:
					System.out.println("\nAn error has occurred; try again");
					break;
				case 1:
					System.out.println(StringtoNumConverter.toInt(s));
					break;
				case 2:
					System.out.println(StringtoNumConverter.toDouble(s));
					break;
				case 3:
					System.out.println(StringtoNumConverter.toFloat(s));
					break;
				case 4:
					System.out.println(StringtoNumConverter.toLong(s));
					break;
			}
			s = " Chocolate Rain . . .";
			System.out.println(ReplaceWhitespace.spaceRemoval(s));
			
			List<String> lstr = new ArrayList<String>();
			
			lstr.add("Test One");
			lstr.add("Test Two");
			lstr.add("Test End");
			
			System.out.println(StringJoining.stringJoin(lstr));
			
			String alpha = "HASTA";
			Set<String> testSet = StringPermutationGenerator.permuteAndStore(alpha);
			
			for(String st : testSet) {
				System.out.println(st + "\n");
			}
			
			System.out.println("There were " + testSet.size() + " unique permutations for the string " + alpha + ".");
			b = false;
		}

	}

}

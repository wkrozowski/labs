/**
 * Implementation of WordGroup class for the second part of the lab
 * Lab 5 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

package lab5part2;
import java.lang.String;
import java.util.HashSet;

public class WordGroup {
 	//instance variable
 	private String words;

	//Constructor takes string, converts it to lowercase and stores in instance variable words.
	public WordGroup(String sentence) {
		words = sentence.toLowerCase();
	}
	
	//Method which returns array of strings created by splitting words instace variable
	public String[] getWordArray() {
		return words.split(" ",0);
	}
	
	//Method that takes another WordGroup object, creates a HashSet for String objects, inserts all the words stored in current and parameter WordGroup Objects and returns this HashSet
	HashSet<String> getWordSet(WordGroup otherWordGroup) {
		HashSet<String> mySet = new HashSet<String>();
		String[] currentArray = this.getWordArray();
		String[] otherArray = otherWordGroup.getWordArray();
		for (int i = 0; i < currentArray.length; i++) {
			mySet.add(currentArray[i]);
		}
		for (int i = 0; i < otherArray.length; i++) {
			mySet.add(otherArray[i]);
		}
		return mySet;
	}
}
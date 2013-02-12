/* Implement an algorithm to determine if a string has all unique characters. 

Assumption: We are handling an ASCII string.

My first instinct was to do this using a hash table by iterating over the string and recording
the characters seen via boolean flags. But you can actually use the ASCII value of characters to
implement the same algorithm using an array, which takes less space than a hash table.

Step 1: Check if the string is longer than 256 characters. If it is, return false
        because there are only 256 unique characters (pigeon-hole principle).
		
Step 2: Make a boolean array of length 256, with all cells initialized to False.
        Each index represents the character with that ASCII value. The boolean
		indicates whether or not the character has been seen yet.
		
Step 3: Iterate over every character of the string, go to the cell that represents
        that character, and change the False to a True, indicating that the
		character has already been seen. (If the cell is already true, then you
		can immediately return false because that character has been seen before).
		
Step 4: If you finish iterating over the String, then you can return true. */


public boolean hasNoDuplicates(String s) {
	if (s.length() > 256) {
		return false;
	}
	
	boolean[] chars = new boolean[256];
	
	for (int i = 0; i < s.length(); i++) {
		int val = s.charAt(i);
		if (chars[val]) {
			return false;
		}
		chars[val] = true;
	}
	
	return true;
}

/* What if you cannot use additional data structures?

The brute force method that will take O(n^2) time is comparing every character
with every other character via two for-loops. This will take O(1) space. */

public boolean hasNoDuplicates(String s) {
	for (int i = 0; i < s.length(); i++) {
		for (int j = i + 1; j < s.length(); j++) {
			if (s.charAt(i) == s.charAt(j)) {
				return false;
			}
		}
	}
	
	return true;
}

/* If we are allowed to modify the string, another way to solve this problem without
data structures is to sort the string in O(nlog(n)) time, and then check if any neighboring 
characters are the same in linear time. */

public boolean hasNoDuplicates(String s) {
	char[] chars = s.toCharArray();
	Arrays.sort(chars);
	for (int i = 0; i < chars.length - 1; i++) {
		if (chars[i] == chars[i + 1]) {
			return false;
		}
	}
	return true;
}
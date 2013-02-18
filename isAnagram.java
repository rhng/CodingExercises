/* Given two strings, write a method to decide if one is a permutation of the other.

Assumptions: case-sensitive, white space matters, and we are using the ASCII character set

Examples: "Star" and "Rats" are not anagrams of each other.
          "star  " and "rats" are not anagrams of each other.
		  "st AR" and "t sRA" ARE anagrams of each other.
		  
To solve this problem, you can make sure that the counts of each character in both strings are
the same. */
		  
public boolean areAnagrams(String s1, String s2) {
	if (s1.length() != s2.length()) {
		return false;
	}
	
	
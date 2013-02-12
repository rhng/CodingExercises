// This is a function to reverse a String.
// My first instinct was to simply create a new String, iterate through the original
// String backwards, and add each letter to the new String.

public String reverseString(String s) {
	String s2 = "";
	
	for (int i = s.length() - 1; i >= 0; i--) {
		char c = s.charAt(i);
		s2 += c;
	}
	
	return s2;
}

// Another way of writing this function would be to utilize the String class's
// toCharArray function, which converts a String into a new character array.

// Steps:
// 1) Convert the String into a character array.
// 2) Switch the first and last characters, the second and second-to-last characters,
      the third and third-to-last characters, etc.
		-Make sure to store one of the characters in a temporary variable before swapping.
// 3) Convert the character array back into a String and return that String.

public String reverseString(String s) {
	char[] a = s.toCharArray();
	
	int last = s.length() - 1;
	for (int i = 0; i < s.length() / 2; i++) {
		char c = a[i];
		a[i] = a[last - i];
		a[last - i] = c;
	}
	
	return new String(a);
}
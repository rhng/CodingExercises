// Problem: Print out the grade-school multiplication table up to 12x12

// My first approach was to take in two parameters, x for the number of rows,
// and y for the number of columns. Then I simply printed out the products in
// each row separated by a single space.

public void printMultTable(int x, int y) {
	for (int i = 1; i <= x; i++) {
		for (int j = 1; j <= y; j++) {
			System.out.print(i*j + " ");
		}
		System.out.println();
	}
}

// Another way to look at this problem is to take in a single parameter, a max,
// and assume that the client wants a square multiplication table.

// Also, the table will look nicer if we use String's format method.

public void printMultTable(int max) {
	for (int i = 1; i <= max; i++) {
		for (int j = 1; j <= max; j++) {
			System.out.print(String.format("%4d", i*j));
		}
		System.out.println();
	}
}
// This is a function to compute the Nth Fibonacci number using recursion.

// The sequence F_n of Fibonacci numbers is defined by the recurrence relation
// F_n = F_(n-1) + F_(n-2)
// with seed values  F_0 = 0 and F_1 = 1.   (Wikipedia)

// Intuitively, we can compute the Nth Fibonacci number by using its recursive
// definition and use the series' seed values as the base cases.

// Note that we are using zero-based indexing (i.e., the first fibonacci number
// starts at index 0 with a value of 0).

public int computeNthFibNum(int n) {
	if (n == 0) {
		return 0;
	} else if (n == 1) {
		return 1;
	} else {
		return computeNthFibNum(n - 2) + computeNthFibNum(n - 1);
	}
}
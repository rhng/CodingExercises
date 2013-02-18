/* Find the mth-to-last element of the list. Define mth to last such that when m = 0 the last
element of the list is returned. */

public ListElement findMToLastElement(ListElement head, int m) {
	if (!head)
		throw new IllegalArgumentException("Cannot pass an empty list");
	
	ListElement current = head;
	ListElement mBehind;
	int counter = 0; // keeps track of the element number that current points to
	
	// advance the current pointer until it gets to the mth element
	while (current.next != null && counter < m) {
		current = current.next;
		counter++;
		// initialize the mBehind pointer to point to the front of the list when it is m elements
		// behind the current pointer
		if (counter == m) {
			mBehind = head;
		}
	}
	
	// if we broke out of the previous loop and the counter did not reach the mth element,
	// then the list was shorter than m elements, and there does not exist an mth-to-last element
	if (counter < m)
		throw new IllegalArgumentException("There is no mth-to-last element");
	
	// advance the current and mBehind pointers at the same rate until the current pointer reaches
	// the end of the list
	while (current.next != null) {
		current = current.next;
		mBehind = mBehind.next;
	}
	
	// mBehind will be pointing to the mth-to-last element
	return mBehind;
}
/* Write a function that takes a pointer to the head of a list and determines whether the list is
cyclic or acyclic. Your function should return false if the list is acyclic and true if it is
cyclic. You may not modify the list in any way.

The idea is to make a fast pointer and a slow pointer and advance them at different rates. In an
acyclic list, the faster pointer will always reach the end of the list. In a cyclic list, the
faster pointer will eventually "lap" the slower pointer. */

// initial solution
public boolean determineTermination(Node head) {
	if (head == null)
		return false;
	if (head.next == null)
		return false;
	
	Node slow = head;
	Node fast = head.next;
	
	while (fast.next != null && fast.next.next != null) {
		if (fast.next == slow || fast.next.next == slow)
			return true;
			
		fast = fast.next.next;
		slow = slow.next;
	}
	
	return false;
}

// a more elegant solution that gets rid of the if-statements at the beginning of my original
// solution
public boolean determineTermination(Node head) {
	Node slow = head;
	Node fast = head.next;
	
	// advance pointers indefinitely until the fast pointer reaches the end of the list or laps the
	// slow pointer
	while (true) {
		if (fast == null || fast.next == null) {
			return false;
		} else if (fast == slow || fast.next == slow) {
			return true;
		} else {
			fast = fast.next.next;
			slow = slow.next;
		}
	}
}
package Lab5;
import Lab3.SList;
import Lab3.Node;
/**
 * A generic queue implementation using a singly linked list.
 *
 * @param <T> the type of elements stored in the queue
 */
public class Queue<T> {
	/** The underlying singly linked list for the queue. */
	SList<T> list = new SList<T>();

	/** Default constructor to initialize an empty queue. */
	public Queue() {
	}

	/**
	 * Enqueues an element into the queue.
	 *
	 * @param element the element to enqueue
	 */
	public void enqueue(T element) {
		// Exercise 1a
		list.addLast(element);
	}

	/**
	 * Dequeues an element from the queue.
	 *
	 * @return the dequeued element
	 */
	public T dequeue() {
		return list.removeFirst(); // Exercise 1b
	}

	/**
	 * Gets the element at the front of the queue without removing it.
	 *
	 * @return the element at the front of the queue
	 */
	public T queuefront() {
		return list.first.element; // Exercise 1c
	}

	/**
	 * Gets the element at the rear of the queue without removing it.
	 *
	 * @return the element at the rear of the queue
	 */
	public T queuerear() {
		return list.last.element; // Exercise 1d
	}

	/**
	 * Checks if the queue is empty.
	 *
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Creates a copy of this queue.
	 *
	 * @return a new queue containing the same elements as this queue
	 */
	Queue<T> copyQueue() { // Exercise 2
		Queue<T> Q2 = new Queue<T>();
		Node<T> tmp = list.first;
		for(int i=0;i<list.size;i++) {
			Q2.enqueue(tmp.element);
			tmp = tmp.next;
		}
		return Q2;
	}

	/**
	 * Checks if this queue is identical to another queue in terms of content and
	 * sequence.
	 *
	 * @param Q2 the queue to compare with
	 * @return true if the queues are identical, false otherwise
	 */
	public boolean isIdentical(Queue<T> Q2) {
		// Exercise 3
		Node<T> tmp = Q2.list.first;
		Node<T> tmp2 = list.first;
		if(Q2.list.size != list.size) {
			return false;
		}
		for(int i = 0; i < list.size; i++) {
			if(tmp.element != tmp2.element) {
				return false;
			}
			tmp = tmp.next;
			tmp2 = tmp2.next;		}
		return true; 
	}

	/**
	 * Prints the elements of the queue horizontally. Handles potential
	 * 
	 */
	public void printHorizontal() {
		Node<T> walker = list.first;
		while (walker != null) {
			System.out.print(walker.element + " ");
			walker = walker.next;
		}

	}

}
package Lab4;
import Lab3.Node;
import Lab3.SList;


/**
 * The {@code Stack<T>} class represents a generic stack data structure
 * implemented using a singly linked list. It provides methods for push, pop,
 * peek, copy, printing, binary conversion, and more.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class Stack<T> {
	private SList<T> list = new SList<T>();

	/**
	 * Constructs an empty stack.
	 */
	public Stack() {
	}

	/**
	 * Pushes an element onto the top of the stack.
	 *
	 * @param element The element to be pushed onto the stack.
	 */
	public void push(T element) {// Exercise 1a
		list.addFirst(element);
	}

	/**
	 * Removes and returns the element at the top of the stack.
	 *
	 * @return The element removed from the top of the stack.
	 */
	public T pop() {// Exercise 1b
		return list.removeFirst();
		}

	/**
	 * Retrieves the element at the top of the stack without removing it.
	 *
	 * @return The element at the top of the stack.
	 */
	public T peek() {// Exercise 1c
		if (list.size == 0) {
			return null;
		}else {
			Node<T> tmp = list.first;
			return tmp.element;
		}
		
	}

	/**
	 * Checks if the stack is empty.
	 *
	 * @return {@code true} if the stack is empty, {@code false} otherwise.
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Creates and returns a copy of the stack.
	 *
	 * @return A copy of the stack.
	 */
	Stack<T> copyStack() {
		Stack<T> rvStack = reverseStack();
		return rvStack.reverseStack();
	}

	/**
	 * Prints the elements of the stack vertically.
	 */
	public void printVertical() {
		SListExtension.printVertical(list);
	}

	/**
	 * Converts an integer to binary representation and prints it.
	 *
	 * @param x The integer to be converted to binary.
	 */
	static void binaryConversion(int x) {// Exercise 2
		Stack<Integer> answer = new Stack<Integer>();
		// Write your code here
		int num = 0;
		if(x == 0) {
			answer.push(0);
		}else {
			while(x > 0) {
				num = x%2;
				x = x/2;
				//System.out.print(x);
				answer.push(num);
			}
		}
		answer.list.printHorizontal();
	}

	/**
	 * Reverses the order of elements in the stack.
	 *
	 * @return A new stack with the reversed order of elements.
	 */
	Stack<T> reverseStack() {// Exercise 3
		Stack<T> answer = new Stack<T>();
		// Write your code here
		Node<T> tmp = list.first;
		for(int i = 0; i < list.size; i++) {
			answer.push(tmp.element);
			tmp = tmp.next;
		}
		return answer;
	}

	/**
	 * Checks if a given string is a palindrome (case-insensitive).
	 *
	 * @param word The string to be checked for palindrome.
	 * @return {@code true} if the string is a palindrome, {@code false} otherwise.
	 */
	static boolean isPalindrome(String word) {// Exercise 4
		Stack<Character> tmp = new Stack<Character>();
		
		for(int i = 0; i < word.length(); i++) {
			tmp.push(word.charAt(i));
		}
		
		Stack<Character> tmp2 = tmp.reverseStack();
		
		for(int j = 0; j < word.length(); j++) {
			if(tmp.peek() != tmp2.peek()) {
				return false;
			}
			tmp.pop();
			tmp2.pop();
		}
		return true;
	}

	/**
	 * Checks if a string represents an integer.
	 *
	 * @param s The string to be checked.
	 * @return {@code true} if the string represents an integer, {@code false}
	 *         otherwise.
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * Evaluates a postfix expression and returns the result.
	 *
	 * @param input The postfix expression as an array of strings.
	 * @return The result of evaluating the postfix expression.
	 */
	public static Integer evalPostfix(String[] input) {// Exercise 5
		Stack<Integer> S = new Stack<Integer>();
		int num1 = 0;
		int num2 = 0;
		// Write your code here
		for(int i=0; i<input.length; i++) {
			//System.out.println(input[i]);
			//S.printVertical();
			if(input[i] == "+") {
				num1 = S.peek();
				S.pop();
				num2 = S.peek();
				S.pop();
				S.push(num1+num2);
			}else if(input[i] == "-") {
				num1 = S.peek();
				S.pop();
				num2 = S.peek();
				S.pop();
				S.push(num2-num1);
			}else if(input[i] == "*") {
				num1 = S.peek();
				S.pop();
				num2 = S.peek();
				S.pop();
				S.push(num2*num1);
			}else if(input[i] == "/") {
				num1 = S.peek();
				S.pop();
				num2 = S.peek();
				S.pop();
				S.push(num2/num1);
			}else if(input[i] == "%"){
				num1 = S.peek();
				S.pop();
				num2 = S.peek();
				S.pop();
				S.push(num2%num1);
			}else {
				S.push(Integer.parseInt(input[i]));
			}
		}
		return S.peek();
	}
}
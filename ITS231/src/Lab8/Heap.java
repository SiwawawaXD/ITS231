package Lab8;

/**
* The `Heap` class represents a simple heap data structure.
* A heap is a specialized tree-based data structure that satisfies the heap property.
* In this implementation, the heap is represented as an array.
* The class provides methods for insertion, deletion, and heap sort.
*
*/
public class Heap {
	
	/** The current number of elements in the heap. */
	int load = 0;
	
	/** The array representing the heap. */
	int[] hArray = new int[100];

	/**
    * Constructs an empty heap.
    */
	Heap() {
	}

	/**
    * Performs the reheapUp operation to maintain the heap property after insertion.
    *
    * @param currentIndex The index of the current element.
    */
	void reheapUp(int currentIndex) {
		 // Exercise 1
		//  add your code here 
		int temp1;
		int temp2;
		int index = currentIndex;
		int parent;
		parent = (int) Math.floor((index-1)/2);
		while(hArray[index] > hArray[parent]) {
			swap(hArray, index, parent);
			index = parent;
			parent = (int) Math.floor((index-1)/2);
			//printHeapArray();
			
		}
		
	}

	/**
    * Inserts a new element into the heap and performs the necessary reheapUp operation.
    *
    * @param data The data to be inserted into the heap.
    */
	void insert(int data) {
		// Exercise 2
		// add your code here 
		hArray[load] = data;
		load = load + 1;
		reheapUp(load-1);
	}

	 /**
    * Performs the reheapDown operation to maintain the heap property after deletion.
    *
    * @param currentIndex The index of the current element.
    */
	void reheapDown(int currentIndex) {
		// Exercise 3
		// add your code here 
		int temp1;
		int temp2;
		int index = currentIndex;
		int child = 2*index;
		while(true) {
			if(hArray[index] < hArray[child+1] && hArray[child+1] > hArray[child+2]) {
				swap(hArray, index, child+1);
			}
			else if(hArray[index] < hArray[child+2]&& hArray[child+2] > hArray[child+1]) {
				swap(hArray, index, child+2);
			}
			else {
				break;
			}
			index = child;
			child = 2*index;
			//printHeapArray();
		}
		
		
	}

	/**
    * Deletes the root element of the heap and performs the necessary reheapDown operation.
    *
    * @return The value of the root element that was deleted.
    */
	int deleteRoot() {
		// Exercise 4
		// add your code here 
		int temp = hArray[0];
		hArray[0] = hArray[load-1];
		hArray[load-1] = 0;
		load--;
		reheapDown(0);
		return temp;
	}

	/**
    * Sorts the heap in ascending order.
    */
	void makeHeapSort() {
		// Exercise 5
		// add your code here 
		
		for (int i = 1; i < load; i++) {
			int temp = hArray[i];
			for (int j = i -1; j >= 0 && hArray[j] < temp; j--) {
				swap(hArray, j+1, j);
			}
		}
		printHeapArray();
	}

	/**
    * Finds the level of a given node in the heap.
    *
    * @param nodeIndex The index of the node.
    * @return The level of the node in the heap.
    */
	int findLevel(int nodeindex) {
		int parent = (nodeindex - 1) / 2;
		int level = 0;

		if (parent > 0)
			level++;

		while (parent > 0) {
			parent = (parent - 1) / 2;
			level++;
		}
		return level;
	}

	/**
    * Swaps two elements in the heap array.
    *
    * @param A The heap array.
    * @param ind1 The index of the first element to be swapped.
    * @param ind2 The index of the second element to be swapped.
    */
	void swap(int[] A, int ind1, int ind2) {
		int temp = A[ind1];
		A[ind1] = A[ind2];
		A[ind2] = temp;
	}

	/**
    * Prints the elements of the heap array.
    */
	void printHeapArray() {
		for (int i = 0; i < load; i++)
			System.out.print(hArray[i] + " ");
		System.out.println();
	}

}
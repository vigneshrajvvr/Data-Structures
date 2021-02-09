package heaps;

import java.util.Arrays;

public class MaxHeap {
	
	private int size;
	private int capacity = 10;
	private int arr[];
	
	private int getParentIndex(int childIndex) {return (childIndex-1)/2;}
	private int getLeftChildIndex(int parentIndex) {return parentIndex * 2 + 1;};
	private int getRightChildIndex(int parentIndex) {return parentIndex * 2 + 2;};

	
	private int parent(int index) {return arr[getParentIndex(index)];}
	private int leftChild(int index) {return arr[getLeftChildIndex(index)];}
	private int rightChild(int index) {return arr[getRightChildIndex(index)];}
	
	private boolean hasParent(int index) {return getParentIndex(index) >= 0;}
	private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size;}
	private boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}	
	
	public MaxHeap() {
		arr = new int[capacity];
	}
	
	public int peek() {
		if(size == 0) {
			throw new IllegalStateException();
		}
		return arr[0];
	}
	
	public int poll() {
		if(size == 0) {
			throw new IllegalStateException();
		}
		int item = arr[0];
		arr[0] = arr[size-1];
		size--;
		heapifyDown();
		return item;
	}
	
	public void heapifyDown() {
		int index = 0;		
		while(hasLeftChild(index)) {
			int largestChild = getLeftChildIndex(index);
			if(hasRightChild(index) && arr[getRightChildIndex(index)] > largestChild) {
				largestChild = getRightChildIndex(index);
			}
			if(arr[index] > arr[largestChild]) {
				break;
			} else {
				exchange(index, largestChild);
			}
			index = largestChild;
		}
		
	}
	
	public void add(int value) {
		ensureCapacity();
		arr[size] = value;
		size++;
		heapifyUp();
		
	}
	
	public void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && parent(index) < arr[index]) {
			exchange(index, getParentIndex(index));
			index = getParentIndex(index);
		}
	}
	
	private void exchange(int value1, int value2) {
		int temp = arr[value1];
		arr[value1] = arr[value2];
		arr[value2] = temp;
	}
	
	private void ensureCapacity() {
		if(size == capacity) {
			arr = Arrays.copyOf(arr, capacity * 2);
			capacity *= 2;
		}
	}

}

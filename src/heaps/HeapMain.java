package heaps;

public class HeapMain {
	public static void main(String args[]) {
		
		MaxHeap test = new MaxHeap();
		test.add(5);
		test.add(10);
		test.add(15);
		test.add(20);
		System.out.println(test.peek()); // 20
		System.out.println(test.poll()); // 20
		System.out.println(test.peek()); // 10
	}

}

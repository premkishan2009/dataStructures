package dataStructures;


public class Stack<T> {
	private T[] stack;
	private int head;
	
	private static final int defaultSize = 10;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[])new Object[defaultSize];
		head = 0;
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		stack = (T[])new Object[size];
		head = 0;
	}
	
	public T pop() {
		if (head - 1 < 0) {
			throw new IllegalStateException("Stack is Empty.");
		}
		return stack[--head];
	}
	
	@SuppressWarnings("unchecked")
	public void push(T x) {
		stack[head] = x;
		head++;

		if (stack.length == head) {
			T[] temp = (T[])new Object[stack.length*2];
			for (int i = 0; i < stack.length; i++) {
				temp[i] = stack[i];
			}
			
			stack = temp;
		}
	}
	
	public T peek() {
		return stack[head - 1];
	}
	
	public boolean isEmpty() {
		return head - 1 < 0;
	}
	
	public int size() {
		return head;
	}
	
	public static void main(String[] args) {
		Stack<Integer> x = new Stack<>(3);
		x.push(Integer.valueOf(1));
		x.push(Integer.valueOf(2));
		x.push(Integer.valueOf(3));
		x.push(Integer.valueOf(4));
		System.out.println(x.pop());
		System.out.println(x.pop());
		System.out.println(x.pop());
		System.out.println(x.pop());
		System.out.println(x.isEmpty());
		System.out.println(x.pop());
		
	}

}

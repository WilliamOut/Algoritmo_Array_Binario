package Chap04;

class stack {
	private int max_size;
	private long[] StackArray;
	private int top;
	
	public stack(int s) {
		max_size = s; // determining size of vector
		StackArray = new long[max_size];
		top = -1;	// without values yet
	}
	
	public void push(long j) {	// method to put a number on top
		StackArray[++top] = j; // incrementing the number on top by calling j into our array with top incremented by plus
	}
	
	public long pop() { // remove item of top of our battery
		return StackArray[top--]; // access it and decrement
	}
	
	public long peek() {
		return StackArray[top]; // see the top 
	}
	
	public boolean isEmpty() { // true if battery is empty
		return (top == -1); 
	}
	
	public boolean isFull() {
		return (top == max_size - 1);
	}
}

	class StackApp{
		public static void main(String[]args) {
			stack theStack = new stack(10);
			
			theStack.push(20);
			theStack.push(40);
			theStack.push(80);
			theStack.push(60);
			
			while(! theStack.isEmpty() ) {
				long value = theStack.pop();
				System.out.print(value);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

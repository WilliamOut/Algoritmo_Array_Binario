package Chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stackx{
	private int maxSize;
	private char [] array;
	private int top;
	
	public Stackx(int max) {
		maxSize = max;
		array = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		array[++top] = j;
	}
	
	public char pop() {
		return array[top--];
	}
	
	public char peek() {
		return array[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}

class Reverser{
	private String input;
	private String output;
	
	public Reverser(String in) {
		input = in;
	}
	
	public String doRev() {
		int StackSize = input.length();
		Stackx thestackArray = new Stackx(StackSize);
		
		for(int j=0;j<input.length();j++) {
			char ch = input.charAt(j);
			thestackArray.push(ch);
		}
		output = "";
		while(! thestackArray.isEmpty() ) {
			char ch = thestackArray.pop();
			output += ch;
		}
		return output;
	}
}
public class stackReverseWord {
	public static void main(String[]args) throws IOException{
		String input, output;
		while(true) {
			System.out.println("Enter a String: ");
			System.out.flush();
			input = getString();
			if(input.equals("")) {
				break;
			}
			
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();
			System.out.println("Reversed: " + output);
		}		
}
public static String getString() throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
}
}
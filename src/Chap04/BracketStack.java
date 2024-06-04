package Chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketStack {
	private int max;
	private char[] array;
	private int top;
	
	public BracketStack(int maxsize) {
		max = maxsize;
		this.array = new char[max];
		top = -1;
	}
	
	public void push(char value) {
		array[++top] = value;
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

class BracketChecker {
	private String input;
	
	public BracketChecker(String in) {
		this.input = in;
	}
	
	public void check() {
		BracketStack pilha = new BracketStack(input.length());
		
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
				case '[':
				case '{':
				case '(':
					pilha.push(ch);
					break;
				
				case ']':
				case '}':
				case ')':
					if (!pilha.isEmpty()) {
						char chx = pilha.pop();
						if ((ch == ']' && chx != '[') ||
						    (ch == '}' && chx != '{') ||
						    (ch == ')' && chx != '(')) {
							System.out.println("Error: " + ch + " at " + j);
						}
					} else {
						System.out.println("Error: " + ch + " at " + j);
					}
					break;
				default:
					break;
			}
		}
		if (!pilha.isEmpty()) {
			System.out.println("Error: Missing right delimiter");
		}
	}
}

class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while (true) {
			System.out.println("Enter a String containing delimiters: ");
			System.out.flush();
			input = getString();
			if (input.equals("")) {
				break;
			}
			BracketChecker checker = new BracketChecker(input);
			checker.check();
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}

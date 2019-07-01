package com.ananth.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostFixToInfix {

	public static void main(String[] args) throws IOException {
		String input;
		int output;
		
		while(true) {
			System.out.println("Enter Postfix: ");
			System.out.flush();
			input = getString();
			if(input.equals("")) 
				break;
			output = postFixToInfix(input);
			System.out.println("Postfix : " + output + "\n");
			
		}

	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static Integer postFixToInfix(String input) {
		Stack<String> stack = new Stack<String>();
		Stack<Integer> intStack = new Stack<Integer>();
		for(int i=0; i<input.length();i++) {
			
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				stack.push(ch+"");
			} else {
				String ch1 = stack.pop();
				String ch2 = stack.pop();
				String result = "(" + ch2 + ch + ch1+ ")";
				//int res = Integer.valueOf(ch2) + ch + Integer.valueOf(ch1);
				int res = Integer.valueOf(ch2 + ch + ch1);
				stack.push(result);
				intStack.push(res);
			}
		}
		return intStack.peek();
	}

}

package com.ananth.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixToPostFix {

	public static void main(String[] args) throws IOException {
		String input, output;
		
		while(true) {
			System.out.println("Enter Infix: ");
			System.out.flush();
			input = getString(); 
			
			if(input.equals("")) 
				break;
			
			output = doTrans(input);
			System.out.println("Postfix : " + output + "\n");
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static String doTrans(String input) {
		String output = "";
		StackArray theStack = new StackArray(input.length());
		
		for(int j=0; j<input.length();j++) {
			char ch = input.charAt(j);
			theStack.displayStack("For "+ch+" ");
			
			switch(ch) 
			{
			case '+':
			case '-':
				output = gotOper(ch, 1, theStack, output);
				break;
			case '*':
			case '/':
				output = gotOper(ch, 2, theStack, output);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				output = gotParen(ch, theStack, output);
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while(!theStack.isEmpty()) {
			theStack.displayStack("While ");
			output = output + theStack.pop();
		}
		theStack.displayStack("End  ");;
		return output;
	}
		
		


	public static String gotOper(char opThis, int prec1, StackArray theStack, String output) {
	
		while(!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if(opTop == '(') {
				theStack.push(opTop);
				break;
			} else {
				int prec2;
				
				if(opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				
				if(prec2<prec1) {
					theStack.push(opTop);
					break;
				} else
					output = output + opTop;
			}
		}
			theStack.push(opThis);
			return output;
	}
	
	public static String gotParen(char ch, StackArray theStack, String output) {
		while(!theStack.isEmpty()) {
			char chx = theStack.pop();
			if(chx == '(') 
				break;
			else
				output = output + chx;
		}
		return output;
	}

}

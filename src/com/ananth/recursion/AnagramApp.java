package com.ananth.recursion;

//Anagram App without handling duplicates
import java.io.*;

class AnagramApp{

	static int size;
	static int count;
	static char[] arr = new char[100];

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static void main(String[] args) throws IOException{
		System.out.println("Enter a word: ");
		String input = getString();
		size = input.length();
		count = 0;
		for(int i=0; i<size;i++)
			arr[i] = input.charAt(i);
		//System.out.println("MAIN Calling--> doAnagram");
		doAnagram(size);
	}

	public static void doAnagram(int newSize) {
		//System.out.println("doAnagram("+ newSize + ")");
		if (newSize == 1)
			return;
		for(int i=0; i<newSize;i++) {
			//	System.out.println("doAnagram for-loop, i=" + i);
			doAnagram(newSize-1);
			if(newSize==2)
				displayWord();
			//	System.out.println("\n");
			rotate(newSize);
		}
	}
	
	public static void displayWord() {
		System.out.println("DISPLAY WORD: ");
		for(int i=0;i<size;i++) 
			System.out.print(arr[i]);
		System.out.println("");
	}

	public static void rotate(int newSize) {
		//System.out.println();
		//System.out.println("Rotate(" + newSize + ")");
		int j;
		int position = size - newSize;
		//System.out.println("Position: "+ position);
		char temp = arr[position];
		//System.out.println("temp:" + temp);
		for(j=position+1;j<size;j++)
			arr[j-1] = arr[j];
		arr[j-1] = temp;
	}
}		

package com.ananth.recursion;

import java.util.ArrayList;
import java.util.List;

public class AnagramUsingList {
	 
    public static void main(String[] args) {
 
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("a");
        list.add("b");
 
        int[] countList = new int[] {1, 1, 1};
        Object[] result = new Object[list.size()];
 
        printPermutations(list, countList, result, 0);
    }
 
    private static void printPermutations(List<Object> list, int[] countList, Object[] result, int pointer) {
        if (pointer == list.size()) {
        	System.out.println("RESULT");
            printArray(result);
            return;
        }
 
        for (int i = 0; i < list.size(); i++) {
        	System.out.println("i: " + i);
        	System.out.println("pointer: " + pointer);
            
        	if (countList[i] == 0) {
                continue;
            }
 
            result[pointer] = list.get(i);
            System.out.println("Result array");
            printArray(result);
            
            System.out.println("count before decrement before recusion call");
            printInt(countList);
            
            countList[i]--;
            
            System.out.println("count after decrement before recusion call");
            printInt(countList);
            
            System.out.println("printPermutations(" + pointer + ")");
            printPermutations(list, countList, result, pointer + 1);
            
            System.out.println("Out of printPermutations(" + pointer + ")");
            System.out.println("count after recursion call before increment");
            printInt(countList);
            
            countList[i]++;
            
            System.out.println("count after recursion call after increment");
            printInt(countList);
        }
    }
 
    private static void printArray(Object input[]) {
        for (Object ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }
    
    private static void printInt(int input[]) {
        for (int ch : input) {
            System.out.println(ch);
        }
        System.out.println();
    }
}

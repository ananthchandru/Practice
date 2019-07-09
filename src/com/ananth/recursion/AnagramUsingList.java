package com.ananth.recursion;

import java.util.ArrayList;
import java.util.List;

public class AnagramUsingList {
	 
    public static void main(String[] args) {
 
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("b");
        list.add("c");
 
        int[] countList = new int[] {1, 1, 1};
        Object[] result = new Object[list.size()];
 
        printPermutations(list, countList, result, 0);
    }
 
    private static void printPermutations(List<Object> list, int[] countList, Object[] result, int pointer) {
        if (pointer == list.size()) {
            printArray(result);
            return;
        }
 
        for (int i = 0; i < list.size(); i++) {
            if (countList[i] == 0) {
                continue;
            }
 
            result[pointer] = list.get(i);
            countList[i] = countList[i] - 1;
 
            printPermutations(list, countList, result, pointer + 1);
 
            countList[i] = countList[i] + 1;
        }
    }
 
    private static void printArray(Object input[]) {
        for (Object ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

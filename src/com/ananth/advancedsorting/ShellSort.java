package com.ananth.advancedsorting;

public class ShellSort {
	
	public static void main(String[] args) {
		int maxSize = 15;
		int[] arr = new int[maxSize];
		for(int i=0;i<maxSize;i++) {
			arr[i] = 15-i;
					//(int)(java.lang.Math.random()*99);
		}

		display(arr);
		shellSort(arr);
		display(arr);
	}
	
	public static void display(int[] arr) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void shellSort(int[] arr) { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
            for (int i = gap; i < n; i += 1) 
            { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        } 
    }
	
	/* Book given h = h*3+1;*/
	/*public static void shellSort(int[] arr) {
		int inner, outer;
		int temp;
		
		int h=1;
		while(h<=arr.length/3) {
			h = h*3+1;
		}
		
		while(h>0) {
			System.out.println("\nh: " + h);
			for(outer=h;outer<arr.length;outer++) {
				temp = arr[outer];
				inner = outer;
				
				while(inner>h-1 && arr[inner-h] >= temp) {
					arr[inner] = arr[inner-h];
					System.out.println("\n"+"inner while");
					display(arr);
					inner -= h;
				}
				arr[inner] = temp;
				
				System.out.println("\n"+ "for while");
				display(arr);
			}
			h = (h-1)/3;
		}
	}*/
	/*Book given h*3+1;*/
}

package com.ananth.recursion;

class DArray{

	private	long[] arr;
	private int nElements;

	public DArray(int max) {
		arr = new long[max];
		nElements = 0;
	}

	public void insert(long value) {
		arr[nElements] = value;
		nElements++;
	}
		
	public void display() {
		System.out.println();
		for(int i=0; i<nElements;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void mergeSort() {
		long[] workspace = new long[nElements];
		sort(workspace, 0, nElements-1);
	}
		
	private void sort(long[] workSpace, int lowerBound, int upperBound) {
	if(lowerBound == upperBound) 
		return;
	else {
			int mid = (lowerBound+upperBound)/2;
			sort(workSpace, lowerBound, mid);
			sort(workSpace, mid+1, upperBound);
			merge(workSpace, lowerBound, mid+1, upperBound);
		}
	}
	
	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j=0;
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound - lowerBound +1;
		
		while(lowPtr <= mid && highPtr <= upperBound) 
			if(arr[lowPtr] < arr[highPtr])
				workspace[j++] = arr[lowPtr++];
			else
				workspace[j++] = arr[highPtr++];
		
		while(lowPtr <= mid)
			workspace[j++] = arr[lowPtr++];
	
		while(highPtr <= upperBound)
			workspace[j++] = arr[highPtr++];
	
		for(j=0; j<n;j++)
			arr[lowerBound+j] = workspace[j];
	}		
}


public class InsertionSort {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,6,5,4};
/*		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 4;
		a[4] = 2;*/
		
		//display(a);
		insertionSort(a);
		

	}
	
	public static void insertionSort(int a[]) {
		/*for(int i=1; i<a.length;i++) {
			int sorted = i;
			for(int j=sorted-1;j>=0;j--) {
				if(a[sorted]<a[j]) {
					int temp = a[sorted];
					a[sorted] = a[j];
					a[j] = temp;
				}
				sorted--; 
				//since i cannot be decremented, we use a copy variable "sorted"
			}
			display(a);
		}*/
		int in, out;
		for(out=1;out<a.length;out++) {
			int temp = a[out];
			in = out;
			
			while(in>0 && a[in-1] >= temp ) {
				a[in] = a[in-1];
				--in;
				display(a);
			}
			a[in]=temp;
			display(a);
		}
	
		
	}
	
	public static void display (int[] a) {
		System.out.println();
		for(int i=0;i<a.length;i++) {
			/*if(i==0) {
				System.out.println(a[i]);
			} else {*/
				System.out.print(a[i] + " ");
//			}
		}
	}

}


public class SelectionSort {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 4;
		a[2] = 1;
		a[3] = 5;
		a[4] = 2;
		
		display(a);
		selectionSort(a);
		

	}
	
	public static void selectionSort(int a[]) {
		boolean sort = false;
		for(int j=0;j<a.length-1;j++) {
			int min = j;
			sort = false;
			for(int i=j+1; i<a.length; i++) {
				if(a[i]<a[min]) {
					min = i;
					sort = true;
				}				
			}			
			if(sort==true) {
				int temp = a[j];
				a[j] = a[min];
				a[min] = temp;
			}
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

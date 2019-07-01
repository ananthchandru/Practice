
public class BubbleSort {
	
	public static void main(String args[]) {
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 4;
		a[2] = 3;
		a[3] = 1;
		a[4] = 2;
/*		a[5] = 6;
		a[6] = 9;
		a[7] = 7;
		a[8] = 10;
		a[9] = 8;*/
		
		display(a);
		
		bubbleSort(a);
		
	}
	
	public static void bubbleSort(int a[]) {
		boolean sort = false;
		for(int j=a.length-1;j>=0;j--) {
			for(int i=0;i<j;i++) {
				if(a[i] > a[i+1]) {
					int temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
					sort = true;
				} else {
					sort = false;
				}
			}
			display(a);
			if(sort == false) {
				break;
			}
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


public class ArrayTest {
	
	public static void main(String[] args ) {
		int a[] = new int[10];
		int j=1;
		for(int i=0; i<a.length;i++)
		{
			a[i] = j;
			j++;
		}
		//guess = 3;
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		find(11, a);
	}
	
	public static void find(int search, int a[]) {
		
		int lb = 0;
		int ub = a.length-1;
		int i=1;
		
		while(true) {
			if(lb > ub){
				System.out.println("Unable to find");
				break;
			}
			System.out.println("Step"+ i);
			int cb = (lb+ub)/2;
			System.out.println("Lower bound: "+a[lb]);
			System.out.println("Upper bound: "+a[ub]);
			System.out.println("Current bound: "+a[cb]);
			if(search == a[cb]) {
				System.out.println("found: "+a[cb]);
				break;
			} else if(search < a[cb]) {
				ub = cb-1;
			} else if(search > a[cb]) {
				lb = cb+1;
			} 
			i++;
		}
	}
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class PickingNumbers {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
    	Arrays.sort(a);
    	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
    	int count = 1;
    	for(int i=0;i<a.length;i++) {
    		if(i==a.length-1) {
				map.put(a[i], count);
				break;
			}
    		if(a[i]==a[i+1]) {
    			count++;
    		} else {
    			map.put(a[i], count);
    			count=1;
    		}    	
    	}
    	if(map.size()==1) {
    		return map.get(map.firstKey());
    	}
    	int max = 0;
    	for(int i=0;i<map.keySet().size()-1;i++) {
    		int next = new ArrayList<Integer>(map.keySet()).get(i+1);
    		int current = new ArrayList<Integer>(map.keySet()).get(i);
    		if(next-current ==1) {
    			max = Math.max(max, map.get(next)+map.get(current));
    		}
    	}
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


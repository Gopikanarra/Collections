
import java.io.*;
import java.util.*; 


class Main {

    public static void main (String[] args) {

       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int arr[] = new int[num];

       for(int i=0;i<num;i++){
          arr[i]=sc.nextInt();
       }

       List<List<Integer>> subs=findSubarrays(arr);

       for(List<Integer> l:subs){
           int first=l.get(0);
           for(int i=0;i<l.size();i++){
               first=gcd(first,l.get(i));
           }
       System.out.print(first);

       }
    }
       public static List<List<Integer>> findSubarrays(int[] arr) {

        List<List<Integer>> subarrays = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
}

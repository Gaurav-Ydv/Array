package Array;

import java.util.Scanner;
public class RangeQuery {
    public static int[] makePrefixSumArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        System.out.println("Enter "+n+" element of the array : ");
        for (int i = 1; i <= n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = makePrefixSumArray(arr);

        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l-1];
            System.out.println("Sum " + ans);

        }
    }
}

package Array;

import java.util.Scanner;

public class MiscellaneousProblem {


//-----swap two values using temp variable
    static void swap(int a , int b){
        System.out.println("Original Value before swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int temp = a; //temp = 9
        a = b;   //a = 3
        b = temp;  //b = 9

        System.out.println("Values after swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }

//-------swap values without using temp variable
    static void swapWithoutTemp(int a, int b){
        System.out.println("Original Value before swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//-----Method 1 Reverse an array using any other variable
//    static int[] reverseArray(int[] arr){
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//
//        for (int i = n-1; i >= 0 ; i--) {
//            ans[j++] = arr[i];
//
//        }
//        return ans;
//    }


//----Method 2 Reverse an array without using any other variable----
//----Two pointer Approach---------------
    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;

        while( i < j){
            swapInArray(arr, i , j);   //call by reference
            i++;
            j--;
        }
    }

//----Method(1)Rotate the given Array 'a' by k steps, where k is non_negative without using extra space
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void reverse(int[] arr,int i,int j ){
//        while( i < j){
//            swap(arr, i , j);   //call by reference
//            i++;
//            j--;
//        }
//    }
//    static void rotateInPlace(int[] arr, int k){
//        int n = arr.length;
//        k = k % n;
//        reverse(arr, 0, n-k-1);
//        reverse(arr, n-k, n-1);
//        reverse(arr, 0, n-1);
//    }

//----Method(2)Rotate the given array 'a' by k steps where k is non-negative.
    static int[] rotate(int[] arr,int k){
        int n  = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n ; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k ; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }


//-----check if a number is present in the array or not and answer queries corresponding to it.
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }









    public static void main(String[] args) {
        int a = 9 ;
        int b = 3;
//        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+ " element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }


//-------swap two values with using temp variable
//        swap(a,b);

//-------swap values without using temp variable
//        swapWithoutTemp(a,b);


//-----Method 1 Reverse an array with using any other variable
//        int[] ans = reverseArray(arr);
//        printArray(ans);

//-----Method 2 Reverse an array without using any other variable
//        reverseArray(arr);
//        System.out.println("Reverse of the number is");
//        printArray(arr);

//        System.out.print("Enter k : ");
//        int k = sc.nextInt();
//        System.out.println("Original array : ");
//        printArray(arr);
////--------Rotate the given array 'a' by k steps where k is non-negative.
//        rotateInPlace(arr,k);
//        System.out.println("Array after rotation");
//        printArray(arr);
////--------Rotate the given array 'a' by k steps, where k is non-negative
////        int[] ans = rotate(arr,k);
////        System.out.println("Array after rotation");
////        printArray(ans);



//------check if a number is present in the array or not and answer queries corresponding to it.
        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter number to searched ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;

        }
    }
}

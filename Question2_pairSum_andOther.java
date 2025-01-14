package Array;

import java.util.Scanner;

public class Question2_pairSum_andOther {

//---find the second_smallest element from array
    static int Smallest(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
    static int secondSmallest(int[] arr){
        int min = Smallest(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int findSecondSmallest = Smallest(arr);
        return findSecondSmallest;

    }


//---print the first value that is repeating in the array. if no value is being repeated, return -1..
    static int firstRepeatingValue(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }

        }
        return -1;
    }

//-----Array manipulation
//-----Find the second_largest element in the given array
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int SecondMax = findMax(arr);
        return SecondMax;
    }

//-----Array Manipulation--------------
//--find the unique number in a given array where all the elements are being repeated twice with one value being unique
    static int findUnique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

//-----find the total number of pairs in the Array whose sum is equal to the given value x.
    static int pairSum(int[] arr, int target){
//        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    ans++;
                }

            }

        }
        return ans;
    }

//------count the number of triplets whose sum is equal to the given value x.
    static int tripletSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == target){
                        ans++;
                    }

                }

            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+ " element of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
//        System.out.println();
//        System.out.print("Enter target sum : ");
//        int target = sc.nextInt();

//-----find the total number of pairs in the Array whose sum is equal to the given value x.
//        System.out.println("Total number of pairs : "+pairSum(arr,target));


//------count the number of triplets whose sum is equal to the given value x.
//        System.out.println("Total number of triplet : "+tripletSum(arr,target));


//--------find the unique number in a given array where all the elements are being repeated twice with one value being unique
//        System.out.println("\nUnique element : "+findUnique(arr));


//------Find largest and Second_largest element in an array--------
//        System.out.println("\nLargest element : "+findMax(arr));
//        System.out.println("SecondLargest element : "+findSecondMax(arr));


//---------print the first value that is repeating in the array. if no value is being repeated, return -1..
//        System.out.println("\nFirst Repeating number : " +firstRepeatingValue(arr));


        System.out.println("\nsmallest number : "+Smallest(arr));
        System.out.println("Second smallest number : "+secondSmallest(arr));






    }


}


package Array;

import java.util.*;

public class Question1 {

    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//------print the smallest and largest element in an array
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
                return ans;
    }

//------check the given array is sorted or not--------
    static boolean iSortedOrNot(int[] arr ){
       boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            /*
            i = 0
            arr[0] < arr[-1]
             */
            if(arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

//------count the number of elements strictly greater than value x
    static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }

        }
        return count;
    }

//------find the last occurrence of an element x in a given array
    static int lastOccurrence (int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastIndex = i;
            }

        }
        return lastIndex;

    }


//-------find the frequency of element in an array
    static int countOccurrences(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n + " elements : " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("original array is : ");
        PrintArray(arr);

//        System.out.println("Enter x : ");
//        int x = sc.nextInt();
//-------find the frequency of number in an array

//        System.out.println("count of "+x+" is : "+countOccurrences(arr,x));


//-------find the last occurrence of an element x in a given array

//        System.out.println("Last Occurrence of "+x+" is : "+lastOccurrence(arr,x));

//-------count the number of elements strictly greater than value x

//        System.out.println("Total Number strictly greater than "+x+" is : "+strictlyGreater(arr,x));


//-------check the given array is sorted or not
//        System.out.println("Is sorted : "+iSortedOrNot(arr));


//-------print array with first element is smallest and last element is largest

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("smallest : "+ ans[0]);
        System.out.println(("Largest : "+ans[1]));




    }
}

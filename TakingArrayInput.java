package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TakingArrayInput {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Original array : ");
        //print the array element by method call
        PrintArray(arr);
        //print array element normally
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //trying to copy arr to arr_2
//(1)----int[] arr_2 = arr;  //shallow copy :- means it create the copy of same array but no any other address is created on heap like arr_2 and arr both refers to the same Address
//(2)----int[] arr_2 = arr.clone(); //arr.clone :- means it also create copy of array as shallow array but in arr.clone it create or assign the other address on the heap for the copied array
        //arr.clone is also known as deep copies because it copy the same array but both the array and copy array have different address
//(3)----int[] arr_2 = Arrays.copyOf(arr, arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr, 2,arr.length);
        System.out.println("copied array_2 : ");
        //print array element using method call
        PrintArray(arr_2);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr_2[i] + " ");
//
//        }

        //changing some values of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("original array after changing arr_2");
        PrintArray(arr);

        System.out.println("copied arr_2 after changing arr_2");
        PrintArray(arr_2);

    }
}

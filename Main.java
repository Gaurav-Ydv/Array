package Array;

class ArraysExample{

//------search the given element x in the array.if present then return the index else return -1---
//-------linear search algo----------------------------------------------------------------------------------
    void searchElement(){
        int[] arr = {10,5,3,6,2,3,4};
        int x = 3;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]==x){
                 ans = i;
                 break;
             }
        }
        if(ans == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }


//------find the maximum element in array------------------------------------------
    void maximumElement(){
        int[] arr = {1,4,5,6,1};
        int max_value = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_value){
                max_value = arr[i];
            }

        }
        System.out.println(max_value);
    }


//---Sum of Array Element------------------------------------------------------------------
    void sumOfArray(){
        int[] arr = {1,4,5,6,1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("The sum is : "+sum);
    }

//---------------------------------------------------------------------------------
//------Accessing the element from 2D Arrays----------------------------------------
    void multiArrays(){
//        int[][] arr = new int[3][2];
        int[][] arr = {{56,46,48},{14,12,15},{21,52,85}};
//-------//Accessing the Array element from iteration----------------------------------------
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//
//        }

//--------//Accessing array element manually--------------------------------------------------
//        System.out.print(arr[0][0]+" "); //56
//        System.out.print(arr[0][1]+" "); //46
//        System.out.print(arr[0][2]+" "); //48
//
//        System.out.print("\n"+arr[1][0]+" "); //14
//        System.out.print(arr[1][1]+" "); //12
//        System.out.print(arr[1][2]+" "); //15
//
//        System.out.print("\n"+arr[2][0]+" "); //2
//        System.out.print(arr[2][1]+" "); //5
//        System.out.println(arr[2][2]); //8
    }

//---Accessing the element from 1D array--------------------------------
    void demoArrays(){
        int[] ages = new int[3];  //ages[0], ages[1], ages[2]
        float[] weight = new float[3];
        String[] names = {"rahul","ram","krishna"};
        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
//        ages[5] = 50;  //out of bound error

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
////        System.out.println(ages[5]);
//        System.out.println(names[0]);
    }
}
public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        obj.multiArrays();
//        obj.sumOfArray();
//        obj.maximumElement();
        obj.searchElement();

    }
}

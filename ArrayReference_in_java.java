package Array;

public class ArrayReference_in_java {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void changeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    static void changeVal(int a){
        a = 1004;
    }


    public static void main(String[] args) {
        int a = 5;
        changeVal(a);
        System.out.println(a);  //ans = 5 because of pass by value  :- matlab Actual value kabhi pass nahi hoti hai. Ek method call mai copy banti hai actual value ki wo pass hoti hai.

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 5;

        changeArray(arr);
        PrintArray(arr);

    }
}

package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//      int[] arr = new int[]{1, 5, 15, 10, 11, 30, 31, 33};
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int t = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = t;
//                }
//            }
//      }
//        int [] arr = new int [10];
//        for(int i = 0; i<10; i++){
//           arr[i] =  random.nextInt(10);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int[] arr1 = Arrays.copyOf(arr,3);
//        System.out.println(Arrays.toString(arr1));
//        Scanner scanner = new Scanner(System.in);
//        String [] arr = new String[5];
//        for(int i = 0; i<5; i++){
//          arr[i] =  scanner.nextLine();
//        }
//        String[] arr1 = Arrays.copyOf(arr,5);
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int [] arr =  new int[] {1,3,6,8,11,14,17,20,22,25};
//        Scanner scanner = new Scanner(System.in);
//        int i  =  scanner.nextInt();
//        for(int j = 0; j<arr.length; j++) {
//            if(arr[i] == j){
//                arr[i] = 0;
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        int min = -100;
//        int max = 100;
//        int step = 5;
//        for(int i = min; i<=max; i+=step){
//         System.out.println(i);
//        }

        int[] arr = {1,-15,10,15,20,-65,30,-9,12};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0) {
                sum = sum + arr[i];
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}

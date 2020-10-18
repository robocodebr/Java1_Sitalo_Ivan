package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//      String[] cars = {"Volvo", "BMW", "Ford" , "Mazda"};
//      System.out.println(cars[0]);
//      for(int i = 0; i<4; i++) {
//          System.out.println(cars[i]);
//      }
//     int[] myNum = {10,20,30,40};
//      myNum[0] = 20;
//      System.out.println(myNum.length);
//      for(int i = 0; i<4; i++){
//          System.out.println(myNum[i]);
//      }
//      int[] arr = new int[10];
//      for (int i = 0; i < arr.length; i++) {
//          arr[i] = 1;
//      }
//      System.out.println(Arrays.toString(arr));

//      int[]arr1 = new int[10];
//      int sum = 0;
//      for(int i = 0; i < arr1.length ; i++){
//          arr1[i] = random.nextInt(10);
//          System.out.println(arr1[i]);
//          sum += arr1[i];
//      }
//      System.out.println(sum);

//       Scanner scanner = new Scanner(System.in);
//       Random random = new Random();
//      int[] arr = new int[10];
//      for(int i = 0; i < arr.length; i++) {
//          arr[i] = random.nextInt(20)-10;
//          System.out.println("arr[" + i + "]" + " " + "=" + " " + arr[i]);
//      }
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int[][] arr2 = new int[m][n];
//        int x = 0;
//        boolean b = false;
//        arr2[0][0] = 5;
//
//        for(int i = 0; i<m; i++) {
//            for(int j = 0; j<n; j++){
//                arr2[i][j] = random.nextInt(10);
//                if(arr2[i][j]==x){
//                    System.out.println(i+""+j);
//                    b = true;
//                }
//            }
//            System.out.println(Arrays.toString(arr2[i]));
//        }
//        if(!b){
//          System.out.println("Not Found");
//        }

        float[] arr = {1,5,30,7,17,20,10};
        float x = arr[0];
        for(int i = 2; i < arr.length; i+=2){
            if(arr[i]>x) {
                x = arr[i];
            }
        }
        System.out.println(x);
}
}

package com.company;
import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{6,9,6},{8,3,1},{9,9,9}};
        int[][] arr2 = {{4,5,6},{2,3,6},{7,8,9}};
        int[][] arr3 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepEquals(arr,arr2));
        int[][] arr4 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.deepToString(arr4));
//        method1();
//    int arr2[][] = {{4,2,7},{6,8,1},{7,5,0}};
//    for(int i = 0; i<arr2.length; i++){
//       for(int j = 0; j<arr2.length; j++){
//           arr2[i][j] = random.nextInt(100);
//       }
//    }
//    for(int i1 = 0; i1< arr2.length; i1++){
//        System.out.println(Arrays.toString(arr2[i1]));
//    }
//        for(int d = 0; d<arr2.length; d++){
//        System.out.println(arr2[d][d]);
//        }
//        for(int d = 0; d<arr2.length; d++){
//            System.out.println(arr2[arr2.length-1-d][d]);
//        }
    }

//    public static void method1(){
//    Random random = new Random();
//    int arr[][] = new int[3][3];
//    for(int i = 0; i<arr.length; i++){
//        for(int j = 0; j<arr.length; j++){
//            arr[i][j] = random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr[i]));
//    }
//        int sum = 0;
//        for(int i1 = 0; i1< arr.length; i1++){
//        System.out.println(arr[arr.length-1-i1][i1]);
//        sum += arr[i1][i1];
//    }
//    System.out.println("sum" + " = " + sum);
//        System.out.println(Arrays.deepToString(arr));
}



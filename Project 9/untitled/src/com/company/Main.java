package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int len = scanner.nextInt();
        int [] arr = new int[len];

        for(int i = 0; i<arr.length; i++){
            arr [i] = random.nextInt(30);
        }
        int key = scanner.nextInt();
        int count = 0;
        for(int j = 0; j<arr.length; j++) {
            if(arr[j] == key){
                count++;
            }
        }
        int arr2 [] = new int[arr.length-count];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=key){
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
//    int [] arr = {1,2,3,4,5,6,7,8,9,10};
//    int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
//    for(int i = 0; i<arr.length; i++){
//        int temp = arr2[i];
//        arr2[i] = arr[i];
//        arr[i] = temp;
//    }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//    for(int i = 0; i<(int)arr.length/2; i++){
//        int temp = arr[i];
//        arr[i] = arr[arr.length-1-i];
//        arr[arr.length-1-i] = temp;
//    }

// System.out.println(Arrays.toString(arr));

//       Random random = new Random();
//        int arr[];
//        arr = new int[10];
//        for(int i = 0; i<arr.length; i++){
//            arr [i] = random.nextInt(40)-20;
//        }
//        for(int i = 0; i<arr.length; i++){
//          for(int j = 0; j<arr.length-i; j++){
//              if(arr[i]<arr[j]){
//                  int temp = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//              }
//          }
//        }
       // System.out.println(Arrays.toString(arr));
//	Scanner scanner = new Scanner(System.in);
//	String arr[];
//	arr = new String[10];
//	for(int i = 0; i<arr.length; i++){
//	    arr[i] = scanner.nextLine();
//    }
//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
//	int arr[];
//	arr = new int[10];
//    for(int i = 0; i<arr.length; i++){
//	    arr[i] = scanner.nextInt();
//    }
//        for(int j = 0; j<arr.length; j++){
//            if(arr[j]%2 == 0){
//                System.out.println(arr[j]);
//            }
//        }
//        Arrays.sort(arr);
	//System.out.println(Arrays.toString(arr));
//	String s = scanner.nextLine();
//	if(s.equals("+")){
//	    plus(45,78);
//    }else if(s.equals("-")){
//	    minus(45,78);
//    }else if(s.equals("*")){
//	    multiplication(45,78);
//    }else if(s.equals("/")){
//	    division(45,78);
 }
//
   }
//
//    public static void plus(int i, int i1){
//      System.out.println(i+i1);
//    }
//
//    public static void minus(int i, int i1) {
//        System.out.println(i-i1);
//    }
//
//    public static void multiplication(int i, int i1) {
//        System.out.println(i*i1);
//    }
//
//    public static void division(int i, int i1) {
//        System.out.println(i/i1);
//    }



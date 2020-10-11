package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
        int i2 = scanner.nextInt();
        sum(i, i2);
        minus(i,i2);
        mnozh(i,i2);
        divide(i,i2);
        if(s.equals("+")) {
            System.out.println(sum(i,i2));
        } else if(s.equals("-")){
            System.out.println(minus(i,i2));
        } else if(s.equals("*")) {
            System.out.println(mnozh(i,i2));
        } else if(s.equals("/")) {
            System.out.println(divide(i, i2));
        }

//        str();
//     func("func");
//     String s = "text";
//     func(s);
//     println("text", "text");
    }

//    public static void func(String name) {
//      System.out.println("Hello" + name);
//    }
//
//    public static void println(String arg1,String arg2) {
//    System.out.println("arg1 = " + arg1);
//    System.out.println("arg2 = " + arg2);
//    }

//    public static String str(){
//
//        return "jhjghjgh";
//    }
        public static int sum(int i, int i2) {
        return  i + i2;
        }

        public static int minus(int i, int i2 ){
        return i - i2;
        }

        public static int mnozh(int i, int i2 ){
        return i * i2;
        }

        public static int divide(int i, int i2 ){
        return i/i2;
        }

}

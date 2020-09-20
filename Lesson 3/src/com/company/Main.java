package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println("our string" + s);

//        String name = scanner.nextLine();
//        String surname = scanner.nextLine();
//        String middlename = scanner.nextLine();
//
//        System.out.println(name + " " + surname + " " + middlename);

//        String aa = scanner.nextLine();
//        System.out.println(aa + aa + aa);

//        int i = scanner.nextInt();
//        System.out.println("our number" + i);
//
//        int i1 = scanner.nextInt();
//        int i2 = scanner.nextInt();
//
//        System.out.println(i1 + i2);
//        System.out.println(i1 - i2);
//        System.out.println(i1 * i2 );
//        System.out.println(i1/i2);

       String s = scanner.nextLine();
       s.charAt(2);
        int i = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        int i1 = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
       if("+".equals(""+s.charAt(2))) {
       System.out.println(i +i1);
      }else if("-".equals(""+s.charAt(2))){
         System.out.println(i-i1);
       }else if("*".equals(""+s.charAt(2))){
         System.out.println(i*i1);
       }else if("/".equals(" "+s.charAt(2))){
          System.out.println(i/i1);
      }


    }
}

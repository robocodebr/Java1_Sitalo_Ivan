package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        boolean b = scanner.hasNextLine();
//        System.out.println(b);
//        boolean bool = scanner.hasNextInt();
//        System.out.println(bool);
//        Random random = new Random();
//        System.out.println(random.nextInt(65)-55);
        Random random = new Random();
//        float f = scanner.nextFloat();
//       System.out.println(f/100);
//      boolean b = random.nextBoolean();
//    System.out.println(b);
//        Double d = random.nextDouble();
//        System.out.println(d);

        //    int i = -20;
//        while(i<20) {
//          System.out.println(random.nextInt(100));
//          i++;
//        }
////    }
//        int j = 100;
//        do {
//            System.out.println(random.nextInt(100) + 100);
//            j++;
//        } while (j < 200);

//        for(int i = 0; i<70; i+=7){
//           System.out.println(i);
//
//        }
//        int i1 = scanner.nextInt();
//        int i = 0;
//        while(i<i1) {
//            System.out.println(random.nextInt(100));
//            i++;
//        }
        int i1 = scanner.nextInt();
      for(int i = 0; i<=10; i++){
          System.out.println(i+"*"+i1+"="+i*i1);
      }
      String s = " ";
      System.out.println(s);

      for(int i = 1; i<=10; i++) {
         System.out.println(i1+"/"+i+"="+i1/i);
      }
        String s1 = " ";
        System.out.println(s1);

        for(int i = 0; i<=10; i++) {
            System.out.println(i + "-" + i1 + "=" + (i - i1));
        }
        String s2 = " ";
        System.out.println(s2);

        for(int i = 0; i<=10; i++) {
            System.out.println(i + "+" + i1 + "=" + (i + i1));
        }
    }
}

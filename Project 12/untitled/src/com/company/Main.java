package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    String s = scanner.nextLine();
    String s2 = scanner.nextLine();
    int sum = 0;
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j<s2.length(); j++){
          if((s.charAt(i)+"").equals(s2.charAt(j)+"")){
            sum += 1;
          }
      }
    }
   System.out.println(sum);

//        String hello = "Hello";
//        int index1 = hello.indexOf('H');
//        int index2 = hello.indexOf('O');
//        int index3 = hello.indexOf('W');
//
//        System.out.println("Мы ищкм букву 'Н' в строке" + hello + ".");
//        System.out.println("Индекс этой буквы : " + index1);
//
//        System.out.println("Мы ищем букву 'o' в строке" + hello + ".");
//        System.out.println("Индекс этой буквы :" + index2);
//
//        System.out.println("Мы ищем букву 'W' в строке" + hello + ".");
//        System.out.println("Индекс этой буквы :" + index3);
//

//        String oldString = "Java";
//        String newString = oldString.replace('a','i');
//        System.out.println("Old string:" + oldString);
//        System.out.println("New string:" + newString);
//
//
//        String str = "Oбожаю язык програмирования Java";
//
//        System.out.println("Substring from 27 till the end "+ str.substring(27));
//        System.out.println("Substring from 0 to 8" + str.substring(0,8));
//        System.out.println("Substring from 27 to 31" + str.substring(27,31));

//        String s = "Привет,как дела?";
//     for(int i = 0; i<s.length(); i++){
//         if(s.charAt(i) == '?'){
//             System.out.println("Это - вопрос");
//         }else if(s.charAt(i) == '!'){
//             System.out.println("Это - восклицательные предложение");
//         }else if(s.charAt(i) == '.'){
//             System.out.println("Это - повествовательное предложение");
//         }
//     }
//        System.out.println(s.replace("Привет,как дела?","Как сам?"));
//     System.out.println(s.toUpperCase());
//     String str = "TEXT";
//     System.out.println(str.toLowerCase());
//     System.out.println(str.substring(1,3));
//     System.out.println(str.indexOf('T'));
//        String s1 = "literal";
//        String s2 = new String("literal");
//        if(s1 == s2)
//            System.out.println("s1 == s2");
//        if(s1.equals(s2))
//            System.out.println("s1.equals(s2)");
    }
}

package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      String s = "Расте́ния (лат. Plantae) — биологическое царство, " +
              "одна из основных групп многоклеточных организмов, " +
              "включающая в себя в том числе мхи, папоротники, хвощи, плауны, голосеменные" +
              " и цветковые растения. Нередко к растениям относят также все " +
              "водоросли или некоторые их группы. Растения (в первую очередь, цветковые) " +
              "представлены многочисленными жизненными формами — среди них есть деревья, " +
              "кустарники, травы и др";
       String str = " ";
       for(int i = 0; i<s.length(); i++){
           if(s.charAt(i) == ' '){
             list.add(str);
             str = " ";
           }else {
            str += s.charAt(i);
           }
       }
       String s3 = list.get(0);
       for(int i = 0; i<list.size(); i++){
           if(s3.length()>list.get(i).length()){
             s3 = list.get(i);
           }
           System.out.println(list.get(i));
       }
        System.out.println(s3);



//Scanner scanner =  new Scanner(System.in);
//       String str = scanner.nextLine();
//        String str1 = scanner.nextLine();
//        char c = str.charAt(0);
//        int integer = 0;
//           for(int i = 0; i<str.length(); i++){
//               if(str.charAt(i) == c) {
//                   integer++;
//           }
//       }
//      System.out.println(integer);




   //HashMap<Integer,String> hashMap = new HashMap<>();
//     hashMap.put(1111,"Sitalo");
//     hashMap.put(1234,"Suharev");
//        hashMap.remove(1234);
//        hashMap.clear();
//     System.out.println(hashMap.get(1111));
//     System.out.println(hashMap.size());
//     System.out.println(hashMap.containsKey(1111));
//        System.out.println(hashMap.containsValue(1234));
//        System.out.println(hashMap.containsKey(1234));
//        System.out.println(hashMap.isEmpty());
//        HashMap<Integer,String> hashMap1 = new HashMap<>();
//        hashMap1.put(5678,"Name1");
//        hashMap1.put(9101,"Name2");
//        hashMap1.put(1213,"Name3");
//        hashMap.putAll(hashMap1);
//        System.out.println(hashMap.size());
    }
}

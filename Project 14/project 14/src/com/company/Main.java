package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Mandarin",10);
        hashMap.put("Apple",10);
        hashMap.put("Pomegrenade",10);
        int i = 0;
        System.out.println(hashMap);
         while(i<10) {
             String str = scanner.next();
             int Int = scanner.nextInt();
             hashMap.put(str,Int);
           i++;
         }
        System.out.println(hashMap);
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//        String str = scanner.next();
//        for(int i = 0; i < str.length(); i++) {
//            char currentElement = str.charAt(i);
//            if(hashMap.containsKey(currentElement)) {
//             hashMap.put(currentElement,hashMap.get(currentElement)+1);
//            } else {
//                hashMap.put(currentElement, 1);
//            }
//        }
//        char maxChar = ' ';
//        int max = 0;
//        for(HashMap.Entry<Character,Integer> element:hashMap.entrySet()){
//         System.out.println(element.getKey());
//         System.out.println(element.getValue());
//         if(element.getValue()>max){
//             max = element.getValue();
//             maxChar = element.getKey();
//         }
//        }
//        System.out.println(hashMap);
//        System.out.println(max);
//        System.out.println(maxChar);
//    HashMap<Integer,String> hashMap = new HashMap<>();
//    hashMap.put(1111,"Surname 1");
//    hashMap.put(1234,"Surname 2");
//    System.out.println(hashMap);
//    hashMap.put(1111,"Surname 3");
//    System.out.println(hashMap);






//	Random random = new Random();
//	long start = System.currentTimeMillis();
//    ArrayList<String> List  = new ArrayList<>();
//    List.add("Yehor");
//    List.add("Mark");
//    List.add("Ilya");
//    List.add("Natasha");
//    String str = List.get(random.nextInt(List.size()));
//    System.out.println(List.indexOf(str));
//    System.out.println(str);
//    System.out.println(System.currentTimeMillis()-start);
    }
}

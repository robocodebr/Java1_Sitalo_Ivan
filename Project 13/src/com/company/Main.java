package com.company;
import java.awt.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        ArrayList<String> staff = new ArrayList<>();
        for(int i = 0; i<s; i++){
         staff.add(scanner.next());
        }
        method(staff);
        method1(staff);
//        String s1 = scanner.next();
//        if(staff.contains(s1)){
//            staff.remove(staff.indexOf(s1));
//        }
        System.out.println(staff);
//        ArrayList<String> people = new ArrayList<>();
//        people.add("Myrosik");
//        people.add("Yehor");
//        people.add("Mark");
//        if (people.contains("Yehor")) {
//        System.out.println("List contains Yehor");
//         int index = people.indexOf("Yehor");
//         people.remove(index);
//         System.out.println(people);
//        }

//        Random random = new Random();
//        int r = random.nextInt(100);
//        ArrayList<Integer> List = new ArrayList<>();
//        for(int i = 0; i<r; i++){
//         List.add(random.nextInt(10));
//        }
//        List.remove(0);
//        if(List.contains(5)){
//            List.indexOf(5);
//        } else{
//            List.set(List.size()-1,100);
//        }
//        List.clear();
//        System.out.println(List);
    }

    public static void method(ArrayList<String> staff){
        Collections.sort(staff);
    }

    public static void method1(ArrayList<String> staff) {
        Collections.sort(staff,Collections.reverseOrder());
        System.out.println(staff);
    }
}

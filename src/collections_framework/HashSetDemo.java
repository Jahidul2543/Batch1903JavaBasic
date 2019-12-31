package collections_framework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        storeInfoInHashSet();
    }

    public static void storeInfoInHashSet(){

        /**
         * Set does not allow duplicate value
         * No order gurante
         * Set allows to store null value
         *
         * */

        HashSet<Integer> studentId = new HashSet<>();

        studentId.add(190301);
        studentId.add(190302);
        studentId.add(190303);
        studentId.add(190303);
        studentId.add(null);

        for(Integer id: studentId){
            System.out.println("Student id: " + id);
        }
        HashSet<String> studentList = new HashSet<>();

        studentList.add("John");
        studentList.add("Jack");
        studentList.add("John");
        studentList.add(null);
        studentList.add("");

        for(String str: studentList){
            System.out.println("Student id: " + str);
        }

    }

}

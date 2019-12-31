package collections_framework;
import java.util.*;

public class ArrayListDemo {

    /**
     * Can an Interface have Objects?
     * */

    public static void main(String[] args) {
              ArrayListDemo obj = new ArrayListDemo();
              //obj.storeStudentInfoInArray();
              //obj.storeStudentInfoInArrayList();
              obj.storeIntegerObjectsInArrayList();
    }


    public void storeStudentInfoInArray(){
        String [] studentsArray = new String[3];

        //  studentsArray = {"Ahad", "Nayem", "Farhan", "Zahid", "Fairuz", "Rahul"};
        studentsArray[0] = "Ahad";
        studentsArray[1] = "Nayem";
        studentsArray[2] = "Nayem";

        for (String str: studentsArray ) {
            System.out.println(str);
        }
    }

    public void storeStudentInfoInArrayList(){

        /**
         * List can contain only objects cant contain any primitive variable
         * */

       List<String>  studentList = new ArrayList<>();


        studentList.add("John");
        studentList.add("Jack");
        studentList.add("John");
        studentList.add(null);
        studentList.add("");


        /*
        * Few methods of ArrayList
        * */

        System.out.println("Lenght of ArrayList: " + studentList.size());
        studentList.remove(1);
        System.out.println("Lenght of ArrayList after removal operation: " + studentList.size());


        for (String str: studentList) {

            System.out.println("Student Name from studentList: " + str );

        }

        for(int i =0; i<studentList.size(); i++){
            System.out.println("Access ArrayList using for loop: " + studentList.get(i));
        }

    }

    public void storeIntegerObjectsInArrayList(){
        /**
         * Wrapper class --> Integer wrapper class holds primitive int variable as an object
         * The {@code Integer} class wraps a value of the primitive type
         * {@code int} in an object. An object of type {@code Integer}
         * contains a single field whose type is {@code int}.
         * */

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        /*
        * lambda function -> it has been introduced in Java 8
        *
        * */
        integerList.forEach(number -> System.out.println("Reading Integer using foreahc(): " + number));

        int x = integerList.get(0);
        System.out.println(x);

        List<Character>  gradeIno =  new ArrayList<>();
        gradeIno.add('A');

        char grade = gradeIno.get(0);

    }

}

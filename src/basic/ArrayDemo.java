package basic;

public class ArrayDemo {

    public static void main(String[] args) {

        /**
         * Length need to define while initilaizing an array
         * Array length is fixed
         *
         * */

       String [] nameOfServices = new String[4];

       nameOfServices[0] = "DevOps";
       nameOfServices[1] = "QAAE";
       nameOfServices[2] = "Data Science";
       nameOfServices[3] = "UX/UI Desgin";

        String courseName = nameOfServices[0];
        System.out.println(courseName);// 1
        System.out.println(nameOfServices[1]); // 2
        System.out.println(nameOfServices[2]); // 3
        System.out.println(nameOfServices[3]); // 4
        /**
         * Start from 0
         * After 4 times we will say good bye
         *
         * */
         // 0, 1, 2, 3
         for(int x = 0; x<4; x++ ){
             System.out.println(nameOfServices[x]);
         }

    }

}

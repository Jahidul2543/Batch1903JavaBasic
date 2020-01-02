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
         for(int x = 0; x<=nameOfServices.length -1; x++ )
         {
             System.out.println(nameOfServices[x]);
         }
                        //  0,    1,   2,   3,   4,  5
                        //  10,  11,  12,  13,  14,  15
         double grade[] = {1.1, 1.2, 1.3, 1.4, 1.5, 1.7};

         int i;
         // 16-10 = 6
         for(i=10; i <16; i++)
         {
             System.out.println(grade[i-10]);//0, 1, 2, 3, 4 ,5// 10
         }

         // I am smart I can identify from where to start and where to stop

        for (double d: grade)
        {
            System.out.println(d);
        }

    }

}








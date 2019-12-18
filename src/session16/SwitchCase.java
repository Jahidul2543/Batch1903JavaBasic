package session16;

public class SwitchCase {
    public static void main(String[] args) {

           // String studentName = "Rupam";
            char grade = 'F';
            int marks;

            SwitchCase obj = new SwitchCase();

            switch (grade) {

                case 'A':
                   // obj.gradeAMarkRange();
                    System.out.println("Grade is A");
                    break;

                case 'F':
                    marks = 75;
                    System.out.println("Grade is F");
                    break;

                case 'D':
                    marks = 65;
                    System.out.println("Grade is D");
                    break;

                default:
                    marks = 0;
                    System.out.println("Grade is 0");
                    break;

            }
        }
      //  System.out.println(marks);


   /* public void gradeAMarkRange(){

        System.out.println("Grade A: >80");

    }*/

}

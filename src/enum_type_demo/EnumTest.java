package enum_type_demo;

import java.util.EnumSet;

public class EnumTest {

   /*
   * Day day1 = new Day();
   * We can't instantiate an Enum type Object
   * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
   *
   * */

    int x;

    Day day;

    public EnumTest(Day day){
        this.day= day;

        // day = xyz
        // this.day = xyz
        //

    }
    public EnumTest(int x){
        this.x = x;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(Day.FRIDAY);
        enumTest.tellItLikeItIs();
        EnumTest enumTest2 = new EnumTest(Day.MONDAY);
        enumTest2.tellItLikeItIs();


    }

}

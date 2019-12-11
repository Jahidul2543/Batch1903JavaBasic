package basic;

public class ArithmaticOperatorDemo {
    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        // result = 10 % 7; 1.3
        result = 37 % 6;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        // The only symbol that might look new to you is "%",
        // which divides one operand by another and returns the remainder as its result.


    }
}


package session16;

public class Calculator {

    // int x; int x = 4;

    public Calculator(){
        System.out.println("I am first constructor");
    }

    public Calculator(String modelNo){
        System.out.println("Creating " + modelNo + "calculator using second Calculator Constructor");
    }


   static Calculator calculator = new Calculator("Casio 5507");

    public static void main(String[] args) {

      //  calculator.add(4,5);
        calculator.divide(4,2);
    }

    public int add(int x, int y){

        int sum = x +y;
        System.out.println("Sum: " + sum);
        return sum;
    }

    public int divide(int x, int y){
        int result = 0;
      //  result = x / y;

        try {
            result = x / y; // 0/2? 2/0 --> Invalid arithmetic operation
            return result;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
            System.out.println("A number cant be divided by zero, please go to Mars using SpaceX and try!!!!");
        }
        finally {
            System.out.println("Thank you for using our App!!!");
        }
        System.out.println("Result: " + result);
        return result;
    }
}

package basic;

public class IfElseDemo {

    public static void main(String[] args) {
        // Declare temperature variable
        int temperature = 0;

          /**
           * if(Condition --> True or False){
           *     // If Block
           *     // This block will execute only if condition is True
           * }
           *
           * */
        // Temperature is 15~10
        if(temperature <= 15 && temperature >= 10) {
            System.out.println("Wear light Jacket ");
        }
        else if (temperature < 10){
            System.out.println("Wear winter cloths");
        }

        else{
            System.out.println("Wear normal cloths");
        }
    }
}

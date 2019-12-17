package variabletypes_accordingto_scope;

public class Car {
    /*
    * variable outside method inside class
    *
    * */
    // Instance variable

    int rupamsCar = 3;

    /**
     *
     * Class variable
     * should have a staci key word
     *
     **/

    static int nahiansCar = 1;
    static int numberOfWheels = 4;



    public static void main(String[] args) {

    }

    public void washCar(){
        // Local variable
       int carTobeWashed = rupamsCar;
    }

    public void billing(){
        int numberOfCarWashed;
    }

    public static void generateReport(){
        System.out.println("Create report of Nahians car");
    }
}

//int rumpu = 10;
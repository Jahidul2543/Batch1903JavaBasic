package variabletypes_accordingto_scope;

public class AllState {
    /**
     *
     * All state need to know your Car history
     *
     * */

    // Object is an instance of a class!!!!

    Car objCar = new Car();

    public void rumpamsCarHistory(){
        // Get number of rupamsCar from Car class using an instance of Car class
       int rupamsActualCarCount = objCar.rupamsCar;

    }

    public void nahiansCarHistory(){
      int nahiansActualCarCount =  Car.nahiansCar;
         // objCar.generateReport();
        Car.generateReport();

    }
}

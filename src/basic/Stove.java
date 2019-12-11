package basic;

public class Stove {

    public Stove(){
        System.out.println("I am default constructor");
    }

    public static void main(String[] args) {
      Stove myStove = new Stove();
            myStove.turnOffStove();
    }

    public void turnOffStove(){

        int initialValue=36;
        int finalTemperature = 70;
        int[] temperatureArray = new int[35];
        int arrayIndex = 0;
         // 70 >= 36   == True or false

        // 70  -->

        while(finalTemperature >= 69 ) {

           // Store initial values in an array
           temperatureArray[arrayIndex] = initialValue;

           // Increment initial value by 1
           initialValue++;

           // Increment index value by 1
            arrayIndex++;

        }

        System.out.println("Turn Off the Stove");
        System.out.println("Length of the array: " +  temperatureArray.length);
        /**
         * Retrieve elements from temperatureArray using for loop
         * */
        for(int i = 0; i<= temperatureArray.length - 1; i++ ){
            System.out.print(temperatureArray[i] + ", ");
        }
    }
}

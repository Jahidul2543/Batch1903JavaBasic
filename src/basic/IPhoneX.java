package basic;

public class IPhoneX{

    /**
     * Class is the plan of IPhoneX
     * Now we will send this to China to build IPhoneX for us
     * myIphoneX  =  by using new keyword you invoke constructor to create myIPhoneX
     * IPhoneX() --> Constructor --> Same as class name with ();
     * IPhoneX  myIPhoneX = new IPhoneX();
     * Declaratin if object
     * IPhoneX  myIPhoneX;
     * Create object
     * myIPhoneX = new IPhoneX();
     * Funtion = method
     * Here name of the function is call
     * Method does some job
     * call() method able to make call
     * This is the main gate of your house/ of your application
     * Mainmethod syntex can't be altered
     * JVM only understands whatever inside this main method
     * or anything mehtod having relationship with the main method
     *
     * */

     public IPhoneX(){
         /*
         * Default constructor, it will not have any argument/s
         * No void --> No return type
         * Class Name and Constructor Name is same
         * method Name can be anything appropriate to the class name but
         * constructor name has to be same as Class Name
         * */
         System.out.println("I am inside default constructor");
     }

     public IPhoneX(int x){
         System.out.println("Create a " + x +"nd grade IPhone");
         System.out.println("I am in side second constructor");

     }

     public static void main(String[] args){
           IPhoneX myIPhoneX = new IPhoneX();
           // Calling using myIphone
           // By doing this we have created a Relationship with main() method and call() method
           myIPhoneX.call();
           myIPhoneX.sendText();

           IPhoneX secondGradeIPhoneX = new IPhoneX(2);
           //Make a call using secondGradeIPhoneX
           secondGradeIPhoneX.call();
        }

     public void call(){

     System.out.println("This method can make a call");

     }
     public void sendText(){
         /**
          * String is Java class
          * It has constructor, method.
          */
         String text = "Hello Dear, How are you today?";
         System.out.println("Object text without constructor ---> " + text);

         String morningText = new String("Hello Dear, How are you today?");
         System.out.println("Object morningText created using String(String original) constructor ---> " + morningText);

        int lenghtOfMornigText = morningText.length();

         System.out.println("Length of string object text: " + lenghtOfMornigText);

     }

 }
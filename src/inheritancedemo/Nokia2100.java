package inheritancedemo;

public class Nokia2100 extends Nokia1100 {
    // Abstartc class can't be instantiated
    //PreNokia1100 objPreNokia = new PreNokia1100();

   static Nokia2100 objNokia2100 = new Nokia2100();

    public Nokia2100(){
        super();
    }

    public void camera(){
        System.out.println("Take photo");

    }

    public void gallery(){
        System.out.println("Store photo");
    }

    public void makeCallByNokia2100(){
        objNokia2100.makeCall();

    }
     // Thread safe method
    public synchronized void playSnakeGameUsingNokia2100(){
        objNokia2100.snakeGame();
    }

    public static void main(String[] args) {

        String name = new String("Fairuz");
        objNokia2100.camera();

    }

}

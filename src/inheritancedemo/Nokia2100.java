package inheritancedemo;

public class Nokia2100 extends Nokia1100 {
    // Abstartc class can't be instantiated
    //PreNokia1100 objPreNokia = new PreNokia1100();

    Nokia2100 objNokia2100 = new Nokia2100();

    public void camera(){
        System.out.println("Take photo");

    }

    public void gallery(){
        System.out.println("Store photo");
    }

    public void makeCallByNokia2100(){
        objNokia2100.makeCall();
    }

    public void playSnakeGameUsingNokia2100(){
        objNokia2100.snakeGame();
    }

    public static void main(String[] args) {

        String name = new String("Fairuz");

    }

}

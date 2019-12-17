package inheritancedemo;

public abstract class PreNokia1100 implements Symbian {
    public void makeCall(){
        System.out.println("This method can make call");
    }
    public void sendText(){
        System.out.println("This method can send text");
    }
    // This method shall enable users to play Snake Game
    public abstract void snakeGame();
}

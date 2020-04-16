package inheritancedemo;

public class Nokia1100 extends PreNokia1100 {

    public Nokia1100(){
        System.out.println(" I am a constructor in Nokia1100 Class");
    }

    public void snakeGame(){
        System.out.println("This method shall enable users to play Snake Game");
    }

    public void snakeGame(int x){
        System.out.println("This method shall enable users to play Snake Game");
    }
    public void snakeGame(int x, int y ){
        System.out.println("This method shall enable users to play Snake Game");
    }
    public void snakeGame(int x, boolean isHeGood ){
        System.out.println("This method shall enable users to play Snake Game");
    }
    public void snakeGame(boolean isHeGood, int x ){
        System.out.println("This method shall enable users to play Snake Game");
    }
    public void sendText(){

    }
}

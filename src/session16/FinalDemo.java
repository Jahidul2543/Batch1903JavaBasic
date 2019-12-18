package session16;

public final class FinalDemo {

    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething(){
        // If you say a variable is final value cant be reassigned further
       final int x = 20;
       //x = 10;
        // x = 12;

        System.out.println("Value of x: " + x);
    }
    public void doNothing(){

    }

}

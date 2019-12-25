package getter_setter_demo;

public class GetterSetterDemo {

    /**
     *
     * Getter --> Get the value of an object
     * Setter --> Set the value of an object
     *
     * */

   private int x = 4;
    int y;

   public int getX(){
       return x;
   }

    public void setX(int x) {
        this.x = x;
        System.out.println(x);
        // instance variable or class variable =
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}

package getter_setter_demo;

public class ConsumerClass {

    public static void main(String[] args) {
        GetterSetterDemo obj = new GetterSetterDemo();
        int a =  obj.getX();
        System.out.println("Value of a: " + a);

        System.out.println("Value of x in GetterSetterDemo Class: ");
        obj.setX(8);
    }

}

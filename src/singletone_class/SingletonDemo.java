package singletone_class;

import sun.java2d.SunGraphics2D;

public class SingletonDemo {

    /**
     *
     * Singleton class restrict other classes to create object of the Singleton class by making constructor private
     * Read note please
     *
     * */

    private static SingletonDemo objsingletonDemo = new SingletonDemo();

    private SingletonDemo(){
        System.out.println("This is singleton class private constructor");
    }

    // Getter method to get the value of object objSingletonDemo

    public static SingletonDemo getObjSingletonDemo(){

       return  objsingletonDemo;
    }
}

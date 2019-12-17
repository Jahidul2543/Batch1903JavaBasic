package variabletypes_accordingto_scope;

public class Echo {

    /**
     * Main method Entry point to the Java Application
     * JVM enters to the Java application using main method
     * static keyword allows JVM to execute without instantiating an Object of this class
     * main has special meaning to JVM
     * args -->  array variable
     * */

    public static void main(String[] args) {
        System.out.println("Hello");
       for (String s: args) {
            System.out.println(s);
        }
    }

}
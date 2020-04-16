package basic;

public class StringImmutableDemo {

    public static void main(String[] args) {
        immutableDemo();
    }

    public  static void immutableDemo(){
        String name = "Rahul";
        String name2 = name.replace('R', 'L');

        System.out.println(name2); //Rahul or Lahul

        /**
         * StringBuffer is a mutable Java API
         * Synchronized thus it is thread safe
         *
         * */
        StringBuffer stringBuffer = new StringBuffer("Ahad");
        System.out.println(stringBuffer);
        stringBuffer.replace(0, 1,"S");
        System.out.println(stringBuffer);

        /**
         *
         * StringBuilder is a mutable Java API
         * StringBuilder is not synchronized thus not thread safe
         *
         * */
        StringBuilder stringBuilder = new StringBuilder("Midul");
        System.out.println(stringBuffer);
        stringBuilder.replace(0,1, "S");
        System.out.println(stringBuilder);


    }
}

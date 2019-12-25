package unittestdemo;

public class CasioCalculator {

    public static void main(String[] args) {
        CasioCalculator casio5570 = new CasioCalculator();
        casio5570.add(4,4);
    }

    public int add(int x, int y){
        int sum = x + y;
        System.out.println("Result: " + sum);
       return sum;
    }

    public int divide(int x, int y){
        int results = x/y;
        return results;
    }
}

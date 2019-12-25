package input_output_stream;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
         readFromKeyBoard();
    }

   public static void readFromKeyBoard(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //scanner.next();
   }
}

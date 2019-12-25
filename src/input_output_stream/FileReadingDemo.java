package input_output_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
            readTextFile();
        //charIntValueExtraction();

    }

    public static void readTextFile()  {

        FileReader  fileReader = null;

        ///Users/jahidul/IdeaProjects/Batch1903JavaBasic/src/data/sample.txt
        // System.getProperty("user.dir") == the path until base directory

        String filePath =  System.getProperty("user.dir")+"/src/dataaa/sample.txt";

       // System.out.println(filePath);

        try {
             fileReader = new FileReader(filePath);
        }
        catch (FileNotFoundException exception){
           // exception.printStackTrace();
        }

        try{
            int i;
            while ((i = fileReader.read())!=-1){
                System.out.print((char) i);
            }
            fileReader.close();
        }
        catch (IOException exception){
           // exception.printStackTrace();
        }
    }

    public static void charIntValueExtraction(){
        char grade = 'a';
        System.out.println("Value of the grade char :" + (int)grade);
        int intVariable = 97;
        System.out.println("Value of int intVariable char value: " + (char)intVariable);
        System.out.println((char)72);
    }
}

package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class CheckedExceptions {


    public static void main(String[] args) {


        try {
            System.out.println("Before reading file");
            readFile("D:\\Projekty\\JavaKurs\\src\\pages\\tests.txt");
            System.out.println("close file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("closing file");
        }
    }
        public static void readFile (String path) throws FileNotFoundException{
            FileInputStream fileInputStream = new FileInputStream(path);

        }
    }

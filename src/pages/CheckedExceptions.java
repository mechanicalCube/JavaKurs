package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class CheckedExceptions {


    public static void main(String[] args) throws FileNotFoundException {
        readFile("/scr/dfdasf.pl");
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}

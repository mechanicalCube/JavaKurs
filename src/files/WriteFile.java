package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("text.txt");
        file.write("sam tekst");
        file.close();
    }
}

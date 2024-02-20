import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class hello {

    public static void main(String[] args) throws IOException {

        readFile("src/hello.txt");
    }

    public static String  readFile(String filePath) throws IOException {

        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        fr.read(chars);
        String fileContent = new String(chars);

        return fileContent;
    }

}

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Created by OskarPraca on 2017-03-27.
 */
public class Zadanie2 {


    public static void main(String[] args) {
        File myFile = new File("D:\\Ak\\", "test.txt");
        Scanner scanner = new Scanner(System.in);
        if(!myFile.exists()){
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.print("Podaj tekst: ");
            try {
                Files.write(myFile.toPath(), ( scanner.nextLine() + "\r\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

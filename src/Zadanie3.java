import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-27.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        try {
            List<String> linesOfText =  Files.readAllLines(Paths.get("D:\\Ak\\test.txt"));
            for(String line : linesOfText){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

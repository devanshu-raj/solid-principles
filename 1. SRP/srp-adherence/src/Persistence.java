import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(journal.toString());
        }
    }

    public void loadFromFile(String fileName) {
        // Logic to load file

    }

    public void loadFromUrl(URL url) {
        // Logic to load file from URL
    }

}

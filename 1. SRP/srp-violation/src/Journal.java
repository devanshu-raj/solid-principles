import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int totalCount = 0;

    public void addEntry(String entry) {
        entries.add(totalCount + ": " + entry);
        ++totalCount;
    }

    public void removeEntry(int index) {
        entries.remove(index);
        --totalCount;
    }

    public void saveToFile(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(this);
        }
    }

    public void loadFromFile(String fileName) {
        // Logic to load journal entries from file
    }

    public void loadFromUrl(URL url) {
        // Logic to load journal entries from URL
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

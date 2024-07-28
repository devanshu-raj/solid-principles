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

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

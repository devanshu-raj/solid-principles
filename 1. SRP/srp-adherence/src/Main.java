import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Journal journal = new Journal();
        journal.addEntry("First journal entry");
        journal.addEntry("Second journal entry");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        persistence.saveToFile(journal, "tempFile.txt");
    }
}

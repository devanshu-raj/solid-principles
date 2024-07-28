import java.util.List;

public class SQLProductRepository {

    public List<String> getAllProductNames() {
        // Retrieve all products from SQL DB
        return List.of("lamp", "button", "toothbrush");
    }

}

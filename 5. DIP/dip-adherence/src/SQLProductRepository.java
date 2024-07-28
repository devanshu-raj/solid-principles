import java.util.List;

public class SQLProductRepository implements ProductRepository {

    @Override
    public List<String> getAllProductNames() {
        // Retrieve all products from SQL DB
        return List.of("lamp", "button", "toothbrush");
    }
}

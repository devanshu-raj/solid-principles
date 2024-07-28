import java.util.List;

public class ProductCatalog {

    private final SQLProductRepository sqlProductRepository;

    public ProductCatalog(SQLProductRepository sqlProductRepository) {
        this.sqlProductRepository = sqlProductRepository;
    }

    public void listAllProducts() {
        List<String> allProductNames = sqlProductRepository.getAllProductNames();

        allProductNames.forEach(System.out::println);

        // ProductCatalog (High-level) directly depends upon SQLProductRepository (low-level)
    }

}

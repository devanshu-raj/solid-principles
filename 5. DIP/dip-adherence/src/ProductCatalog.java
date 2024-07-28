import java.util.List;

public class ProductCatalog {

    private final ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void listAllProducts() {
        List<String> allProductNames = productRepository.getAllProductNames();

        allProductNames.forEach(System.out::println);

        // ProductCatalog (High-level implementation) does not depend upon SQLProductRepository (low-level implementation)
        // instead both of them depend upon ProductRepository interface (abstraction)
    }

}

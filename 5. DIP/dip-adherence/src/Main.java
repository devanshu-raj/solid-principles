public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(ProductFactory.create());
        productCatalog.listAllProducts();
    }
}
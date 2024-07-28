import product.Product;
import product.ProductFilter;
import product.enums.Color;
import product.enums.Size;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> productList = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();

        Stream<Product> greenProducts = productFilter.filterProductByColor(productList, Color.GREEN);
        System.out.println("\nGreen Products:");
        greenProducts.forEach(System.out::println);

        Stream<Product> largeProducts = productFilter.filterProductBySize(productList, Size.LARGE);
        System.out.println("\nLarge Products:");
        largeProducts.forEach(System.out::println);

        Stream<Product> largeBlueProducts = productFilter.filterProductBySizeAndColor(productList, Size.LARGE, Color.BLUE);
        System.out.println("\nLarge and Blue Products:");
        largeBlueProducts.forEach(System.out::println);
    }

}

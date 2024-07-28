import product.Product;
import product.filter.ProductFilter;
import product.enums.Color;
import product.enums.Size;
import product.specification.AndSpecification;
import product.specification.ColorSpecification;
import product.specification.SizeSpecification;

import java.util.List;
import java.util.stream.Stream;

// OCP adherence using specification pattern
public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> productList = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();

        Stream<Product> greenProducts = productFilter.filterBySpecification(productList, new ColorSpecification(Color.GREEN));
        System.out.println("\nGreen Products:");
        greenProducts.forEach(System.out::println);

        Stream<Product> largeProducts = productFilter.filterBySpecification(productList, new SizeSpecification(Size.LARGE));
        System.out.println("\nLarge Products:");
        largeProducts.forEach(System.out::println);

        Stream<Product> largeBlueProducts = productFilter.filterBySpecification(productList, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)));
        System.out.println("\nLarge and Blue Products:");
        largeBlueProducts.forEach(System.out::println);
    }

}
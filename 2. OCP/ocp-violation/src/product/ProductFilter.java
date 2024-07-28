package product;

import product.enums.Color;
import product.enums.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterProductByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterProductBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterProductBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.color == color && p.size == size);
    }

    // Addition of more filters will require existing code modification, hence violating OCP

}

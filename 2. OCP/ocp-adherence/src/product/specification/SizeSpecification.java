package product.specification;

import product.Product;
import product.enums.Size;

public class SizeSpecification implements Specification<Product> {

    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.size == size;
    }

}

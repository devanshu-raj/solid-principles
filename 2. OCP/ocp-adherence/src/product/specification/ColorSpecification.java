package product.specification;

import product.Product;
import product.enums.Color;

public class ColorSpecification implements Specification<Product> {

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product){
        return product.color == color;
    }

}

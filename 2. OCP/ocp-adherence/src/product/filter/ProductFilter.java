package product.filter;

import product.Product;
import product.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filterBySpecification(List<Product> products, Specification<Product> spec) {
        return products.stream().filter(spec::isSatisfied);
    }

    // Addition of more filters will NOT require modification to existing code. Just create new Specifications accordingly

}

package product.filter;

import product.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filterBySpecification(List<T> items, Specification<T> specification);

}

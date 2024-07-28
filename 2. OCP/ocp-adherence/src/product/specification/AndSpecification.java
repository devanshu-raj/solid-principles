package product.specification;

public class AndSpecification<T> implements Specification<T> {

    private final Specification<T> firstSpec, secondSpec;

    public AndSpecification(Specification<T> firstSpec, Specification<T> secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfied(T item) {
        return firstSpec.isSatisfied(item) && secondSpec.isSatisfied(item);
    }
}

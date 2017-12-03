package service.specification;

import java.util.Collection;
import java.util.function.Predicate;

public class IsInCollection<T> implements Predicate<T> {

    private final Collection<T> collection;

    public IsInCollection(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean test(T element) {
        return collection.contains(element);
    }
}

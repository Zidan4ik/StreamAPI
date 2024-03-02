package examples.lambda;

@FunctionalInterface
public interface DoValue<T> {
    T getArea(int value1, int value2);
}


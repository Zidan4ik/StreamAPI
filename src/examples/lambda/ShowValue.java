package examples.lambda;

@FunctionalInterface
public interface ShowValue<T> {
    void show(T value);
}

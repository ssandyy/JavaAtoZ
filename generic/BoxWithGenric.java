package generic;

public class BoxWithGenric<T> {
    T name;

    public BoxWithGenric(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
}

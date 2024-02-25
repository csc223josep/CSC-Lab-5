public class PairBox<T, U> {
    T object1;
    private U object2;

    public PairBox(T object1, U object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void setObject(T object1) {
        this.object1 = object1;
    }

    public void setObject2(U object2) {
        this.object2 = object2;
    }

    public T getObject(T object1) {
        return this.object1;
    }

    public U getObject2(U object2) {
        return this.object2;
    }

}
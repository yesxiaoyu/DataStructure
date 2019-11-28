public interface Stack<E> {

    void push(E e);
    E pop();
    E getTop();
    int getSize();
    boolean isEmpty();
}

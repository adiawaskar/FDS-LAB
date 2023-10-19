/**
 * The `Stack` interface defines a basic set of methods for a stack data structure.
 *
 * @param <E> The type of elements to be stored in the stack.
 */
interface Stack<E> {
    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    int size();

    /**
     * Checks if the stack is empty.
     *
     * @return `true` if the stack is empty, `false` otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes an element onto the stack.
     *
     * @param elem The element to be pushed onto the stack.
     * @throws IllegalStateException if the stack is full and cannot accommodate more elements.
     */
    void push(E elem);

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack, or `null` if the stack is empty.
     */
    E top();

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The element at the top of the stack, or `null` if the stack is empty.
     */
    E pop();
}

/**
 * The `ArrayStack` class implements the `Stack` interface using an array.
 *
 * @param <E> The type of elements to be stored in the stack.
 */
public class ArrayStack<E> implements Stack<E> {
    private E[] a;
    private int ptr = -1;

    /**
     * Constructs an `ArrayStack` with the specified size.
     *
     * @param size The maximum size of the stack.
     */
    public ArrayStack(int size) {
        this.a = (E[]) new Object[size];
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size() {
        return (ptr + 1);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return `true` if the stack is empty, `false` otherwise.
     */
    public boolean isEmpty() {
        return ptr == -1;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param elem The element to be pushed onto the stack.
     * @throws IllegalStateException if the stack is full and cannot accommodate more elements.
     */
    public void push(E elem) throws IllegalStateException {
        if (size() == a.length) throw new IllegalStateException("Stack is full");
        a[++ptr] = elem;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack, or `null` if the stack is empty.
     */
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return a[ptr];
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The element at the top of the stack, or `null` if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E temp = a[ptr];
        a[ptr] = null;
        ptr--;
        return temp;
    }
}
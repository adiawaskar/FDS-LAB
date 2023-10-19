interface Stack<E>{
    int size();
    boolean isEmpty();
    void push(E elem);
    E top();
    E pop();
}
public class ArrayStack<E> implements Stack<E> {
    private E[] a;
    private int ptr = -1;
    private int size;

    public ArrayStack(int size){
        this.a = (E[]) new Object[size];
    }

    public int size(){
        return (ptr + 1);
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
    public void push(E elem) throws IllegalStateException{
        if(size() == a.length) throw new IllegalStateException ("Stack is full");
        a[++ptr] = elem;
        return;
    }

    public E top(){
        if(isEmpty()){
            return null;
        }
        return a[ptr];
    }

    public E pop(){
        if(isEmpty()){
            return null;
        }
        E temp = a[ptr];
        a[ptr] = null;
        ptr--;
        return temp;
    }

}



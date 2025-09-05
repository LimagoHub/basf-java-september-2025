package de.basf.collections;

/**
 *
 */
public class Stapel<T> {

    private T []data;
    private int index;

    public Stapel() throws  StapelException {

        this(10);

    }
    public Stapel(int size) throws StapelException {
        if(size < 1)
            throw new StapelException("init");
        data = (T []) new Object[size];
        index = 0;
    }


    public T pop() throws StapelException {
        if(isEmpty()) throw new StapelException("Underflow");
        return data[--index];
    }

    public void push(T value) throws StapelException {
        if(isFull()) {
            throw new StapelException("Overflow");
        }

        data[index++] = value;

    }

    public boolean isEmpty() {
        return index == 0;
    }
    public boolean isFull() {
        return index == data.length;
    }


}

package de.basf.collections;

/**
 *
 */
public class Stapel {

    private int []data;
    private int index;

    public Stapel() {
        this(10);
    }
    public Stapel(int size) {
        data = new int[size];
        index = 0;
    }


    public int pop() throws StapelException {
        if(isEmpty()) throw new StapelException("Underflow");
        return data[--index];
    }

    public void push(int value) {
        if(isFull()) return;
        data[index++] = value;

    }

    public boolean isEmpty() {
        return index == 0;
    }
    public boolean isFull() {
        return index == data.length;
    }


}

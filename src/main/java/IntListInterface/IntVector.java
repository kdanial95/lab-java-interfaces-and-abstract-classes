package IntListInterface;

import java.util.Vector;

// Package-private implementation with 2x growth, default capacity = 20
class IntVector implements IntList {
    private static final int DEFAULT_CAPACITY = 20;

    private int[] data;
    private int size;

    public IntVector() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = value;
    }

    @Override
    public int get(int index) {
        rangeCheck(index);
        return data[index];
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }
}
package IntListInterface;

// Package-private implementation with 50% growth, default capacity = 10
class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;

    private int[] data;
    private int size;

    public IntArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if (size == data.length) {
            int newCapacity = data.length + (data.length / 2);
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

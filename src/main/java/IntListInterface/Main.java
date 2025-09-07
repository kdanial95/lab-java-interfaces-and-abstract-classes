package IntListInterface;

/**
 * Create an IntList interface with the following methods:
 * add(int number): a method that adds a new number to the list
 * get(int id): a method that retrieves an element by its ID
 * Create two implementations of IntList: IntArrayList and IntVector.
 * IntArrayList should store numbers in an array with a length of 10 by default. When the add method is called, you must first determine if the array is full. If it is, create a new array that is 50% larger, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 15.)
 * IntVector should store numbers in an array with a length of 20 by default. When the add method is called, you must first determine if the array is full. If it is, create a new array that is double the size of the current array, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 20.)
 * In your README.md, include an example of when IntArrayList would be more efficient and when IntVector would be more efficient.
 */


public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vector = new IntVector();

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 30; i++) {
            vector.add(i * 2);
        }

        System.out.println("IntArrayList contents:");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println("\n\nIntVector contents:");
        for (int i = 0; i < 30; i++) {
            System.out.print(vector.get(i) + " ");
        }
    }
}





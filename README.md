# IntListInterface

## 📖 Overview
This project demonstrates a simple `IntList` interface and two implementations:
- **IntArrayList** → Grows by 50% when full
- **IntVector** → Doubles in size when full

Both store integers in arrays and automatically resize when needed.  
They differ in **initial size** and **growth strategy**.

---

## 📂 Project Structure
+ src
    + main
        + java
            + IntListInterface
                + IntList.java
                + IntArrayList.java
                + IntVector.java
                + Main.java
    + test
        + java
            + IntListInterface
                + IntListInterfaceTest.java
---

## 🔧 How It Works

### `IntList` (Interface)
Defines two methods:
```java
public interface IntList {
    void add(int number);  // Adds a number to the list
    int get(int index);    // Retrieves a number at the given index
}
```
### `IntArrayList` (Implementation)
- Starts with an array of size **10**.
- When full, increases array size by **50%** (e.g., 10 → 15 → 22 → ...).
- Best for **smaller datasets** and **memory efficiency**.

### `IntVector` (Implementation)
- Starts with an array of size **20**.
- When full, **doubles** array size (e.g., 20 → 40 → 80 → ...).
- Best for **large datasets** and **fewer resizes**.

---
Sample Output
---
```
IntArrayList contents:
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

IntVector contents:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 

# IntListProject

## 📖 Overview
This project demonstrates a simple `IntList` interface and two implementations:
- **IntArrayList** → Grows by 50% when full
- **IntVector** → Doubles in size when full

Both store integers in arrays and automatically resize when needed.  
They differ in **initial size** and **growth strategy**.

---

## 📂 Project Structure
IntListProject/
│
├── src/
│ └── main/
│ └── java/
│ └── IntListProject/
│ ├── IntList.java # Interface
│ ├── IntArrayList.java # 50% growth
│ ├── IntVector.java # 2x growth
│ └── Main.java # Demo program
│
└── src/
└── test/
└── java/
└── IntListProject/
└── IntListTest.java # JUnit tests
---

## 🔧 How It Works

### `IntList` (Interface)
```java
public interface IntList {
    void add(int number);  // Adds a number to the list
    int get(int index);    // Retrieves a number at the given index
}
```
Sample Output
---
```
IntArrayList contents:
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
[ERROR] Invalid index 20. Valid range: 0 to 19

IntVector contents:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48
[ERROR] Invalid index 25. Valid range: 0 to 24

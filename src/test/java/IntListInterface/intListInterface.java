package IntListInterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class intListInterface {
    @Test
    void testIntArrayListAddAndGet() {
        IntList list = new IntArrayList();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        assertEquals(0, list.get(0));
        assertEquals(19, list.get(19));
    }

    @Test
    void testIntVectorAddAndGet() {
        IntList list = new IntVector();
        for (int i = 0; i < 25; i++) {
            list.add(i * 2);
        }
        assertEquals(0, list.get(0));
        assertEquals(48, list.get(24));
    }

    @Test
    void testIntArrayListResize() {
        IntArrayList list = new IntArrayList();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        assertEquals(29, list.get(29)); // Ensures resizing worked
    }

    @Test
    void testIntVectorResize() {
        IntVector list = new IntVector();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        assertEquals(49, list.get(49)); // Ensures resizing worked
    }
}
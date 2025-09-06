package BigDecimals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main bigDec;

    @BeforeEach
    void setUp() {
        Main bigDec = new Main();
    }

    @Test
    void bigDec2Double() {
        assertEquals(4.25, bigDec.BigDec2Double(new BigDecimal("4.2545"), 2));
    }

    @Test
    void bigDecReverse() {
        assertEquals(-1.2, bigDec.BigDecReverse(new BigDecimal("1.2345")));
        assertEquals(45.7, bigDec.BigDecReverse(new BigDecimal("-45.67")));
    }
}
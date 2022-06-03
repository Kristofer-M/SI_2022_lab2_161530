import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void functionTest() {
        Exception ex;
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new ArrayList(0)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new ArrayList(5)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        assertEquals(SILab2.function(new ArrayList(Arrays
                        .asList("0", "#", "0", "#", "0", "#", "0", "#", "#", "0", "0", "0", "0", "0", "0", "0"))),
                new ArrayList(Arrays.asList("1", "#", "2", "#", "2", "#", "2", "#", "#", "2", "0", "1", "1", "0", "0", "0")));
    }
}
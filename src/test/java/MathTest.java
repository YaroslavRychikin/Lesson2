import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class MathTest {
    @Test
    void sum() {
        int expected = Math.Sum(10, 15);
        assertEquals(expected, 25);
    }
}
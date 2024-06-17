import org.junit.Assert;
import org.junit.jupiter.api.Test;


class UserTest {
    @Test
    void sum() {
        int expected = User.Sum(10, 15);
        Assert.assertEquals(expected, 25);
    }
}
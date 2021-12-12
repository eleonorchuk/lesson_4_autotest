import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TriangleTest {
    @Test
    public void simpleTringleTest() {
        Assertions.assertEquals(6.0, Main.triangleSquare(3,4,5));
    }

    @Test
    public void zeroTringleTest() {
        Assertions.assertEquals(0.0, Main.triangleSquare(0,0,0));
    }

    @Test
    public void notTringleTest() {
        Assertions.assertEquals(-1, Main.triangleSquare(1,1,10));
    }
}

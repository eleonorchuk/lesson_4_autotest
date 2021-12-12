import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void simpleTringleTest() {
        //logger.info("simple test");
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

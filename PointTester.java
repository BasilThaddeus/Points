import org.junit.*;
import static org.junit.Assert.*;

public class PointTester {
    Point p1, p2;

    @Before
    public void setUp() throws Exception {
        p1 = new Point(); // (0,0)
        p2 = new Point(2, 0); // (2,0)
    }

    @Test
    public void testIsSame() {
        assertFalse("should return false", p1.isSame(p2));
    }
}

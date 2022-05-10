import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myTest {

    private double testTomeg(double magassag, double suly) {
        if (magassag < 0.54 || suly < 19.5)
            return -1;
        if (magassag > 2.72 || suly > 635)
            return -1;
        return suly / (magassag * magassag);
    }


    @Test
    @DisplayName("Testtömeg-indexet meghatározó metódus tesztelése")
    public void testTomegIndex(){
        assertEquals(-1, testTomeg(0.5, 18));
        assertEquals(-1, testTomeg(3.0, 18));
        assertEquals(-1, testTomeg(3.0, 700));
        assertEquals(-1, testTomeg(0.5, 700));
        assertEquals(-1, testTomeg(0.5, 100));
        assertEquals(-1, testTomeg(1.8, 18));
        assertEquals(-1, testTomeg(1.8, 700));
        assertEquals(-1, testTomeg(3.5, 80));
        assertEquals(-1, testTomeg(0, 0));
        assertEquals(-1, testTomeg(0, -20));
        assertEquals(-1, testTomeg(-20, 0));
        assertEquals(-1, testTomeg(-1, -1));
        assertEquals(-1, testTomeg(1.8, 0));
        assertEquals(-1, testTomeg(0, 80));
        assertEquals(-1, testTomeg(-1, 100));
        assertEquals(-1, testTomeg(80, -1));
        assertEquals(25, testTomeg(2.0, 100));
        assertEquals(21.604938271604937, testTomeg(1.8, 70));
        assertEquals(26.8595041322314, testTomeg(2.2, 130));
    }

}

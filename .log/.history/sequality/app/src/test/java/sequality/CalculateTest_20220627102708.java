package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 6; /* 5から6に書き換える */
    assertEquals(expected, calculate.sum(2, 3));
  }

}

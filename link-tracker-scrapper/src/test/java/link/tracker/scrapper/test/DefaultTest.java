package link.tracker.scrapper.test;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class DefaultTest {
  @Test
  public void test() {
    assert LocalDate.now().isAfter(LocalDate.now().minusDays(1));
  }
}

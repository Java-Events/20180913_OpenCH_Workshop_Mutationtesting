package junit.org.rapidpm.event.opench.p002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rapidpm.event.opench.p002.Accumulator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AccumulatorTest {

  // GIVEN
  private Accumulator accumulatorUT;

  // Still GIVEN since the class under test is state full
  @BeforeEach
  void setUp() {
    accumulatorUT = new Accumulator();
  }

  @Test
  @DisplayName("Test a new accumulator")
  void test001() {
    // THAN
    int sum = accumulatorUT.getSum();

    // THAT
    assertThat(sum, is(0));
  }

}

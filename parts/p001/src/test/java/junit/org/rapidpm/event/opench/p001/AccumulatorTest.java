package junit.org.rapidpm.event.opench.p001;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

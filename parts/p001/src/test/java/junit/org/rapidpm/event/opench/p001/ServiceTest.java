package org.rapidpm.junit.demo;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ServiceTest {
	// GIVEN
	// Convention UT - under test
	private Service serviceUT = new Service();

	@Test
	@DisplayName("Test add big postiv numbers")
	void test001() {
		// THAN
		int sum = serviceUT.add(200, 200);

		// THAT
		assertThat(sum, is(400));
	}

	@Test
	@DisplayName("Test add small postiv numbers")
	void test002() {
		// THAN
		int sum = serviceUT.add(2, 2);

		// THAT
		assertEquals(4, sum);
	}
}

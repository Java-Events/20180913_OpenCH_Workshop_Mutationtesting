package org.rapidpm.junit.demo;

public class Accumulator {
	private int sum = 0;

	public void add(int a) {
		if (a < 2) {
			sum = sum + a * -1;
		} else {
			sum = sum + a;
		}

	}

	public int getSum() {
		return sum;
	}
}
package org.rapidpm.event.opench.p002;

public class Service {
	/**
	 * A non-sense add method
	 * @param a
	 * @param b
	 * @return 
	 */
	public int add(int a, int b) {
		if (a < 2) {
			return (a + b) * -1;
		} else {
			return a + b;
		}
	}
}

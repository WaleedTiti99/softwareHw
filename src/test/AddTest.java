package test;

import static org.junit.Assert.*;

import org.junit.Test;

import testingCalc.Calculator;

public class AddTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int output = calc.add(4, 12);
		assertEquals(16,output);
		
	}

}

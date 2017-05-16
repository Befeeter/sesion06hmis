package test;

import static org.junit.Assert.*;
import sesion06.Ejercicio4;

import org.junit.Test;

public class Test4 {
	
	Ejercicio4 test = new Ejercicio4();

	@Test
	public void zeroStar() {
		assertTrue("".equals(test.buildStar(0)));
	}
	
	@Test
	public void oneStar(){
		assertTrue("*".equals(test.buildStar(1)));
	}
	
	@Test
	public void negative(){
		assertTrue("número erróneo".equals(test.buildStar(-1)));
	}
	
	@Test
	public void tenStar(){
		int ten=10;
		String expected ="";
		for (int i=0;i<ten;i++)
			expected +="*";
		assertTrue(expected.equals(test.buildStar(10)));
	}

}

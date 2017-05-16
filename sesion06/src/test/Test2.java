package test;

import static org.junit.Assert.*;
import sesion06.Ejercicio2;

import org.junit.Test;

public class Test2 {

	
	Ejercicio2 test = new Ejercicio2();
	
	
	@Test
	public void pruebaSignoZero() {
		assertTrue(test.signo(0));
	}
	
	@Test
	public void pruebaSignoPositivo() {
		assertTrue(test.signo(1));
	}
	
	@Test
	public void pruebaSignoNegativo(){
		assertFalse(test.signo(-1));
	}

}

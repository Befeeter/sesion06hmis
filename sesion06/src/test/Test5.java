package test;

import static org.junit.Assert.*;

import org.junit.Test;
import sesion06.Ejercicio5;
public class Test5 {

	Ejercicio5 test = new Ejercicio5();
	
	@Test
	public void differentChars() {
		assertTrue("pericsñdfgkjfg".equals(test.missedCharacters("holapericosñadfglkjafg", "hola")));
	}

}

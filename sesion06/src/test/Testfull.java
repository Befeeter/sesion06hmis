package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sesion06.Ejercicio2;
import sesion06.Ejercicio3;
import sesion06.Ejercicio4;
import sesion06.Ejercicio5;

public class Testfull {

Ejercicio2 test2 = new Ejercicio2();
	
	
	@Test
	public void pruebaSignoZero() {
		assertTrue(test2.signo(0));
	}
	
	@Test
	public void pruebaSignoPositivo() {
		assertTrue(test2.signo(1));
	}
	
	@Test
	public void pruebaSignoNegativo(){
		assertFalse(test2.signo(-1));
	}
	
	Ejercicio3 test3 = new Ejercicio3();

	@Test
	public void usernameEmpty() {
		assertFalse(test3.compruebaLogin("", "hola"));
	}
	
	@Test
	public void passwordEmpty(){
		assertFalse(test3.compruebaLogin("hola", ""));
	}
	
	@Test
	public void usernameLenght(){
		assertFalse(test3.compruebaLogin("1234567890123456789012345678901", "hola"));
	}
	
	@Test
	public void passwordLenght(){
		assertFalse(test3.compruebaLogin("hola", "1234567890123456789012345678901"));
	}
	
	@Test
	public void niceLogin(){
		assertTrue(test3.compruebaLogin("hola", "hola"));
	}

	
	Ejercicio4 test4 = new Ejercicio4();

	@Test
	public void zeroStar() {
		assertTrue("".equals(test4.buildStar(0)));
	}
	
	@Test
	public void oneStar(){
		assertTrue("*".equals(test4.buildStar(1)));
	}
	
	@Test
	public void negative(){
		assertTrue("número erróneo".equals(test4.buildStar(-1)));
	}
	
	@Test
	public void tenStar(){
		int ten=10;
		String expected ="";
		for (int i=0;i<ten;i++)
			expected +="*";
		assertTrue(expected.equals(test4.buildStar(10)));
	}
	
Ejercicio5 test5 = new Ejercicio5();
	
	@Test
	public void differentChars() {
		assertTrue("pericsñdfgkjfg".equals(test5.missedCharacters("holapericosñadfglkjafg", "hola")));
	}
}

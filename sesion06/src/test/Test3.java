package test;

import static org.junit.Assert.*;

import org.junit.Test;
import sesion06.Ejercicio3;

public class Test3 {
	
	Ejercicio3 test = new Ejercicio3();

	@Test
	public void usernameEmpty() {
		assertFalse(test.compruebaLogin("", "hola"));
	}
	
	@Test
	public void passwordEmpty(){
		assertFalse(test.compruebaLogin("hola", ""));
	}
	
	@Test
	public void usernameLenght(){
		assertFalse(test.compruebaLogin("1234567890123456789012345678901", "hola"));
	}
	
	@Test
	public void passwordLenght(){
		assertFalse(test.compruebaLogin("hola", "1234567890123456789012345678901"));
	}
	
	@Test
	public void niceLogin(){
		assertTrue(test.compruebaLogin("hola", "hola"));
	}

}

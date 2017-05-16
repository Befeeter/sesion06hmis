package sesion06;

public class Ejercicio1 {
	
	public static int transformar (int x) {
		if (x % 2 == 0) // % Resto de una división entre enteros (mod) multiplo de 2
		transformar (2 * x);
		else if (x % 3 == 0) // multiplo de 3
		transformar ( 3 * x );
		else if (x % 5 == 0)
		transformar (5 * x); // multiplo de 5
		else return x;
		return 0;
		}
}

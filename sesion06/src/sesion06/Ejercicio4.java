package sesion06;

public class Ejercicio4 {

	public Ejercicio4(){
		
	}
	
	public String buildStar(int x){
		String star ="";
		if (x <0)
			star = "número erróneo";
		else
			for (int i=0; i<x; i++)
				star +="*";
		return star;
	}
}

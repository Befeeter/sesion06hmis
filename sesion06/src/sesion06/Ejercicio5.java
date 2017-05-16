package sesion06;

public class Ejercicio5 {

	public Ejercicio5(){
		
	}
	
	public String missedCharacters(String P1, String P2){
		String characters="";
		char[] p1 = P1.toCharArray();
		int j = p1.length;
		for (int i=0; i<j;i++){
			if(P2.indexOf(p1[i])== -1)
				characters+=p1[i];
		}
		return characters;
	}
}

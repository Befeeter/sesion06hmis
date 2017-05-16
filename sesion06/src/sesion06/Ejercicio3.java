package sesion06;

public class Ejercicio3 {
	
	public Ejercicio3 (){
		
	}

	public boolean compruebaLogin (String username, String password){
		if (username.length() > 30 || password.length() > 30)
			return false;
		if (username == "" || password == "")
			return false;
		//compruebaLoginEnBD(username, password);
		return true;
	}
}

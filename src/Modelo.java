
public class Modelo {
	private Login miLogin;
	private final String usrPRF;
	private final String pwdPRF;
	private final String usrALM;
	private final String pwdALM;
	private String resultado;
	private int fallos;

	public Modelo() {
		//Profesor
		this.usrPRF = "admin";
		this.pwdPRF = "admin";	
		//Alumno
		this.usrALM = "alumno";
		this.pwdALM = "1234";
		fallos = 0;
	}

	public void setLogin(Login miLogin) {
		this.miLogin = miLogin;
	}

	public void login(String usr, String pwd) {
		if (this.usrPRF.equals(usr) && this.pwdPRF.equals(pwd) || this.usrALM.equals(usr) && this.pwdALM.equals(pwd)) {
			resultado = "Correcto";
			fallos = 0;
			
		} else {
			fallos++;
			if (fallos == 3) {
				resultado = "Cerrar";
			} else
				resultado = "Incorrecto";
		}
		miLogin.actualizar();
	}

	public String getResultado() {
		return this.resultado;
	}

}

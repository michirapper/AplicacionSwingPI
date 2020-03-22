
public class Controlador {
	private Modelo miModelo;
	private Login miLogin;
	private Bienvenida miBienvenida;
	private Registro miRegistro;
	private cambioContraseña miCambioContraseña;
	
	public void setBienvenida(Bienvenida miBienvenida) {
		this.miBienvenida = miBienvenida;
	}
	public void setRegistro(Registro miRegistro) {
		this.miRegistro = miRegistro;
	}
	public void setCambioContrasena(cambioContraseña miCambioContraseña) {
		this.miCambioContraseña = miCambioContraseña;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void setLogin(Login miLogin) {
		this.miLogin = miLogin;
	}
	public void login() {
		String usr = miLogin.getUsr();
		String pwd = miLogin.getPwd();
		miModelo.login(usr,pwd);
		
	}
	public void registro() {
		miLogin.setVisible(false);
		miRegistro.setVisible(true);
	}
	public void bienvenida() {
		miLogin.setVisible(false);
		miBienvenida.setVisible(true);
	}
	public void goLogin() {
		miRegistro.setVisible(false);	
		miLogin.setVisible(true);
	}
	public void cambiarContrasena() {
		miLogin.setVisible(false);
		miCambioContraseña.setVisible(true);		
	}
	
}

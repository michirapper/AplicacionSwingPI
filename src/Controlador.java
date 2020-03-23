
public class Controlador {
	private Modelo miModelo;
	private Login miLogin;
	private pantallaPrincipal miPantallaPrincipal;
	private Registro miRegistro;
	private cambioContrase�a miCambioContrase�a;
	private Empresa	miEmpresa;
	
	public void setpantallaPrincipal(pantallaPrincipal miPantallaPrincipal) {
		this.miPantallaPrincipal = miPantallaPrincipal;
	}
	public void setRegistro(Registro miRegistro) {
		this.miRegistro = miRegistro;
	}
	public void setEmpresa(Empresa miEmpresa) {
		this.miEmpresa = miEmpresa;
	}
	public void setCambioContrasena(cambioContrase�a miCambioContrase�a) {
		this.miCambioContrase�a = miCambioContrase�a;
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
	public void pantallaPrincipal() {
		miLogin.setVisible(false);
		miPantallaPrincipal.setVisible(true);
	}
	public void goLoginRegistro() {
		miRegistro.setVisible(false);	
		miLogin.setVisible(true);
	}
	public void cambiarContrasena() {
		miLogin.setVisible(false);
		miCambioContrase�a.setVisible(true);		
	}
	public void goLoginCambioContrasena() {
		miCambioContrase�a.setVisible(false);	
		miLogin.setVisible(true);
	}
	public void goLoginPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);	
		miLogin.setVisible(true);
		
	}
	public void goEmpresasPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);
		miEmpresa.setVisible(true);
				
	}
	public void goAlumnosEmpresa() {
		miEmpresa.setVisible(false);
		miPantallaPrincipal.setVisible(true);		
	}
	
}

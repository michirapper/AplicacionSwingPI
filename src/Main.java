
public class Main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Login miLogin = new Login();
		Registro miRegistro = new Registro();
		Bienvenida miBienvenida = new Bienvenida();		
		miControlador.setModelo(miModelo);
		miControlador.setLogin(miLogin);
		miControlador.setBienvenida(miBienvenida);
		miControlador.setRegistro(miRegistro);
		miModelo.setLogin(miLogin);
		miLogin.setControlador(miControlador);
		miLogin.setModelo(miModelo);		
		miLogin.setVisible(true);
		
	}

}

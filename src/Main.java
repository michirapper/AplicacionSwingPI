
public class Main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Login miLogin = new Login();
		Registro miRegistro = new Registro();
		pantallaPrincipal miPantallaPrincipal = new pantallaPrincipal();
		cambioContrase�a miCambioContrase�a = new cambioContrase�a();
		Empresa miEmpresa = new Empresa();
		DetalleEmpresa miDetalleEmpresa = new DetalleEmpresa();
		AsignarEmpresas miAsignarEmpresas = new AsignarEmpresas();
		miControlador.setModelo(miModelo);
		miControlador.setLogin(miLogin);
		miControlador.setpantallaPrincipal(miPantallaPrincipal);
		miControlador.setRegistro(miRegistro);
		miControlador.setCambioContrasena(miCambioContrase�a);
		miControlador.setEmpresa(miEmpresa);
		miControlador.setDetalleEmpresa(miDetalleEmpresa);
		miControlador.setAsignarEmpresas(miAsignarEmpresas);
		miModelo.setLogin(miLogin);
		miLogin.setControlador(miControlador);
		miRegistro.setControlador(miControlador);
		miCambioContrase�a.setControlador(miControlador);
		miPantallaPrincipal.setControlador(miControlador);
		miEmpresa.setControlador(miControlador);
		miDetalleEmpresa.setControlador(miControlador);
		miAsignarEmpresas.setControlador(miControlador);
		miLogin.setModelo(miModelo);
		miLogin.setVisible(true);

	}

}

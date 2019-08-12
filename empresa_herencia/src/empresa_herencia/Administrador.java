package empresa_herencia;

public class Administrador extends Persona{

	int id_administrador;

	

	public Administrador  (int id_administrador,String nombre,int dni, int edad) {
		
		super(nombre,dni,edad);

		this.id_administrador = id_administrador;
	}
	
	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}

	public void registrarAdmin() {

	}

	public boolean esMayorEdad() {

		return false;

	}

}

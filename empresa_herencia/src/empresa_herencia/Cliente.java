package empresa_herencia;

//hija

public class Cliente extends Persona{

	int id_cliente;
	
	

	public Cliente(int id_cliente, String nombre,int dni, int edad) {
		super(nombre,dni,edad);
		
		this.id_cliente = id_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public void registrarCliente() {

	}

	public boolean esMayorEdad() {
		
		return true;
	}

}

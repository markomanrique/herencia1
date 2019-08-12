package empresa_herencia;

public class Persona {
	private String nombre;
	private int dni;
	private int edad;

	public Persona(String nombre, int dni, int edad) {

		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public Persona() {

		this.nombre = "marko";
		this.dni = 2971755;
		this.edad = 21;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean esMayorEdad() {

		return true;

	}

	void imprimir() {

	

		String var = this.getClass().toString();

		String array[] = var.split("\\.");

		System.out.println("Tipo: " + array[1]);

		System.out.println("-------------");
		
		 String tipo=array[1];

		if (  tipo.equals("Administrador")) {
			
			
			System.out.println("-------------");
			System.out.println(this.getNombre());
			System.out.println(this.getDni());
			// System.out.println(this.getClass().toString());
			
			

		}

	}

}

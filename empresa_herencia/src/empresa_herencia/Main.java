package empresa_herencia;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Persona> personas =new ArrayList <Persona>();
		
		Persona c=new Cliente (1,"juan",29712,22);
		Persona d=new Administrador (2,"miguel",297122,70);
		
		
		personas.add(c);
		personas.add(d);
		
		
		System.out.println(c.getClass());
		System.out.println(d.getClass());
		
		String var = c.getClass().toString();
		
		
		String array[] =var.split("\\.");
		
		System.out.println("aqui"+array[1]);
		
		
		//personas.get(0).imprimir();
		
		//asi se imprime el list
		
		for(Persona g :personas) {
			
			
			g.imprimir();
		}
		
		
	}

}

package tareaGrupal1;

import tareaGrupal1.Persona.Status;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(34875210, "Javier", Status.LICENCIA);
				
		Casino c1 = new Casino("Casino Royal", p1);
		System.out.println(c1);
	}
}

package tareaGrupal1;

import java.util.LinkedList;

import tareaGrupal1.Persona.Status;
import tareaGrupal1.Slot.tipoJuegoSlot;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(34875210, "Javier", Status.ACTIVO);
		
		Mesa m1 = new Mesa("Domino", 2.2, 2, 4);
		Mesa m2 = new Mesa("Damas", 3.3, 2, 2);
		Slot s1 = new Slot("Traga monedas", tipoJuegoSlot.BOTONES);
		Slot s2 = new Slot("Atari", tipoJuegoSlot.PALANCA);
				
		Casino c1 = Casino.getInstancia();
		c1.setNombreCasino("Casino Royal");
		c1.setResponsableCasino(p1);
		c1.setJuegos(m1);
		c1.setJuegos(m2);
		c1.setJuegos(s1);
		c1.setJuegos(s2);
		
		System.out.println(c1);
					
		System.out.println(c1.toString()+" "+m1.toString()+"\n"+m2.toString()+"\n"+s1.toString()+"\n"+s2.toString()+"\n");
			
	}
}

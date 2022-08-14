package tareaGrupal1;

import tareaGrupal1.Slot.tipoJuegoSlot;

public class Slot extends Juego{

	public enum tipoJuegoSlot {
		PALANCA, BOTONES;
	}	
	
	public Slot(String nombreJuego, tipoJuegoSlot tipo) {
		super(nombreJuego);
		
	}

	@Override
	public String toString() {
		return getNombreJuego();
	}
	
}

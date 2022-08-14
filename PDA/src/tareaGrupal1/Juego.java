package tareaGrupal1;

public class Juego {
	private String nombreJuego;

	public Juego(String nombreJuego) {
		super();
		this.nombreJuego = nombreJuego;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	@Override
	public String toString() {
		return nombreJuego;
	}	

}

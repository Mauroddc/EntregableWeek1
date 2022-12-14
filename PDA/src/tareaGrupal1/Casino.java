package tareaGrupal1;

public class Casino {
	
	private static Casino instancia = new Casino();
	private String nombreCasino; 
	private Persona responsableCasino;
	private Juego juegos;
		
	public Casino() {
	}
	
	public Casino(String nombreCasino, Persona responsableCasino) {
		//super();
		this.nombreCasino = nombreCasino;
		this.responsableCasino = responsableCasino;
	}

	public String getNombreCasino() {
		return nombreCasino;
	}

	public void setNombreCasino(String nombreCasino) {
		this.nombreCasino = nombreCasino;
	}

	public Persona getResponsableCasino() {
		return responsableCasino;
	}

	public void setResponsableCasino(Persona responsableCasino) {
		this.responsableCasino = responsableCasino;
	}

	public static Casino getInstancia() {
		return instancia;
	}
	
	public Juego getJuegos() {
		return juegos;
	}

	public void setJuegos(Juego juegos) {
		this.juegos = juegos;
	}

	@Override
	public String toString() {
		return "Casino: " + nombreCasino + ", responsable: " + responsableCasino +"\n" + "Juegos del casino: " 
				+ juegos;
	}


		
}

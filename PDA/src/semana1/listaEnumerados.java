package semana1;

public enum listaEnumerados {
	
	//Por convencion, primero se definen las constantes antes que los metodos
	LUNES("Lunes", 1), MARTES("Martes", 2), MIERCOLES("Miercoles", 3), 
	JUEVES("Jueves", 4), VIERNES("Viernes", 5), SABADO("Sabado", 6), DOMINGO("Domingo", 7);
	
	private String nombreDia;
	private int posicionDia;
	
	//constructor para asignar valores, de acceso private o package
	private listaEnumerados(String nombreDia, int posicionDia) {
		this.nombreDia = nombreDia;
		this.posicionDia = posicionDia;
	}
	public String getNombreDia() {
		return nombreDia;
	}
	public int getPosicionDia() {
		return posicionDia;
	}
	
}

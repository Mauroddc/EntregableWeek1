package tareaGrupal1;

public class Mesa extends Juego {

	public Mesa(String nombreJuego) {
		super(nombreJuego);
		// TODO Auto-generated constructor stub
	}
	private double metrosCuadrados;
	private int cantidadMax;
	private int cantidadMin;
	

	public Mesa(String nombreJuego, double metrosCuadrados, int cantidadMax, int cantidadMin) {
		super(nombreJuego);
		this.metrosCuadrados = metrosCuadrados;
		this.cantidadMax = cantidadMax;
		this.cantidadMin = cantidadMin;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public int getCantidadMax() {
		return cantidadMax;
	}
	public void setCantidadMax(int cantidadMax) {
		this.cantidadMax = cantidadMax;
	}
	public int getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(int cantidadMin) {
		this.cantidadMin = cantidadMin;
	}
	@Override
	public String toString() {
		return "Mesa [metrosCuadrados=" + metrosCuadrados + ", cantidadMax=" + cantidadMax + ", cantidadMin="
				+ cantidadMin + "]";
	}
	
}

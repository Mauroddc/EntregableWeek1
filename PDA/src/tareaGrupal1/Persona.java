package tareaGrupal1;

public class Persona {
	private int cedula;
	private String nombre;
	private Status status;
	
	public enum Status{ACTIVO("activo"), INACTIVO("Inactivo"), LICENCIA("Licencia");

	private Status(String nombre) {
		
	}}
	
	public Status getStatus() {
		return status;
	}
	public Persona(int cedula, String nombre, Status s1) {
		//super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.status=s1;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return nombre + ", "+cedula+ ", Status: "+status;
	};
}

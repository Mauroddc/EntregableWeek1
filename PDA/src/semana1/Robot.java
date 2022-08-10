package semana1;

public class Robot {
	
	//Creo la primer y unica instancia de Robot()
	private static Robot instancia=new Robot();
	private String nombreRobot;
	private byte cantidadVidasRobot;
	
	//Constructor privado
	private Robot() {	
	}
	
	public static Robot getInstancia() {
		return instancia;
	}
	
	public String getNombreRobot() {
		return nombreRobot;
	}
	
	public void setNombreRobot(String nombreRobot) {
		this.nombreRobot = nombreRobot;
	}
	
	public byte getCantidadVidasRobot() {
		return cantidadVidasRobot;
	}
	
	public void setCantidadVidasRobot(byte cantidadVidasRobot) {
		this.cantidadVidasRobot = cantidadVidasRobot;
	}
	
	@Override
	public String toString() {
		return "El Robot "+this.nombreRobot+" tiene: "+ this.cantidadVidasRobot +" de cantidad de vidas";
	}

}

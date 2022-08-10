package semana1;

import semana1.*;
import semana1.Robot;

public class Principal {

	public static void main(String[] args) {
		
		//Invoco la instancia generada en la clase Robot
		Robot robot1 = Robot.getInstancia();
		robot1.setNombreRobot("Mr. Robot");
		robot1.setCantidadVidasRobot((byte) 4);
		
		Robot robot2 = Robot.getInstancia();
		System.out.println(robot2);
		
		robot2.setCantidadVidasRobot((byte)10);
		System.out.println("------------------------");
		System.out.println(robot1);
		System.out.println(robot2);
	}

}

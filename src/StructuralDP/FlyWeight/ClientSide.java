package StructuralDP.FlyWeight;

public class ClientSide {
	public static void main(String[] args) {

		Robot r1 = RobotFactory.createRobot("HumanRobot");
		r1.display(1,2);
		r1.display(2, 3);

		Robot r2 = RobotFactory.createRobot("BirdRobot");
		r2.display(2,2);


	}
}

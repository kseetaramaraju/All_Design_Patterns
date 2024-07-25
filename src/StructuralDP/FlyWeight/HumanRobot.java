package StructuralDP.FlyWeight;

public class HumanRobot implements Robot {

	String type;
	public HumanRobot(String type) {
		super();
		this.type = type;
	}
	@Override
	public void display(int x, int y)
	{
		System.out.println(type+" Robot is displayed in "+x+" , "+y +" Co-Ordinates ");
	}

}

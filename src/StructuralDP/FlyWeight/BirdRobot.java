
package StructuralDP.FlyWeight;

public class BirdRobot implements Robot {

	String type;
	public BirdRobot(String type) {
		super();
		this.type = type;
	}
	@Override
	public void display(int x, int y)
	{
		System.out.println(type+" Robot is displayed in "+x+" , "+y +" Co-Ordinates ");
	}

}

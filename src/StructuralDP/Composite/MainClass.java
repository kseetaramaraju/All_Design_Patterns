package StructuralDP.Composite;

public class MainClass {
	public static void main(String[] args) 
	{

		Leaf cpu=new Leaf(2000,"CPU");
		Leaf ram=new Leaf(4000,"RAM");

		Composite motherBoard=new Composite(" MotherBoard ");
		motherBoard.addComponet(cpu);
		motherBoard.addComponet(ram);

		Leaf hardDisk=new Leaf(1000," HardDisk ");

		Composite cabinet=new Composite(" Cabinet ");
		cabinet.addComponet(hardDisk);
		cabinet.addComponet(motherBoard);

		Leaf mouse=new Leaf(500," MOUSE ");
		Leaf keyboard=new Leaf(800," KeyBoard ");

		Composite peripheral=new Composite(" Peripheral ");
		peripheral.addComponet(mouse);
		peripheral.addComponet(keyboard);

		Composite computer=new Composite(" Computer ");
		computer.addComponet(cabinet);
		computer.addComponet(peripheral);

		
		computer.showPrice();


	}

}

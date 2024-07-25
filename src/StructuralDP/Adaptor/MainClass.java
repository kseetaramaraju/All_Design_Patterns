package StructuralDP.Adaptor;

public class MainClass {
	public static void main(String[] args) {

		WeightMachineAdaptor a=new WeightMachineAdaptorImpl(new WeightMachineImpl());
		System.out.println(a.getWeightInKgs());
	}
}

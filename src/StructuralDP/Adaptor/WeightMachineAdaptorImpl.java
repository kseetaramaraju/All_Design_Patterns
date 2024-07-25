package StructuralDP.Adaptor;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor {


	private WeightMachine machine;

	public WeightMachineAdaptorImpl(WeightMachine machine) {
		this.machine = machine;
	}

	@Override
	public double getWeightInKgs() {
		return machine.getWeightInPounds()*0.45;
	}

}

package StructuralDP.Bridge;

public class Netflix extends Video{

	public Netflix(VideoProcessor processor) {
		super(processor);
	}

	@Override
	void play(String filename) 
	{
		processor.process(filename);
	}

}

package StructuralDP.Bridge;

public class Youtube extends Video{

	public Youtube(VideoProcessor processor)
	{
		super(processor);
	}

	@Override
	void play(String filename)
	{
		processor.process(filename);
	}

}

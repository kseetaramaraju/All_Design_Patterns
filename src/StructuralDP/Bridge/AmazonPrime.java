package StructuralDP.Bridge;

public class AmazonPrime extends Video {

	public AmazonPrime(VideoProcessor processor) {
		super(processor);
	}

	@Override
	void play(String filename) {
		processor.process(filename);	
	}

}

package StructuralDP.Bridge;

public abstract class Video {

	protected VideoProcessor processor;

	public Video(VideoProcessor processor) {
		super();
		this.processor = processor;
	}

	abstract void play(String filename);

}

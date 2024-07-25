package Behavioral_DP._Template;

public abstract class  Game {

	public abstract void initialize();

	public abstract void startPlaying();

	public abstract void endPlaying();

	public final void play()
	{
		initialize();

		startPlaying();

		endPlaying();
	}

}

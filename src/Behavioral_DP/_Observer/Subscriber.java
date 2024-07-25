package Behavioral_DP._Observer;

public class Subscriber {

	private String name;
	private Channel channel=new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel ch) {
		channel = ch;
	}

	public void update()
	{
		System.out.println("Hey !! "+name+" , "+channel.videoTitle+" Video Uploaded !! ");
	}


}

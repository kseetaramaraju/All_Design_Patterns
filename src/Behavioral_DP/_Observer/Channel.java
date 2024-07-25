package Behavioral_DP._Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private String name;
	private List<Subscriber> subs=new ArrayList<Subscriber>();
	String videoTitle;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public void subscribe(Subscriber subscriber)
	{
		subs.add(subscriber);
	}

	public void Un_subscribe(Subscriber subscriber)
	{
		subs.remove(subscriber);
	}

	public void uploadVideo(String videoTitle)
	{
		this.videoTitle=videoTitle;
		notify_Subscriber();
	}

	public void notify_Subscriber()
	{
		for(Subscriber subscriber:subs)
		{
			subscriber.update();
		}
	}


}

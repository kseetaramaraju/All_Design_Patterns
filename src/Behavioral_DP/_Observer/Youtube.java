package Behavioral_DP._Observer;

public class Youtube {
	public static void main(String[] args) {

		Channel c1=new Channel();
		c1.setName(" Telusuko Channel ");

		Subscriber s1=new Subscriber("raju");
		Subscriber s2=new Subscriber("shiva");
		Subscriber s3=new Subscriber("suresh");
		Subscriber s4=new Subscriber("ramesh");
		Subscriber s5=new Subscriber("yogesh");

		c1.subscribe(s1);
		c1.subscribe(s2);
		c1.subscribe(s3);
		c1.subscribe(s4);
		c1.subscribe(s5);

		s1.setChannel(c1);
		s2.setChannel(c1);
		s3.setChannel(c1);
		s4.setChannel(c1);
		s5.setChannel(c1);

		c1.setVideoTitle(" Java OOPs ");
		c1.notify_Subscriber();

		System.out.println("-----------");

		c1.Un_subscribe(s5);
		c1.setVideoTitle(" SQL Course ");
		c1.notify_Subscriber();

	}
}

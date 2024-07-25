package StructuralDP.Bridge;

public class MainClass {
	public static void main(String[] args) {

		Video v = new Youtube(new HD8KProcessor());
		v.play(" Bahubali Conclusion ");

		Video v1 = new AmazonPrime(new HD4KProcessor());
		v1.play(" KalKi 2868 AD Movie ");


		Video v2 = new Netflix(new HDProcessor());
		v2.play(" Kantara Movie ");



	}
}

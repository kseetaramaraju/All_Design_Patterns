package Behavioral_DP._Iterator;

public class Customer {

	private int cId;
	private String cName;
	public Customer(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + "]";
	}

}

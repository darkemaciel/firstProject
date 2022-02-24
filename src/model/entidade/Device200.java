package model.entidade;

public abstract class Device200 {

	private String serialNumber;

	public Device200(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processDoc(String doc);
}

package model.entidade;

public class ConcreteScanner200 extends Device200 implements Scanner200 {
	
	public ConcreteScanner200(String serialNumber) {
		super(serialNumber);
	}
	
	public String scan() {
		return "Scanned contend";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
}

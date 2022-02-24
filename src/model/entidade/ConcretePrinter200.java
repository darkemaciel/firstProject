package model.entidade;

public class ConcretePrinter200 extends Device200 implements Printer200 {

	public ConcretePrinter200(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}

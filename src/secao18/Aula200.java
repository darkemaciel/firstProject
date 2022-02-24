package secao18;

import model.entidade.ComboDevice;
import model.entidade.ConcretePrinter200;
import model.entidade.ConcreteScanner200;

public class Aula200 {

	public static void main(String[] args) {

	ConcretePrinter200 p = new ConcretePrinter200("1080");
	p.processDoc("My letter");
	p.print("My letter");
	
	System.out.println();
	ConcreteScanner200 s = new ConcreteScanner200("2003");
	s.processDoc("My email");
	System.out.println("Scan result: " + s.scan());
	
	System.out.println();
	ComboDevice c = new ComboDevice("2081");
	c.processDoc("My dissertation");
	c.print("My dissertation");
	System.out.println("Scan result: " + c.scan());
	
	}

}

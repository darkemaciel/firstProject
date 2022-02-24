package secao18;

import model.entidade.AbstractShape199;
import model.entidade.Circle;
import model.entidade.Rectangle;
import model.entidade.Shape199;
import model.enums.Color;

public class Aula199 {

	public static void main(String[] args) {

	AbstractShape199 s1 = new Circle(Color.BLACK, 2.0);
	AbstractShape199 s2 = new Rectangle(Color.BLACK, 3.0, 4.0);
	
	System.out.println("Circle color: " + s1.getColor());
	System.out.println("Circle area: " + String.format("%.2f" ,s1.area()));
	System.out.println("Rectangle color: " + s2.getColor());
	System.out.println("Rectangle area: " + String.format("%.2f" ,s2.area()));
	
	
	}

}

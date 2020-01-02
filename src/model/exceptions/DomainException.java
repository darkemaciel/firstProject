package model.exceptions;

// Exception, o compilador obriga a tratar a exce��o no c�digo fonte
// RunTimeException, o compilador n�o obriga a tratar, posso tirar o throws DomainException da classe Reserva

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}

}

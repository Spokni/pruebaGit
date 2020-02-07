package PruebaGit;

public class Operaciones {
	
	private int OperadorA;
	private int OperadorB;
	
	public Operaciones(int OperadorA, int OperadorB) {
		super();
		this.OperadorA = OperadorA;
		this.OperadorB = OperadorB;
	}
	
	public int getOperadorA() {
		return OperadorA;
	}
	public void setOperadorA(int operadorA) {
		OperadorA = operadorA;
	}
	public int getOperadorB() {
		return OperadorB;
	}
	public void setOperadorB(int operadorB) {
		OperadorB = operadorB;
	}
	
	public int Suma() {
		return OperadorA + OperadorB;
	}
	
	public int Resta() {
		return OperadorA - OperadorB;
	}
	

}

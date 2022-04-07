package sk.train;

public class Arithmetic {
	
	private Arithmetic() {
		super();
	}
	
	static public double add(double op1, double op2) {
		return op1 + op2;
	}
	
	static public int fakultaet(int n) {
		int erg = 1;
		for (int i=2; i <= n; ++i) {
			erg = erg * i;
			//System.out.println(erg);
		}
		
		return erg;
	}

}

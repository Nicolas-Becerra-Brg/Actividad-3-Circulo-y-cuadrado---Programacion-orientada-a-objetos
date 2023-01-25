package actividad_cuadro_circulo;

public class Circulo {

	public  double ac;
	public double circ;
	public double x;
	
	
	public Circulo() {
		this(175513);
	}
	
public Circulo(double x) {
			this.x = x;
	}

	public double circunferencia () {
		
		circ = 2*3.14146*x;
		return circ;
	}
	
	public double area () {
		ac = Math.pow(3.1416*x, 2);
		return ac;
		
	}
		//a = Math.pow(3.1416*radio, 2);
		//circ = 2*3.14146*radio;
	
	
}

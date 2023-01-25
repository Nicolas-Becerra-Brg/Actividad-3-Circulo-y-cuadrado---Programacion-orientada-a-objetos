package actividad_cuadro_circulo;

public class Cuadrado {
	
	public double lado;
	public  double diag;
	public double peri;
	public double a;
	public double x;
	//ID == 175513, lado = ID, diag = (math.sqrt(math.pow(175513) + math.pow(175513))), peri = (lado*4), a = lado*lado;
	
	
public Cuadrado() {
		this(175513);
	}
	
public Cuadrado(double x) {
			this.x = x;
	}

	public double diagonal () {
		
		diag = Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2));
		return diag;
	}
	
	public double perimetro() {
		peri = x*4;
		return peri;
	}

	public double area () {
		a = Math.pow(x, 2);
		return a;
	}
	
}		

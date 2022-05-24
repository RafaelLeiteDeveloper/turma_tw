package exercicio;

public class Triangulo extends Figura {
	
	public Triangulo() {}
	
	public Triangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public void calcularArea() {
		
		double area = (this.base * this.altura) / 2;
		
		System.out.println("A area do triangulo é de " + area);
		
	}


}

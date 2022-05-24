package exercicio;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(10,20);
		Quadrado quadrado = new Quadrado(50,50);
				
		triangulo.calcularArea();
		quadrado.calcularArea();

	}

}

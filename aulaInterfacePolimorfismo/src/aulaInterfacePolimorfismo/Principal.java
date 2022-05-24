package aulaInterfacePolimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		boolean retoroCachorro = cachorro.animalSaudavel("Tudo mal");
		
		boolean retornoGato = gato.animalSaudavel("Patinha ferida");
		
		System.out.println(retoroCachorro);
		System.out.println(retornoGato);


	}

}

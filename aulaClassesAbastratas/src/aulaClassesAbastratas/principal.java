package aulaClassesAbastratas;

public class principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.racaAnimal("Pastor Alemão");
		cachorro.nome = "toto";
		
		Gato gato = new Gato();
		gato.racaAnimal("Siames");

	}

}

package aulaInterfacePolimorfismo;

public class Cachorro implements Saudavel {

	@Override
	public boolean animalSaudavel(String diagnostico) {
		// LOGICA UTILIZANDO O PARAMETRO
		
		if(diagnostico.equalsIgnoreCase("Tudo bem"))
			return true;

		return false;
		
		
	}

}

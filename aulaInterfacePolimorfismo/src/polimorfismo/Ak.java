package polimorfismo;

public class Ak extends Arma {
	
	@Override
	public void recarregarArma(){
		
		this.quantidadeDeMunicao = 30;
		System.out.println("Recarregando arma AK quantidade " + this.quantidadeDeMunicao);
		
	}

}

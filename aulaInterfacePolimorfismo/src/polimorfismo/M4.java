package polimorfismo;

public class M4 extends Arma {
	
	@Override
	public void recarregarArma(){
		
		this.quantidadeDeMunicao = 25;
		System.out.println("Recarregando arma M4 quantidade " + this.quantidadeDeMunicao);
		
	}

}

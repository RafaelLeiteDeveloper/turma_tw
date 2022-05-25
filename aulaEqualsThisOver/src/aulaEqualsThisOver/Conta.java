package aulaEqualsThisOver;

import java.util.Objects;

public class Conta {

	private Integer numeroConta;
	private Integer agencia;
	
	public Conta() {}
	
	public Conta(Integer numeroConta, Integer agencia) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(agencia, numeroConta);
	}

	@Override
	public boolean equals(Object obj){
		
		if(obj != null && obj instanceof Conta) {
			
			return (getNumeroConta().equals(((Conta) obj).getNumeroConta()) &&
					getAgencia().equals(((Conta) obj).getAgencia()));
			
		} else {
			return false;
		}
		
	}

	
	@Override
	public String toString() {
		return "numeroConta " + numeroConta + "agencia " + agencia;
	}
	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	


}


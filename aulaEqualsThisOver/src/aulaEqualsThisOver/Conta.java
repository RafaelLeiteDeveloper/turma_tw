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
	public String toString() {
		return "numeroConta " + numeroConta + "agencia " + agencia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(agencia, numeroConta);
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

package notificacao;

import model.Cliente;

public class NotificadorZap implements Notificador {
	
	@Override
	public void notificar(Cliente cliente) {
		System.out.println("Notificando cliente por zap, nome cliente " + cliente.getNome());
	}

}

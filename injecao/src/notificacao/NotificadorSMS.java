package notificacao;

import model.Cliente;

public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente) {
		System.out.println("Notificando cliente por sms, nome cliente " + cliente.getNome());
	}

}

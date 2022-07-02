package notificacao;

import model.Cliente;

public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente) {
		System.out.println("Notificando cliente por email, nome cliente " + cliente.getNome());
	}

}

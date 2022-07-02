package service;

import model.Cliente;
import notificacao.NotificadorEmail;

public class EmicaoNotaFiscal {
	
	private NotificadorEmail notificador;
	
	public EmicaoNotaFiscal(NotificadorEmail notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente) {
		// TODO emitir nota fiscal
	
		this.notificador.notificar(cliente);
	}

}

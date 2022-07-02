package injecao;

import model.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;
import notificacao.NotificadorZap;
import service.AtivacaoClienteService;

public class main {

	public static void main(String[] args) {
		System.out.println("injecao");
		
		Cliente cliente = new Cliente("Rafael", false);
		Notificador notificador = new NotificadorZap();
		
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		
		ativacaoClienteService.ativar(cliente);
		
		

	}

}

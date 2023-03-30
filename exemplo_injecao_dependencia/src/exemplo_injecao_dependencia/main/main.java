package exemplo_injecao_dependencia.main;

import exemplo_injecao_dependencia.Cliente;
import exemplo_injecao_dependencia.noteficacao.Notificacao;
import exemplo_injecao_dependencia.noteficacao.NotificacaoCliente;
import exemplo_injecao_dependencia.noteficacao.NotificacaoSMS;
import exemplo_injecao_dependencia.service.AtivacaoClienteService;

public class main {
	
	public static void main(String[] args) {
		
		Cliente Gabriel = new Cliente("Gabriel", "lopes@gmail.com", false, "61991139141");
		Cliente Maria = new Cliente("Maria", "maria@gmail.com", false, "61992014156");
		
		Notificacao notificador = new NotificacaoCliente();
		
		AtivacaoClienteService ativar = new AtivacaoClienteService(notificador);

		ativar.ativar(Maria);
		ativar.ativar(Gabriel);
		
	}
	
}

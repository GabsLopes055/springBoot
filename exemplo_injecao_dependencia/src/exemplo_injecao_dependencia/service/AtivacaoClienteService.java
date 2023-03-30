package exemplo_injecao_dependencia.service;

import exemplo_injecao_dependencia.Cliente;
import exemplo_injecao_dependencia.noteficacao.Notificacao;


public class AtivacaoClienteService {

	
	private Notificacao notificacao;
	
	public AtivacaoClienteService(Notificacao notificador) {
		this.notificacao = notificador;
	};
	
	public void ativar(Cliente cliente) {
		cliente.ativar();		
		this.notificacao.notificar(cliente, "Seu cadastro esta ativo !");
	}
	
}

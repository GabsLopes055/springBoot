package exemplo_injecao_dependencia.noteficacao;

import exemplo_injecao_dependencia.Cliente;

public class NotificacaoSMS implements Notificacao {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando usuário: %s. Atraves do numero: %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
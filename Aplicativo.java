package tailanbarrosmorita;

public class Aplicativo {
	private Usuario usuario;
	private Fatura fatura;
	
	
	
	

	public Aplicativo(String nome, String cpf, String senha) {
		usuario = new Usuario(cpf, nome, senha);
		fatura = new Fatura();
	}
	
	
	public void comprarItem(String cpf, String senha, Integer iCodigo, Integer iValor, String iNome, String iDataAquisicao) {
		
		if (usuario.login(cpf,senha)) {
			
			if (fatura.getLimite() >= iValor) {
				
				fatura.adicionarItem(iCodigo,iValor,iNome,iDataAquisicao);
				return;
				
			} else {
				System.out.println("valor do limite da fatura ultrapassado");
			}
			
			
			
		} else {
			System.out.println("cpf ou senha incorretos");
		}
		
	
	}

	public void consultarFatura(String cpf, String senha) {
		if (usuario.login(cpf,senha)) {
			System.out.println("valor total da fatura: " + fatura.getValorTotal() +";00RS");
			System.out.println("limite da fatura: " + fatura.getLimite() +";00RS");
			fatura.imprimirItems();
		} else {
			System.out.println("erro ao efetuar login");
		}
		
	}

	public void pagarFatura(String cpf, String senha, Integer valor) {
		if (usuario.login(cpf,senha)) {
			if (fatura.getValorTotal().equals(valor)) {
				fatura.limparFatura();
				System.out.println("fatura paga");
			} else {
				System.out.println("valor inadequado");
			}
		} else {
			System.out.println("erro ao efetuar login");
		}
	}
	
	public void solicitarAumentoLimite(String cpf, String senha, Integer valorSolicitado) {
		if (usuario.login(cpf,senha)) {
			fatura.aumentarLimite(valorSolicitado);
		} else {
			System.out.println("erro ao efetuar login");
		}
	}
	
	public void alterarSenha(String cpf, String senha, String novaSenha) {	
		if (usuario.login(cpf,senha)) {
			usuario.alterarSenha(novaSenha);
		} else {
			System.out.println("erro ao efetuar login");
		}
	}
}

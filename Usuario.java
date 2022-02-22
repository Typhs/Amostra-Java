package tailanbarrosmorita;

public class Usuario {
	private String cpf, nome, senha;

	public Usuario(String cpf, String nome, String senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}

	public void alterarSenha(String novaSenha) {
		senha = novaSenha;
		System.out.println("senha alterada com sucesso");
	}
		
	public boolean login(String lCpf, String lSenha) {
		if (lCpf == cpf && lSenha == senha) {
			return true;
		} else {
			return false;
		} 
	}
	
	
	
}

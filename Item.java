package tailanbarrosmorita;

public class Item {
	private Integer codigo, valor;
	private String nome, dataAquisicao;
	
	
	public Item(Integer codigo, Integer valor, String nome, String dataAquisicao) {
		this.codigo = codigo;
		this.valor = valor;
		this.nome = nome;
		this.dataAquisicao = dataAquisicao;
	}

	
	public String toString() {
		return "Item [codigo=" + codigo + ", valor=" + valor + ", nome=" + nome + ", dataAquisicao=" + dataAquisicao
				+ "]";
	}
	
	
}

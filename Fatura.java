package tailanbarrosmorita;

public class Fatura {
	private Integer limite, valorTotal;
	private Item[] item;

	public Fatura() {
		limite = 3000;
		item = new Item[10];
		valorTotal = 0;
	}
	
	public void adicionarItem(Integer iCodigo, Integer iValor, String iNome, String iDataAquisicao) {
		
		valorTotal = valorTotal + iValor;
		limite = limite - iValor;
		
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				item[i] = new Item(iCodigo,iValor,iNome,iDataAquisicao);
				System.out.println("item adicionado");
				return;
			}
		}
		System.out.println("não há espaço para adicionar um item");
	}

	public void limparFatura() {
		limite = limite + valorTotal;//isso reseta o limite ao original... eu acho
		valorTotal = 0;
		
		for (int i = 0; i < item.length; i++) {
			item[i] = null;
		}
	}
	
	public void imprimirItems() {
		for (int i = 0; i < item.length; i++) {
			if (item[i] != null) {
				System.out.println("item " + (i+1) + " : " + item[i].toString());
			}
		}
	}
	
	public void aumentarLimite(Integer valorSolicitado) {
		if (valorSolicitado > limite + valorTotal) {
			limite = valorSolicitado - valorTotal;
			System.out.println("limite alterado com sucesso");
		} else {
			System.out.println("valor solicitado é inválido");
		}
	}
	
	
	public Integer getLimite() {
		return limite;
	}


	public Integer getValorTotal() {
		return valorTotal;
	}

	
	
	
}

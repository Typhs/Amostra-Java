package tailanbarrosmorita;

public class test {
	public static void main(String[] args) {
		
		
		Aplicativo aplicativo = new Aplicativo("PrimeiroNome Sobrenome", "17220559950","senhaLegal");
		
		
		aplicativo.consultarFatura("17220559950","senhaLegal");
		
		aplicativo.comprarItem("17220559950", "senhaLegal", 20, 5000, "armário", "05/11/2009");// valor extrapola limite
		
		aplicativo.consultarFatura("17220559951","senhaLegal"); //cpf errado
		aplicativo.consultarFatura("17220559950","senhaRuim"); //senha errada
		
		aplicativo.consultarFatura("17220559950","senhaLegal");
	
		aplicativo.comprarItem("17220559950", "senhaLegal", 20, 500, "armário", "05/11/2009");
		
		aplicativo.consultarFatura("17220559950","senhaLegal");
		
		aplicativo.pagarFatura("17220559950","senhaLegal", 501); //valor inadequado
		
		aplicativo.consultarFatura("17220559950","senhaLegal");
		
		aplicativo.pagarFatura("17220559950","senhaLegal", 500);	
		
		aplicativo.solicitarAumentoLimite("17220559950","senhaLegal", 4000);
		
		aplicativo.consultarFatura("17220559950","senhaLegal");
		
		aplicativo.alterarSenha("17220559950","senhaLegal", "senhaNova");
		
		aplicativo.consultarFatura("17220559950","senhaNova");
		
	}
}

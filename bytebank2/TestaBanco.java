package bytebank2;

public class TestaBanco {
	public static void main(String[] args) {
		
	
		Cliente diego = new Cliente();
		diego.nome = "diego fuchs";
		diego.cpf = "222.222.222-22";
		diego.profissao = "estudande";
	
		Conta contaDoDiego = new Conta();
		contaDoDiego.deposita(100);
		
	
	}
} 

public class TestMetodo {

	public static void main(String[] args) {
		Conta contaDoFernando = new Conta();
		contaDoFernando.saldo = 100;
		contaDoFernando.deposita(50);
		System.out.println(contaDoFernando.saldo);
		boolean conseguiuRetirar  = contaDoFernando.saca(20);
		System.out.println(contaDoFernando.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoFernando);
		
		System.out.println(contaDaMarcela.saldo);

	}

}

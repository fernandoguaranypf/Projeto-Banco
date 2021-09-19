
public class TestMetodo {

	public static void main(String[] args) {
		Conta contaDoFernando = new Conta();
		contaDoFernando.saldo = 100;
		contaDoFernando.deposita(50);
		System.out.println(contaDoFernando.saldo);
		boolean conseguiuRetirar  = contaDoFernando.saca(20);
		System.out.println(contaDoFernando.saldo);

	}

}

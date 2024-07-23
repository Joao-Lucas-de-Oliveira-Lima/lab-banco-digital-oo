
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		CartaoDebito cartaoDebito = new CartaoDebito("1111-1111-1111-1111", venilton, cc);
        CartaoCredito cartaoCredito = new CartaoCredito("2222-2222-2222-2222", venilton, cc, 1000);

        venilton.adicionarCartao(cartaoDebito);
        venilton.adicionarCartao(cartaoCredito);

        venilton.realizarPagamento("1111-1111-1111-1111", 200); 
        venilton.realizarPagamento("1111-1111-1111-1111", 900); 

        venilton.realizarPagamento("2222-2222-2222-2222", 300); 
        venilton.realizarPagamento("2222-2222-2222-2222", 800); 

        venilton.realizarPagamento("2222-2222-2222-2222", 200); 
	}

}

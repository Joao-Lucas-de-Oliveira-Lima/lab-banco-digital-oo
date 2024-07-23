public class CartaoDebito extends Cartao {

    public CartaoDebito(String numero, Cliente cliente, Conta conta) {
        super(numero, cliente, conta);
    }

    @Override
    public void pagar(double valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente na conta.");
        } else {
            conta.sacar(valor);
            System.out.println("Pagamento realizado com sucesso. Saldo atual: " + conta.getSaldo());
        }
    }
}
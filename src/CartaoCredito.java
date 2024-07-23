public class CartaoCredito extends Cartao {
    private double limite;
    private double saldoDevedor;

    public CartaoCredito(String numero, Cliente cliente, Conta conta, double limite) {
        super(numero, cliente, conta);
        this.limite = limite;
        this.saldoDevedor = 0;
    }

    @Override
    public void pagar(double valor) {
        if (saldoDevedor + valor > limite) {
            System.out.println("Limite de crédito excedido.");
        } else {
            saldoDevedor += valor;
            System.out.println("Pagamento realizado com sucesso. Saldo devedor: " + saldoDevedor);
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}
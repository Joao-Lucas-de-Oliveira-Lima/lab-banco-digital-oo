public abstract class Cartao {
    protected String numero;
    protected Cliente cliente;
    protected Conta conta;

    public Cartao(String numero, Cliente cliente, Conta conta) {
        this.numero = numero;
        this.cliente = cliente;
        this.conta = conta;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public abstract void pagar(double valor);
}
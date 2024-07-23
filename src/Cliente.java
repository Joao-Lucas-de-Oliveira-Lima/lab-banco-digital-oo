import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cliente {
    private String nome;
    private List<Cartao> cartoes;

	public Cliente(String nome){
		this.nome = nome;
		this.cartoes = new ArrayList<>();
	}

    public Cliente() {
        this.cartoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void adicionarCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }

    public void realizarPagamento(String numeroCartao, double valor) {
		Optional<Cartao> cartaoParaPagamento = cartoes.stream()
			.filter(cartao -> cartao.getNumero().equals(numeroCartao))
			.findFirst();

		cartaoParaPagamento.ifPresentOrElse(
			cartao -> cartao.pagar(valor),
			() -> {System.out.println("Cartão não encontrado");}
		);
    }
}
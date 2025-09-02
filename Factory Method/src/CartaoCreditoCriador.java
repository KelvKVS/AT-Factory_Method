public class CartaoCreditoCriador implements CriadorPagamento {
    @Override
    public Pagamento criarPagamento() {
        System.out.println("[FÁBRICA] Criando instância de CartaoCreditoPagamento...");
        return new CartaoCreditoPagamento();
    }
}
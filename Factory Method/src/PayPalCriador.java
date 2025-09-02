public class PayPalCriador implements CriadorPagamento{
    @Override
    public Pagamento criarPagamento() {
        System.out.println("[FÁBRICA] Criando instância de PayPalPagamento...");
        return new PayPalPagamento();
    }
}

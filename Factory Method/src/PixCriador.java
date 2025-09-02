public class PixCriador implements CriadorPagamento {
    @Override
    public Pagamento criarPagamento() {
        System.out.println("[FÁBRICA] Criando instância de PixPagamento...");
        return new PixPagamento();
    }
}

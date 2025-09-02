public class BoletoCriador implements CriadorPagamento {
    @Override
    public Pagamento criarPagamento() {
        System.out.println("[FÁBRICA] Criando instância de BoletoPagamento...");
        return new BoletoPagamento();
    }
}
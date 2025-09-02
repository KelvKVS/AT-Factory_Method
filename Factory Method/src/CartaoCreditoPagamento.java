public class CartaoCreditoPagamento implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        // Simula o processamento específico do cartão de crédito
        System.out.println("=== PAGAMENTO COM CARTÃO DE CRÉDITO ===");
        System.out.println("Validando dados do cartão...");
        System.out.println("Conectando com operadora...");
        System.out.println("Processando pagamento de R$ " + valor);
        System.out.println("Pagamento com cartão aprovado!");
        System.out.println("==========================================");
    }
}
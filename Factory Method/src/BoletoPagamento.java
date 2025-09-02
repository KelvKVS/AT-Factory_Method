public class BoletoPagamento implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("=== PAGAMENTO COM BOLETO BANCÁRIO ===");
        System.out.println("Gerando código de barras...");
        System.out.println("Código: 34191.79001 01043.510047 91020.150008 4 83950000012345");
        System.out.println("Definindo data de vencimento...");
        System.out.println("Valor do boleto: R$ " + valor);
        System.out.println("Boleto gerado com sucesso!");
        System.out.println("Aguardando pagamento em até 3 dias úteis.");
        System.out.println("======================================");
    }
}
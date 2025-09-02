public class PayPalPagamento implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("=== PAGAMENTO COM PAYPAL ===");
        System.out.println("Redirecionando para PayPal...");
        System.out.println("Verificando login do usuário...");
        System.out.println("Autenticando conta PayPal...");
        System.out.println("Verificando saldo disponível...");
        System.out.println("Processando pagamento de R$ " + valor);
        System.out.println("Pagamento PayPal confirmado!");
        System.out.println("Retornando para a loja...");
        System.out.println("=============================");
    }
}

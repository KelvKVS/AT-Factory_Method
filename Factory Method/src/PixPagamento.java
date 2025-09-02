public class PixPagamento implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("=== PAGAMENTO COM PIX ===");
        System.out.println("Redirecionando para Pix...");
        System.out.println("Verificando login do usuário...");
        System.out.println("Verificando chave Pix...");
        System.out.println("Verificando saldo disponível...");
        System.out.println("Processando pagamento de R$ " + valor);
        System.out.println("Pagamento Pix confirmado!");
        System.out.println("Retornando para a loja...");
        System.out.println("=============================");
    }
}

import java.util.Scanner;

public class SistemaPagamento {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        SISTEMA DE PAGAMENTO          ║");
        System.out.println("║         (Factory Method)             ║");
        System.out.println("╚══════════════════════════════════════╝");

        boolean continuar = true;

        while (continuar) {
            try {
                mostrarMenu();

                int opcao = lerOpcao();

                if (opcao == 5) {
                    System.out.println("\n👋 Obrigado por usar nosso sistema!");
                    continuar = false;
                    continue;
                }

                double valor = lerValor();

                processarPagamento(opcao, valor);

                continuar = perguntarContinuar();

            } catch (Exception e) {
                System.out.println("❌ Erro: " + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }

        scanner.close();
    }

    // Menu de opções
    private static void mostrarMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - 💳 Cartão de Crédito");
        System.out.println("2 - 📄 Boleto Bancário");
        System.out.println("3 - 💰 PayPal");
        System.out.println("4 - 💸 Pix");
        System.out.println("5 - ❌ Sair");
        System.out.print("Digite sua opção: ");
    }

    // Lê a opção
    private static int lerOpcao() {
        int opcao = scanner.nextInt();
        if (opcao < 1 || opcao > 5) {
            throw new IllegalArgumentException("Opção inválida! Escolha entre 1 e 5.");
        }
        return opcao;
    }

    // Lê o valor do pagamento
    private static double lerValor() {
        System.out.print("Digite o valor do pagamento (R$): ");
        double valor = scanner.nextDouble();
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }
        return valor;
    }

    private static void processarPagamento(int opcao, double valor) {
        CriadorPagamento criador = null;

        // Escolhe a fábrica baseada na opção do usuário
        switch (opcao) {
            case 1:
                criador = new CartaoCreditoCriador();
                break;
            case 2:
                criador = new BoletoCriador();
                break;
            case 3:
                criador = new PayPalCriador();
                break;
            case 4:
                criador = new PixCriador();
                break;
        }

        System.out.println("\n🚀 Processando pagamento...\n");

        Pagamento pagamento = criador.criarPagamento();
        pagamento.processarPagamento(valor);

        System.out.println("\n✅ Pagamento processado com sucesso!");
    }

    private static boolean perguntarContinuar() {
        System.out.print("\nDeseja fazer outro pagamento? (s/n): ");
        String resposta = scanner.next().toLowerCase();
        return resposta.equals("s") || resposta.equals("sim");
    }
}
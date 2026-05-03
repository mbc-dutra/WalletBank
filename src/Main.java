import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "João Alberto";
        String tipoConta = "Corrente";
        double saldo = 3500;
        int opcao = 0;

        System.out.printf("""
                ***********************
                Dados iniciais do cliente: 
                
                Nome: %s
                Tipo conta: %s
                Saldo: %.2f
                ***********************
                """, nome, tipoConta, saldo);

        while (opcao != 4) {
            System.out.printf("""
                    \n1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - sair\n""");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O seu saldo atual é: %.2f", saldo);
                    break;
                case 2:
                    System.out.println("Qual valor vai receber? ");
                    double receberValor = 0;
                    receberValor = scan.nextDouble();
                    if (receberValor < 1) {
                        System.out.println("Valor inválido");
                        break;
                    }
                    saldo += receberValor;
                    System.out.printf("O novo saldo agora é: %.2f", saldo);
                    break;
                case 3:
                    System.out.println("Qual valor vai transferir? ");
                    double transferirValor = 0;
                    transferirValor = scan.nextDouble();
                    if (transferirValor < 1) {
                        System.out.println("Valor inválido");
                        break;
                    }
                    if (transferirValor > saldo) {
                        System.out.println("Você não tem saldo o suficiente");
                        break;
                    }
                    saldo -= transferirValor;
                    System.out.printf("O novo saldo agora é: %.2f", saldo);
                    break;
                case 4:
                    System.out.println("Encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scan.close();
    }
}
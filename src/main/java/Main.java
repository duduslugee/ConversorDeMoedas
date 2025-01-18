import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    ***************************************************************
                    Bem-vindo ao Conversor de Moedas
                    
                    Escolha uma das opções de conversão:
                    
                    1- Dólar Americano (USD) >>> Peso Argentino (ARS)
                    2- Peso Argentino (ARS) >> Dólar Americano (USD)
                    3- Dólar Americano (USD) >>> Real Brasileiro (BRL)
                    4- Real Brasileiro (BRL) > Dólar Americano (USD)
                    5- Dólar Americano (USD) >>> Peso Colombiano (COP)
                    6- Peso Colombiano (COP) > Dólar Americano (USD)
                    7- Real Brasileiro (BRL) > Peso Chileno (CLP)
                    8- Peso Chileno (CLP) > Boliviano Boliviano (BOB)
                    9- Sair
                    
                    Digite sua escolha:
                    ***************************************************************
                    """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> TaxaDeConversao.converter("USD", "ARS", "Digite o valor em USD para converter em ARS:");
                case 2 -> TaxaDeConversao.converter("ARS", "USD", "Digite o valor em ARS para converter em USD:");
                case 3 -> TaxaDeConversao.converter("USD", "BRL", "Digite o valor em USD para converter em BRL:");
                case 4 -> TaxaDeConversao.converter("BRL", "USD", "Digite o valor em BRL para converter em USD:");
                case 5 -> TaxaDeConversao.converter("USD", "COP", "Digite o valor em USD para converter em COP:");
                case 6 -> TaxaDeConversao.converter("COP", "USD", "Digite o valor em COP para converter em USD:");
                case 7 -> TaxaDeConversao.converter("BRL", "CLP", "Digite o valor em BRL para converter em CLP:");
                case 8 -> TaxaDeConversao.converter("CLP", "BOB", "Digite o valor em CLP para converter em BOB:");
                case 9 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (opcao != 9);
    }
}

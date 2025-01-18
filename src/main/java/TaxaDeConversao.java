import java.io.IOException;
import java.util.Scanner;

public class TaxaDeConversao {
    public static void converter(String moedaOrigem, String moedaDestino, String mensagem) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        double valorInserido = scanner.nextDouble();

        double taxaConversao = ConversorDeMoedas.obterTaxaDeConversao(moedaOrigem, moedaDestino);
        System.out.printf("O valor convertido de %s para %s é: %.2f%n", moedaOrigem, moedaDestino, (valorInserido * taxaConversao));
    }
}

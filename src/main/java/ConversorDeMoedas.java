import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {
    public static double obterTaxaDeConversao(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        String apiUrl = "https://v6.exchangerate-api.com/v6/d856ff62c01ed0d29a8dc99b/pair/" + moedaOrigem + "/" + moedaDestino;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
        HttpResponse<String> resposta = httpClient.send(requisicao, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(resposta.body(), JsonObject.class);

        if (jsonResponse.has("conversion_rate")) {
            return jsonResponse.get("conversion_rate").getAsDouble();
        } else {
            throw new IOException("Erro ao obter a taxa de conversão. Verifique o código das moedas.");
        }
    }
}

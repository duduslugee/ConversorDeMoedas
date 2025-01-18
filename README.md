# Conversor de Moedas

## Descrição do Projeto
O **Conversor de Moedas** é uma aplicação desenvolvida em Java, como parte da **formação em Java Orientado a Objetos do programa Oracle Next Education**. Esta ferramenta permite converter valores entre diferentes moedas utilizando taxas de câmbio atualizadas em tempo real. O projeto é uma demonstração prática dos conceitos de programação orientada a objetos e boas práticas de desenvolvimento.

As moedas suportadas no sistema são:
- **USD** - Dólar Americano
- **ARS** - Peso Argentino
- **BOB** - Boliviano
- **BRL** - Real Brasileiro
- **CLP** - Peso Chileno
- **COP** - Peso Colombiano

## Funcionalidades
- Conversão entre diferentes pares de moedas.
- Consulta de taxas de câmbio em tempo real usando uma API externa.
- Interface interativa no terminal para facilitar o uso.
- Validação de entradas e tratamento de erros para uma experiência mais robusta.

### Conversões Suportadas
1. USD → ARS
2. ARS → USD
3. USD → BRL
4. BRL → USD
5. USD → COP
6. COP → USD
7. BRL → CLP
8. CLP → BOB

---

## Pré-requisitos

Antes de executar o projeto, certifique-se de que você tenha:
1. **Java 17 ou superior** instalado.
2. **Maven** configurado para gerenciamento de dependências.
3. Conexão com a internet para acessar a API externa de taxas de câmbio.

---

## Configuração do Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moedas.git
   cd conversor-de-moedas
   ```

2. **Configure o Maven:**
   Tenha certeza de que o arquivo `pom.xml` contenha as dependências do GJSON. O projeto utiliza a biblioteca `Gson` para manipulação de JSON.

   **Exemplo de `pom.xml`:**
   ```xml
   <dependencies>
       <dependency>
           <groupId>com.google.code.gson</groupId>
           <artifactId>gson</artifactId>
           <version>2.10</version>
       </dependency>
   </dependencies>
   ```

3. **Compile o projeto:**
   ```bash
   mvn clean install
   ```

4. **Execute a aplicação:**
   ```bash
   java -cp target/conversor-de-moedas-1.0-SNAPSHOT.jar Main
   ```

---

## Estrutura do Projeto

- **`ConversorDeMoedas.java`**: Classe responsável por obter as taxas de conversão da API externa.
- **`TaxaDeConversao.java`**: Contém o método para realizar o cálculo da conversão entre moedas.
- **`Main.java`**: Classe principal que fornece a interface interativa para o usuário.
- **`pom.xml`**: Arquivo de configuração do Maven para dependências do projeto.

---

## Exemplo de Uso

1. Após executar o programa, será exibido o menu:
   ```
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
   ```

2. Escolha uma opção, insira o valor e veja o resultado da conversão:
   ```
   Digite o valor em dólar a ser convertido em peso argentino: 100
   O valor convertido é: 10.000 ARS
   ```

---

## API Utilizada

A aplicação utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para buscar as taxas de câmbio.

Exemplo de URL da API:
```
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{MOEDA_ORIGEM}/{MOEDA_DESTINO}
```

---

## Autor

**Eduardo Ramos da Silva**  
Projeto desenvolvido na formação de Java Orientado a Objetos do programa Oracle Next Education.  

---

## Licença

Este projeto está licenciado sob a **MIT License**

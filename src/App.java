public class App {
    public static void main(String[] args) throws Exception {

        // 1. Verificar se um número é par ou ímpar
        int numero1 = 5;
        String resultadoParImpar = (numero1 % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(resultadoParImpar); // Saída: IMPAR

        // 2. Verificar se um número é positivo ou negativo
        int numero2 = 10;
        String resultadoPositivoNegativo = (numero2 >= 0) ? "NAO NEGATIVO" : "NEGATIVO";
        System.out.println(resultadoPositivoNegativo); // Saída: NAO NEGATIVO

        // 3. Comparar dois números
        int a = 8, b = 12;
        String maior = (a > b) ? "A é maior" : "B é maior ou igual a A";
        System.out.println(maior); // Saída: B é maior ou igual a A

        // 4. Verificar idade para maioridade
        int idade = 18;
        String maioridade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(maioridade); // Saída: Maior de idade

        // 5. Verificar se um ano é bissexto
        int ano = 2024;
        String bissexto = ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) ? "Ano Bissexto" : "Ano Comum";
        System.out.println(bissexto); // Saída: Ano Bissexto

        // 6. Verificar se um número está dentro de um intervalo
        int numero3 = 15;
        String intervalo = (numero3 >= 10 && numero3 <= 20) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(intervalo); // Saída: Dentro do intervalo

        // 7. Retornar o maior de dois números
        int x = 7, y = 14;
        int maiorNumero = (x > y) ? x : y;
        System.out.println(maiorNumero); // Saída: 14

        // 8. Retornar o menor de três números
        int x1 = 15, y1 = 9, z = 20;
        int menorNumero = (x1 < y1) ? ((x1 < z) ? x1 : z) : ((y1 < z) ? y1 : z);
        System.out.println(menorNumero); // Saída: 9
    }
}

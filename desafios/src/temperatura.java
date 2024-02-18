/*  Escreva um programa que, com base em uma temperatura em graus celsius,
a converta e exiba em Kelvin (K) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
 */

public class temperatura {
    public static void main(String[] args) {
        double C, K, F; //declaração de variáveis
        C = 10; //considerando que a temp em celsius é 10

        F = C * 1.8 + 32;
        K = C + 273.15;

        //impressão
    System.out.println("A temperatura em Celsius é: º" + C);
    System.out.println("A temperatura em Fahrenheit é: º" + F);
    System.out.println("A temperatura em Kelvin é: " + K);
    }

}
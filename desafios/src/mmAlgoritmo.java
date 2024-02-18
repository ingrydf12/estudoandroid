/* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e
escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens; OK
c. o número de mulheres.

 */
import java.util.Scanner;
public class mmAlgoritmo {
    public static void main(String[] args) {
        double altura, media, maior = 0, menor = 10, somaAltura=0;
        int qtMulher = 0, qtHomem = 0, sexo;

        //declaração do leitor da entrada do usuário
        Scanner leitor = new Scanner(System.in); //lê a entrada double com , por exemplo. nao reconhece. (Locale)
        //laço de repetição com 5 voltas para a entrada do usuário com o sexo e altura
        for (int i=0; i<5; i++) {
            System.out.println("Escolha o sexo (1-Mulher, 2-Homem)");
            sexo = leitor.nextInt();
            System.out.println("Digite a altura: ");
            altura = leitor.nextDouble();
            //vai indicar a quantidade de homens/mulheres a partir do sexo escolhido
            if (sexo == 1) {
                qtMulher++;
            } else if (sexo == 2) {
                qtHomem++;
                somaAltura = somaAltura + altura;
            } else {
                System.out.println("Opção inválida");
            }

            //maior (que 0) e menor altura (menor que 0)
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }

        media = somaAltura / qtHomem;

        //impressão
        // o maior e menor que são puxados aqui são os que estão no if/else dentro da estrutura for
        System.out.println("A maior altura é: " + maior + " e a menor altura é: " + menor);
        System.out.println("A quantidade de mulheres no grupo são: " + qtMulher);
        System.out.println("A média de altura dos homens é de: " + media);

    leitor.close(); //breakpoint(verificar)
    }
}
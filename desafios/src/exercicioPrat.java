/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares,
quantos valores informados são positivos e quantos valores informados são negativo
 */
import java.util.*;
public class exercicioPrat {
    public static void main(String[] args) {
        int n, par = 0, impar = 0, positivo = 0, negativo=0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            n = leitor.nextInt();
            if (n % 2 == 0)
                par += 1;
            if (n % 2 != 0)
                impar += 1;
            if (n > 0)
                positivo += 1;
            if (n < 0)
                negativo += 1;
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        leitor.close();

    }
}
/* 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class MediasAritDesafio{
    public static void main(String[] args){
        int num1 = 8, num2 = 9, num3 = 7, num4=4, num5 = 5, num6 = 6;
        float media1, media2, mediaArit;
        
        media1= (num1 + num2 + num3) / 3;
        media2 = (num4 + num5 + num6) / 3;
        mediaArit = (media1 + media2) / 2;
        
        System.out.println("Media 1: " + media1);
        System.out.println("Media 2: "+ media2);
        System.out.println("Media das medias: " + mediaArit);
    }
}
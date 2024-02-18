import java.util.Scanner

// Função para encontrar a soma dos elementos de um array de inteiros
fun somaArray(array: IntArray): Int {
    var soma = 0
    for (x in array) {
        soma += x // adiciona o elemento na soma
    }
    return soma // retorna o resultado
}

fun main() {
    val leitor = Scanner(System.`in`)
    val inputAr = leitor.nextLine().split(" ").map { it.toInt() }.toIntArray() // o leitor pega a entrada do usuário e converte pra inteiro

    println("${somaArray(inputAr)}")// chama a fun somaArray e imprime o array colocado dentro
}

/* split divide a string em substrings
 map aplica uma função a cada elemento da lista resultante do split, entao o conversor para inteiro é aplicado a cada elemento
it referencia a cada elemento */
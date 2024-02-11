// checa se a variável foi inicializada ou não
class GFG {

    // Declaring a lateinit variable of Int type
    lateinit var minhaVariavel: String
    fun inicializarNome() {

        // Check using isInitialized method
        println("minhaVariavel foi inicializada? " + this::minhaVariavel.isInitialized);

        // initializing myVariable
        minhaVariavel = "GFG"

        // Check using isInitialized method
        println("Is myVariable initialized? " + this::minhaVariavel.isInitialized);
    }
}

fun main(args: Array<String>) {

    // chamando método
    GFG().inicializarNome();
}
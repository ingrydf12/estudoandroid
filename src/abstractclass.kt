abstract class Mamifero(var nome: String) {  // serve para fazer o molde/base de uma herança nas classes
    fun acordar(){ println("Acordando")}
    fun dormir() { println("Dormindo")}
}

//o : indica herança
class dog(nome: String) : Mamifero(nome){
}

fun main() {
    var d: dog = dog("teste")
    d.acordar()
    d.dormir()
}

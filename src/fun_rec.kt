// algoritmo de fatorial utilizando função recursiva
fun fatorial(a: Int):Int{
    if(a == 1){
        return 1
    }
    return a * fatorial(a - 1) //retorno da funcao é o fatorial
}
//    fun ler(x: Int){
//        readlnOrNull()?.toInt() ?:0 // ler e converter para inteiro
//    }
fun main() {
    val x: Int = readlnOrNull()?.toInt()?:0
    //val x: Int = 0//inicializando a variavel
    //ler(x)
    println(fatorial(x))
}
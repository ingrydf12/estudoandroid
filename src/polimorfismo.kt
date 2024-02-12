open class dev(var salario: Float){ //interface (não herda, só implementa) e não pode criar construtores ou abstract;
    fun bonus(){
    }
}
class mobile(salario: Float):dev(salario){ //quando nao especifica se é var, o bixo é padrão val

}
class game(salario:Float):dev(salario){

}
class back(salario: Float):dev(salario){

}

//com as mudanças:


fun main() {

}
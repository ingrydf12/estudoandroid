interface desenvolvedor{ //criação de uma interface para criação de hierarquia/herança de tais propriedades para classes filhas
    var salario: Float
    fun bonus ():Float
}
//Notas: interface (não herda, só implementa) e não pode criar construtores ou abstract;

//modificador override herdando o salario e a fun bonus presente no desenvolvedor implementando um retorno diferente (aumenta 0.7)
class backend(override var salario: Float):desenvolvedor{
    override fun bonus():Float{
        return salario*0.7f
    }
}
//modificador override herdando o salario e a fun bonus presente no desenvolvedor implementando um retorno diferente (aumenta 0.6)
class mobile(override var salario: Float):desenvolvedor{
    override fun bonus():Float{
        return salario*0.6f
    }
}

//função para mostrar bonus chamando a interface desenvolvedor e imprimindo
fun mostrar_bonus(d: desenvolvedor){
    println(d.bonus())
}
//chama a função mostrar_bonus, que chama as classes presentes (mobile e backend) junto com o tamanho do valor (1000)
fun main() {
    mostrar_bonus(backend(1000f))
    mostrar_bonus(mobile(1000f))
}
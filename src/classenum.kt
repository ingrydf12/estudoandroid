//declarada uma classe de enumeradores
enum class Prioridade{
    BAIXA, MÉDIA, ALTA
}

enum class Animais{
    cachorro, gato, vaca, porco
}

//p: significa o parâmetro da função chamando uma classe nesse caso
fun x(p: Prioridade){

}

//lembrete sempre: funções precisam conter o () "parâmetro); pode estar vazio.
fun main(){
    x(Prioridade.ALTA)// acessa um valor contido na classe Prioridade que está dentro da função x
}

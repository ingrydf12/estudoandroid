public class swicaseaula {
    float calculoBonus (String cargo, float salario){
        float bonus = 0.5f;
        cargo = cargo.toLowerCase();
        switch(cargo){
            case "gerente":
                bonus = salario*1.7f;
                break;
            default:
                bonus = salario*1.2f;
                break;
        }
        return bonus;
    }
    public static void main(String[] args) {
        //código de calculo de bonus dependendo do cargo
        String cargo = "gerente"; // exemplo
        float salario = 1000f;
        System.out.printf("para o cargo" + cargo + "de salario atual: " + salario);
        System.out.printf("O bonus será de " + (salario+bonus));
    }
}

public class Pet {
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;



    public void apresentar(){
        System.out.println("Olá! Meu nome é " + nome + ", sou um cachorro da raça " + raca + ".\nTenho " + idade + "anos e peso " + peso + " kg.");
    }

    public void aniversario(int idade){
        idade = idade + 1;
        System.out.println("Parabens pelos " + idade + " de vida");
    }

    public void avaliarPeso(double pesoIdeal){
        if (peso < 30.0) {
            System.out.println(nome + " está abaixo do peso ideal ("+ pesoIdeal + "kg)");
        } else if (peso > 30.0) {
            System.out.println(nome + " está acima do peso ideal ("+ pesoIdeal + "kg)");
        }else{
            System.out.println(nome + " está no peso ideal ("+ pesoIdeal + "kg)");
        }
    }
}
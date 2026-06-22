//Nome:Bernardo Candido de Queiroz 
//RA:1261948200
public class App {
    public static void main(String[] args) throws Exception {
        Pet pet = new Pet();
        pet.nome = "rex";
        pet.especie = "cachorro";
        pet.raca = "Labrador";
        pet.idade = 3;
        pet.peso = 28.5;

        pet.apresentar();

        pet.avaliarPeso(30.0);

    }
}

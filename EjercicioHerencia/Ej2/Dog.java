package EjercicioHerencia.Ej2;

public class Dog extends Animal{
    private String species;

    public Dog(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }
    public void snif(){
        System.out.println("El perro está olfateando");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    void makeSound() {
        System.out.println("El perro ladra");
    }

    @Override
    void information() {
        System.out.println("El perro " +this.name+ " tiene " + this.age + " años, es " + this.gender + " y es un " + species);
    }
}

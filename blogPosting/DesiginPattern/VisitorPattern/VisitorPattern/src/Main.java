public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Beaver());
        zoo.addAnimal(new Elephant());

        AnimalVisitor animalVisitor = new AnimalSoundVisitor();
        zoo.accept(animalVisitor);

    }
}
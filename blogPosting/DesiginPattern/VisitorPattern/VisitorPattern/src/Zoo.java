import java.util.ArrayList;
import java.util.List;

// 객체 구조
public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void accept(AnimalVisitor visitor){
        for(Animal animal : animals){
            animal.accept(visitor);
        }
    }
}

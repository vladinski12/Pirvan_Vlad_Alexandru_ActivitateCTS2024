package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;

    private ZooKeeper zooKeeper;
    private Map<Animal, String> animals;


    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void feedAllAnimals() {
        for (var animal : this.animals.entrySet()) {
            this.zooKeeper.feedAnimal(animal.getKey(), animal.getValue());
        }
    }

    public void addAnimal(Animal animal, String food) {
        if (this.animals == null) {
            this.animals = new HashMap<>();
        }
        this.animals.put(animal, food);
    }
}
package Model;

import Model.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal, String mancare) {
        animal.eat(mancare);
    }
}
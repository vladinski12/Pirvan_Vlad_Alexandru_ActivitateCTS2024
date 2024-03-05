package Main;

import Models.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ion");
        Zoo zoo = new Zoo("Zoo", zooKeeper, new HashMap<>());

        zoo.addAnimal(new Zebra("Marty", 21), "grass");
        zoo.addAnimal(new Lion("Simba", 10), "Marty");
        zoo.addAnimal(new Cat("Tom", 7), "pliculet");

        zoo.feedAllAnimals();
    }
}
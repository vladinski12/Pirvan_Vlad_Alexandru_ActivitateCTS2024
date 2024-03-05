package Models;

public class Zebra extends Animal {

    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The zebra " + this.getName() + " eats " + food);
    }
}
package example2;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Cat();
        animal.eat();
        animal2.eat();

        animal.sleep();
        animal2.sleep();
    }
}

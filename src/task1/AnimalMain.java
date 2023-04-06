package task1;

public class AnimalMain {
    public static void main(String[] args) {

        final Animal animal = new Animal("Wolf", 4);
        final Animal animal1 = new Animal("Cow", 4, 120.0);

        animal.animalAging(5);
        animal.animalFatteing(60.0);
        animal.animalLosingWeight(10.0);
        animal.printAnimal();

        animal1.getBreed();
        animal1.animalAging(3);
        animal1.animalFatteing(30.0);
        animal1.animalLosingWeight(5.0);
        animal1.printAnimal();

    }
}

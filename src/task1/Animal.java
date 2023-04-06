package task1;

public class Animal {
    private String breed;
    private int years;
    private double weight;

    public Animal(String breed, int years) {
        this.breed = breed;
        this.years = years;

    }

    public Animal(String breed, int years, double weight) {
        this.breed = breed;
        this.years = years;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public int getYears() {
        return years;
    }

    public double getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void animalAging(int years) {
        this.years += years;
    }

    public void animalFatteing(double weight) {
        this.weight += weight;
    }

    public void animalLosingWeight(double weight) {
        this.weight -= weight;
    }

    public void printAnimal() {

        System.out.println("This is a " + this.breed + "  with " + this.weight + " kg and " + this.years + " years\n");
    }

}

// Parent class
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void displaySpecies() {
        System.out.println("Species: " + species);
    }

    public void makeSound() {
        System.out.println("Animal sound!");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    private String breed;

    public Cat(String breed) {
        super("Cat");
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of the Cat class
        Cat myCat = new Cat("Persian");

        // Accessing the inherited method from the Animal class
        myCat.displaySpecies();

        // Accessing the overridden method specific to the Cat class
        myCat.makeSound();

        // Accessing the method specific to the Cat class
        myCat.displayBreed();
    }
}

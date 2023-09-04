class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furcolor, String breed) {
        super(name, age, furcolor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes a specific sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}


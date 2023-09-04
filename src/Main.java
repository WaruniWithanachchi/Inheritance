public class Main
{
    public static void main(String[] args)
    {
        Animal a = new Animal("Generic animal", 5);
        Mammal m = new Mammal("Zimba",3,"Brown");
        Bird b = new Bird("Macco",1,5.4);
        Dog d = new Dog("Rover",4,"Black","Belgium shephard");

        a.makeSound();
        System.out.println(a);

        m.makeSound();
        System.out.println(m);

        b.makeSound();
        System.out.println(b);

        d.makeSound();
        System.out.println(d);
    }
}
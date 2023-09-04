 class Mammal extends Animal {
     private String furcolor;
     private String furColor;

     public Mammal(String name, int age, String furcolor) {
         super(name, age);
         this.furcolor = furcolor;
     }

     @Override
     public void makeSound() {
         System.out.println("Mammal makes a specific sound");
     }

     @Override
     public String toString()
     {
         return super.toString() + ", Fur Color: " + furColor;

     }
 }

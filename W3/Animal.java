class Animal {
    public void animalSound() {
        System.out.println("The Animal Makes A Sound...");
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("Pig Soungs - wee  wee ");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("Dog Soungs - Bow  Bow ");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig =  new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
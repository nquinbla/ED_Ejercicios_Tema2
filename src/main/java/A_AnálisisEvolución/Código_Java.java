package A_AnálisisEvolución;

public class Código_Java {
    public class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }

    public class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();
        }
    }
}

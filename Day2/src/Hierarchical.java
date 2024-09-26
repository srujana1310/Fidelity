public class Hierarchical{
        String name;
        public void eat() {
            System.out.println("all animals can eat");
        }
    }
    class Dog extends Hierarchical{
        public void bark(){
            System.out.println("Dog is barking");
        }
    }
    class Cat extends Hierarchical{

        public void meow(){
            System.out.println("cat is meowing");
        }
    }
    class AnimalName{
        public static void main(String[] args) {
            Cat ct =new Cat();
            ct.name="lab";
            ct.eat();
            Dog dg =new Dog();
            dg.bark();
            ct.meow();
        }
    }


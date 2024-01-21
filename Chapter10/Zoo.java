package Chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog zaza = new Dog();
        zaza.makeSound();
        zaza.fetch();
        feed(zaza);

        Animal Sacha = new Dog();
        Sacha.makeSound();
        feed(Sacha);

        Sacha = new Cat();
        Sacha.makeSound();
        ((Cat) Sacha).Scratch();
        feed(Sacha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's Your dog food");
        }else if(animal instanceof Cat){
            System.out.println("Here's Your cat food");
        }
    }
}

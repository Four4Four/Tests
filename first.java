public class first {
    public static void main(String[] args) {
        Animal object1 = new Cat();
        Animal object2 = new Dog();

        object1.say();
        object2.say();
    }
}

abstract class Animal {
    public int age;

    Animal() {
        this(0);
    }
    Animal(int age) {
        this.age = age;
    }

    abstract public void say();
}

class Cat extends Animal {
    public String name_cat;

    Cat() {
        super(0);
        this.name_cat = "undefined";
    }
    Cat(int age, String name_cat) {
        super(age);
        this.name_cat = name_cat;
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public String name_dog;

    Dog() {
        super(0);
        this.name_dog = "undefined";
    }
    Dog(int age, String name_dog) {
        super(age);
        this.name_dog = name_dog;
    }

    @Override
    public void say() {
        System.out.println("Gav");
    }
}

package BATA;
abstract class Duck {
    public void swim() {
        System.out.println("The duck is able to swim");
    }

    public abstract void display();
}

interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}





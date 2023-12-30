package BATA;

public class ess {

    public static void main(String[] args) {
    	Flyable f1=new Fly1();
    	Quackable q1=new Quack1();
        MallardDuck mallardDuck = new MallardDuck(f1,q1);
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();
        
        Flyable f2=new Fly2();
        Quackable q2=new Quack2();
        RedheadDuck redheadDuck = new RedheadDuck(f2,q2);
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.fly();
        redheadDuck.quack();

        RubberDuck rubberDuck = new RubberDuck(q1);
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();


        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
    }
}


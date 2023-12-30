package BATA;

class MallardDuck extends Duck implements Flyable, Quackable {
	Flyable fb;
	Quackable qu;
	
	public MallardDuck(Flyable f,Quackable q)
	{fb=f;
	qu=q;
	}
    public void display() {
        System.out.println("This is a Mallard Duck");
    }

    public void fly() {
        fb.fly();
    }

    public void quack() {
       qu.quack();
    }
}

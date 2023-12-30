package BATA;

class RedheadDuck extends Duck implements Flyable, Quackable {
	Flyable fb;
	Quackable qu;
	public RedheadDuck(Flyable f, Quackable q )
	{ fb=f;
	qu=q;
	}
	
    public void display() {

        System.out.println("This is a Redhead Duck");
    }

    public void fly() {
        fb.fly();
    }

    public void quack() {
        qu.quack();
    }
}
package BATA;


class RubberDuck extends Duck implements Quackable {
	Quackable qu;
	RubberDuck(Quackable q)
	{qu=q;
	}
	
    public void display() {
        System.out.println("This is a Rubber Duck");
    }

    public void quack() {
    	qu.quack();
        
    }
}


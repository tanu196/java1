
abstract class A{
	
public	abstract void speed();
public void voice() {}
		
}


class Dog extends A{
	public void speed() {
		System.out.println("速い");
	}
}

class Pce1{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.speed();
		d.voice();
		
	}
}

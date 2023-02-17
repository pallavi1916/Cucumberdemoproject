package JavaProgram;

public class Hello {
	int length = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		float f=1.8f;
		
	System.out.println(f);
		Hello h = new Hello();
		h.bark();
		h.eat();
		h.run();
		
		

	}
	
	public void bark()
	{
		System.out.println("bark");
	}
	public void eat()
	{
		System.out.println("eat");
	}
	public void run()
	{
		System.out.println("run");
	}

}

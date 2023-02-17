package JavaProgram;

public class Constructor {
	 Constructor()
	{
		System.out.println(" constructor");
	}
	 Constructor(String xyz)
	 {
			System.out.println(" constructor one");

	 }

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor("pallavi");
	}

}

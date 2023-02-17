package Programs;

public class MethodThree {
	
	
	public  void noparameter()
	{
		System.out.println("This method have No Parameter");
	}
	
	public  void withparamete(int a, int b)
	{
		int c=a+b;
		System.out.println("This Methos have Paramete With C value : " +c);
	}
	
	public  void message(String msg)
	{
		System.out.println("This Method have Message ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodThree obj = new MethodThree();
		
		obj.noparameter();
		obj.withparamete(45, 50);
		obj.message("This is Java Method Programs");

	}

}

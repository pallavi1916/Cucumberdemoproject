package Programs;

public class Method1 {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b= 8;
		int c= minifunction(a,b);
		System.out.println("The min number is : " +c);
	}
	
	public static int minifunction(int n1 , int n2)
	{
		int min;
		if(n1 > n2)
			min=n1;
		else
			min=n2;
		return min;
	}

}

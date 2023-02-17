package Programs;

public class ifelseThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int mark=60;
		if(mark < 50)
		{
			System.out.println("Fail");
		}
		else if(mark<=50 && mark >60 )
		{
			System.out.println("The Grade is D");
		}
		
		else if(mark >=60 && mark <70)
		{
			System.out.println("The Grade is C");
		}
		
		else if(mark >=70 && mark <80)
		{
			System.out.println("The Grade is B");
			
		}
		
		else if(mark >=80 && mark <90)
		{
			System.out.println("The Grade is A+");
		}
		
		else if(mark>=90 && mark <100)
		{
			System.out.println("The Grade is A++");
		}
		
		else 
		{
			System.out.println("mark is invalid");


		}
	}

}

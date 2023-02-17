package Programs;

public class MethodFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=18;
		
		int blood= blooddonation(age);
		System.out.println("Blood Donation : " +blood);

	}
	
	public static int blooddonation(int a)
	{
		int aw=23;
		if (aw>=a)
			System.out.println("you are eligable to donate blood");
		else
			System.out.println("you are not eligable to donate blood");
		return aw;
	}

}

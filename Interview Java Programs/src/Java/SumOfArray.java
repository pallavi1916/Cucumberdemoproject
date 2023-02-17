package Java;

public class SumOfArray {

	public static void main(String[] args) {
		// Sum of element in array
		int a[]={5,2,7,9,6};
		int sum=0;
		
		//logic 1
//		for(int i=0;i<=a.length-1;i++) // 0 1 2 3
 //		{
//			sum=sum+a[i];//5+2+7+9+6
//		}
		
		
		//Enahance for loop -special for array(for each loop)
		for(int value:a)
		{
			sum=sum+value;
		}
		
		System.out.println("Sum Of Array is : "+sum);

	}

}

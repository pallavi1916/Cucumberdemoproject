package JavaProgram;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		//System.out.println(a);
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}

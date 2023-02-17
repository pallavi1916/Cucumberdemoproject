package Java;

public class ReverseString {

	public static void main(String[] args) {
		
		// using  + (String concatenation) operator
		String str = "ABCD";
		String rev = "";
		/*int len=str.length();//4
		//str.charAt(0);
		for(int i=len-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+str.charAt(i); //D C B A
			
		}*/
		
		//using charater array
		/*char a[]=str.toCharArray();
		int len=a.length;//4
		for(int i =len-1;i>=0;i--)//3 2 1 0 -1
		{
			rev=rev+a[i];//D C B A
		}*/
		
		//using StringBuffer Class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse()); 
		System.out.println("Reverse Number : "+rev);

	}

}

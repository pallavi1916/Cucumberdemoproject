package program;

public class Reverse_String {

	public static void main(String args[])
	{
		String str="ABCD";
		String rev="";
		int len=str.length();//4
		
		//using concatinate
//		for(int i=len-1;i>=0;i--)//3 2 1 0
//		{
//			rev=rev+str.charAt(i);//D C B A
//			
//		}
		
		//using  charater array
		char a[]= str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		//using String Buffer
		
		StringBuffer sb = new StringBuffer(String.valueOf(str));
		System.out.println(sb.reverse());
			
		//System.out.println(rev);
		
	}
}

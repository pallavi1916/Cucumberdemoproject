package JavaProgram;

public class Assignmentone {
     
	public static void main(String args[])
	{
		//write a program to calculate Finonacci series up to n number
		 int n1=0;
		 int n2=1;
		 int n3;
		 int count=10;
		 
		 System.out.print(+n1+ " " +n2);
		 for(int a= 2; a<=count; a++)
		 {
			 n3=n1+n2;
			 System.out.print(" " +n3);
			 n1=n2;
			n2=n3;		 
					 
		 }
	}
}

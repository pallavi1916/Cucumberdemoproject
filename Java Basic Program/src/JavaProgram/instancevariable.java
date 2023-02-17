package JavaProgram;

public class instancevariable 
{
	   float a;
	   char b;
	   int c;
	   double d;
	   long e;
	   boolean f;
	   short g;
	   byte h;
	   
	   
	public static void main(String[] args) 
	
	{
		// check the default value of DataTypes
		instancevariable obj = new instancevariable();
		System.out.println("Float default value :" + obj.a);
		System.out.println("Character default value : " + obj.b);
		System.out.println("Integer default value : " + obj.c);	
		System.out.println("Double default value : " + obj.d);
		System.out.println("Long default value : " + obj.e);
		System.out.println("Boolean default value : " + obj.f);
		System.out.println("Short default value : " + obj.g);
		System.out.println("Byte default value : " + obj.h);
		
	}

}

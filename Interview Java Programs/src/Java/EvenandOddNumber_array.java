package Java;

public class EvenandOddNumber_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={1,2,3,4,5,6};
  //Extracting even number
      System.out.println("Even Number");
      for(int i=0; i<a.length;i++)
      {
    	  if(a[i]%2==0)
    	  {
    		  System.out.println(a[i]);
    	  }
    	  
      }
      
      System.out.println("Odd Number");
      for(int i=0; i<a.length;i++)
      {
    	  if(a[i]%2!=0)
    	  {
    		  System.out.println(a[i]);
    	  }
    	  
      }
	}

}

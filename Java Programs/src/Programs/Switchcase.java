package Programs;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int number=20;
             String code;
             
             switch(number)
             {
             case 20 :
            	 code = "Testing";
            	 System.out.println("Code is :" +code);
            	 break;
            	 
             case 30:
            	 code = "Developer";
            	 System.out.println("code is : " +code);
            	 break;
             case 40:
            	 code = "Managment";
            	 System.out.println("code is :" +code);
            	 break;
            	 default:
            		 System.out.println("Code is not available");
             }
	}

}

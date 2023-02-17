package Hybrid;

public class TestDataDriver {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
String spath=("D:\\Selenium-Automation\\hybriddriven.xlsx");
		
		ExcelUtills.setexcelfile(spath, "Sheet1");
		
		for(int irow=0;irow<6;irow++)
		{
			String sActionKeyword=ExcelUtills.getCellData(irow,0);
			
			String sTestData=ExcelUtills.getCellData(irow, 1);
		
			//Comparison 
			
			if(sActionKeyword.equals("OpenBrowser"))
				{
				Actionkeyword.OpenBrowser();
	                
					}
			else if(sActionKeyword.equals("Navigate"))
			
			{
				Actionkeyword.Navigate(sTestData);
				}
			else if(sActionKeyword.equals("Username"))
				
			{
				Actionkeyword.Username(sTestData);
				}
			
else if(sActionKeyword.equals("Password"))
				
			{
	Actionkeyword.Password(sTestData);
				}
			
else if(sActionKeyword.equals("ClickLogin"))
	
{
	Actionkeyword.ClickLogin();
	}
			
else if(sActionKeyword.equals("CloseBrowser"))
	
{
	Actionkeyword.CloseBrowser(sTestData);
	}
		}

	}

}

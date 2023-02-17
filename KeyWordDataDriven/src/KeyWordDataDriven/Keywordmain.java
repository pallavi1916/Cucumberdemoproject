package KeyWordDataDriven;


public class Keywordmain {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
String spath=("D:\\Selenium-Automation\\Action.xlsx");
		
		// Read data from excel sheet 
Readdata.setExcelFile(spath, "Sheet1");
		
		
		for(int i=0;i<6;i++)
		{
			String sActionKeyword=Readdata.getCellData(i,0);
			// comparission 
			
			if(sActionKeyword.equals("openbrowser"))
				{
				KeywordAction.openbrowser();
	                }
			
			else if(sActionKeyword.equals("Navigate"))
			
			{
				KeywordAction.navigate();
				}
			else if(sActionKeyword.equals("Username"))
				
			{
				KeywordAction.username();
				}
			
else if(sActionKeyword.equals("Password"))
				
			{
	KeywordAction.password();
				}
			
else if(sActionKeyword.equals("ClickLogin"))
	
{
	KeywordAction.clicklogin();
	}
			
else if(sActionKeyword.equals("CloseBrowser"))
	
  {
	KeywordAction.closebrowser();
	}
		
		}
	}
	}



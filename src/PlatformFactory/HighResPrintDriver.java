package PlatformFactory;

public class HighResPrintDriver extends Document
{
	DocumentDriverFactory documentDriverFactory;
	 
	public HighResPrintDriver(DocumentDriverFactory documentDriverFactory)
	{
		this.documentDriverFactory = documentDriverFactory;
	}
 
	void print()
	{
		System.out.println("Printing " + name + "...");
	}
}

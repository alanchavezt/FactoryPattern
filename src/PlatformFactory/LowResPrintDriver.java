package PlatformFactory;

public class LowResPrintDriver extends Document
{
	DocumentDriverFactory documentDriverFactory;
	 
	public LowResPrintDriver(DocumentDriverFactory documentDriverFactory)
	{
		this.documentDriverFactory = documentDriverFactory;
	}
 
	void print()
	{
		System.out.println("Printing " + name + "...");
	}
}

package PlatformFactory;

public abstract class PrintPlatform
{
	protected abstract Document createPrintDriver(String item);
	 
	public Document getPrintDriver(String type)
	{
		Document document = createPrintDriver(type);
		return document;
	}
}

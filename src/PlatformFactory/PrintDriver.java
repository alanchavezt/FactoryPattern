package PlatformFactory;

public class PrintDriver extends PrintPlatform
{
	protected Document createPrintDriver(String item) {
		Document document = null;
		
		DocumentDriverFactory driverFactory = new PrintDriverFactory();
 
		if (item.equals("low")) {
			document = new LowResPrintDriver(driverFactory);
			document.setResolution("Low Resolution Print Driver");
			
		} else if (item.equals("high")) {
 
			document = new HighResPrintDriver(driverFactory);
			document.setResolution("High Resolution Print Driver");
		}
		
		return document;
	}

}

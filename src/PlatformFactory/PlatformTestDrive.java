package PlatformFactory;

public class PlatformTestDrive
{
	public static void main(String[] args)
	{
		// Document Print Driver
		PrintPlatform documentPlatform = new PrintDriver();
		
		Document document = documentPlatform.getPrintDriver("low");
		document.print();
		System.out.println(document);
		
		document = documentPlatform.getPrintDriver("high");
		document.print();
		System.out.println(document);
		
		// Widget Display Driver
		DisplayPlatform widgetPlatform = new DisplayDriver();
		
		Widget widget = widgetPlatform.getDisplayDriver("low");
		widget.draw();
		System.out.println(widget);
		
		widget = widgetPlatform.getDisplayDriver("high");
		widget.draw();
		System.out.println(widget);
	}
}

package PlatformFactory;

public class DisplayDriver extends DisplayPlatform
{
	protected Widget createDisplayDriver(String item) {
		Widget widget = null;
		
		WidgetDriverFactory driverFactory = new DisplayDriverFactory();
 
		if (item.equals("low")) {
			widget = new LowResDisplayDriver(driverFactory);
			widget.setResolution("Low Resolution Widget Driver");
			
		} else if (item.equals("high")) {
 
			widget = new HighResDisplayDriver(driverFactory);
			widget.setResolution("High Resolution Widget Driver");
		}
		
		return widget;
	}
}

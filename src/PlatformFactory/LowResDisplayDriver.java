package PlatformFactory;

public class LowResDisplayDriver extends Widget
{
	WidgetDriverFactory widgetDriverFactory;
	 
	public LowResDisplayDriver(WidgetDriverFactory widgetDriverFactory)
	{
		this.widgetDriverFactory = widgetDriverFactory;
	}
 
	void draw()
	{
		System.out.println("Drawing " + name + "...");
	}
}

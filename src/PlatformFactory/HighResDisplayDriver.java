package PlatformFactory;

public class HighResDisplayDriver extends Widget
{
	WidgetDriverFactory widgetDriverFactory;
	 
	public HighResDisplayDriver(WidgetDriverFactory widgetDriverFactory)
	{
		this.widgetDriverFactory = widgetDriverFactory;
	}
 
	void draw()
	{
		System.out.println("Drawing " + name + "...");
	}

}

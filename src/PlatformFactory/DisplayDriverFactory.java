package PlatformFactory;

public class DisplayDriverFactory implements WidgetDriverFactory
{
	public LowResDisplayDriver createLowResDisplayDriver()
	{
		return new LowResDisplayDriver(null);
	}
	
	public HighResDisplayDriver createHighResDisplayDriver()
	{
		return new HighResDisplayDriver(null);
	}

}

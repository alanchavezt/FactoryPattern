package PlatformFactory;

public abstract class DisplayPlatform
{
	protected abstract Widget createDisplayDriver(String item);
	 
	public Widget getDisplayDriver(String type)
	{
		Widget widget = createDisplayDriver(type);
		return widget;
	}
}

package PlatformFactory;

public interface WidgetDriverFactory
{
	public LowResDisplayDriver createLowResDisplayDriver();
	public HighResDisplayDriver createHighResDisplayDriver();
}

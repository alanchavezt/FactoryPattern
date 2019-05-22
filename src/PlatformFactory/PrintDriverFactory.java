package PlatformFactory;

public class PrintDriverFactory implements DocumentDriverFactory
{
	public LowResPrintDriver createLowResPrintDriver()
	{
		return new LowResPrintDriver(null);
	}
	
	public HighResPrintDriver createHighResPrintDriver()
	{
		return new HighResPrintDriver(null);
	}

}

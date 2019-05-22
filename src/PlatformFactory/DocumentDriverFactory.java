package PlatformFactory;

public interface DocumentDriverFactory
{
	public LowResPrintDriver createLowResPrintDriver();
	public HighResPrintDriver createHighResPrintDriver() ;
}

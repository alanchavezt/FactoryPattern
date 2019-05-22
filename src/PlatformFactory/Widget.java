package PlatformFactory;

public abstract class Widget
{
	String name = "Widget";
	String description = "is being drawn with a";
	String resolution;
	
	void setResolution(String resolution) {
		this.resolution = resolution;
	}

	String getResolution() {
		return resolution;
	}
	
	abstract void draw();
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(name + " ");
		if (description != null) {
			result.append(description);
			result.append(" ");
		}
		if (resolution != null) {
			result.append(resolution);
			result.append("\n");
		}
		
		return result.toString();
	}
}

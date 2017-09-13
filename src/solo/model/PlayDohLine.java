package solo.model;

public class PlayDohLine
{
	private int length;
	
	public PlayDohLine()
	{
		this.length = 10;
	}
	public PlayDohLine(int length)
	{
		this.length = length;
	}
	public String toString()
	{
		String description = "I am a line and my length is " + length;
		return description;
	}

}

package dk.muj.longerdays;

public class DayLengthSetting
{
	public DayLengthSetting()
	{
		
	}
	
	private int dayLengthMultiplier = 1;
	private int nightLengthMultiplier = 1;

	
	public int getDayLengthMultiplier()
	{
		return dayLengthMultiplier;
	}
	public void setDayLengthMultiplier(int summerDayLengthMultiplier)
	{
		this.dayLengthMultiplier = dayLengthMultiplier;
	}

	public int getNightLengthMultiplier()
	{
		return nightLengthMultiplier;
	}
	public void setNightLengthMultiplier(int nightLengthMultiplier)
	{
		this.nightLengthMultiplier = nightLengthMultiplier;
	}

}

package dk.muj.longerdays.entity;

import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import dk.muj.longerdays.DayLengthSetting;

import java.util.Map;

public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	
	public Map<String, DayLengthSetting> worldTimeMultipliers = MUtil.map(
		"world1", new DayLengthSetting(),
		"world2", new DayLengthSetting(),
		"world3", new DayLengthSetting(),
		"world4", new DayLengthSetting()

	);

}
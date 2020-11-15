package holderPattern;

public class HotTemperature implements ITemperature {

	String dbString = "HOT";
	
	@Override
	public String toDbString() {
		
		return dbString;
	}

	@Override
	public void operateThermostat(Thermostat thermostat) {
		
		thermostat.cooling();
	}

}

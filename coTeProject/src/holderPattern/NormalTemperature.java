package holderPattern;

public class NormalTemperature implements ITemperature {

	String dbString = "NORMAL";

	@Override
	public String toDbString() {
		
		return dbString;
	}

	@Override
	public void operateThermostat(Thermostat thermostat) {
		
		thermostat.stop();
	}
	
	
}

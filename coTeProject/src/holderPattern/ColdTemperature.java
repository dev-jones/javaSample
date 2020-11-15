package holderPattern;

public class ColdTemperature implements ITemperature {

	String dbString = "COLD";
	
	@Override
	public String toDbString() {
		
		return dbString;
	}

	@Override
	public void operateThermostat(Thermostat thermostat) {
		
		thermostat.cooling();
	}

}

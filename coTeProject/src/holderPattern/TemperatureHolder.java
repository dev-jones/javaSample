package holderPattern;

public class TemperatureHolder {

	public static final ITemperature HOT = new HotTemperature();
	public static final ITemperature NORMAL = new NormalTemperature();
	public static final ITemperature COLD = new ColdTemperature();
	
	public static ITemperature getTemperature(int temperature) {
		
		if(temperature > 30) return HOT;
		if(temperature >= 0) return NORMAL;
		else return COLD;
	}
}

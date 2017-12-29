
public class Thermostat {
	
	public enum PartOfDay{
		Sleep,Wake;
	}
	public enum Temp {
		High, Low;
	}
	
	//Valores iniciales
	static PartOfDay partOfDay = PartOfDay.Wake;
	static Temp temperatura = Temp.Low;
	

	public static void advance() {
		if (partOfDay == PartOfDay.Wake){
			partOfDay = PartOfDay.Sleep;
		} else if (partOfDay == PartOfDay.Sleep) {
			partOfDay = PartOfDay.Wake;
		}
	}
	
	public static void up() {
		if (temperatura == Temp.Low) {
			temperatura = Temp.High;
		}
	}
	
	public static void down() {
		if (temperatura == Temp.High) {
			temperatura = Temp.Low;
		}
	}
}

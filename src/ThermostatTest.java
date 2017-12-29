import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;



class ThermostatTest {
	
	@Before
	public void setUp() {
		Thermostat.partOfDay = Thermostat.PartOfDay.Wake;
		Thermostat.temperatura = Thermostat.Temp.Low;
	}
	
	//Probamos lo implementado en el apartado 2
	@Test
	public void test() {
		assertTrue("Los valores iniciales no son los correctos", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Wake && 
				Thermostat.temperatura == Thermostat.Temp.Low);
		Thermostat.up();
		assertTrue("Falla al hacer up", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Wake && 
				Thermostat.temperatura == Thermostat.Temp.High);
		Thermostat.advance();
		assertTrue("Falla al hacer advance", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Sleep && 
				Thermostat.temperatura == Thermostat.Temp.High);
		Thermostat.down();
		assertTrue("Falla al hacer down", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Sleep && 
				Thermostat.temperatura == Thermostat.Temp.Low);
		Thermostat.advance();
		assertTrue("Falla al hacer advance", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Wake && 
				Thermostat.temperatura == Thermostat.Temp.Low);
		Thermostat.advance();
		assertTrue("Falla al hacer advance", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Sleep && 
				Thermostat.temperatura == Thermostat.Temp.Low);
		Thermostat.up();
		assertTrue("Falla al hacer up", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Sleep && 
				Thermostat.temperatura == Thermostat.Temp.High);
		Thermostat.advance();
		assertTrue("Falla al hacer advance", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Wake && 
				Thermostat.temperatura == Thermostat.Temp.High);
		Thermostat.down();
		assertTrue("Falla al hacer advance", 
				Thermostat.partOfDay== Thermostat.PartOfDay.Wake && 
				Thermostat.temperatura == Thermostat.Temp.Low);
	}

}

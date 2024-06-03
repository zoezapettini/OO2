package ejercicio16.ejercicio16;
import java.util.*;

public interface HomeWeatherData  {
	
	public abstract double getPresion();
	public abstract double getRadiacionSolar();
	public abstract double getTemperatura();
	public abstract List<Double>getTemperaturas();
	public abstract String displayData();

}

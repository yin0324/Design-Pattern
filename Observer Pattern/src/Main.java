import Model.Observable.WeatherStation;
import Model.Observer.DigitalDisplay;
import Model.Observer.PhyiscalDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhyiscalDisplay phyiscalDisplay = new PhyiscalDisplay(weatherStation);
        weatherStation.add(phyiscalDisplay);
        DigitalDisplay digitalDisplay = new DigitalDisplay(weatherStation);
        weatherStation.add(digitalDisplay);

        weatherStation.updateTemperatureFromSensor(30);
        weatherStation.updateTemperatureFromSensor(50);
    }
}
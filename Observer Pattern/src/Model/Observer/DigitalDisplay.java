package Model.Observer;

import Interface.IObserver;
import Model.Observable.WeatherStation;
import lombok.Getter;
import lombok.Setter;

public class DigitalDisplay implements IObserver {

    WeatherStation weatherStation;
    @Getter
    @Setter
    private double temperature;

    @Override
    public void update() {
        this.setTemperature(weatherStation.getTemperature());
        System.out.println("Digital Display gets updated on temperature " + this.getTemperature());
    }

    public DigitalDisplay (WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

}

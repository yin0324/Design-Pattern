package Model.Observable;

import Interface.IObservable;
import Interface.IObserver;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private List<IObserver> observers;
    @Getter
    @Setter
    private double temperature;
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void push() {
        observers.stream().forEach(
                observer -> observer.update()
        );
    }

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void updateTemperatureFromSensor(double latestTemperature) {
        this.setTemperature(latestTemperature);
        this.push();
    }
}

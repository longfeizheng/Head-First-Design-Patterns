package cn.merryyou.chapter02;

import java.util.ArrayList;

/**
 * Created on 2017/11/3 0003.
 *
 * @author zlf
 * @since 1.0
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChaged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChaged();
    }

}

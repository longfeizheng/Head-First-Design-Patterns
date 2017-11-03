package cn.merryyou.chapter02;

/**
 * Created on 2017/11/3 0003.
 *
 * @author zlf
 * @since 1.0
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay() {
    }

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }


}

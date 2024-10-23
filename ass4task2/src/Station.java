import java.util.ArrayList;
import java.util.List;

public class Station {
    private List<Display> displays;
    private double temp;
    private double humidity;
    private double pressure;

    public Station() {
        displays = new ArrayList<>();
    }

    public void registerDisplay(Display display) {
        displays.add(display);
    }

    public void removeDisplay(Display display) {
        displays.remove(display);
    }

    public void setWeather(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }

    private void notifyDisplays() {
        for (Display display : displays) {
            display.update(temp, humidity, pressure);
        }
    }
}

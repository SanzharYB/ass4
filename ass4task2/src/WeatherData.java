public class WeatherData {
    private Station station;

    public WeatherData() {
        station = new Station();
    }

    public void addDisplay(Display display) {
        station.registerDisplay(display);
    }

    public void updateWeather(double temp, double humidity, double pressure) {
        station.setWeather(temp, humidity, pressure);
    }
}

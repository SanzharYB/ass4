public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay();
        StatsDisplay statsDisplay = new StatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addDisplay(currentDisplay);
        weatherData.addDisplay(statsDisplay);
        weatherData.addDisplay(forecastDisplay);

        weatherData.updateWeather(30.0, 65.0, 30.4);
        weatherData.updateWeather(28.0, 70.0, 29.2);
        weatherData.updateWeather(26.0, 90.0, 29.2);
    }
}

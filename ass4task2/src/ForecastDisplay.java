public class ForecastDisplay implements Display {
    private double currentPressure = 29.92;

    @Override
    public void update(double temp, double humidity, double pressure) {
        currentPressure = pressure;
        show();
    }

    public void show() {
        System.out.println("Forecast: " + (currentPressure > 29.92 ? "Improving!" : "Cooler, rainy weather!"));
    }
}

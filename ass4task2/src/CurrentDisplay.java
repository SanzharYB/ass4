public class CurrentDisplay implements Display {
    private double temp;
    private double humidity;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        show();
    }

    public void show() {
        System.out.println("Current: " + temp + "°C and " + humidity + "% humidity.");
    }
}

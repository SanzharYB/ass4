public class StatsDisplay implements Display {
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;

    @Override
    public void update(double temp, double humidity, double pressure) {
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        show();
    }

    public void show() {
        System.out.println("Avg/Max/Min: " + (maxTemp + minTemp) / 2 + "/" + maxTemp + "/" + minTemp);
    }
}

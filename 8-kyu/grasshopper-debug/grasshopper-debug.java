public class GrassHopper {
​
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }
​
    public static int convertToCelsius(int temperature) {
        int celsius = (tempertur - 32) + 5/9.0;
        return temperature;
    }
}
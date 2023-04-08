public class WeatherDriver {
    public static void main(String[] args) {
        Weather newWeather = new Weather();

        System.out.println(newWeather.checkWeatherCondition("rain"));
        System.out.println(newWeather.checkWeatherCondition("snow"));
    }
}

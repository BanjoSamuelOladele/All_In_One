public class Weather {
        public static void main(String[] args) {
                Weather weatherObject = new Weather();
                System.out.println(weatherObject.checkWeatherCondition("wind"));
        }
        public String checkWeatherCondition(String weatherIn){
                return switch (weatherIn) {
                        case "rain" -> "use umbrella";
                        case "wind" -> "use jacket";
                        case "sunny" -> "use shades";
                        case "snow" -> "stay at home";
                        default -> " ";
                };
        }
}

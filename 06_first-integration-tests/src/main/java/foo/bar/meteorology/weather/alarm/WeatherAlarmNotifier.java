package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;

public class WeatherAlarmNotifier {
    public WeatherAlarmNotifier() {

    }

    public static void main(String[] args) {
        WeatherAlarmNotifier wan = new WeatherAlarmNotifier();
        wan.raiseLevelIfNeccessary();
    }

    private WeatherService weatherService;

    public WeatherAlarmNotifier(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public WeatherAlarmLevel raiseLevelIfNeccessary() {
        Weather weather = weatherService.getWeather();
        if (weather.getTemprature() > 35 && weather.getRainfall() < 100 && weather.getWindSpeed() < 100) {
            return WeatherAlarmLevel.SECOND_LEVEL;
        }
        if (weather.getTemprature() < 35 && weather.getRainfall() < 100 && weather.getWindSpeed() > 100) {
            return WeatherAlarmLevel.SECOND_LEVEL;
        }
        if (weather.getTemprature() < 35 && weather.getRainfall() > 100 && weather.getWindSpeed() < 100) {
            return WeatherAlarmLevel.THIRD_LEVEL;
        }
        if (weather.getTemprature() < 35 && weather.getRainfall() < 100 && weather.getWindSpeed() < 100) {
            return WeatherAlarmLevel.ALL_OK;
        }
        else {
            return WeatherAlarmLevel.FIRST_LEVEL;
        }
    }
}
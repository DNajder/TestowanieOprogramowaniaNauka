package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlarmNotifierTest {

    private WeatherAlarmNotifier alarmNotifier =
            new WeatherAlarmNotifier(
                    new WeatherService(
                            new TemperatureProvider(),
                            new RainfallProvider(),
                            new WindSpeedProvider()
                    )
            );
    WeatherService mokservic = Mockito.mock(WeatherService.class);
    private WeatherAlarmNotifier weatherAlarmMok = new WeatherAlarmNotifier(mokservic);

    //  @Test
    //  void TestWeatherAlarmNotifierMok(){
    //      Mockito.when(mokservic.getWeather()).thenReturn(new Weather(38,70,150));
    //      WeatherAlarmLevel weatherAlarmLevel = weatherAlarmMok.raiseLevelIfNeccessary();
    //      Assertions.assertEquals("FIRST_LEVEL", weatherAlarmLevel);
//
    //  }
    @Test
    void TestWeatherAlarmNotifierMokTemperature() {
        Mockito.when(mokservic.getWeather()).thenReturn(new Weather(38, 70, 90));
        WeatherAlarmLevel weatherAlarmLevel = weatherAlarmMok.raiseLevelIfNeccessary();
        Assertions.assertEquals(WeatherAlarmLevel.SECOND_LEVEL, weatherAlarmLevel);

    }

    @Test
    void TestWeatherAlarmNotifierMokWind() {
        Mockito.when(mokservic.getWeather()).thenReturn(new Weather(33, 110, 90));
        WeatherAlarmLevel weatherAlarmLevel = weatherAlarmMok.raiseLevelIfNeccessary();
        Assertions.assertEquals(WeatherAlarmLevel.SECOND_LEVEL, weatherAlarmLevel);
    }

    @Test
    void TestWeatherAlarmNotifierMokRain() {
        Mockito.when(mokservic.getWeather()).thenReturn(new Weather(33, 90, 110));
        WeatherAlarmLevel weatherAlarmLevel = weatherAlarmMok.raiseLevelIfNeccessary();
        Assertions.assertEquals(WeatherAlarmLevel.THIRD_LEVEL, weatherAlarmLevel);
    }
    @Test
    void TestWeatherAlarmNotifierMokFirstLevel() {
        Mockito.when(mokservic.getWeather()).thenReturn(new Weather(38, 90, 110));
        WeatherAlarmLevel weatherAlarmLevel = weatherAlarmMok.raiseLevelIfNeccessary();
        Assertions.assertEquals(WeatherAlarmLevel.FIRST_LEVEL, weatherAlarmLevel);
    }
}

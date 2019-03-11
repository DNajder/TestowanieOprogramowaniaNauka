package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.logging.Logger;

class WeatherServiceTest {

    private WeatherService weatherService =
        new WeatherService(
            new TemperatureProvider(),
            new RainfallProvider(),
            new WindSpeedProvider()
        );

    @Test
    void testWeatherService() {
        Weather weather = weatherService.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }
    TemperatureProvider moktp = Mockito.mock(TemperatureProvider.class);
    RainfallProvider mokrp= Mockito.mock(RainfallProvider.class);
    WindSpeedProvider mokwsp= Mockito.mock(WindSpeedProvider.class);
    private WeatherService weterwhithMock= new WeatherService(moktp,mokrp,mokwsp);

    @Test
    void testWeatherServiceWithMock(){
        Mockito.when(moktp.getTemperature()).thenReturn(30);
        Mockito.when(mokrp.getRainfallLevel()).thenReturn(10);
        Mockito.when(mokwsp.getWindSpeed()).thenReturn(100);
        Weather weather = weterwhithMock.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());
    }
  // WeatherService mokservic = Mockito.mock(WeatherService.class);

  // @Test
  // void testWeatherServiceWeatherWithMock(){
  //     Weather weather = mokservic.getWeather();
  //     Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

  // }
}

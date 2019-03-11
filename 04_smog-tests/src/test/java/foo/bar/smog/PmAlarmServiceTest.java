package foo.bar.smog;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PmAlarmServiceTest {
// pierwsza opcja osobne testy
    // @Test
    // void shouldReturnNoneForMeasurement_10() {
    //     PmAlarmService service = new PmAlarmService();
    //     assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.POLAND));
    // }

    // @Test
    // void shouldReturnInfoForMeasurement_201() {
    //     PmAlarmService service = new PmAlarmService();
    //     assertEquals(AlarmLevel.INFO, service.getAlarmMessage(201, Country.POLAND));
    // }

    // @Test
    // void shouldReturnInfoForMeasurement_350() {
    //     PmAlarmService service = new PmAlarmService();
    //     assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(301, Country.POLAND));
    //}

    // 2ga opcja jadna metoda
  // private PmAlarmService pas = new PmAlarmService();
  // @Test
  // public void shouldReturnMeasurementforExample() {
  //  assertEquals(AlarmLevel.NONE,pas.getAlarmMessage(10,Country.POLAND) );
  //  assertEquals(AlarmLevel.INFO,pas.getAlarmMessage(201,Country.POLAND) );
  //  assertEquals(AlarmLevel.WARNING,pas.getAlarmMessage(301,Country.POLAND) );
   // }
    @ParameterizedTest(name = "For measurement od PM10={0}, in country = {1}, given alarm = {2}")
    @CsvSource({
            "10, POLAND, NONE",
            "201, POLAND, INFO",
            "301, POLAND, WARNING",
    })
    void shouldReturnMeasurementforExample() {
        PmAlarmService pas= new PmAlarmService();
       // assertEquals();
    }



}

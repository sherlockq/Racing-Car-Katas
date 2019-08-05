package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class AlarmShould {
    @InjectMocks
    Alarm alarm;

    @Mock
    private Sensor sensor;

    @Test
    public void stay_off_by_default() {
        assertEquals(false, alarm.isAlarmOn());
    }

    @Test
    public void stay_off_when_sensor_within_range() {
        given(sensor.popNextPressurePsiValue()).willReturn(20d);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void name() {
    }

    //    @Test
//    public void should_send_greeting_email_to_employee() {
//        System.setOut(new PrintStream(consoleContent));
//        given(clock.monthDay()).willReturn(TODAY);
//        Employee employee = anEmployee().build();
//        given(employeeRepository.findEmployeesBornOn(MonthDay.of(CURRENT_MONTH, CURRENT_DAY_OF_MONTH))).willReturn(Collections.singletonList(employee));
//
//        birthdayGreeter.sendGreetings();
//
//        String actual = consoleContent.toString();
//        assertThat(actual)
//                .isEqualTo("To:" + employee.getEmail() + ", Subject: Happy birthday!, Message: Happy birthday, dear " + employee.getFirstName()+"!");
//
//    }
}

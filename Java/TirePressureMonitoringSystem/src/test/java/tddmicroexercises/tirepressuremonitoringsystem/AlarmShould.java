package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

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
}

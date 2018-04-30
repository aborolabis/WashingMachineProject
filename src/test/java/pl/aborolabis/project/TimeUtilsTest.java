package pl.aborolabis.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeUtilsTest {

    @Test
    public void testGetTimeToString(){
        int seconds = 9000;

        String timeToString = TimeUtils.getTimeToString(seconds);

        Assertions.assertEquals("02:30:00", timeToString);
    }

    @Test
    public void testGetStringToSec(){
        String time = "02:30";

        int stringToSec = TimeUtils.getStringToSec(time);

        Assertions.assertEquals(9000, stringToSec);
    }

}
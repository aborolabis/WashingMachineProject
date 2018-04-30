package pl.aborolabis.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    public void testToString(){
        Program program = new Program(1, "cottons", 60, 2, 1200, 9000);
        String testString = "Program 1: \nname: cottons\nwater temperature: 60\nmax load size: 2\nspinning speed: 1200\ntime of the program: 02:30:00";

        String result = program.toString();

        Assertions.assertEquals(testString, result);
    }

}
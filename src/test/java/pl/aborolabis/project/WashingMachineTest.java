package pl.aborolabis.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WashingMachineTest {

    private List<Program> listOfPrograms;
    private WashingMachine washingMachine;

    @BeforeEach
    void setUp(){
        listOfPrograms = new ArrayList<>();
        Program program1 = new Program(1, "cottons", 60, 5, 1200, 9000);
        Program program2 = new Program(2, "wools", 30, 2, 1000, 3600);
        Program program3 = new Program(3, "short", 40, 2, 1000, 1800);
        Program program4 = new Program(4, "test", 10, 1, 100, 60);
        listOfPrograms.add(program1);
        listOfPrograms.add(program2);
        listOfPrograms.add(program3);
        listOfPrograms.add(program4);

        washingMachine = new WashingMachine("bekko", listOfPrograms);
    }

    @Test
    public void testSelectProgram(){
        int programNumber = 2;
        Program program = washingMachine.selectProgram(programNumber);

        Assertions.assertEquals(programNumber, program.getProgramNumber());
        Assertions.assertEquals("wools", program.getProgramName());
        Assertions.assertEquals(30, program.getWaterTemperature());
        Assertions.assertEquals(2, program.getMaxLoadSize());
        Assertions.assertEquals(1000, program.getSpinningSpeed());
        Assertions.assertEquals(3600, program.getTimeInSec());
    }

}
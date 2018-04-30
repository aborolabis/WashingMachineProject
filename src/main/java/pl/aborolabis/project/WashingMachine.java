package pl.aborolabis.project;

import java.util.List;
import java.util.Optional;

public class WashingMachine {

    private String washerName;
    private List<Program> listOfPrograms;
    private Program currentProgram;

    public WashingMachine(String washerName, List<Program> listOfPrograms) {
        this.washerName = washerName;
        this.listOfPrograms = listOfPrograms;
        currentProgram = null;
    }

    public String getWasherName() {
        return washerName;
    }

    public void setWasherName(String washerName) {
        this.washerName = washerName;
    }

    public List<Program> getListOfPrograms() {
        return listOfPrograms;
    }

    public void setListOfPrograms(List<Program> listOfPrograms) {
        this.listOfPrograms = listOfPrograms;
    }

    public Program selectProgram(int programNumber){
        Optional<Program> selectedProgram = listOfPrograms.stream().filter(program -> program.getProgramNumber() == programNumber).findFirst();

        if(selectedProgram.isPresent()){
            currentProgram = selectedProgram.get();
        }
        return currentProgram;
    }

    public Program changeProgramWaterTemperature(int newWaterTemperature){
        currentProgram.setWaterTemperature(newWaterTemperature);
        return this.currentProgram;
    }

    public Program changeProgramSpinSpeed(int spinSpeed){
        currentProgram.setSpinningSpeed(spinSpeed);
        return this.currentProgram;
    }

    public Program changeProgramTime(String time){
        int timeStringToSecInt = TimeUtils.getStringToSec(time);
        currentProgram.setTimeInSec(timeStringToSecInt);
        return this.currentProgram;
    }
}

package pl.aborolabis.project;

public class Program {

    private int programNumber;
    private String programName;
    private int waterTemperature;
    private int maxLoadSize;
    private int spinningSpeed;
    private int timeInSec;

    public Program(int programNumber, String programName, int waterTemperature, int maxLoadSize, int spinningSpeed, int timeInSec) {
        this.programNumber = programNumber;
        this.programName = programName;
        this.waterTemperature = waterTemperature;
        this.maxLoadSize = maxLoadSize;
        this.spinningSpeed = spinningSpeed;
        this.timeInSec = timeInSec;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public int getMaxLoadSize() {
        return maxLoadSize;
    }

    public void setMaxLoadSize(int maxLoadSize) {
        this.maxLoadSize = maxLoadSize;
    }

    public int getSpinningSpeed() {
        return spinningSpeed;
    }

    public void setSpinningSpeed(int spinningSpeed) {
        this.spinningSpeed = spinningSpeed;
    }

    public int getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(int timeInSec) {
        this.timeInSec = timeInSec;
    }

    @Override
    public String toString() {
        return "Program " + programNumber + ": \n" +
                "name: " + programName + '\n' +
                "water temperature: " + waterTemperature + "\n" +
                "max load size: " + maxLoadSize + "\n" +
                "spinning speed: " + spinningSpeed + "\n" +
                "time of the program: " + timeInSec;
    }
}

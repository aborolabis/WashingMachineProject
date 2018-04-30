package pl.aborolabis.project;

public class TimeUtils {

    public static String getTimeToString(int seconds){
        int mins = seconds / 60;
        int hours = mins / 60;
        int secondsLeft = seconds - (mins*60);
        int minLeft = mins - (hours*60);

        if(hours>0) {
            return String.format("%02d:%02d:%02d", hours, minLeft, secondsLeft);
        } else {
            return String.format("00:%02d:%02d", minLeft, secondsLeft);
        }
    }

    public static int getStringToSec(String timeString){
        String[] split = timeString.split(":");
        int hours = 0;
        int mins = 0;
        if(split.length == 2){
            hours = Integer.parseInt(split[0]);
            mins = Integer.parseInt(split[1]);
        } else if (split.length == 1){
            mins = Integer.parseInt(split[0]);
        }

        return (hours*60*60) + (mins*60);
    }

}

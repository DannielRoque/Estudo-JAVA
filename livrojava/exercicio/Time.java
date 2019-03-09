package br.com.javacore.livrojava.exercicio;

public class Time {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; //0 - 59

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0); // here is hour
        minute = ((m >= 0 && m < 60) ? m : 0); // here is minute
        second = ((s >= 0 && s < 60) ? s : 0); // here is second
        }
        // Conversor data e hora universal  HH:MM:SS
    public String toUniversalString(){
            return String.format("%02d:%02d:%02d", hour, minute, second );
    }

        //conversor HH:MM:SS  AM ou PM
    public String toString(){
        return String.format( "%02d:%02d:%02d %s",
                ((hour == 0 || hour == 12)? 12: hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}

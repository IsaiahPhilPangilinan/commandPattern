package commandPattern;

public class Thermostat {

    public String tempUp() {
        return "The temperature increased!";
    }

    public String tempDown() {
        return "The temperature decreased!";
    }

    public String hold() {
        return "You've locked the current temperature!";
    }

    public String run() {
        return "The thermostat returned to its programmed schedule!";
    }

}
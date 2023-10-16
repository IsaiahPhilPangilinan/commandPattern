package commandPattern;

public class LightsTurnOff implements Command {

    private Light lights;

    public LightsTurnOff(Light lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.turnOff();
    }

}

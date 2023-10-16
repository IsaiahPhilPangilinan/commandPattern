package commandPattern;

public class LightsTurnOn implements Command {

    private Light lights;

    public LightsTurnOn(Light lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.turnOn();
    }

}

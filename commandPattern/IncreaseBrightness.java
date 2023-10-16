package commandPattern;

public class IncreaseBrightness implements Command {

    private Light lights;

    public IncreaseBrightness(Light lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.increaseBrightness();
    }

}

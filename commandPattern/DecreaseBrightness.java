package commandPattern;

public class DecreaseBrightness implements Command {

    private static Light lights;

    public DecreaseBrightness(Light lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.decreaseBrightness();
    }

}

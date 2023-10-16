package commandPattern;

public class Hold implements Command {

    private Thermostat thermostat;

    public Hold(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.hold();
    }

}

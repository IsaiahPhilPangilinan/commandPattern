package commandPattern;

public class Run implements Command {

    private Thermostat thermostat;

    public Run(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.run();
    }

}

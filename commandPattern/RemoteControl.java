package commandPattern;

public class RemoteControl {
    Light light = new Light();
    Thermostat thermostat = new Thermostat();
    MusicPlayer musicPlayer = new MusicPlayer();
    LightsTurnOn lightsTurnOn = new LightsTurnOn(light);
    LightsTurnOff lightsTurnOff = new LightsTurnOff(light);
    IncreaseBrightness increaseBrightness = new IncreaseBrightness(light);
    DecreaseBrightness decreaseBrightness = new DecreaseBrightness(light);
    IncreaseTemp increaseTemp = new IncreaseTemp(thermostat);
    DecreaseTemp decreaseTemp = new DecreaseTemp(thermostat);
    Hold hold = new Hold(thermostat);
    Run run = new Run(thermostat);
    MusicVolumeUp musicVolumeUp = new MusicVolumeUp(musicPlayer);
    MusicVolumeDown musicVolumeDown = new MusicVolumeDown(musicPlayer);
    PlayMusic playMusic = new PlayMusic(musicPlayer);
    PauseMusic pauseMusic = new PauseMusic(musicPlayer);

    public void clickLightsSwitch(int sw) {
        if (sw == 0) {
            System.out.println(lightsTurnOn.execute());
            System.out.println();
        } else {
            System.out.println(lightsTurnOff.execute());
            System.out.println();
        }
    }

    public void clickIncreaseBrightness() {
        System.out.println(increaseBrightness.execute());
        System.out.println();
    }

    public void clickDecreaseBrightness() {
        System.out.println(decreaseBrightness.execute());
        System.out.println();
    }

    public void clickIncreaseTemp() {
        System.out.println(increaseTemp.execute());
        System.out.println();
    }

    public void clickDecreaseTemp() {
        System.out.println(decreaseTemp.execute());
        System.out.println();
    }

    public void clickThermostatButton(int sw) {
        if (sw == 0) {
            System.out.println(hold.execute());
            System.out.println();
        } else {
            System.out.println(run.execute());
            System.out.println();
        }
    }

    public void clickVolumeUp() {
        System.out.println(musicVolumeUp.execute());
        System.out.println();
    }

    public void clickVolumeDown() {
        System.out.println(musicVolumeDown.execute());
        System.out.println();
    }

    public void clickMusicPlayerButton(int sw) {
        if (sw == 0) {
            System.out.println(playMusic.execute());
            System.out.println();
        } else {
            System.out.println(pauseMusic.execute());
            System.out.println();
        }
    }
}

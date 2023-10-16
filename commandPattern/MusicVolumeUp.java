package commandPattern;

public class MusicVolumeUp implements Command {

    private MusicPlayer mp;

    public MusicVolumeUp(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.volumeUp();
    }

}

package commandPattern;

public class MusicVolumeDown implements Command {

    private MusicPlayer mp;

    public MusicVolumeDown(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.volumeDown();
    }

}

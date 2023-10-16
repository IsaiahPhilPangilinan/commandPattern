package commandPattern;

public class PauseMusic implements Command {

    private MusicPlayer mp;

    public PauseMusic(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.pause();
    }

}

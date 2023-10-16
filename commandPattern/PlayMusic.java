package commandPattern;

public class PlayMusic implements Command {

    private MusicPlayer mp;

    public PlayMusic(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.play();
    }

}

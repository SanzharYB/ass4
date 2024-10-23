public class SetVolume implements Command {
    private Stereo stereo;
    private int level;

    public SetVolume(Stereo stereo, int level) {
        this.stereo = stereo;
        this.level = level;
    }

    @Override
    public void execute() {
        stereo.setVolume(level);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
    }
}

package command;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    private String name;

    public StereoOffCommand(String name) {
        this.name = name;
    }

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}

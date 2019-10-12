package command;

public class TvOnCommand implements Command {
    private TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setVolume();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}

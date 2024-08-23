package Task1;

public class LightDimCommand implements Command{
    private Light light;
    private int level;
    private int prevLevel;

    public LightDimCommand(Light light, int level){
        this.light= light;
        this.level= level;
    }
    @Override
    public void execute() {
        prevLevel= light.getBrightness();
        light.dim(level);

    }

    @Override
    public void undo() {
        light.dim(prevLevel);

    }
}

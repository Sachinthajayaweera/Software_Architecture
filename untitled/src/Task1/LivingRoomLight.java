package Task1;

public class LivingRoomLight implements Light {
    private int brightness;

    String location = "Living Room Light";

    @Override
    public void on() {
        brightness = 100;
        System.out.println(location + " is ON at full brightness.");

    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println( location + " is OFF.");

    }

    @Override
    public int dim(int level) {
        brightness = level;
        System.out.println(location + " light dimmed to " + brightness + "%.");

        return level;
    }

    public int getBrightness() {
        return brightness;
    }

}
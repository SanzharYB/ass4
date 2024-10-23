public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(3);

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        remote.setCommand(0, new TurnTVOn(tv));
        remote.setCommand(1, new SetVolume(stereo, 5));
        remote.setCommand(2, new DimLights(light));

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);

        remote.pressUndo();
        remote.pressUndo();
        remote.pressUndo();
    }
}

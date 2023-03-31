package mainpack.spellPotionWandPet;
import lombok.Getter;
import lombok.Setter;


public class Wand{
    @Getter @Setter private static Core core;
    @Getter @Setter private static Wood wood;
    @Getter @Setter private int length;

    public Wand(Core core, Wood wood, int length) {
        this.core = core;
        this.wood = wood;
        this.length = length;
    }

    public static Core createCore() {
        int random = (int)(Math.random() * 14);
        core = Core.values()[random];
        return core;
    }

    public static Wood createWood() {
        int random = (int)(Math.random() * 15);
        wood = Wood.values()[random];
        return wood;
    }

    public static int setLength() {
        return (int)(Math.random() * 8 + 7);
    }

    public Wand createWand() {
        return new Wand(createCore(), createWood(), setLength());
    }
}

package mainpack.spellPotionWandPet;
import lombok.Getter;
import lombok.Setter;

public class Potion {
    private @Setter @Getter String name;
    private @Setter @Getter int heal;

    public Potion(String name, int heal) {
        this.name = name;
        this.heal = heal;
    }
}

package mainpack.spellPotionWandPet;

import lombok.Setter;
import lombok.Getter;

public abstract class AbstractSpell{
    @Getter @Setter private String name;
    @Getter @Setter private  int damage;
    @Getter @Setter private  int accuracy;

    public AbstractSpell(String name, int damage, int accuracy) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }
}

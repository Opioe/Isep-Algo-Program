package mainpack.spellPotionWandPet;

import mainpack.character.Wizard;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Spell extends AbstractSpell {

    public Spell(String name, int damage, int accuracy) {
        super(name, damage, accuracy);
    }

}

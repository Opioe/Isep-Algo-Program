package mainpack.character;
import lombok.Getter;
import lombok.Setter;
import mainpack.spellPotionWandPet.Spell;

import java.util.ArrayList;


public class Enemy extends AbstractEnemy {
    @Setter @Getter private String name;


    public Enemy(String name, int maxHealth, int health, int attack, int accuracy, int defense, int potionEfficiency, ArrayList<Spell> knownSpells) {
        super(maxHealth, health, attack, accuracy, defense, potionEfficiency, knownSpells);
        this.name = name;

    }
}

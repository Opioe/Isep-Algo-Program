package mainpack.character;

import mainpack.spellPotionWandPet.Spell;

import java.util.ArrayList;

public class Boss extends AbstractEnemy{
    public Boss(int maxHealth, int health, int attack, int accuracy, int defense, int potionEfficiency, ArrayList<Spell> knownSpells) {
        super(maxHealth, health, attack, accuracy, defense, potionEfficiency, knownSpells);
    }

}

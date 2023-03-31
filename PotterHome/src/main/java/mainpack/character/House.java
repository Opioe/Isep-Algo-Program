package mainpack.character;

import mainpack.spellPotionWandPet.Potion;
import mainpack.spellPotionWandPet.Spell;
import mainpack.spellPotionWandPet.Wand;
import lombok.Getter;
import lombok.Setter;

public class House {
    @Getter @Setter private String name;
    @Getter @Setter private int potionEfficiency;
    @Getter @Setter private int attack;
    @Getter @Setter private int defense;
    @Getter @Setter private int accuracy;

    public House(String name, int potionEfficiency, int attack, int defense, int accuracy) {
        this.name = name;
        this.potionEfficiency = potionEfficiency;
        this.attack = attack;
        this.defense = defense;
        this.accuracy = accuracy;
    }


}


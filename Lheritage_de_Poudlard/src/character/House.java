package character;

import spellPotionWandPet.Potion;
import spellPotionWandPet.Spell;
import spellPotionWandPet.Wand;

public class House extends Wizard{

    public House(String name, String house, String bloodStatus, String pet, Wand wand, Spell knownSpells, Potion potions, int health, int maxHealth, int level, int experience, int gold, int strength, int dexterity, int defence, int intelligence) {
        super(name, house, bloodStatus, pet, wand, knownSpells, potions, health, maxHealth, level, experience, gold, strength, dexterity, defence, intelligence);
    }

    public void Serpentard(){
        Wizard.setHouse("Serpentard");
        System.out.println("Serpentard");
    }

    public void Gryffondor(){
        System.out.println("Gryffondor");
    }

    public void Poufsouffle(){
        System.out.println("Poufsouffle");
    }

    public void Serdaigle(){
        System.out.println("Serdaigle");
    }
}

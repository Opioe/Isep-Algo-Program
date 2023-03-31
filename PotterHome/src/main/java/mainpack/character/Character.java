package mainpack.character;
import lombok.Getter;
import lombok.Setter;
import mainpack.spellPotionWandPet.Pet;
import mainpack.spellPotionWandPet.Potion;
import mainpack.spellPotionWandPet.Spell;
import mainpack.spellPotionWandPet.Wand;

import java.util.ArrayList;

public abstract class Character {
        @Setter @Getter public int maxHealth;
        @Setter @Getter public int health;
        @Setter @Getter public int attack;
        @Setter @Getter public int accuracy;
        @Setter @Getter public int defense;
        @Setter @Getter public int potionEfficiency;
        @Setter @Getter public ArrayList<Spell> knownSpells;

        public Character(int maxHealth, int health, int attack, int accuracy, int defense, int potionEfficiency, ArrayList<Spell> knownSpells) {
                this.maxHealth = maxHealth;
                this.health = health;
                this.attack = attack;
                this.accuracy = accuracy;
                this.defense = defense;
                this.potionEfficiency = potionEfficiency;
                this.knownSpells = new ArrayList<>();
        }



        public void takeDamage(int damage) {
                this.health -= damage;
        }
        public boolean isAlive() {
                return this.health > 0;
        }


        public static boolean attack(Character character, Spell spell){
                int random = (int)(Math.random() * 100);
                if (random > spell.getAccuracy()+character.getAccuracy()) {
                        return false;
                } else {
                        character.takeDamage(spell.getDamage() + character.getAttack());
                        return true;
                }
        }
}
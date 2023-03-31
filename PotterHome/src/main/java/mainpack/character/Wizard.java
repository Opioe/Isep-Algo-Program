package mainpack.character;

import mainpack.spellPotionWandPet.Pet;
import mainpack.spellPotionWandPet.Potion;
import mainpack.spellPotionWandPet.Spell;
import mainpack.spellPotionWandPet.Wand;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Wizard extends Character {
    @Getter @Setter private  String name;
    @Getter @Setter public  House house;
    @Getter @Setter private  String bloodStatus;
    @Getter @Setter private  Pet pet;
    @Getter @Setter private  Wand wand;
    private  ArrayList<Spell> knownSpells;
    private  ArrayList<Potion> potions;
    @Getter @Setter private  int level;
    @Getter @Setter private  int experience;
    @Getter @Setter private  int gold;



    public Wizard(String name, String bloodStatus, House house, Pet pet, Wand wand, ArrayList<Spell> knownSpells, ArrayList<Potion> potions, int health, int maxHealth, int level, int experience, int gold) {
        super(maxHealth, health, house.getAttack(), house.getAccuracy(), house.getDefense(),  house.getPotionEfficiency(), knownSpells);
        this.name = name;
        this.bloodStatus = bloodStatus;
        this.house = house;
        this.pet = pet;
        this.wand = wand;
        this.potions = new ArrayList<Potion>();
        this.level = level;
        this.experience = experience;
        this.gold = gold;
        this.knownSpells = getKnownSpells();
    }


    public void gainMaxHealth(int health) {
        this.maxHealth += health;
    }


    public void gainHealth (int health) {
        this.health += health;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }


    public boolean gainExperience(int exp) {
        this.experience += exp;
        if (this.experience >= 100) {
            this.experience -= 100;
            this.level++;
            System.out.println("You leveled up!");
            return true;
        } else {
            return false;
        }
    }

    public int gainGold(int gold) {
        this.gold += gold;
        return this.gold;
    }

    public boolean canBuy(int price) {
        if (gold >= price) {
            gold -= price;
            return true;
        } else {
            return false;
        }
    }

    public void addSpell(Spell spell) {
        knownSpells.add(spell);
    }

    public void addPotion(Potion potion) {
        potions.add(potion);
    }

    public void defend() {
        System.out.println("The wizard defends.");
    }




    public void drinkPotion(Potion potion) {
        gainHealth(potion.getHeal() + house.getPotionEfficiency());
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public void setPotions(ArrayList<Potion> potions) {
        this.potions = potions;
    }
}


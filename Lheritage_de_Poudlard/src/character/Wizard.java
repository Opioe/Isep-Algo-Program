package character;

import spellPotionWandPet.Potion;
import spellPotionWandPet.Spell;
import spellPotionWandPet.Wand;
import lombok
import lombok.Setter;

public class Wizard extends Character {

    private @Getter  String name;
    private String house;
    private String bloodStatus;
    private String pet;
    private Wand wand;
    private Spell knownSpells;
    private Potion potions;
    private int level;
    private int experience;
    private int gold;



    public Wizard(String name, String bloodStatus, String pet, Wand wand, Spell knownSpells, Potion potions, int health, int maxHealth, int level, int experience, int gold) {
        this.name = name;
        this.bloodStatus = bloodStatus;
        this.pet = pet;
        this.wand = wand;
        this.knownSpells = knownSpells;
        this.potions = potions;
        this.health = health;
        this.maxHealth = maxHealth;
        this.level = level;
        this.experience = experience;
        this.gold = gold;

    }

    public void setHouse(String house) {

        this.house = house;
    }
    public String getHouse() {

        return house;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    public void gainHealth (int health) {
        this.health += health;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExperience() {
        return experience;
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

    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getGold() {
        return gold;
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


    public void defend() {
        System.out.println("The wizard defends.");
    }

    @Override
    public void attack() {
        System.out.println("The wizard attacks.");
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getDexterity() {
        return dexterity;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public int getDefence() {
        return defence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getIntelligence() {
        return intelligence;
    }
}

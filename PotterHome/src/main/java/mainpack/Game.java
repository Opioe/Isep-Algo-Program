package mainpack;

import mainpack.character.Character;
import mainpack.character.House;
import mainpack.character.Wizard;
import mainpack.spellPotionWandPet.*;


import java.util.ArrayList;
import java.util.Scanner;

import static mainpack.spellPotionWandPet.Wand.*;

public class Game {


    private String setName() {
        System.out.println("What is your name?");
        String name = Main.scan.nextLine();
        return name;
    }
    private String setBloodStatus() {
        int choice = 0;
        String bloodStatus = "";
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("What is your blood status?");
            System.out.println("1. Pureblood");
            System.out.println("2. Halfblood");
            System.out.println("3. Muggleborn");
            choice = Main.scan.nextInt();
            Main.scan.nextLine();
            switch (choice) {
                case 1 -> bloodStatus = "Pureblood";
                case 2 -> bloodStatus = "Halfblood";
                case 3 -> bloodStatus = "Muggleborn";
                default -> System.out.println("Invalid choice, try again");
            }
        }
        return bloodStatus;
    }
    private static Pet createPet() {
        int random = (int)(Math.random() * 5);
        return Pet.values()[random];
    }

    public static void addSpells(Spell spell, Character character) {
        ArrayList<Spell> spells = character.getKnownSpells();
        spells.add(spell);
        character.setKnownSpells(spells);
    }

    public static ArrayList<Spell> createSpells() {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(ExistingSpells.abraKadabra);
        return spells;
    }


    public static void addPotion(Potion potion, Wizard wizard) {
        ArrayList<Potion> potions = wizard.getPotions();
        potions.add(potion);
        wizard.setPotions(potions);
    }
    public static ArrayList<Potion> createPotions() {
        ArrayList<Potion> potions = new ArrayList<>();
        potions.add(ExistingPotions.healingPotion);
        return potions;
    }

    public Wizard createWizard() {
        House house = SortingHat.Sort();
        String name = setName();
        String bloodStatus = setBloodStatus();
        Wand wand = new Wand(createCore(), createWood(), setLength());
        ArrayList<Spell> spells = new ArrayList<>();
        ArrayList<Potion> potions = new ArrayList<>();
        Wizard wizard = new Wizard(name, bloodStatus, house, createPet(), wand, spells, potions, 100, 100, 1, 0, 100);
        addSpells(ExistingSpells.abraKadabra, wizard);
        addPotion(ExistingPotions.healingPotion, wizard);
        return wizard;
    }

    public Wizard startGame() {
        Main.scan = new Scanner(System.in);
        Wizard wizard = createWizard();
        System.out.println("Welcome to Hogwarts, " + wizard.getName() + "!");
        System.out.println("You are a " + wizard.getBloodStatus() + " " + wizard.house.getName() + " and you have a " + Wand.getWood() + " wand with a " + Wand.getCore() + " core.");
        System.out.println("You have a " + wizard.getPet() + " as your pet.");
        System.out.println("You have " + wizard.getGold() + " gold.");
        System.out.println("You have " + wizard.getHealth() + " health.");
        System.out.println("You have " + wizard.getLevel() + " level.");
        System.out.println("You have " + wizard.getExperience() + " experience.");
        System.out.println(" ");
        System.out.println("You are now ready to start your adventure!");
        System.out.println(" ");
        System.out.println(" ");
        return wizard;
    }




}

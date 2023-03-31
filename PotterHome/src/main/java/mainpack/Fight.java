package mainpack;

import mainpack.character.Enemy;
import mainpack.character.Wizard;
import mainpack.spellPotionWandPet.Potion;
import mainpack.character.Character;
import java.util.ArrayList;

import static mainpack.Main.scan;

public class Fight {

    public Fight(Wizard wizard, Enemy troll) {
        super();
    }

    public boolean startFight(Enemy enemy, Wizard wizard) {
        int turn = 0;
        while (enemy.isAlive() && wizard.isAlive()) {
            System.out.println(" ");
            System.out.println("Enemy health: " + enemy.getHealth());
            System.out.println("Your health: " + wizard.getHealth());
            if (turn % 2 == 0) {
                int choice = 0;
                while (choice != 1 && choice != 2) {
                    System.out.println(" ");
                    System.out.println("Your turn");
                    System.out.println("1. Use spell");
                    System.out.println("2. Drink potion");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1 -> {
                            boolean validSpell = false;
                            while (!validSpell) {
                                System.out.println("Which spell do you want to use?");
                                for (int i = 0; i < wizard.getKnownSpells().size(); i++) {
                                    System.out.println(i + 1 + ". " + wizard.getKnownSpells().get(i).getName());
                                }
                                int spellChoice = scan.nextInt() - 1;
                                if (spellChoice < 0 || spellChoice > wizard.getKnownSpells().size()) {
                                    System.out.println("Invalid choice");
                                } else {
                                    Character.attack(enemy, wizard.getKnownSpells().get(spellChoice));
                                    validSpell = true;
                                }
                            }
                        }
                        case 2 -> {
                            boolean validPotion = false;
                            while (!validPotion) {
                                System.out.println("Which potion do you want to use?");
                                for (int i = 0; i < wizard.getPotions().size(); i++) {
                                    System.out.println(i + 1 + ". " + wizard.getPotions().get(i).getName());
                                }
                                int potionChoice = scan.nextInt() - 1;
                                if (potionChoice < 0 || potionChoice > wizard.getPotions().size()) {
                                    System.out.println("Invalid choice");
                                } else {
                                    wizard.drinkPotion(wizard.getPotions().get(potionChoice));
                                    validPotion = true;
                                }
                            }
                        }
                        default -> {
                            System.out.println("Invalid choice");
                        }
                    }
                }
            } else {
                // random attack
                int random = (int)(Math.random() * enemy.getKnownSpells().size());
                System.out.println(random);
                System.out.println(enemy.getKnownSpells().size());
                Character.attack(wizard, enemy.getKnownSpells().get(random));
                System.out.println(" ");
                System.out.println("The " + enemy.getName() + " attacked you with " + enemy.getKnownSpells().get(random).getName() + "!");
            }
            turn++;

        }
        if (wizard.isAlive()) {
            System.out.println("You won");
            return true;
        } else {
            System.out.println("You died");
            return false;
        }
    }
}

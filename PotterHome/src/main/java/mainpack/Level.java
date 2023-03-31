package mainpack;
import mainpack.character.Character;
import mainpack.character.Enemy;
import mainpack.character.Wizard;
import mainpack.spellPotionWandPet.ExistingPotions;
import mainpack.spellPotionWandPet.ExistingSpells;
import mainpack.spellPotionWandPet.Spell;

import java.util.ArrayList;

import static mainpack.Game.addSpells;
import static mainpack.Game.createSpells;


public class Level {
    public static int level1(Wizard wizard) {
        Game.addSpells(ExistingSpells.lumos, wizard);
        Game.addSpells(ExistingSpells.wingardiumLeviosa, wizard);
        wizard.gainHealth(100);
        System.out.println("First year");
        System.out.println("You have to face the evil Troll who is in the toilets next to the Dungeon. To defeat him, you must lift objects and release them when they are above his head.");
        System.out.println("You also can use your wand to cast spells on it.");
        Enemy troll = new Enemy("Troll",200, 100, 30, 1, 30, 0, Game.createSpells());
        Game.addSpells(ExistingSpells.lumos, troll);
        Game.addSpells(ExistingSpells.alohomora, troll);
        Fight trollFight = new Fight(wizard, troll);
        boolean result = trollFight.startFight(troll, wizard);
        if (result) {
            wizard.gainExperience(100);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 100 experience and 20 health");
            return 2;
        } else {
            System.out.println("You lost");
            return 1;
        }
    }
    public static int level2(Wizard wizard) {
        Game.addSpells(ExistingSpells.accio, wizard);
        wizard.gainHealth(200);
        System.out.println("Second year");
        System.out.println("You are facing the terrible basilisk. If you are from Gryffindor, you can call on the legendary sword of Godric Gryffindor to defeat him. If not, you'll have to rip one of his fangs out and use it to destroy Tom Riddle's journal.");
        System.out.println("You also can use your wand to cast spells on it.");
        Enemy basilisk = new Enemy("Basilisk", 300, 200, 30, 1, 30, 0, new ArrayList<>());
        Game.addSpells(ExistingSpells.accio, basilisk);
        Game.addSpells(ExistingSpells.expelliarmus, basilisk);
        Fight basiliskFight = new Fight(wizard, basilisk);
        boolean result = basiliskFight.startFight(basilisk, wizard);
        if (result) {
            wizard.gainExperience(200);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 200 experience and 20 health");
            return 3;
        } else {
            System.out.println("You lost");
            return 2;
        }
    }
    public static int level3(Wizard wizard) {
        Game.addSpells(ExistingSpells.expectoPatronum, wizard);
        Game.addPotion(ExistingPotions.megaHealingPotion, wizard);
        wizard.gainHealth(300);
        System.out.println("Third year");
        System.out.println("The Dementors are on the loose. They roam the streets, the countryside. Luckily, you've heard of a spell to put them to flight... Expect... Expecta... Ah yes, Expectro Patronum. Your goal is to learn the spell, then use it to defeat the Dementors.");
        System.out.println("You also can use your wand to cast spells on him.");
        Enemy dementor = new Enemy("Dementor", 100, 100, 30, 1, 30, 0, new ArrayList<>());
        Game.addSpells(ExistingSpells.stupefy, dementor);
        Game.addSpells(ExistingSpells.expelliarmus, dementor);
        Fight dementorFight = new Fight(wizard, dementor);
        boolean result = dementorFight.startFight(dementor, wizard);
        if (result) {
            wizard.gainExperience(150);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 150 experience and 20 health");
            return 4;
        } else {
            System.out.println("You lost");
            return 3;
        }
    }
    public static int level4(Wizard wizard) {
        Game.addSpells(ExistingSpells.stupefy, wizard);
        wizard.gainHealth(300);
        System.out.println("Fourth year");
        System.out.println("Unfortunately, you won the Triwizard Tournament... and the right to die. You are in a cemetery, where Voldemort and Peter Pettigrew are also. Your only chance of escape is to get closer to the Portkey to pull it to you (Accio!). Don't worry, you'll see Voldemort again.");
        System.out.println("You also can use your wand to cast spells on him.");
        Enemy voldemort = new Enemy("Voldemort", 500, 500, 50, 80, 30, 20, new ArrayList<>());
        Game.addSpells(ExistingSpells.stupefy, voldemort);
        Game.addSpells(ExistingSpells.expelliarmus, voldemort);
        Game.addSpells(ExistingSpells.imperio, voldemort);
        Game.addSpells(ExistingSpells.avadaKedavra, voldemort);
        Fight voldemortFight = new Fight(wizard, voldemort);
        boolean result = voldemortFight.startFight(voldemort, wizard);
        if (result) {
            wizard.gainExperience(200);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 200 experience and 20 health");
            return 5;
        } else {
            System.out.println("You lost");
            return 4;
        }
    }
    public static int level5(Wizard wizard) {

        wizard.gainHealth(300);
        System.out.println("Fifth year");
        System.out.println("It's time for the UCEW (Universal Certificate of Elementary Witchcraft)! Dolores Ombrage is attentive to the slightest gesture. Your goal is to distract her until the fireworks are ready to go.");
        System.out.println("You also can use your wand to cast spells on her.");
        Enemy doloresOmbrage = new Enemy("Dolores Ombrage", 100, 100, 30, 20, 10, 2, new ArrayList<>());
        Game.addSpells(ExistingSpells.stupefy, doloresOmbrage);
        Game.addSpells(ExistingSpells.expelliarmus, doloresOmbrage);
        Game.addSpells(ExistingSpells.petrificusTotalus, doloresOmbrage);
        Fight doloresOmbrageFight = new Fight(wizard, doloresOmbrage);
        boolean result = doloresOmbrageFight.startFight(doloresOmbrage, wizard);
        if (result) {
            wizard.gainExperience(999999999);
            wizard.gainMaxHealth(999999999);
            wizard.gainHealth(999999999);
            System.out.println("You pass the exam ! Everyone knows that degrees define you");
            System.out.println("You are now invicible ! lol");
            return 6;
        } else {
            System.out.println("You lost");
            return 5;
        }
    }
    public static int level6(Wizard wizard) {
        Game.addSpells(ExistingSpells.sectumsempra, wizard);
        wizard.gainHealth(300);
        System.out.println("Sixth year");
        System.out.println("The Deatheaters attack Hogwarts. Are you ready to defend yourself? You must attack them from the front (Sectumsempra). If you're from Slytherin, you can decide to join the ranks of the Death Eaters.");
        Enemy deatheater = new Enemy("Death Eater", 100, 100, 40, 10, 10, 10, new ArrayList<>());
        Game.addSpells(ExistingSpells.stupefy, deatheater);
        Game.addSpells(ExistingSpells.expelliarmus, deatheater);
        Game.addSpells(ExistingSpells.petrificusTotalus, deatheater);
        Game.addSpells(ExistingSpells.avadaKedavra, deatheater);
        Game.addSpells(ExistingSpells.doloris, deatheater);
        Fight deatheaterFight = new Fight(wizard, deatheater);
        boolean result = deatheaterFight.startFight(deatheater, wizard);
        if (result) {
            wizard.gainExperience(200);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 200 experience and 20 health");
            return 7;
        } else {
            System.out.println("You are a absolute loser. But I don't want you to restart the year. So you can continue");
            System.out.println("But you are terribly bad at this game.");
            return 7;
        }
    }
    public static int level7(Wizard wizard) {
        Game.addSpells(ExistingSpells.doloris, wizard);
        Game.addSpells(ExistingSpells.avadaKedavra, wizard);
        Game.addSpells(ExistingSpells.imperio, wizard);
        Game.addSpells(ExistingSpells.alohomora, wizard);
        wizard.gainHealth(300);
        System.out.println("Seventh year");
        System.out.println("Enough procrastination, we must attack the problem at the source. You are facing Voldemort and Bellatrix Lestrange. Be careful, they can one-hit you with Avada Kedavra if you're not ready.");
        Enemy bellatrixLestrange = new Enemy("Bellatrix Lestrange", 100, 100, 30, 20, 10, 2, new ArrayList<>());
        Fight bellatrixLestrangeFight = new Fight(wizard, bellatrixLestrange);
        boolean result = bellatrixLestrangeFight.startFight(bellatrixLestrange, wizard);
        if (result) {
            wizard.gainExperience(200);
            wizard.gainMaxHealth(20);
            System.out.println("You gained 200 experience and 20 health");
        } else {
            System.out.println("You died");
            return 1;
        }
        Enemy voldemort = new Enemy("Voldemort", 500, 800, 50, 80, 30, 20, new ArrayList<>());
        Fight voldemortFight = new Fight(wizard, voldemort);
        result = voldemortFight.startFight(voldemort, wizard);
        if (result) {
            wizard.gainExperience(200);
            wizard.gainMaxHealth(20);
            System.out.println("I sure hope you won with the stats I gave you");
            return 8;
        } else {
            System.out.println("You died");
            return 1;
        }
    }
    public static void endLevel(Wizard wizard) {
        System.out.println("You won the game ! Congratulations !");
        System.out.println("You are Level " + wizard.getLevel());
    }


    public static int selectLevel(int level, Wizard wizard) {
        switch (level) {
            case 1 -> {
                return level1(wizard);
            }
            case 2 -> {
                return level2(wizard);
            }
            case 3 -> {
                return level3(wizard);
            }
            case 4 -> {
                return level4(wizard);
            }
            case 5 -> {
                return level5(wizard);
            }
            case 6 -> {
                return level6(wizard);
            }
            case 7 -> {
                return level7(wizard);
            }
            default -> {
                endLevel(wizard);
                return 9;
            }
        }
    }
}

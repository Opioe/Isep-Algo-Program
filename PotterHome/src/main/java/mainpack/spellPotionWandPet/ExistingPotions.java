package mainpack.spellPotionWandPet;

import lombok.Getter;
import lombok.Setter;

public class ExistingPotions {
    @Getter @Setter public static Potion healingPotion = new Potion("Healing Potion", 20);
    @Getter @Setter public static Potion megaHealingPotion = new Potion("Mega Healing Potion", 100);
}

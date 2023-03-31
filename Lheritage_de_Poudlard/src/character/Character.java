package character;

public abstract class Character {
        public int maxHealth;
        public int health;
        public int strength;
        public int dexterity;
        public int defence;
        public int intelligence;
        public abstract void attack();
        public void takeDamage(int damage) {
                this.health -= damage;
        }

}
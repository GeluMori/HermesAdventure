



public class Player {
    private String name;
    private int health;
    private int maxHealth;
    private int attackpower;

    public Player(String name) {
        this.name = name;
        this.maxHealth = 20;
        this.health = maxHealth;
        this.attackpower = 5;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
    }

    public int attack() {
        return attackpower;
    }
}
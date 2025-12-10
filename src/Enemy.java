import java.util.Random;

public class Enemy {
    private String name;
    private int health;
    private int attackPower;
    private Random random = new Random();

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
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
        if(health < 0) health = 0;
    }

    public int attack(){
        return random.nextInt(attackPower) + 1;
    }
}
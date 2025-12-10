import java.util.Scanner;



public class Game {

    private Scanner input = new Scanner(System.in);
    private Player player;

    public void start() {
        System.out.println("Welcome to Hermes Adventure");
        System.out.print("Enter your name: ");
        String name = input.mextLine();

        player = new Player(name);
        System.out.println("Hermes… trapped in Hades’ dungeon. Treasure awaits… if you survive.");

        firstEncounter();
    }

    private void firstEncounter(){
        Enemy skeleton = new Enemy("Skeleton Guard", 10, 4);
        System.out.println("\nA Skeleton Guard blocks your path!");

        while (player.isAlive() && skeleton.isAlive()) {
            System.out.println("\nYour HP: " + player.getHealth() +
                    " | Enemy HP: " + skeleton.getHealth());
            System.out.println("[1] Attack");
            System.out.println("[2] Run"); //WIP
            System.out.print("Choose an action: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                int dmg = player.attack();
                skeleton.takedamage(dmg);
                System.out.println("Ypu strike the " + skeleton.getName() + " for " + dmg + " damage ");
            } else {
                System.out.println("You can’t escape now!");
            }
            if (skeleton.isAlive()) {
                int enemyDmg = skeleton.attack();
                player.takeDamage(enemyDmg);
                System.out.println("The " + skeleton.getName + " hits you for " + enemyDmg + " damage ");
            }
        }
        if (player.isAlive()) {
            System.out.println("\nYou defeated the Skeleton Guard! The dungeon grows silent...");
        }else {
            System.out.print("\nYou died. Hades laughs as your body fades into the shadows...");
        }
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
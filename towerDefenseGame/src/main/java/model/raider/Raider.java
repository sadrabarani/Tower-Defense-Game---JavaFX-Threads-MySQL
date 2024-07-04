package model.raider;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
abstract public class Raider {
    private int health;
    private int speed;
    private int loot;
    private int pathIndex;

    public Raider(int health, int speed, int loot) {
        this.health = health;
        this.speed = speed;
        this.loot = loot;
        this.pathIndex = 0;
    }

    // Getters and Setters
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getLoot() { return loot; }
    public void setLoot(int loot) { this.loot = loot; }

    public int getPathIndex() { return pathIndex; }
    public void setPathIndex(int pathIndex) { this.pathIndex = pathIndex; }

    // Method to move the raider
    public void move() {
        this.pathIndex += speed;
    }
}
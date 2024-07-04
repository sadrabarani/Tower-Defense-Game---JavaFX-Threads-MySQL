package model;

public interface Spell {
    int getPrice();
    void drop();
}

class HealthSpell implements Spell {
    private int price;
    private int healthIncrease;

    public HealthSpell(int price, int healthIncrease) {
        this.price = price;
        this.healthIncrease = healthIncrease;
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void drop() {
        // Implement the effect of the spell
    }
}

class FreezeSpell implements Spell {
    private int price;
    private int duration;

    public FreezeSpell(int price, int duration) {
        this.price = price;
        this.duration = duration;
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void drop() {
        // Implement the effect of the spell
    }
}

class CoinSpell implements Spell {
    private int price;
    private int healthIncrease;

    public CoinSpell(int price, int healthIncrease) {
        this.price = price;
        this.healthIncrease = healthIncrease;
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void drop() {
        // Implement the effect of the spell
    }
}

class LittleBoySpell implements Spell {
    private int price;
    private int healthIncrease;

    public LittleBoySpell(int price, int healthIncrease) {
        this.price = price;
        this.healthIncrease = healthIncrease;
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void drop() {
        // Implement the effect of the spell
    }
}
// More spells can be implemented similarly
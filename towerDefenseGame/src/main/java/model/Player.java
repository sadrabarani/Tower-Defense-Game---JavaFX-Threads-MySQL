package model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Player {
    private int id;
    private String username;
    private String displayName;
    private String password;
    private int level;
    private int diamonds;
    private List<Spell> spells;

    public Player(String username, String displayName, String password) {
        this.username = username;
        this.displayName = displayName;
        this.password = password;
        this.level = 1;
        this.diamonds = 0;
        this.spells = new ArrayList<>();
    }

    public List<Spell> getSpells() { return spells; }
    public void addSpell(Spell spell) { this.spells.add(spell); }

    // Other methods for registering, logging in, and purchasing spells can be added here
}

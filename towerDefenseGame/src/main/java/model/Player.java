package model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Player {
    private static int id=1;
    private String username;
    private String displayName;
    private String password;
    private int level;
    private int diamonds;
    private List<Spell> spells;
    private boolean isLogin;

    public Player(String username, String displayName, String password) {
        id+=1;
        this.username = username;
        this.displayName = displayName;
        this.password = password;
        this.level = 1;
        this.diamonds = 0;
        this.spells = new ArrayList<>();
        isLogin=true;
    }

    public List<Spell> getSpells() { return spells; }
    public void addSpell(Spell spell) { this.spells.add(spell); }

    // Other methods for registering, logging in, and purchasing spells can be added here
}

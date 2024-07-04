package model.raider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShieldRaider extends Raider{

    public ShieldRaider() {
        super(health, speed, loot);
    }
}

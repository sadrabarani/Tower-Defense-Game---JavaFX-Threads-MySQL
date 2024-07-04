package model.raider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlyRaider extends Raider{
    public FlyRaider() {
        super(health, speed, loot);
    }
}

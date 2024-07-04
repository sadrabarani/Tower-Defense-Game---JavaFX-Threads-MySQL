package model.raider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttackerRaider extends Raider{
    public AttackerRaider() {
        super(health, speed, loot);
    }
}

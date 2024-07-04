package model.raider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MiniBossRaider extends Raider{

    public MiniBossRaider() {
        super(health, speed, loot);
    }
}

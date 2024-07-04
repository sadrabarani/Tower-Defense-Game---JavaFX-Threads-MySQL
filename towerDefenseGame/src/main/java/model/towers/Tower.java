package model.towers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class Tower {
    int powerDistruction;
    int cost;
    int range;

    public Tower(int powerDistruction, int cost, int range) {
        this.powerDistruction = powerDistruction;
        this.cost = cost;
        this.range = range;
    }
}

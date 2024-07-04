package model.towers;
import lombok.*;

@Getter @Setter
public class archerTower extends Tower{
    public archerTower() {
        super(powerDistruction, cost, range);
    }
}

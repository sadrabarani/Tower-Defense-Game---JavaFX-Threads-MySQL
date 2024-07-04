package model.maps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.raider.Raider;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class GameMap {
    private final ArrayList<Integer> heroPathX;
    private final ArrayList<Integer> towerPositionsX;
    private final Integer endPointX;
    private final ArrayList<Integer> heroPathY;
    private final ArrayList<Integer> towerPositionsY;
    private final Integer ENDPOINTy;
    private final ArrayList<Raider> RAIDERS;
    private final int STARTCOIN;
}
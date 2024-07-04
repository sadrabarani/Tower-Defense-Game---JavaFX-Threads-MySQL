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
    private ArrayList<Integer> heroPathX;
    private ArrayList<Integer> towerPositionsX;
    private Integer endPointX;
    private ArrayList<Integer> heroPathY;
    private ArrayList<Integer> towerPositionsY;
    private Integer endPointY;
    private ArrayList<Raider> raiders;
    private int startingCoin;
}
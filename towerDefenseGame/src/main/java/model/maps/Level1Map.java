package model.maps;

import model.raider.Raider;

import java.util.ArrayList;

public class Level1Map extends GameMap{
    public Level1Map() {
        super(heroPathX, towerPositionsX, endPointX, heroPathY, towerPositionsY, endPointY, raiders, startingCoin);
    }
}

package model.DataBase;

import lombok.Getter;
import lombok.Setter;
import model.Player;

import java.util.ArrayList;
import java.util.Date;

@Getter@Setter
public class DataBase {
    private ArrayList<Player>players;
    private static DataBase dataBase;

    public DataBase() {
        this.players = new ArrayList<>();
    }

    public static DataBase getDatabase(){
        if(dataBase==null)
            dataBase=new DataBase();
        return dataBase;
    }
}

package controler;

import exeptions.InvalidFormatException;
import exeptions.SameExistExption;
import exeptions.UserNotFoundException;
import exeptions.WrongPaswordException;
import lombok.Getter;
import lombok.Setter;
import model.DataBase.DataBase;
import model.Player;
import model.Spell;

import java.util.ArrayList;

@Getter
@Setter
public class PlayerControler {
    private static PlayerControler playerControler;
    private Player player;

    private PlayerControler() {
    }

    public static PlayerControler getPlayerControler() {
        if (playerControler == null)
            playerControler = new PlayerControler();
        return playerControler;
    }

    public String signUpPlayer(String username, String displayname, String pasword) {
        if (!Regex.passwordRegex(pasword))
            throw new InvalidFormatException(" use harder password with more than 8 character");
        ArrayList<Player> players = DataBase.getDatabase().getPlayers();
        for (Player player1 : players) {
            if (player1.getUsername().equals(username)) {
                throw new SameExistExption("user name already exist");
            }
        }
        player = new Player(username, displayname, pasword);
        setPlayer(player);
        DataBase.getDatabase().getPlayers().add(player);
        player.setLogin(true);
        return "sign uped";
    }

    public String login(String username, String password) throws UserNotFoundException {
        ArrayList<Player> players = DataBase.getDatabase().getPlayers();
        int counter = 0;
        for (Player user : players) {
            if (user.getUsername().equals(username))
                break;
            counter++;
        }
        if (counter == players.size())
            throw new UserNotFoundException();
        for (Player player1 : players) {
            if (player1.getUsername().equals(username) && player.getPassword().equals(password)) {
                return "login successful .";
            }
        }
        throw new WrongPaswordException();
    }

    public String logout() {
        ArrayList<Player> players = DataBase.getDatabase().getPlayers();
        player.setLogin(false);
        return "logout successfull";
    }

    public boolean buySpell(Spell spell) {
        if (spell.getPrice() < player.getDiamonds()) {
            player.getSpells().add(spell);
            player.setDiamonds(player.getDiamonds() - spell.getPrice());
            return true;
        } else return false;
    }
}

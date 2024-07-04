package GUI;

import controler.PlayerControler;
import exeptions.FailedLoginException;
import exeptions.InvalidFormatException;
import exeptions.SameExistExption;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class LoginSignUpPage implements Initializable {

    @FXML
    private TextField fulNameTxt;

    @FXML
    private Button loginBtn;

    @FXML
    private Label loginLbl;

    @FXML
    private PasswordField passField;

    @FXML
    private TextField passTxt;

    @FXML
    private Label passlbl;

    @FXML
    private Button signInBtn;

    @FXML
    private Label userLbl;

    @FXML
    private TextField userNameTxt;

    @FXML
    private TextField userNameTxt1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginBtn.setOnMouseClicked(e -> {
            if (userNameTxt.getText().isEmpty() || passField.getText().isEmpty()) {
                Warning.warning("please compeletee every field .", "Field is empty ");
            } else {
                try {
                    PlayerControler.getPlayerControler().login(userNameTxt.getText(), passField.getText());
                } catch (FailedLoginException e1) {
                    Warning.warning(String.valueOf(e1.getClass()), e1.getMessage());
                }
            }
        });

        signInBtn.setOnMouseClicked(e -> {
            if (userNameTxt1.getText().isEmpty() || passTxt.getText().isEmpty() || fulNameTxt.getText().isEmpty()) {
                Warning.warning("please compelete every field .", "Field is empty ");
            } else {
                try {
                    Date date = null;
                    try {
                        PlayerControler.getPlayerControler().signUpPlayer(userNameTxt1.getText(), fulNameTxt.getText(), passTxt.getText());
                    } catch (Exception exception) {
                        Warning.warning(String.valueOf(exception.getClass()), exception.getMessage());
                    }
                } catch (InvalidFormatException | SameExistExption formatException) {
                    Warning.warning(String.valueOf(formatException.getClass()), formatException.getMessage());
                }
            }

        });

    }
}


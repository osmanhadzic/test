package main.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

;
public class login {
    @FXML PasswordField lozinka;
    @FXML TextField text;
    public void klik(ActionEvent actionEvent) {



        if(lozinka.getLength() < 8){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Pogrešna lozinka!");
            alert.setHeaderText("Unijeli ste pogresnu lozinku");
            alert.setContentText("Lozinka mora imati bar 8 karaktera!");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Uspješan login!");
            alert.setHeaderText("Dobro došli " + text.getText());
            alert.show();

        }
    }
}

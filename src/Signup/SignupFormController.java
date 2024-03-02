package Signup;

import Database.Customers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Database.Db;

import java.util.Optional;

public class SignupFormController {

    public AnchorPane signupForm;
    public TextField txtUsername;
    public PasswordField txtReEnterPassword;
    public PasswordField txtPassword;


    public void onClickSignup(ActionEvent actionEvent) {
        if(txtUsername.getText().equals("") || txtPassword.getText().equals("") || txtReEnterPassword.getText().equals("")){
            Alert confirm = new Alert(Alert.AlertType.WARNING,"All fields are mandatory!", ButtonType.OK);
            confirm.showAndWait();
        } else{
            if(!(txtPassword.getText().equals(txtReEnterPassword.getText()))) {
                Alert confirm = new Alert(Alert.AlertType.WARNING,"Make sure you enter the same & valid passwords!\nTry again.", ButtonType.OK);
                confirm.showAndWait();
            }else {
                if((txtPassword.getLength()) < 6) {
                    Alert confirm = new Alert(Alert.AlertType.WARNING,"Password should be longer than 5 characters", ButtonType.OK);
                    confirm.showAndWait();
                }else{
                    Db.customerData.add( new Customers(txtUsername.getText(),txtPassword.getText()));
                    txtUsername.clear();
                    Alert confirm = new Alert(Alert.AlertType.INFORMATION,"Successfully Saved!", ButtonType.OK);
                    confirm.showAndWait();
                }
            }

            txtPassword.clear();
            txtReEnterPassword.clear();

        }
    }

    public void onClickLogin(MouseEvent mouseEvent) throws Exception{
        Parent parent = FXMLLoader.load(
                getClass().getResource("../Login/LoginForm.fxml")
        );
        Stage stage = (Stage)signupForm.getScene().getWindow();
        stage.setScene(
                new Scene(parent)
        );
        stage.show();
    }
}



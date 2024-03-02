package Login;

import Database.Customers;
import Database.Db;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginFormController {
    public AnchorPane loginForm;
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void onClickLogin(ActionEvent actionEvent) throws Exception{
        if(txtUsername.getText().equals("") || txtPassword.getText().equals("")){
            Alert confirm = new Alert(Alert.AlertType.WARNING,"Make sure you filled all fields!", ButtonType.OK);
            confirm.showAndWait();
        }else {
            for (Customers c : Db.customerData){
                if(!(c.getName().equals(txtUsername.getText()))){
                    Alert confirm = new Alert(Alert.AlertType.WARNING,"Ops! That user doesn't exists!", ButtonType.OK);
                    confirm.showAndWait();
                    txtUsername.clear();
                }else{
                    if(c.getName().equals(txtUsername.getText()) && !(c.getPassword().equals(txtPassword.getText()))) {
                        Alert confirm = new Alert(Alert.AlertType.WARNING,"You have entered wrong password. \n Try again!", ButtonType.OK);
                        confirm.showAndWait();
                    }else{
                        Parent parent = FXMLLoader.load(
                                getClass().getResource("../Dashboard/DashboardForm.fxml")
                        );
                        Stage stage = (Stage) loginForm.getScene().getWindow();
                        stage.setScene(
                                new Scene(parent)
                        );
                        stage.show();
                    }
                }
                txtPassword.clear();
            }
        }
    }

    public void onClickSignup(MouseEvent mouseEvent) throws Exception {

        Parent parent = FXMLLoader.load(
                getClass().getResource("../Signup/SignupForm.fxml")
        );
        Stage stage = (Stage)loginForm.getScene().getWindow();
        stage.setScene(
                new Scene(parent)
        );
        stage.show();
    }

}

package Dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    public AnchorPane context;
    public AnchorPane DashboardForm;

    public void winOne(ActionEvent actionEvent) throws Exception{
        setUi("WinOne");
    }

    public void winTwo(ActionEvent actionEvent) throws Exception{
        setUi("WinTwo");
    }

    public void logoutBtn(ActionEvent actionEvent) throws Exception {
        Parent parent = FXMLLoader.load(
                getClass().getResource("../Login/LoginForm.fxml")
        );
        Stage stage = (Stage)DashboardForm.getScene().getWindow();
        stage.setScene(
                new Scene(parent)
        );
        stage.show();
    }

    public void setUi(String location) throws Exception{
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource( location + ".fxml")));
    }

}

package Dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WinOneController {

    public AnchorPane win1;

    public void BackBtn(ActionEvent actionEvent) throws Exception{
        Parent parent = FXMLLoader.load(
                getClass().getResource("Dashboard.fxml")
        );
        Stage stage = (Stage)win1.getScene().getWindow();
        stage.setScene(
                new Scene(parent)
        );
        stage.show();
    }
}

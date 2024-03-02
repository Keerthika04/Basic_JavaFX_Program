package Dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class winTwoController {
    public AnchorPane win2;

    public void backBtn(ActionEvent actionEvent) throws Exception {
        Parent parent = FXMLLoader.load(
                getClass().getResource("DashboardForm.fxml")
        );
        Stage stage = (Stage)win2.getScene().getWindow();
        stage.setScene(
                new Scene(parent)
        );
        stage.show();
    }
    }


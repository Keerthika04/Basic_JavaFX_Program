package Dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class DashboardController {
    public AnchorPane context;

    public void winOne(ActionEvent actionEvent) throws Exception{
        setUi("WinOne");
    }

    public void winTwo(ActionEvent actionEvent) throws Exception{
        setUi("WinTwo");
    }

    public void setUi(String location) throws Exception{
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource(location+".fxml")));
    }
}

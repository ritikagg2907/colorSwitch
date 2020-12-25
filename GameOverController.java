package colorSwitch;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class GameOverController {
	
	@FXML
	private Label score;
	@FXML
	private Button quit;
	@FXML
	private Button MainMenu;
	
	
	public void quit (ActionEvent event) throws IOException{
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

	
    public void MainMenu (ActionEvent event) throws IOException{
    	 ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

         GridPane grid = FXMLLoader.load(getClass().getResource("Main.fxml"));
         Scene scene = new Scene(grid);
         Stage stage = new Stage();

         stage.setTitle("Main Menu");


         stage.setScene(scene);
         stage.setResizable(false);
         stage.initModality(Modality.APPLICATION_MODAL);

         stage.show();
    }
    


}
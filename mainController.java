package colorSwitch;

import javafx.animation.RotateTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;

public class mainController {

    @FXML
    private Button newGame;
    @FXML
    public Button close;

    @FXML
    private AnchorPane mainPane;


    @FXML
    private void initialize(){

        Circles cir = new Circles(200.f, 100.f, 80f, 10);


        Circles cir2 = new Circles(200.f, 100.f, 110f, 10);


        // Group circle = cir.Circles();
        // Group circle2 = cir2.Circles();
        RotateTransition rotate = new RotateTransition(Duration.seconds(1), cir.group);
        rotate.setFromAngle(45);
        rotate.setToAngle(405);
        rotate.setRate(0.1);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        RotateTransition rota = new RotateTransition(Duration.seconds(1), cir2.group);
        rota.setFromAngle(405);
        rota.setToAngle(45);
        rota.setRate(0.2);
        rota.setCycleCount(RotateTransition.INDEFINITE);
        rota.play();

        AnchorPane.setTopAnchor(cir.group, 280.0);
        AnchorPane.setLeftAnchor(cir.group, 280.0);
        AnchorPane.setRightAnchor(cir.group, 260.0);
        AnchorPane.setBottomAnchor(cir.group, 260.0);

        AnchorPane.setTopAnchor(cir2.group, 250.0);
        AnchorPane.setLeftAnchor(cir2.group,250.0);
        AnchorPane.setRightAnchor(cir.group, 260.0);
        AnchorPane.setBottomAnchor(cir2.group, 260.0);

        ObservableList list = mainPane.getChildren();
        list.addAll(cir.group, cir2.group);



    }

    public void newGame(ActionEvent event) throws IOException {
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        GridPane grid = FXMLLoader.load(getClass().getResource("GamePlay.fxml"));
        Scene scene = new Scene(grid);
        Stage stage = new Stage();

        stage.setTitle("Game screen");


        stage.setScene(scene);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();

    }

    public void resumeGame(ActionEvent event) throws IOException {
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        GridPane grid = FXMLLoader.load(getClass().getResource("Resume.fxml"));
        Scene scene = new Scene(grid);
        Stage stage = new Stage();

        stage.setTitle("Saved Games");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();

    }
    
    public void Instagram(ActionEvent event) throws IOException {
		
		  try { Desktop.getDesktop().browse(new URL("https://www.instagram.com/accounts/login/").toURI());
		  } catch (Exception e) {}
		 
		/*
		 * Stage primaryStage = new Stage();
		 * primaryStage.setTitle("JavaFX WebView Example");
		 * 
		 * WebView webView = new WebView();
		 * 
		 * webView.getEngine().load("https://www.instagram.com/accounts/login/");
		 * 
		 * VBox vBox = new VBox(webView); Scene scene = new Scene(vBox, 960, 600);
		 * 
		 * primaryStage.setScene(scene); primaryStage.show();
		 */
			/*
			 * WebView viewweb = new WebView(); WebEngine web = viewweb.getEngine();
			 * web.load("https://www.instagram.com/accounts/login/");
			 */

  }
    
    public void AboutUs(ActionEvent event) throws IOException {
		
		  try { Desktop.getDesktop().browse(new URL("https://github.com/ritikagg2907/colorSwitch/blob/main/README.md").toURI());
		  } catch (Exception e) {}
		 
		/*
		 * Stage primaryStage = new Stage();
		 * primaryStage.setTitle("JavaFX WebView Example");
		 * 
		 * WebView webView = new WebView();
		 * 
		 * webView.getEngine().load("https://www.instagram.com/accounts/login/");
		 * 
		 * VBox vBox = new VBox(webView); Scene scene = new Scene(vBox, 960, 600);
		 * 
		 * primaryStage.setScene(scene); primaryStage.show();
		 */
			/*
			 * WebView viewweb = new WebView(); WebEngine web = viewweb.getEngine();
			 * web.load("https://www.instagram.com/accounts/login/");
			 */

  }
    public void quit(ActionEvent event) throws IOException{
    	((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }



}

package colorSwitch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javafx.animation.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GamePlayController {
	private int height = 360;
	private double deptLimit = 530;
	private double ballNewPos = 0;
	private double ballInitialPos = 566;
	Timeline timeline, timeline2;
	private Group obs1, obs2, obs3, obs4;
	private Circles dummyC1 = new Circles(200.f, 100.f, 100f, 15);

	@FXML
	private Polygon star;

	@FXML
	private Label score;

	private final Color[] arr = { Color.BLUE, Color.PURPLE, Color.GREEN, Color.RED };

	static Circle ball1;
	Cross cross;
	@FXML
	public AnchorPane gamePane;
	private Group ballChanger1;
	private int star_count = 0;

	ArrayList<Group> allObstacles = new ArrayList<>();
	ArrayList<Group> starAndChanger = new ArrayList<>();

	Group currrentObs, currStarOrChanger;
	Group root1, r1;

	@FXML
	public void initialize() throws FileNotFoundException {
		Circles cir1 = new Circles(200.f, 100.f, 100f, 15);
		Circles cir2 = new Circles(200.f, 100.f, 100f, 15, Color.BLUE, Color.PURPLE, Color.GREEN, Color.RED);
		this.cross = new Cross(200.f, 100.f, 80f, 15);
		Rectangle r1 = new Rectangle(200.0f, 100.0f, 140f, 15);
		r1.group.relocate(280, 0);

		// cir1.rotateObstacle(cir1.group,0,405,0.2);
		// cir2.rotateObstacle(cir2.group, 0,405,0.2);
		cir1.group.setLayoutX(35);
		cir2.group.setLayoutX(242);
		Circles cir3 = new Circles(200.f, 100.f, 100f, 15);
		cir3.group.setLayoutX(150);

		Image image = new Image(new FileInputStream(
				"C:\\Users\\Ritik Aggarwal\\eclipse-workspace\\colorSwitch\\src\\colorSwitch\\images\\star.png"));

		// Setting the image view
		ImageView imageView = new ImageView(image);

		// Setting the position of the image
		imageView.setX(315f);
		imageView.setY(75f);

		// setting the fit height and width of the image view
		imageView.setFitHeight(25);
		imageView.setFitWidth(30);

		// Setting the preserve ratio of the image view
		imageView.setPreserveRatio(true);
		root1 = new Group(imageView);
		this.starAndChanger.add(root1);
		this.starAndChanger.add(root1);
		this.starAndChanger.add(root1);

		// ROTATE OBSTACLES
		// cir1.rotateObstacle(cir1.group, 0,405,0.2);
		// cir2.rotateObstacle(cir2.group, 0,405,0.2);
		cir3.rotateObstacle(cir3.group, 0, 405, 0.2);
		r1.rotateObstacle(r1.group, 405, 45, 0.2);

		obs1 = cross.group;
		obs2 = cir3.group;
		obs3 = r1.group;
		// obs4 = new Group(cir1.group, cir2.group);

		this.allObstacles.add(obs1);
		this.allObstacles.add(obs2);
		this.allObstacles.add(obs3);

		this.currStarOrChanger = starAndChanger.get(0);
		this.currrentObs = allObstacles.get(0);
		// this.allObstacles.add(obs4);

		// System.out.println(lineList.get(0).getClass());

		// System.out.println(allObstacles.size());
		Ball ball = new Ball(200.f, 100.f, 15.f);

		AnimationTimer timer = new MyTimer();
		timer.start();
		BallChanger ballChanger = new BallChanger(200.f, 100.f, 25f);
		Circle ball1 = ball.createBall();
		this.ball1 = ball1;
		ballChanger1 = ballChanger.createBallChanger();

		this.starAndChanger.add(ballChanger1);
		this.starAndChanger.add(ballChanger1);

		this.starAndChanger.add(ballChanger1);

		RotateTransition rotate = new RotateTransition(Duration.seconds(1), cross.group);
		rotate.setFromAngle(45);
		rotate.setToAngle(405);
		rotate.setRate(0.15);
		rotate.setCycleCount(RotateTransition.INDEFINITE);
		rotate.play();

		RotateTransition rotate1 = new RotateTransition(Duration.seconds(1), ballChanger1);
		rotate1.setFromAngle(45);
		rotate1.setToAngle(405);
		rotate1.setRate(0.15);
		rotate1.setCycleCount(RotateTransition.INDEFINITE);
		rotate1.play();
		cross.group.setLayoutX(200);
		// cross.group.setLayoutY(150);

		ball1.setLayoutX(330);
		ball1.setLayoutY(500);
		score.setText(Integer.toString(star_count));
		// score.setText("score :" + Integer.toString(star_count));

		ballChanger1.setLayoutX(100);
		ballChanger1.setLayoutY(300);

		ObservableList list = gamePane.getChildren();
		list.addAll(ball1, ballChanger1, root1);
		getCurrObstacle();

	}

	public void getCurrObstacle() {
		Random random = new Random();
		boolean flag = false;
		int index = -1;
		index = random.nextInt(this.allObstacles.size());
		/*
		 * while (!flag) { if (index != this.allObstacles.indexOf(this.currrentObs)) {
		 * flag = true; } else { continue; } }
		 */
		this.currrentObs = this.allObstacles.get(index);
		gamePane.getChildren().add(currrentObs);
	}

	public void getCurrStarOrChanger() {
		Random random = new Random();
		boolean flag = false;
		int index = -1;
		index = random.nextInt(this.starAndChanger.size());
		/*
		 * while (!flag) { if (index != this.allObstacles.indexOf(this.currrentObs)) {
		 * flag = true; } else { continue; } }
		 */
		this.currStarOrChanger = this.starAndChanger.get(index);
		gamePane.getChildren().add(currStarOrChanger);
	}

	public void checkDepth() {
		if (this.currrentObs.getLayoutY() >= this.deptLimit) {
			this.currrentObs.setLayoutY(0);
			this.allObstacles.add(currrentObs);
			gamePane.getChildren().remove(currrentObs);
			getCurrObstacle();
		}
		if (this.currStarOrChanger.getLayoutY() >= this.deptLimit) {
			this.currStarOrChanger.setLayoutY(0);
			this.starAndChanger.add(currStarOrChanger);
			gamePane.getChildren().remove(currStarOrChanger);
			getCurrStarOrChanger();
		}
	}

	/*
	 * public void addMusic() { File lol = new File("D:\\bs.wav");
	 * 
	 * 
	 * try{ Clip clip = AudioSystem.getClip();
	 * clip.open(AudioSystem.getAudioInputStream(lol)); clip.start(); } catch
	 * (Exception e){ e.printStackTrace(); }
	 * 
	 * 
	 * Media sound = new Media(getClass().getResource("D:\\bs.wav").toString());
	 * MediaPlayer mediaPlayer = new MediaPlayer(sound);
	 * mediaPlayer.setAutoPlay(true);
	 * mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	 * mediaPlayer.setStartTime(Duration.seconds(0));
	 * mediaPlayer.setStopTime(Duration.seconds(1)); mediaPlayer.play();
	 * 
	 * }
	 */

	public void onSpacebarHit() throws IOException {
		//addMusic();
		if (ballNewPos < ballInitialPos) {
//            if(ball1.getLayoutY()>100) {
//                    ball1.setLayoutY(150);
//
//            }
//
//            if(ball1.getLayoutY()>550) {
//                ball1.setLayoutY(500);
//            }

			if (ball1.getLayoutY() < height) {
				root1.setLayoutY(root1.getLayoutY() + 150);
				this.currrentObs.setLayoutY(this.currrentObs.getLayoutY() + 150);
				this.ball1.setLayoutY(ball1.getLayoutY() - 70);
			} else {
				this.ball1.setLayoutY(ball1.getLayoutY() - 70);
			}
		}

		if (ball1.getBoundsInParent().intersects(ballChanger1.getBoundsInParent())) {
			Random random = new Random();
			int i = random.nextInt(4);
			Color cl = arr[i];
			ball1.setFill(cl);
			gamePane.getChildren().remove(ballChanger1);
			// ballChanger1.setLayoutY(0);
		}

		if (ball1.getBoundsInParent().intersects(root1.getBoundsInParent())) {
			gamePane.getChildren().remove(root1);
			// root.setLayoutY(0);
			this.star_count += 1;
			score.setText(Integer.toString(star_count));
			// score.setText("score :" + Integer.toString(star_count));
		}

		if (timeline2 != null) {
			ballNewPos = ball1.getLayoutY();
			timeline2.stop();
		}
		if (timeline != null) {
			timeline.stop();
		}
		if (this.currrentObs == obs1 || this.currrentObs == obs3) {
			ObservableList<Node> lineList = this.currrentObs.getChildren();
			for (int i = 0; i < lineList.size(); i++) {
				Line line = (Line) lineList.get(i);
				Shape intersect = Shape.intersect(line, ball1);
				if (intersect.getBoundsInLocal().getWidth() != -1) {
					if (ball1.getFill() != line.getStroke()) {
						this.gamePane.getScene().getWindow().hide();
						GridPane grid = FXMLLoader.load(getClass().getResource("GameOver.fxml"));
						Scene scene = new Scene(grid);
						Stage stage = new Stage();

						stage.setTitle("Game screen");

						stage.setScene(scene);
						stage.setResizable(false);
						stage.initModality(Modality.APPLICATION_MODAL);

						stage.show();
					}
				}
			}
		} else if (this.currrentObs == obs2) {
			ObservableList<Node> arcList = this.currrentObs.getChildren();
			for (int i = 0; i < arcList.size(); i++) {
				Arc arc = (Arc) arcList.get(i);
				Shape intersect = Shape.intersect(arc, ball1);
				if (intersect.getBoundsInLocal().getWidth() != -1) {
					if (ball1.getFill() != arc.getStroke()) {
						this.gamePane.getScene().getWindow().hide();
						GridPane grid = FXMLLoader.load(getClass().getResource("GameOver.fxml"));
						Scene scene = new Scene(grid);
						Stage stage = new Stage();

						stage.setTitle("Game screen");

						stage.setScene(scene);
						stage.setResizable(false);
						stage.initModality(Modality.APPLICATION_MODAL);

						stage.show();
					}
				}
			}
		}

	}

	private class Jump implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) throws NullPointerException {
			ball1.setLayoutY(ball1.getLayoutY() - 1);
		}
	}

	private class Fall implements EventHandler<ActionEvent> {

		public void handle(ActionEvent event) throws NullPointerException {
			ball1.setLayoutY(ball1.getLayoutY() + 1);
		}
	}

	private class MyTimer extends AnimationTimer {

		@Override
		public void handle(long now) {

			doHandle();
		}

		private void doHandle() {

			GamePlayController.ball1.setLayoutY(GamePlayController.ball1.getLayoutY() + 1.2);

		}
	}

	public void quit(ActionEvent event) throws IOException {
		((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

		GridPane grid = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(grid);
		Stage stage = new Stage();

		stage.setTitle("Main Menu ");

		stage.setScene(scene);
		stage.setResizable(false);
		stage.initModality(Modality.APPLICATION_MODAL);

		stage.show();
	}

}

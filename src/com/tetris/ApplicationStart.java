package com.tetris;

import com.tetris.board.GameBoard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationStart extends Application {

  private Button start = new Button();

  public static void main(String[] args) throws InterruptedException {
    GameBoard gameBoard = new GameBoard();
    gameBoard.render();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("something");
    start.setText("Start");

    StackPane layout = new StackPane();
    layout.getChildren().add(start);

    Scene scene = new Scene(layout, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}

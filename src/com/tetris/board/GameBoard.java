package com.tetris.board;

import com.tetris.figures.Triangle;

public class GameBoard {
  public String[][] gameBoard = new String[24][12];
  private Triangle triangle = new Triangle();
  Integer rowChanger = 0;
  Integer colChanger = 0;

  public GameBoard() {
    init();
  }

  public void init() {

    triangle.init();
    for (int i = 0; i < gameBoard.length; i++) {
      for (int j = 0; j < gameBoard.length / 2; j++) {
        gameBoard[i][j] = "*";
      }
    }
  }

  public void render() throws InterruptedException {
    for (int i = 0; i < gameBoard.length; i++) {
      for (int j = 0; j < gameBoard.length / 2; j++) {
        System.out.print(gameBoard[i][j]);
      }
      System.out.println();
    }
    Thread.sleep(2000);
    changeInField(rowChanger, colChanger);
    rowChanger += 1;
    if (rowChanger < 5) {
      System.out.println();
      render();
    }
  }

  public void changeInField(Integer row, Integer col) {
    triangle.move(gameBoard, row, col);
  }
}

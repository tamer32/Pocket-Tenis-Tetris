package com.tetris.figures;

public class Triangle extends Figure {

  public Triangle() {
    super.spaceTaken = new String[2][3];
  }

  @Override
  public void rotation() {}

  public void init() {
    super.init(2, 3, "T");
    spaceTaken[1][0] = "*";
    spaceTaken[1][2] = "*";
  }

  @Override
  public void move(String[][] gameBoard, Integer row, Integer col) {
    for (int i = 0; i < spaceTaken.length; i++) {
      for (int j = 0; j < spaceTaken[i].length; j++) {
        gameBoard[i][j] = "*";
        gameBoard[i + row][j + col] = spaceTaken[i][j];
      }
    }
  }

  @Override
  public String[][] getSpaceTaken() {
    return super.spaceTaken;
  }
}

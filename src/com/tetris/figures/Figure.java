package com.tetris.figures;

public abstract class Figure {
  String[][] spaceTaken;

  protected abstract void rotation();

  protected abstract void move(String[][] gameBoard, Integer row, Integer col);

  public String[][] getSpaceTaken() {
    return spaceTaken;
  }

  protected void init(Integer row, Integer col, String appearence) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        spaceTaken[i][j] = appearence;
      }
    }
  }

  public void setSpaceTaken(String[][] spaceTaken) {
    this.spaceTaken = spaceTaken;
  }
}

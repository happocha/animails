package com.potelova.data.model;

import java.io.Serializable;

public class Setting implements Serializable {
  private int consoleCellWith;

  private int period;

  private int rows;

  private int cols;

  public int getConsoleCellWith() {
    return consoleCellWith;
  }

  public void setConsoleCellWith(int consoleCellWith) {
    this.consoleCellWith = consoleCellWith;
  }

  public int getPeriod() {
    return period;
  }

  public void setPeriod(int period) {
    this.period = period;
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getCols() {
    return cols;
  }

  public void setCols(int cols) {
    this.cols = cols;
  }
}

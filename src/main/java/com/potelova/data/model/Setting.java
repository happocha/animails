package com.potelova.data.model;

import java.io.Serializable;
import java.lang.Integer;

public class Setting implements Serializable {
  private Integer consoleCellWith;

  private Integer period;

  private Integer rows;

  private Integer cols;

  private FoodMap foodMap;

  public Integer getConsoleCellWith() {
    return this.consoleCellWith;
  }

  public void setConsoleCellWith(Integer consoleCellWith) {
    this.consoleCellWith = consoleCellWith;
  }

  public Integer getPeriod() {
    return this.period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public Integer getRows() {
    return this.rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public Integer getCols() {
    return this.cols;
  }

  public void setCols(Integer cols) {
    this.cols = cols;
  }

  public FoodMap getFoodMap() {
    return this.foodMap;
  }

  public void setFoodMap(FoodMap foodMap) {
    this.foodMap = foodMap;
  }

  public static class FoodMap implements Serializable {
    private Boar Boar;

    private Rabbit Rabbit;

    private Rabbit Caterpillar;

    private Bear Bear;

    private Fox Fox;

    private Rabbit Deer;

    private Plant Plant;

    private Mouse Mouse;

    private Boa Boa;

    private Rabbit Horse;

    private Rabbit Sheep;

    private Mouse Duck;

    private Rabbit Goat;

    private Wolf Wolf;

    private Boa Eagle;

    private Plant Buffalo;

    public Boar getBoar() {
      return this.Boar;
    }

    public void setBoar(Boar Boar) {
      this.Boar = Boar;
    }

    public Rabbit getRabbit() {
      return this.Rabbit;
    }

    public void setRabbit(Rabbit Rabbit) {
      this.Rabbit = Rabbit;
    }

    public Rabbit getCaterpillar() {
      return this.Caterpillar;
    }

    public void setCaterpillar(Rabbit Caterpillar) {
      this.Caterpillar = Caterpillar;
    }

    public Bear getBear() {
      return this.Bear;
    }

    public void setBear(Bear Bear) {
      this.Bear = Bear;
    }

    public Fox getFox() {
      return this.Fox;
    }

    public void setFox(Fox Fox) {
      this.Fox = Fox;
    }

    public Rabbit getDeer() {
      return this.Deer;
    }

    public void setDeer(Rabbit Deer) {
      this.Deer = Deer;
    }

    public Plant getPlant() {
      return this.Plant;
    }

    public void setPlant(Plant Plant) {
      this.Plant = Plant;
    }

    public Mouse getMouse() {
      return this.Mouse;
    }

    public void setMouse(Mouse Mouse) {
      this.Mouse = Mouse;
    }

    public Boa getBoa() {
      return this.Boa;
    }

    public void setBoa(Boa Boa) {
      this.Boa = Boa;
    }

    public Rabbit getHorse() {
      return this.Horse;
    }

    public void setHorse(Rabbit Horse) {
      this.Horse = Horse;
    }

    public Rabbit getSheep() {
      return this.Sheep;
    }

    public void setSheep(Rabbit Sheep) {
      this.Sheep = Sheep;
    }

    public Mouse getDuck() {
      return this.Duck;
    }

    public void setDuck(Mouse Duck) {
      this.Duck = Duck;
    }

    public Rabbit getGoat() {
      return this.Goat;
    }

    public void setGoat(Rabbit Goat) {
      this.Goat = Goat;
    }

    public Wolf getWolf() {
      return this.Wolf;
    }

    public void setWolf(Wolf Wolf) {
      this.Wolf = Wolf;
    }

    public Boa getEagle() {
      return this.Eagle;
    }

    public void setEagle(Boa Eagle) {
      this.Eagle = Eagle;
    }

    public Plant getBuffalo() {
      return this.Buffalo;
    }

    public void setBuffalo(Plant Buffalo) {
      this.Buffalo = Buffalo;
    }

    public static class Boar implements Serializable {
      private Integer Plant;

      private Integer Mouse;

      private Integer Caterpillar;

      public Integer getPlant() {
        return this.Plant;
      }

      public void setPlant(Integer Plant) {
        this.Plant = Plant;
      }

      public Integer getMouse() {
        return this.Mouse;
      }

      public void setMouse(Integer Mouse) {
        this.Mouse = Mouse;
      }

      public Integer getCaterpillar() {
        return this.Caterpillar;
      }

      public void setCaterpillar(Integer Caterpillar) {
        this.Caterpillar = Caterpillar;
      }
    }

    public static class Rabbit implements Serializable {
      private Integer Plant;

      public Integer getPlant() {
        return this.Plant;
      }

      public void setPlant(Integer Plant) {
        this.Plant = Plant;
      }
    }

    public static class Bear implements Serializable {
      private Integer Boar;

      private Integer Mouse;

      private Integer Boa;

      private Integer Horse;

      private Integer Rabbit;

      private Integer Sheep;

      private Integer Duck;

      private Integer Goat;

      private Integer Deer;

      private Integer Buffalo;

      public Integer getBoar() {
        return this.Boar;
      }

      public void setBoar(Integer Boar) {
        this.Boar = Boar;
      }

      public Integer getMouse() {
        return this.Mouse;
      }

      public void setMouse(Integer Mouse) {
        this.Mouse = Mouse;
      }

      public Integer getBoa() {
        return this.Boa;
      }

      public void setBoa(Integer Boa) {
        this.Boa = Boa;
      }

      public Integer getHorse() {
        return this.Horse;
      }

      public void setHorse(Integer Horse) {
        this.Horse = Horse;
      }

      public Integer getRabbit() {
        return this.Rabbit;
      }

      public void setRabbit(Integer Rabbit) {
        this.Rabbit = Rabbit;
      }

      public Integer getSheep() {
        return this.Sheep;
      }

      public void setSheep(Integer Sheep) {
        this.Sheep = Sheep;
      }

      public Integer getDuck() {
        return this.Duck;
      }

      public void setDuck(Integer Duck) {
        this.Duck = Duck;
      }

      public Integer getGoat() {
        return this.Goat;
      }

      public void setGoat(Integer Goat) {
        this.Goat = Goat;
      }

      public Integer getDeer() {
        return this.Deer;
      }

      public void setDeer(Integer Deer) {
        this.Deer = Deer;
      }

      public Integer getBuffalo() {
        return this.Buffalo;
      }

      public void setBuffalo(Integer Buffalo) {
        this.Buffalo = Buffalo;
      }
    }

    public static class Fox implements Serializable {
      private Integer Mouse;

      private Integer Rabbit;

      private Integer Duck;

      private Integer Caterpillar;

      public Integer getMouse() {
        return this.Mouse;
      }

      public void setMouse(Integer Mouse) {
        this.Mouse = Mouse;
      }

      public Integer getRabbit() {
        return this.Rabbit;
      }

      public void setRabbit(Integer Rabbit) {
        this.Rabbit = Rabbit;
      }

      public Integer getDuck() {
        return this.Duck;
      }

      public void setDuck(Integer Duck) {
        this.Duck = Duck;
      }

      public Integer getCaterpillar() {
        return this.Caterpillar;
      }

      public void setCaterpillar(Integer Caterpillar) {
        this.Caterpillar = Caterpillar;
      }
    }

    public static class Plant implements Serializable {
    }

    public static class Mouse implements Serializable {
      private Integer Plant;

      private Integer Caterpillar;

      public Integer getPlant() {
        return this.Plant;
      }

      public void setPlant(Integer Plant) {
        this.Plant = Plant;
      }

      public Integer getCaterpillar() {
        return this.Caterpillar;
      }

      public void setCaterpillar(Integer Caterpillar) {
        this.Caterpillar = Caterpillar;
      }
    }

    public static class Boa implements Serializable {
      private Integer Mouse;

      private Integer Rabbit;

      private Integer Duck;

      private Integer Fox;

      public Integer getMouse() {
        return this.Mouse;
      }

      public void setMouse(Integer Mouse) {
        this.Mouse = Mouse;
      }

      public Integer getRabbit() {
        return this.Rabbit;
      }

      public void setRabbit(Integer Rabbit) {
        this.Rabbit = Rabbit;
      }

      public Integer getDuck() {
        return this.Duck;
      }

      public void setDuck(Integer Duck) {
        this.Duck = Duck;
      }

      public Integer getFox() {
        return this.Fox;
      }

      public void setFox(Integer Fox) {
        this.Fox = Fox;
      }
    }

    public static class Wolf implements Serializable {
      private Integer Boar;

      private Integer Mouse;

      private Integer Horse;

      private Integer Rabbit;

      private Integer Sheep;

      private Integer Duck;

      private Integer Goat;

      private Integer Deer;

      private Integer Buffalo;

      public Integer getBoar() {
        return this.Boar;
      }

      public void setBoar(Integer Boar) {
        this.Boar = Boar;
      }

      public Integer getMouse() {
        return this.Mouse;
      }

      public void setMouse(Integer Mouse) {
        this.Mouse = Mouse;
      }

      public Integer getHorse() {
        return this.Horse;
      }

      public void setHorse(Integer Horse) {
        this.Horse = Horse;
      }

      public Integer getRabbit() {
        return this.Rabbit;
      }

      public void setRabbit(Integer Rabbit) {
        this.Rabbit = Rabbit;
      }

      public Integer getSheep() {
        return this.Sheep;
      }

      public void setSheep(Integer Sheep) {
        this.Sheep = Sheep;
      }

      public Integer getDuck() {
        return this.Duck;
      }

      public void setDuck(Integer Duck) {
        this.Duck = Duck;
      }

      public Integer getGoat() {
        return this.Goat;
      }

      public void setGoat(Integer Goat) {
        this.Goat = Goat;
      }

      public Integer getDeer() {
        return this.Deer;
      }

      public void setDeer(Integer Deer) {
        this.Deer = Deer;
      }

      public Integer getBuffalo() {
        return this.Buffalo;
      }

      public void setBuffalo(Integer Buffalo) {
        this.Buffalo = Buffalo;
      }
    }
  }
}

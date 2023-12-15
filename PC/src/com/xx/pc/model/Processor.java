package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class Processor extends Characteristics implements Displayable {
  private int frequency;
  private String socet;
  public static Processor[] ProcessorsCreat(){
    Processor[] processors = new Processor[7];

    processors[0] = new Processor(339.99, "AMD", "Ryzen 7 5700X", 2023, 4900, "AM5");
    processors[1] = new Processor(469.99, "Intel", "i9-12900K", 2023, 5200, "LGA1800");
    processors[2] = new Processor(599.99, "AMD", "Ryzen 9 5950X", 2023, 5000, "AM5");
    processors[3] = new Processor(399.99, "Intel", "i7-12700K", 2023, 4800, "LGA1800");
    processors[4] = new Processor(309.99, "AMD", "Ryzen 5 5600", 2023, 4400, "AM5");
    processors[5] = new Processor(389.99, "Intel", "i5-12600F", 2023, 4300, "LGA1800");
    processors[6] = new Processor(279.99, "AMD", "Ryzen 5 3600X", 2023, 4000, "AM5");


    return processors;
  }

  public Processor(double price, String brand, String model, int year, int frequency,String socet) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.socet =socet;
  }
  public String getSocet(){
    return socet;
  }
  public int getFrequency() {
    return frequency;
  }
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Процессор" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Сокет="+ socet;
    } else {
      return  "" + getModel() + '\'';
    }
  }
}

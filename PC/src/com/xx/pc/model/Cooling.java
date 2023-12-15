package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class Cooling extends Characteristics implements Displayable {
  private int fanSpeed; // Replaced speed with fan speed
  private String coolingType; // Added cooling type (liquid or air)
  private int thermalPower; // Replaced memory capacity with thermal dissipation power

  public static Cooling[] CoolingsCreat() {
    Cooling[] coolings = new Cooling[7];

    coolings[0] = new Cooling(94.99, "Arctic", "Liquid Freezer III 420", 2023, 2500, "Liquid", 360);
    coolings[1] = new Cooling(72.99, "Noctua", "NH-U14S Redux", 2023, 1600, "Air", 200);
    coolings[2] = new Cooling(154.99, "Corsair", "iCUE H180i Elite Capellix", 2023, 3200, "Liquid", 420);
    coolings[3] = new Cooling(54.99, "Cooler Master", "Hyper 212 RGB Pro V2", 2023, 2200, "Air", 250);
    coolings[4] = new Cooling(199.99, "NZXT", "Kraken Z83", 2023, 2900, "Liquid", 360);
    coolings[5] = new Cooling(104.99, "be quiet!", "Dark Rock Pro 5", 2023, 1800, "Air", 220);
    coolings[6] = new Cooling(134.99, "Deepcool", "Castle 360EX", 2023, 2400, "Liquid", 360);


    return coolings;
  }

  public Cooling(double price, String brand, String model, int year, int fanSpeed, String coolingType, int thermalPower) {
    super(price, brand, model, year);
    this.fanSpeed = fanSpeed;
    this.coolingType = coolingType;
    this.thermalPower = thermalPower;
  }
  
  public int getFanSpeed() {
    return fanSpeed;
  }
  
  public String getCoolingType() {
    return coolingType;
  }
  
  public int getThermalPower() {
    return thermalPower;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Система охолодження" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість обертів=" + fanSpeed +
          ", Тип охолодження=" + coolingType +
          ", Потужність тепловідводу=" + thermalPower;
    } else {
      return "" + getModel() + '\'';
    }
  }
}

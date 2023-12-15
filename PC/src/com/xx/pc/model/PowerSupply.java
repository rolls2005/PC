package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class PowerSupply extends Characteristics implements Displayable {
  private int power; // Replaced frequency with power

  public static PowerSupply[] PowerSupplysCreat(){
    PowerSupply[] powerSupply = new PowerSupply[7];

    powerSupply[0] = new PowerSupply(129.99, "NZXT", "C850", 2023, 850);
    powerSupply[1] = new PowerSupply(149.99, "Seasonic", "Focus PX-1000", 2023, 1000);
    powerSupply[2] = new PowerSupply(169.99, "Corsair", "RM1000x", 2023, 1000);
    powerSupply[3] = new PowerSupply(109.99, "EVGA", "600 W1", 2023, 600);
    powerSupply[4] = new PowerSupply(99.99, "Thermaltake", "Smart BX1 650W", 2023, 650);
    powerSupply[5] = new PowerSupply(129.99, "be quiet!", "Straight Power 11 850W", 2023, 850);
    powerSupply[6] = new PowerSupply(114.99, "Antec", "NeoECO Gold Zen 700W", 2023, 700);


    return powerSupply;
  }


  public PowerSupply(double price, String brand, String model, int year, int power) {
    super(price, brand, model, year);
    this.power = power;
  }
  
  public int getPower() {
    return power;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Блок живлення" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Потужність=" + power;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
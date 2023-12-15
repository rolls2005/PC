package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class HardDrive extends Characteristics implements Displayable {
  private int speed; // Replaced power with speed
  private int capacity;

  public static HardDrive[] HardDrivesCreat() {
    HardDrive[] hardDrives = new HardDrive[7];

    hardDrives[0] = new HardDrive(94.99, "Western Digital", "WD Black 2TB", 2023, 7200, 2000);
    hardDrives[1] = new HardDrive(129.99, "Seagate", "IronWolf 6TB", 2023, 5900, 6000);
    hardDrives[2] = new HardDrive(159.99, "Samsung", "980 EVO Plus 2TB", 2023, 4000, 2000);
    hardDrives[3] = new HardDrive(89.99, "Crucial", "P5 1TB", 2023, 7200, 1000);
    hardDrives[4] = new HardDrive(179.99, "Seagate", "BarraCuda Pro 6TB", 2023, 7200, 6000);
    hardDrives[5] = new HardDrive(109.99, "Kingston", "KC2500 2TB", 2023, 4000, 2000);
    hardDrives[6] = new HardDrive(149.99, "SanDisk", "Extreme PRO 2TB", 2023, 5500, 2000);


    return hardDrives;
  }


  public HardDrive(double price, String brand, String model, int year, int speed, int capacity) {
    super(price, brand, model, year);
    this.speed = speed;
    this.capacity = capacity;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Жорсткий диск" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість=" + speed +
          ", Обсяг пам'яті=" + capacity;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
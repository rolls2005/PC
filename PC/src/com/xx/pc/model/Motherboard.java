package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class Motherboard extends Characteristics implements Displayable {
  private String socketType;
  private String formFactor;

  public static Motherboard[] MotherboardsCreat() {
    Motherboard[] motherboards = new Motherboard[7];

    motherboards[0] = new Motherboard(189.99, "ASUS", "ROG Crosshair IX Hero", 2023, "AM5", "ATX");
    motherboards[1] = new Motherboard(149.99, "GIGABYTE", "B660 AORUS PRO AX", 2023, "LGA1700", "ATX");
    motherboards[2] = new Motherboard(119.99, "MSI", "MAG B550 TOMAHAWK MAX", 2023, "AM4", "ATX");
    motherboards[3] = new Motherboard(209.99, "ASRock", "X670 Taichi", 2023, "AM5", "ATX");
    motherboards[4] = new Motherboard(99.99, "ASUS", "TUF Gaming B550M-PLUS (Wi-Fi 6)", 2023, "AM4", "MicroATX");
    motherboards[5] = new Motherboard(179.99, "MSI", "MPG B550 Gaming Edge WiFi", 2023, "AM4", "ATX");
    motherboards[6] = new Motherboard(89.99, "GIGABYTE", "H510M DS2V", 2023, "LGA1200", "MicroATX");


    return motherboards;
  }


  public Motherboard(double price, String brand, String model, int year, String socketType, String formFactor) {
    super(price, brand, model, year);
    this.socketType = socketType;
    this.formFactor = formFactor;
  }
  
  public String getSocketType() {
    return socketType;
  }
  
  public String getFormFactor() {
    return formFactor;
  }
  
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Материнська плата" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Сокет='" + socketType + '\'' +
          ", Форм-фактор='" + formFactor + '\'';
    } else {
      return getModel();
    }
  }
}


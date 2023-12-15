package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class Monitors extends Characteristics implements Displayable {

  private int sizeInInches;
  private String resolution;
  private String panelType;

  public static Monitors[] MonitorsCreate() {
    Monitors[] monitors = new Monitors[5];

    monitors[0] = new Monitors(199.99, "Dell", "S2719DGF", 2023, 27, "2560x1440", "IPS");
    monitors[1] = new Monitors(299.99, "LG", "27GL83A-B", 2023, 27, "2560x1440", "Nano IPS");
    monitors[2] = new Monitors(159.99, "ViewSonic", "VX2458-MHD", 2023, 24, "1920x1080", "TN");
    monitors[3] = new Monitors(399.99, "ASUS", "ROG Swift PG279Q", 2023, 27, "2560x1440", "IPS");
    monitors[4] = new Monitors(249.99, "Acer", "Nitro VG240Y Pbiip", 2023, 24, "1920x1080", "IPS");

    return monitors;
  }

  public Monitors(double price, String brand, String model, int year, int sizeInInches, String resolution, String panelType) {
    super(price, brand, model, year);
    this.sizeInInches = sizeInInches;
    this.resolution = resolution;
    this.panelType = panelType;
  }

  public int getSizeInInches() {
    return sizeInInches;
  }

  public String getResolution() {
    return resolution;
  }

  public String getPanelType() {
    return panelType;
  }

  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Монітор" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Розмір у дюймах='" + sizeInInches + '\'' +
          ", Роздільна здатність=" + resolution +
          ", Тип панелі=" + panelType;
    } else {
      return getModel();
    }
  }
}

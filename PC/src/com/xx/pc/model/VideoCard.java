package com.xx.pc.model;

import com.xx.pc.logic.Displayable;

public class VideoCard extends Characteristics implements Displayable {
  private int frequency;
  private String memoryType;
  private int memorySize;
  public VideoCard(double price, String brand, String model, int year, int frequency, String memoryType, int memorySize) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.memoryType = memoryType;
    this.memorySize = memorySize;
  }
  
 
  public int getFrequency() {
    return frequency;
  }
  public String getMemoryType() {
    return memoryType;
  }
  public int getMemorySize() {
    return memorySize;
  }
  public static VideoCard[] VideoCardsCreat() {
    VideoCard[] videoCardsArray = new VideoCard[7];

    videoCardsArray[0] = new VideoCard(569.99, "NVIDIA", "RTX 3080 Super", 2023, 1800, "GDDR6X", 12);
    videoCardsArray[1] = new VideoCard(829.99, "AMD", "RX 6950 XT", 2023, 2200, "GDDR6X", 16);
    videoCardsArray[2] = new VideoCard(369.99, "NVIDIA", "GTX 1660 Ti", 2023, 1600, "GDDR5", 6);
    videoCardsArray[3] = new VideoCard(679.99, "AMD", "RX 6850 XT", 2023, 2100, "GDDR6", 16);
    videoCardsArray[4] = new VideoCard(929.99, "NVIDIA", "RTX 5090", 2023, 2200, "GDDR7", 32);
    videoCardsArray[5] = new VideoCard(299.99, "AMD", "RX 5800 XT", 2023, 1850, "GDDR6", 8);
    videoCardsArray[6] = new VideoCard(419.99, "NVIDIA", "RTX 3070 Ti", 2023, 1850, "GDDR6", 8);


    return videoCardsArray;
  }

  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Відео карта{" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Тип памяті='" + memoryType + '\'' +
          ", Обсяг памяті=" + memorySize +
          '}';
    } else {
      return  "" + getModel() + '\'';
    }
  }
 
}

package com.xx.pc.model;

public class PC {
  private String videoCard;
  private String processor;
  private String motherboard;
  private String RAM;
 private String hardDrive;
  private String PowerSupply;
  private String cooling;
  private String monitors;
  
  private PC(Builder builder) {
    this.videoCard = builder.videoCard;
    this.processor = builder.processor;
    this.motherboard = builder.motherboard;
    this.RAM = builder.RAM;
    this.hardDrive = builder.hardDrive;
    this.PowerSupply = builder.PowerSupply;
    this.cooling = builder.cooling;
    this.monitors=builder.monitors;
    
  }
  
  public String getVideoCard() {
    return videoCard;
  }
  
  public String getProcessor() {
    return processor;
  }
  
  public String getMotherboard() {
    return motherboard;
  }
  public String getRAM() {
    return RAM;
  }
  
  public String getHardDrive() {
    return hardDrive;
  }
  
  public String getPowerSupply() {
    return PowerSupply;
  }
  
  public String getCooling() {
    return cooling;
  }

  public String getMonitors() {
    return monitors;
  }

  public static class Builder {
    private String motherboard;
    private String processor;
    private String videoCard;
    private String RAM;
    private String hardDrive;
    private String PowerSupply;
    private String cooling;
    private String monitors;
    
   
    public Builder videoCard(String videoCard) {
      this.videoCard = videoCard;
      return this;
    }
    public Builder monitors(String monitors){
      this.monitors=monitors;
      return this;
    }
    
    public Builder processor(String processor) {
      this.processor = processor;
      return this;
    }
    
    public Builder motherboard(String motherboard) {
      this.motherboard = motherboard;
      return this;
    }
    public Builder RAM(String RAM) {
      this.RAM = RAM;
      return this;
    }
    public Builder hardDrive(String hardDrive) {
      this.hardDrive = hardDrive;
      return this;
    }
    public Builder PowerSupply(String PowerSupply) {
      this.PowerSupply = PowerSupply;
      return this;
    }
    public Builder cooling(String cooling) {
      this.cooling = cooling;
      return this;
    }
    public PC build() {
      return new PC(this);
    }
  }
}

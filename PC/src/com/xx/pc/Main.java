package com.xx.pc;

import com.xx.pc.logic.Methods;
import com.xx.pc.model.Cooling;
import com.xx.pc.model.HardDrive;
import com.xx.pc.model.Monitors;
import com.xx.pc.model.Motherboard;
import com.xx.pc.model.PC;
import com.xx.pc.model.PowerSupply;
import com.xx.pc.model.Processor;
import com.xx.pc.model.RAM;
import com.xx.pc.model.VideoCard;

public class Main {

  public static void main(String[] args) {
    VideoCard selectedVideoCard = Methods.selectAndDisplayComponent(VideoCard.VideoCardsCreat(), true);
    HardDrive selectedHardDrive = Methods.selectAndDisplayComponent(HardDrive.HardDrivesCreat(), true);
    Motherboard selectedMotherboard = Methods.selectAndDisplayComponent(Motherboard.MotherboardsCreat(), true);
    RAM selectedRam = Methods.selectAndDisplayComponent(RAM.RAMsCreat(), true);
    Cooling selectedCooling = Methods.selectAndDisplayComponent(Cooling.CoolingsCreat(), true);
    Processor selectedProcessor = Methods.selectAndDisplayComponent(Processor.ProcessorsCreat(), true);
    PowerSupply selectedPowerSupply = Methods.selectAndDisplayComponent(PowerSupply.PowerSupplysCreat(), true);
    Monitors selectedMonitors=Methods.promptUserForMonitors();

    PC pc = new PC.Builder()
        .videoCard(selectedVideoCard.getModel())
        .processor(selectedProcessor.getModel())
        .motherboard(selectedMotherboard.getModel())
        .PowerSupply(selectedPowerSupply.getModel())
        .cooling(selectedCooling.getModel())
        .hardDrive(selectedHardDrive.getModel())
        .RAM(selectedRam.getModel())
        .monitors(selectedMonitors != null ? selectedMonitors.getModel() : "немає")
        .build();

    System.out.print(
        "Відеокарта: " + pc.getVideoCard() + "\n" +
        "Процесор: " + pc.getProcessor() + "\n" +
        "Материнська плата: " + pc.getMotherboard() + "\n" +
        "Блок живлення: " + pc.getPowerSupply() + "\n" +
        "Жорсткий диск: " + pc.getHardDrive() + "\n" +
        "Оперативна память: " + pc.getRAM() + "\n" +
        "Система охолодження: " + pc.getCooling()+"\n"+
        "Монітор:"+pc.getMonitors());
  }

}
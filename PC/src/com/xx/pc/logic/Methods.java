package com.xx.pc.logic;

import com.xx.pc.model.Monitors;
import com.xx.pc.ui.DetailSelection;
import java.util.Scanner;

public class Methods {
  public static <T> T selectAndDisplayComponent(T[] components, boolean displayDetails) {
    return DetailSelection.displayPCDetails(components, displayDetails);
  }
  public static Monitors promptUserForMonitors() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Оберіть потребу в моніторі:");
    System.out.println("1. З монітором");
    System.out.println("2. Без монітору");
    
    int userChoice = scanner.nextInt();
    if (userChoice == 1) {
      return selectAndDisplayComponent(Monitors.MonitorsCreate(), true);
    } else if (userChoice == 2) {
      
      System.out.println("Монітор не обраний (без монітору).");
      return null ;
    } else {
      System.out.println("Невірний вибір. Оберіть 1 або 2.");

      promptUserForMonitors();
      return null;
    }
  }
}

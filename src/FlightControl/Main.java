package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUi textUI = new TextUi(flightControl, scanner);
        textUI.start();

    }
}

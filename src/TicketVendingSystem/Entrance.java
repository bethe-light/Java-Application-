package TicketVendingSystem;

import TicketVendingSystem.Entity.DestMoney;
import TicketVendingSystem.IO.GUI.SSInitialize;

public class Entrance {
    private static int totalTicket;
    private static String departureStation;
    private static String destination;

    public static void main(String[] args) {
        graphicInterface();
    }

    static void graphicInterface() {
        // todo: interact with GUI
        SSInitialize.showInitialize();

        // todo: set from GUI
        DestMoney dm = new DestMoney("destination", 10);

    }

    public static void setDepartureStation(String input) {
        departureStation = input;
    }

    public static String getDepartureStation() {
        return departureStation;
    }

    public static void setDestination(String input) {
        destination = input;
    }

    public static String getDestination() {
        return destination;
    }

    public static void setTotalTicket(int input) {
        totalTicket = input;
    }

    public static void decreaseTotalTicket() {
        totalTicket --;
    }

    public static int getTotalTicket() {
        return totalTicket;
    }
}


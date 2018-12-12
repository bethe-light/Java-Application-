package TicketVendingSystem.Process;

import TicketVendingSystem.Entrance;

public class Ticket {
    public static void print() {
        // todo: interact with GUI
        System.out.println("正在出票……");

        Entrance.decreaseTotalTicket();
    }
}

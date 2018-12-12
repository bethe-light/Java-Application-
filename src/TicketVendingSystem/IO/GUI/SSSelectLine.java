package TicketVendingSystem.IO.GUI;

import TicketVendingSystem.Entrance;

public abstract class SSSelectLine {
    String destination;
    int price;
    int totalTicket = Entrance.getTotalTicket();

    public String getDestination() {
        return destination;
    }

    public void setPrice(int input) {
        price = input;
    }

}
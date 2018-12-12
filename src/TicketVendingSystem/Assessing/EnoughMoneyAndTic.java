package TicketVendingSystem.Assessing;

import TicketVendingSystem.Database.DataAPI;
import TicketVendingSystem.Entity.DestMoney;
import TicketVendingSystem.Entrance;
import TicketVendingSystem.Process.Money;
import TicketVendingSystem.Process.Ticket;

public class EnoughMoneyAndTic {
    static private DestMoney destMoney;

    public EnoughMoneyAndTic(DestMoney input) {
        destMoney = input;
    }

    public void isMoneyEnough() {
        String dest = destMoney.getDestination();
        String depart = Entrance.getDepartureStation();

        int price = DataAPI.returnPrice(depart, dest);
        int inputMoney = destMoney.getMoney();

        if (inputMoney < price)
            Money.refund("insufficientMoney");
        else if (inputMoney > price)
            Money.change(inputMoney - price);
        else
            confirmPurchase();
    }

    public void confirmPurchase() {
        // todo: set isConfirm from GUI
        if (false)
            Ticket.print();
        else
            Money.refund("cancel");
    }
}


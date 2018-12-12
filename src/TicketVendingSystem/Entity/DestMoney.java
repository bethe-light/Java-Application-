package TicketVendingSystem.Entity;

public class DestMoney {
    private String destination;
    private int money;

    public DestMoney(String inputDest, int insertMoney) {
        destination = inputDest;
        money = insertMoney;
    }

    public String getDestination() {
        return destination;
    }

    public int getMoney(){
        return money;
    }
}

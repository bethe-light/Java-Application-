package TicketVendingSystem.Process;

public class Money {

    public static void refund(String type) {
        if (type.equalsIgnoreCase("cancel"))
            CancelBuyingTicket();
        else if (type.equalsIgnoreCase("insufficientMoney"))
            NotEnoughMoney();
        else if (type.equalsIgnoreCase("insufficientTicket"))
            NotEnoughTicket();
    }

    public static void change(int amount) {
        // todo: interact with GUI
        System.out.println(amount);
    }

    // todo: interact with GUI
    public static void CancelBuyingTicket() {
        System.out.println("用户取消购票。");
    }


    // todo: interact with GUI
    public static void NotEnoughMoney() {
        System.out.println("投币不足！");
    }


    // todo: interact with GUI
    public static void NotEnoughTicket() {
        System.out.println("余票不足！");
    }


}

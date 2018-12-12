package TicketVendingSystem.Database;


public class test {
    public static void main(String[] args) {
        // 初始化DataAPI对象
        DataAPI api = new DataAPI();
        /**
         * @param test
         */
        api.data();
        /**
         * @param startPlace String
         * @param terminal String
         * @return int 两地间票价
         */
        api.returnPrice("小寨", "后卫寨");

        /**
         * @param orderNumber String KEY
         * @param startPlace String
         * @param terminal String
         * @param currentTime String
         * @param tickets int  应该是没用到，但不能为空
         */
        api.insertRecord("SH0001", "小寨", "北大街", "20181207");
    }
}
package TicketVendingSystem.Database;

import java.sql.*;

public class DataAPI {

    private static final String DB_URL = "jdbc:mysql://47.105.179.40:3306/prices?useSSL=false&serverTimezone=GMT&useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "*****";
    private static final String PASSWORD = "******";

    /**
     * 打印table price数据
     */
    static void data() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            // todo: remove println.
            System.out.println("Create query statement");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM price";
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                String name = res.getString("firstplace");
                // todo: remove println.
                System.out.println("Name: " + name);
            }
            res.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    /**
     * @param startPlace String
     * @param terminal   String
     *                   return  int 两地间票价
     */
    public static int returnPrice(String startPlace, String terminal) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int price = 0;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String sql = "SELECT " + terminal + " FROM price WHERE firstplace = " + startPlace;
            preparedStatement = conn.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery(sql);
            while (res.next()) {
                price = res.getInt(terminal);
                // todo: remove println.
                System.out.println(startPlace + "->" + terminal + " price: " + price + "元");
            }
            res.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return price;
    }

    /**
     * @param orderNumber String 主键
     * @param currentTime String
     */
    public static void insertRecord(String orderNumber, String startPlace, String terminal, String currentTime) {
        Connection conn = null;
        PreparedStatement preStmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // 此处ticket为售出票数，因为只要求每次售出一张票，故在此设为1
            int tickets = 1;
            String sql = "INSERT INTO records (orderNumber, startPlace,terminal,currentTime,tickets) VALUES (?, ?, ?, ?, ?)";
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, orderNumber);
            preStmt.setString(2, startPlace);
            preStmt.setString(3, terminal);
            preStmt.setString(4, currentTime);
            preStmt.setInt(5, tickets);
            preStmt.executeUpdate();
            // preStmt初始化完成，不能在将sql语句填进去，详见https://stackoverflow.com/questions/33484833/error-in-your-sql-syntax-near

            // todo: remove println
            System.out.println("Insert record successfully!");

            preStmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (preStmt != null)
                    preStmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

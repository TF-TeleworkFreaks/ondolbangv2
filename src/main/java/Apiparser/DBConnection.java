package Apiparser;

import java.sql.*;
import java.time.LocalDateTime;

public class DBConnection {
    private String driver;
    private String url;
    private String user;
    private String password;
    private Connection con;
    private Statement stat;

    public DBConnection(String driver, String url, String user, String password) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.password = password;
        con = null;
        stat = null;
    }

    public boolean activateConnectDB() throws ClassNotFoundException, SQLException {
        boolean isValid = false;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            stat = con.createStatement();
            if (con != null) {
                System.out.println("DB Connection Success");
                isValid = true;
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver Road Fail");
        }
        catch (SQLException e) {
            System.out.println("DB Connection Fail");
            e.printStackTrace();
        }
        return isValid;
    }

    public void createItemsTable(){
        try {
            stat.executeUpdate("CREATE TABLE items" +
                    "(   gonggoNum           INT,\n" +
                    "    gongmaeNum           INT,\n" +
                    "    gongmaeConditionNum      INT not null PRIMARY KEY,\n" +
                    "    itemNum           INT,\n" +
                    "    itemHistoryNum      INT,\n" +
                    "    screenGroupCode       VARCHAR,\n" +
                    "    categoryName      VARCHAR,\n" +
                    "    bidNum       VARCHAR,\n" +
                    "    itemName           VARCHAR,\n" +
                    "    itemManageNum      VARCHAR,\n" +
                    "    addressOld         VARCHAR,\n" +
                    "    addressNew         VARCHAR,\n" +
                    "    disposalMethodCode       VARCHAR,\n" +
                    "    disposalMethodName       VARCHAR,\n" +
                    "    bidMethod        VARCHAR,\n" +
                    "    minimumBidPrice       VARCHAR,\n" +
                    "    averagePrice VARCHAR,\n" +
                    "    feeRate          VARCHAR,\n" +
                    "    bidStartDate     DATETIME,\n" +
                    "    bidEndDate      DATETIME,\n" +
                    "    itemStatus VARCHAR,\n" +
                    "    bidFailCount         INT\n" +
                    ");");
        } catch (SQLException e) {
            System.out.println("CREATE Fail");
            e.printStackTrace();
        }
    }

    public void deleteItemsTable(){
        try {
            stat.executeUpdate("DELETE FROM items");
        } catch (SQLException e) {
            System.out.println("DELETE Fail");
            e.printStackTrace();
        }
    }

    public void insertItemsTable(
            int gonggoNum, int gongmaeNum, int gongmaeConditionNum, int itemNum,
            int itemHistoryNum, String screenGroupCode, String categoryName,
            String bidNum, String itemName, String itemManageNum,
            String addressOld, String addressNew, String disposalMethodCode,
            String disposalMethodName, String bidMethod, String minimumBidPrice,
            String averagePrice, String feeRate, LocalDateTime bidStartDate,
            LocalDateTime bidEndDate, String itemStatus, String bidFailCount){
        try {
            stat.executeUpdate("INSERT INTO items VALUES " +
                    "(" + gonggoNum + "," +
                    "" + gongmaeNum + "," +
                    "" + gongmaeConditionNum + "," +
                    "" + itemNum + "," +
                    "" + itemHistoryNum + "," +
                    "'" + screenGroupCode + "'," +
                    "'" + categoryName + "'," +
                    "'" + bidNum + "'," +
                    "'" + itemName + "'," +
                    "'" + itemManageNum + "'," +
                    "'" + addressOld + "'," +
                    "'" + addressNew + "'," +
                    "'" + disposalMethodCode + "'," +
                    "'" + disposalMethodName + "'," +
                    "'" + bidMethod + "'," +
                    "'" + minimumBidPrice + "'," +
                    "'" + averagePrice + "'," +
                    "'" + feeRate + "'," +
                    "'" + bidStartDate + "'," +
                    "'" + bidEndDate + "'," +
                    "'" + itemStatus + "'," +
                    "'" + bidFailCount +"')");
        } catch (SQLException e) {
            System.out.println("INSERT Fail");
            e.printStackTrace();
        }
    }


    public void dropItemsTable(){
        try {
            stat.executeUpdate("DROP TABLE items");
        } catch (SQLException e) {
            System.out.println("DROP Fail");
            e.printStackTrace();
        }
    }
}
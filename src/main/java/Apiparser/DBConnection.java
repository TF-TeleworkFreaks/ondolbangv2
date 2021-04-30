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

    public void createOnbidTable(){
        try {
            stat.executeUpdate("CREATE TABLE ONBID" +
                    "(   PLNM_NO           INT,\n" +
                    "    PBCT_NO           INT,\n" +
                    "    PBCT_CDTN_NO      INT not null PRIMARY KEY,\n" +
                    "    CLTR_NO           INT,\n" +
                    "    CLTR_HSTR_NO      INT,\n" +
                    "    SCRN_GRP_CD       VARCHAR,\n" +
                    "    CTGR_FULL_NM      VARCHAR,\n" +
                    "    BID_MNMT_NO       VARCHAR,\n" +
                    "    CLTR_NM           VARCHAR,\n" +
                    "    CLTR_MNMT_NO      VARCHAR,\n" +
                    "    LDNM_ADRS         VARCHAR,\n" +
                    "    NMRD_ADRS         VARCHAR,\n" +
                    "    DPSL_MTD_CD       VARCHAR,\n" +
                    "    DPSL_MTD_NM       VARCHAR,\n" +
                    "    BID_MTD_NM        VARCHAR,\n" +
                    "    MIN_BID_PRC       VARCHAR,\n" +
                    "    APSL_ASES_AVG_AMT VARCHAR,\n" +
                    "    FEE_RATE          VARCHAR,\n" +
                    "    PBCT_BEGN_DTM     DATETIME,\n" +
                    "    PBCT_CLS_DTM      DATETIME,\n" +
                    "    PBCT_CLTR_STAT_NM VARCHAR,\n" +
                    "    USCBD_CNT         INT\n" +
                    ");");
        } catch (SQLException e) {
            System.out.println("CREATE Fail");
            e.printStackTrace();
        }
    }

    public void deleteOnbidTable(){
        try {
            stat.executeUpdate("DELETE FROM ONBID");
        } catch (SQLException e) {
            System.out.println("DELETE Fail");
            e.printStackTrace();
        }
    }

    public void insertOnbidTable(
            int PLNM_NO, int PBCT_NO, int PBCT_CDTN_NO, int CLTR_NO,
            int CLTR_HSTR_NO, String SCRN_GRP_CD, String CTGR_FULL_NM,
            String BID_MNMT_NO, String CLTR_NM, String CLTR_MNMT_NO,
            String LDNM_ADRS, String NMRD_ADRS, String DPSL_MTD_CD,
            String DPSL_MTD_NM, String BID_MTD_NM, String MIN_BID_PRC,
            String APSL_ASES_AVG_AMT, String FEE_RATE, LocalDateTime After_PBCT_BEGN_DTM,
            LocalDateTime After_PBCT_CLS_DTM, String PBCT_CLTR_STAT_NM, String USCBD_CNT){
        try {
            stat.executeUpdate("INSERT INTO ONBID VALUES " +
                    "(" + PLNM_NO + "," +
                    "" + PBCT_NO + "," +
                    "" + PBCT_CDTN_NO + "," +
                    "" + CLTR_NO + "," +
                    "" + CLTR_HSTR_NO + "," +
                    "'" + SCRN_GRP_CD + "'," +
                    "'" + CTGR_FULL_NM + "'," +
                    "'" + BID_MNMT_NO + "'," +
                    "'" + CLTR_NM + "'," +
                    "'" + CLTR_MNMT_NO + "'," +
                    "'" + LDNM_ADRS + "'," +
                    "'" + NMRD_ADRS + "'," +
                    "'" + DPSL_MTD_CD + "'," +
                    "'" + DPSL_MTD_NM + "'," +
                    "'" + BID_MTD_NM + "'," +
                    "'" + MIN_BID_PRC + "'," +
                    "'" + APSL_ASES_AVG_AMT + "'," +
                    "'" + FEE_RATE + "'," +
                    "'" + After_PBCT_BEGN_DTM + "'," +
                    "'" + After_PBCT_CLS_DTM + "'," +
                    "'" + PBCT_CLTR_STAT_NM + "'," +
                    "'" + USCBD_CNT +"')");
        } catch (SQLException e) {
            System.out.println("INSERT Fail");
            e.printStackTrace();
        }
    }


    public void dropOnbidTable(){
        try {
            stat.executeUpdate("DROP TABLE ONBID");
        } catch (SQLException e) {
            System.out.println("DROP Fail");
            e.printStackTrace();
        }
    }
}
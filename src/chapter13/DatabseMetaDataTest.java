package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DatabseMetaDataTest {

    private String driver;
    private String username;
    private String password;
    private Connection connection;
    private Statement statement;
    private String url;
    private ResultSet rs;

    public void initParams(String paramFile) throws Exception {
        Properties properties= new Properties();
        properties.load(new FileInputStream(paramFile));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }
    public void info(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            DatabaseMetaData metaData = connection.getMetaData();
            //获得支持的表类型
            rs = metaData.getTableTypes();
            System.out.println("----------MySql支持的表类型------------");
            printResultSet(rs);
            ResultSet rs = metaData.getTables(null,null,"%",new String[]{"TABLE"});
            System.out.println("----------获取所有的表------------");
            printResultSet(rs);
            ResultSet rskey = metaData.getPrimaryKeys(null,null,"php");
            System.out.println("----------获取php表的主键------------");
            printResultSet(rskey);
            System.out.println("----------获取php表的所有列------------");
            ResultSet rc = metaData.getColumns(null,null,"php","%");
            printResultSet(rc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 0; i <columnCount ; i++) {
            System.out.print(metaData.getColumnName(i+1)+"\t");//TABLE_TYPE
        }
        while(resultSet.next()) {
            for (int i = 0; i < columnCount; i++) {
                System.out.println(resultSet.getString(i+1));
            }
        }
        rs.close();
    }
    public static void main(String[] args) throws Exception {
        DatabseMetaDataTest databseMetaDataTest = new DatabseMetaDataTest();
        databseMetaDataTest.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        databseMetaDataTest.info();
    }
}

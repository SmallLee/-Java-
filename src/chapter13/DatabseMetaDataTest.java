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
            ResultSet tableTypes = metaData.getTableTypes();
            printResultSet(tableTypes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 0; i <columnCount ; i++) {
            System.out.println(metaData.getColumnName(i+1)+"\t");
            System.out.println(resultSet.getString(i+1));
        }
    }
    public static void main(String[] args) throws Exception {
        DatabseMetaDataTest databseMetaDataTest = new DatabseMetaDataTest();
        databseMetaDataTest.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        databseMetaDataTest.info();
    }
}

package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PrepareStatementTest {

    private String driver;
    private String url;
    private String username;
    private String password;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public static void main(String[] args) throws Exception {
        PrepareStatementTest pt = new PrepareStatementTest();
        pt.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        pt.getConnect();
        pt.insertData();
        pt.closeConn();
    }

    public void initParams(String paramFile) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(paramFile));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }
    public void getConnect() throws Exception {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
    }

    public void closeConn() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void insertData() throws SQLException {
        preparedStatement = connection.prepareStatement("insert into php (name) values (?)");
        for (int i = 0; i < 10; i++) {
            preparedStatement.setString(1,"姓名"+i);
            preparedStatement.executeUpdate();
        }
    }
}
/*
* 使用PreparedStatement插入中文时乱码的解决：
* 在数据库url后面指定编码
*url = jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8
*
* 使用PreparedStatement预编译SQL语句，性能更好
* 不用拼接SQL语句，编程更简单
* 防止SQL注入，安全性更好
* */
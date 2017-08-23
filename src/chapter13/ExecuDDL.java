package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuDDL {

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

    public void createTable(String sql) throws SQLException {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

    public int insertData(String sql) throws Exception {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }

    public static void main(String[] args) throws Exception {
        ExecuDDL execuDDL = new ExecuDDL();
        execuDDL.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
//        execuDDL.createTable("create table php (id int auto_increment primary key,name varchar(12))");
//        System.out.println("----------------建表成功---------------");

        int data = execuDDL.insertData("insert into php (name) values ('high')");
        System.out.println("影响的记录数为： "+data);//1
    }
}
/*
*   指定auto_increment的同时必须指定为主键，只有一个字段能指定为auto_increment
* MySQLSyntaxErrorException: Incorrect table definition; there can be only one auto column and it must be defined as a key
* */
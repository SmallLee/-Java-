package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class ResultSetTest {
    private String driver;
    private String username;
    private String password;
    private String url;
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet resultSet;

    public void initParams(String paramFile) throws Exception {
        Properties properties= new Properties();
        properties.load(new FileInputStream(paramFile));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    public void query(String sql) throws SQLException {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            pst = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = pst.executeQuery();
            //移动指针到结果集的最后一行
            resultSet.last();
            int rowCount = resultSet.getRow();
            for (int i = rowCount; i > 0; i--) {
                resultSet.absolute(i);//将指针移动到指定的行
                System.out.println(resultSet.getString(1)+ resultSet.getString(2));
                //修改第二列的值
                resultSet.updateString(2,"学生名："+i);
                //提交修改
                resultSet.updateRow();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            connection.close();
            pst.close();
        }
    }

    public static void main(String[] args) throws Exception {
        ResultSetTest resultSetTest = new ResultSetTest();
        resultSetTest.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        resultSetTest.query("select * from php");
    }
}
/*
* 改程序的功能是将数据库中的数据倒序输出，同事改变第二列的值
*
* */
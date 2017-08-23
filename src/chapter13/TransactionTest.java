package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class TransactionTest {

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
    public void insertInTrasaction(String[] sqls) throws SQLException {
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url, username, password);
            //关闭自动提交，开启事务
            connection.setAutoCommit(true);
//            Savepoint savepoint = connection.setSavepoint();创建中间点
//            connection.rollback(savepoint);回滚到中间点
            statement = connection.createStatement();
            for (String sql : sqls) {
                statement.executeUpdate(sql);
            }
            connection.commit();//提交事务
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
            statement.close();
        }
    }

    public void query(String sql) throws SQLException {
        statement.executeQuery(sql);
    }
    public static void main(String[] args) throws Exception {
        TransactionTest transactionTest = new TransactionTest();
        transactionTest.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        String[] sqls = {"insert into php (name)  values ('goku')",
                "insert into php (name)  values ('kulin')",
                //下面的语法错误，因为php表中没有age字段,事务自动回滚，
        "insert into php (age)  values ('2')"};
        transactionTest.insertInTrasaction(sqls);
//        transactionTest.query("select * from php");
    }
}
/*
* 在上面的例子中，如果没有开启事务，会插入前面两条数据，
*   如果开启了，一条也不会插入
* */
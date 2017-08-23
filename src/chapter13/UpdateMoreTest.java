package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UpdateMoreTest {

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
            //保存当前提交模式
            boolean autoCommit = connection.getAutoCommit();
            //关闭自动提交，开启事务
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            for (String sql : sqls) {
                statement.addBatch(sql);
            }
            statement.executeBatch();
            connection.commit();//提交事务
            //恢复原有自动提交模式
            connection.setAutoCommit(autoCommit);
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
        UpdateMoreTest transactionTest = new UpdateMoreTest();
        transactionTest.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        String[] sqls = {"insert into php (name)  values ('goku')",
                "insert into php (name)  values ('kulin')",
                //下面的语法错误，因为php表中没有age字段,事务自动回滚，
                "insert into php (age)  values ('2')"};
        transactionTest.insertInTrasaction(sqls);
    }
}

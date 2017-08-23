package chapter13;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class ExecuSql {
    private String driver;
    private String username;
    private String password;
    private String url;
    public void initParams(String paramFile) throws Exception {
        Properties properties= new Properties();
        properties.load(new FileInputStream(paramFile));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }
    public void exeSql(String sql) throws Exception {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        boolean hasResultSet = statement.execute(sql);
        if (hasResultSet) {
            ResultSet resultSet = statement.getResultSet();
            //获取ResultSet对应的所有列的描述信息
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取列的个数
            int columnCount = metaData.getColumnCount();
            while ((resultSet.next())) {
                for (int i = 0; i < columnCount; i++) {
                    //获取指定列的值，注意列的索引从开始
                    System.out.print(resultSet.getString(i + 1)+"\t");
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("该sql语句影响的记录数有： "+ statement.getUpdateCount());
        }
    }
    public static void main(String[] args) throws Exception {
        ExecuSql execuSql = new ExecuSql();
        execuSql.initParams("D:\\JavaProject\\CrazyJava\\src\\chapter13\\mysql.ini");
        System.out.println("---------执行删除表的语句------------");
        execuSql.exeSql("drop table if exists php");
        System.out.println("---------执行创建表的语句------------");
        execuSql.exeSql("create table php (id int auto_increment primary key,name varchar(5))");
        System.out.println("---------执行插入数据的语句------------");
        execuSql.exeSql("insert into php (name) values ('green')");
        execuSql.exeSql("insert into php (name) values ('red')");
        System.out.println("---------执行查询数据的语句------------");
        execuSql.exeSql("select * from php");
    }
}
/*
* 执行DDL语句打印0
* 执行DML语句打印1
*   resultSet的getString几乎可以获取除了Blob之外的任意类型的值，因为所有的数据类型都可以自动转化为字符串类型
* */
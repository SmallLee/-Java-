package chapter13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConMySql {
    public static void main(String[] args) throws Exception {
        //1.使用反射，加载数据库驱动,加载驱动前要导入mysql对应的jdbc驱动jar包
        Class.forName("com.mysql.jdbc.Driver");
        //2.使用DriverManager获取数据库连接，需要数据库的url，用户名和密码
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "123456");
        //3.创建statement对象
        Statement statement = connection.createStatement();
        //4.执行sql语句
        /*3种执行sql语句的方法
        *   execute:可执行任何sql语句，如果第一个结果是resultset,返回true，否则返回false
        *   executeQuery:执行查询语句，返回查询的结果集
        *   executeUpdate:执行DML语句，返回整数，代表影响的记录数
        * */
//        boolean flag = statement.execute("select * from android");
//        System.out.println(flag);//true
        int num = statement.executeUpdate("update android set num=33 where id=1");
        System.out.println(num);//1
        ResultSet rs = statement.executeQuery("select * from android");
        while (rs.next()) {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)
            +'\t'+rs.getString(3));
        }
        if (rs != null) {
            rs.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
/*
* MySQL数据库的url:
* jdbc:mysql//hostname:port/databasename
*
* executeUpdate可以执行DDL和DML语言：
* */
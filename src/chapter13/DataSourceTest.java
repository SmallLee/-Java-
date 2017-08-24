package chapter13;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceTest {
    public static void main(String[] args) throws SQLException {
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8");
        bds.setUsername("root");
        bds.setPassword("123456");
        //初始连接数
        bds.setInitialSize(5);
        //最少有两个空闲的连接
        bds.setMinIdle(2);
        //最多有多少个活动连接数
        bds.setMaxTotal(10);
        Connection connection = bds.getConnection();
    }
}

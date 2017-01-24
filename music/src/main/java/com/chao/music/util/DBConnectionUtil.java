package com.chao.music.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/music?useUnicode=true&characterEncoding=utf-8";
	private static final String name = "root";
	private static final String pwd = "123456";
	
	public static Connection getConnection(){
		try{
            Class.forName(driver);
            return DriverManager.getConnection(url, name,pwd);
        }catch(ClassNotFoundException e1){
            e1.printStackTrace();
        } catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

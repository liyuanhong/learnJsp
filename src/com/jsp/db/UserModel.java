package com.jsp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 5、JDBC编程步骤
（1）加载驱动程序：Class.forName(driverClass)
 加载mysql驱动：Class.forName("com.mysql.jdbc.Driver");
 加载oracle驱动：Class.forName("oracle.jdbc.driver.OracleDriver");
（2）获得数据库连接
 DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/imooc",user,password);
 DriverManager.gerConnection(URL,user,password);
（3）创建Statement对象：conn.createStatement();
（4）向数据库发送SQL命令
（5）处理数据库的返回结果(ResultSet类)
 */


public class UserModel {
	//定义访问数据库的连接
		private Connection con;
		// 定义数据库的用户名  
	    private String USERNAME = "root";  
	    // 定义数据库的密码  
	    private String PASSWORD = "pass";  
	    // 定义数据库的驱动信息  
	    private String DRIVER = "com.mysql.jdbc.Driver";  
	    // 定义访问数据库的地址  
	    private String URL = "jdbc:mysql://localhost:3306/jdbc";  
    
    private void getusername() {
    	try {
    		//加载驱动
			Class.forName(DRIVER);
			System.out.println("驱动注册成功！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	try {
    		//建立数据库连接
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
    	
    	String sql = "select * from user";
    	//通过数据库的连接操作数据库，实现增删改查（使用Statement类）
    	try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			System.out.println(rs.next());
			System.out.println(rs.getString("username"));
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
    public boolean getLoginStatus(String username,String password) {
    	try {
    		//加载驱动
			Class.forName(DRIVER);
			System.out.println("驱动注册成功！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	try {
    		//建立数据库连接
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
    	
    	String sql = "select * from user";
    	Statement st;
    	ResultSet rs;
    	String uname = "";
    	String upsd = "";
    	//通过数据库的连接操作数据库，实现增删改查（使用Statement类）
    	try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			rs.next();
			uname = rs.getString("username");
			upsd = rs.getString("password");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
		
		if(username.equals(uname) && password.equals(upsd)) {
			return true;
		}else {
			return false;
		}
    }
    
//    public static void main(String[] args) {
//		UserModel model = new UserModel();
//		model.getusername();
//	}
}

package com.test;

import java.sql.*;

//import com.sun.crypto.provider.RSACipher;


public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.select();
		//demo.add(7369,"王五","厂长",(float) 800.00);
		//demo.alter();
		demo.delete();
	}
	//查询
	public void select(){
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","123");
			Connection con = MySql.getInstace();
			//2创建statement类对象，用来执行sql语句
			Statement statement = con.createStatement();
			//要执行的SQL语句
			String sql = "select * from emp";
			//ResultSet类，用来存放获取的结果集
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				System.out.println(ename+"\t"+job);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//添加
	public void add(int empno,String ename,String job,float sal){
		String s = "insert into emp valuse("+empno+",'"+ename+"','"+job+"',"+sal+")";
		//String s = "insert into emp (empno,ename,job,sal) valuse (?,?,?,?)";
		try {
			//Statement statement = con.createStatement();
			String s2 = "INSERT INTO `emp`  VALUES(?,?,?,?)";
			PreparedStatement pst =  MySql.getInstace().prepareStatement(s2);
			pst.setInt(1,empno);
			pst.setString(2, ename);
			pst.setString(3, job);
			pst.setFloat(4, sal);
			boolean jieguo = pst.execute();
			System.out.println("结果是："+jieguo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//修改表数据
	public void alter(){
		PreparedStatement pst;
		try {
			pst = MySql.getInstace().prepareStatement("update emp set ename=? where empno = ?");
			pst.setString(1, "王小二");
			pst.setInt(2, 6060);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(){
		PreparedStatement pst;
		try {
			pst = MySql.getInstace().prepareStatement("delete from emp where empno = ?");
			pst.setInt(1, 7369);
			pst.executeUpdate();
			pst.close();
			System.out.println("删除成功");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

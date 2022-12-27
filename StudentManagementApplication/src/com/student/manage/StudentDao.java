package com.student.manage;


import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;  



/**
 *
 * @author GUSAIN
 */
public class StudentDao {
    public static boolean insertStudentToDB(Student st){
            boolean f = false;
    
        try {
            Connection con = ConnectionProvider.createC();
            String q = "insert into student(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
            pstmt.executeUpdate();
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    public static boolean deleteStudentToDB(int userId){
            boolean f = false;
    
        try {
            Connection con = ConnectionProvider.createC();
            String q = "delete from student where sid=?";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setInt(1,userId);
            pstmt.executeUpdate();
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
        
    }
    public static void displayStudentToDB(){
    
        try {
            Connection con = ConnectionProvider.createC();
            String q = "select * from student;";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while(set.next())
            {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone=set.getString(3);
                String city = set.getString("scity");
                System.out.println("ID: "+id+"Name: "+name+"Phone: "+phone+"City: "+city);
                System.out.println("***********************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        public static boolean updateStudentToDB(Student st,int userId){
            boolean f = false;
    
        try {
            Connection con = ConnectionProvider.createC();
             String q = "update student set sname=? ,sphone=? ,scity=? where sid=?";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
            pstmt.setInt(4,userId);
            pstmt.executeUpdate();
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

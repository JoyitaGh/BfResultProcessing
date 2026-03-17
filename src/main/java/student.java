import db.myconnection;
import java.sql.*; 
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class student {
    Connection con=myconnection.connect();
   PreparedStatement ps;
   
   public void insert(String session,int student_id,String name,String date,String gender,String email,String phone,
           String address){
       String sql = "insert into student values(?,?,?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
           ps.setString(1, session);
            ps.setInt(2, student_id);
             ps.setString(3, name);
              ps.setString(4, date);
               ps.setString(5, gender);
                ps.setString(6, email);
                 ps.setString(7, phone);
                  ps.setString(8, address);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "New student added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   public boolean isemailexist(String email){
       try{
           ps = con.prepareStatement("select * from student where email = ?");
           ps.setString(1, email);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               return true;
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   
   public boolean isphoneexist(String phone){
       try{
           ps = con.prepareStatement("select * from student where phone = ?");
           ps.setString(1, phone);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               return true;
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   public boolean isidexist(int student_id){
       try{
           ps = con.prepareStatement("select * from student where student_id = ?");
           ps.setInt(1, student_id);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               return true;
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   
   public void getstudentvalue(JTable table,String searchval){
       String sql = "select * from student where concat(session,student_id,name,email,phone)like ? order by student_id asc";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[8];
           row[0]=rs.getString(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getString(5);
           row[5]=rs.getString(6);
           row[6]=rs.getString(7);
           row[7]=rs.getString(8);
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
   
   public void getstudentvalue1(JTable table){
       String sql = "select session,student_id,name,email,phone from student order by student_id asc";
       try{
       ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[8];
           row[0]=rs.getString(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getString(5);
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
   public void getstudentvalue2(JTable table,String searchval){
       String sql = "select session,student_id,name,email,phone from student where session like ? order by student_id asc";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[8];
           row[0]=rs.getString(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getString(5);
           
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
   
   public void update(String session,int student_id,String name,String date,String gender,String email,String phone,
           String address){
       String sql = "update student set name=?,date_of_birth=?,gender=?,email=?,phone=?,address=? where student_id=? and session=?";
   try{
           ps = con.prepareStatement(sql);
          
             ps.setString(1, name);
              ps.setString(2, date);
               ps.setString(3, gender);
                ps.setString(4, email);
                 ps.setString(5, phone);
                  ps.setString(6, address);
                  ps.setInt(7, student_id);
                   ps.setString(8, session);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Updated successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   public void delete(int student_id ){
       int yn= JOptionPane.showConfirmDialog(null, "Course and score record will also be deleted","Student delete",JOptionPane.OK_CANCEL_OPTION,0);
   if(yn==JOptionPane.OK_OPTION){
       try{
       ps=con.prepareStatement("DELETE student FROM student LEFT JOIN course ON student.student_id = course.student_id WHERE student.student_id=?");
       ps.setInt(1, student_id);
       if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Student deleted successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   }
   
}

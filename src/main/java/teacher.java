
import db.myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class teacher {
     Connection con=myconnection.connect();
   PreparedStatement ps;
   
    public void teachersignup(String name,String des,String email,String phone,String pass){
       String sql = "insert into teacher values(?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
           ps.setString(1, name);
            ps.setString(2, des);
             ps.setString(3, email);
              ps.setString(4, phone);
               ps.setString(5, pass);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Sighup successfull");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public void updateteacher(String name,String des,String email,String phone,String pass){
       String sql = "update teacher set designation=?,email=?,phone=?,password=? where name=? and email=?";
   try{
           ps = con.prepareStatement(sql);
          
             ps.setString(1, des);
         ps.setString(2, email);
         ps.setString(3, phone);
         ps.setString(4, pass);
         ps.setString(5, name);
         ps.setString(6, email);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Updated successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public boolean getteacher(String currentmail){
       try{
       ps = con.prepareStatement("select * from teacher where email = ?");
           ps.setString(1, currentmail);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               teacherhome.jTextField34.setText(rs.getString("name"));
               teacherhome.jTextField35.setText(rs.getString("designation"));
               teacherhome.jTextField36.setText(rs.getString("email"));
               teacherhome.jTextField37.setText(rs.getString("phone"));
               teacherhome.jPasswordField1.setText(rs.getString("password"));

           return true;
             }
       
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
    
    public void getteacherinfo(JTable table){
       String sql = "select name,designation,email,phone from teacher";
       try{
       ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[4];
           row[0]=rs.getString(1);
           row[1]=rs.getString(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
    public void insertcd(String session,int semester,String ccode,String ctitle,String teacher,String tmail){
       String sql = "insert into course_distribution values(?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
           ps.setString(1, session);
            ps.setInt(2, semester);
             ps.setString(3, ccode);
            ps.setString(4, ctitle);
             ps.setString(5, teacher);
             ps.setString(6, tmail);
                 
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Course distribution record added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    
    public void getcdvalue(JTable table){
       String sql = "select * from course_distribution";
       try{
       ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[20];
           row[0]=rs.getString(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getString(5);
           row[5]=rs.getString(6);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
    
    
          
     public void deletecd(String session,int semester,String ccode,String ctitle,String teacher,String tmail ){
       int yn= JOptionPane.showConfirmDialog(null, "Selected record will be deleted","Record delete",JOptionPane.OK_CANCEL_OPTION,0);
   if(yn==JOptionPane.OK_OPTION){
       try{
       ps=con.prepareStatement("delete from course_distribution where session=? and semester=? and course_code=? and course_title=? and teacher_name=? and teacher_email=?");
           ps.setString(1, session);
            ps.setInt(2, semester);
            ps.setString(3, ccode);
            ps.setString(4, ctitle);
             ps.setString(5, teacher);
             ps.setString(6, tmail); 
       if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Record deleted successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   }
     public void deleteteacher(String mail){
       int yn= JOptionPane.showConfirmDialog(null, "Teacher registration will be deleted","Teacher delete",JOptionPane.OK_CANCEL_OPTION,0);
   if(yn==JOptionPane.OK_OPTION){
       try{
       ps=con.prepareStatement("delete from teacher where email=?");
       ps.setString(1, mail);
       if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Teacher deleted successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   }
     
}

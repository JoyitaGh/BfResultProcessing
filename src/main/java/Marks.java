
import db.myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Marks {
     Connection con=myconnection.connect();
   PreparedStatement ps;
   
   public boolean getidsem(int id,int semester){
       try{
       ps=con.prepareStatement("select student_id,semester from course where student_id=? and semester = ?");
       ps.setInt(1, id);
       ps.setInt(2, semester);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
               teacherhome.jTextField2.setText(String.valueOf(rs.getInt(1)));
                teacherhome.jTextField4.setText(String.valueOf(rs.getInt(2)));
                return true;
           }else{
               JOptionPane.showMessageDialog(null, "Student id or semester number does not exists"); 
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   public boolean getidsemform2(int id,int semester){
       try{
       ps=con.prepareStatement("select student_id,semester from course where student_id=? and semester = ?");
       ps.setInt(1, id);
       ps.setInt(2, semester);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
               teacherhome.jTextField6.setText(String.valueOf(rs.getInt(1)));
                teacherhome.jTextField14.setText(String.valueOf(rs.getInt(2)));
                return true;
           }else{
               JOptionPane.showMessageDialog(null, "Student id or semester number does not exists"); 
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   public boolean getidsemlab(int id,int semester){
       try{
       ps=con.prepareStatement("select student_id,semester from course where student_id=? and semester = ?");
       ps.setInt(1, id);
       ps.setInt(2, semester);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
               teacherhome.jTextField18.setText(String.valueOf(rs.getInt(1)));
                teacherhome.jTextField24.setText(String.valueOf(rs.getInt(2)));
                return true;
           }else{
               JOptionPane.showMessageDialog(null, "Student id or semester number does not exists"); 
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   
    public boolean isidsemexist(int student_id,int sem){
       try{
           ps = con.prepareStatement("select * from marks where student_id = ? and semester = ?");
           ps.setInt(1, student_id);
           ps.setInt(2, sem);
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
    public boolean isidsemexistm2(int student_id,int sem){
       try{
           ps = con.prepareStatement("select * from marks2 where student_id = ? and semester = ?");
           ps.setInt(1, student_id);
           ps.setInt(2, sem);
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
    public boolean isidsemexistlab(int student_id,int sem){
       try{
           ps = con.prepareStatement("select * from lab where student_id = ? and semester = ?");
           ps.setInt(1, student_id);
           ps.setInt(2, sem);
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
     public void getmarksvalue(JTable table,String currentemail,String searchval){
       String sql = "SELECT * FROM marks m " +
             "INNER JOIN course_distribution cd ON m.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks WHERE m.course_code = marks.course_code) " +
             "AND m.student_id LIKE ? " +
             "ORDER BY m.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[11];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           row[10]=rs.getFloat(11);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarksvaluecourse(JTable table,String currentemail,String searchval){
       String sql = "SELECT * FROM marks m " +
             "INNER JOIN course_distribution cd ON m.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks WHERE m.course_code = marks.course_code) " +
             "AND m.course_code LIKE ? " +
             "ORDER BY m.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
        ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getlabmarksvalue(JTable table,String currentemail,String searchval){
       String sql = "SELECT * FROM lab l " +
             "INNER JOIN course_distribution cd ON l.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM lab WHERE l.course_code = lab.course_code) " +
             "AND l.student_id LIKE ? " +
             "ORDER BY l.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
        ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarkslabcourse(JTable table,String currentemail,String searchval){
       String sql = "SELECT * FROM lab l " +
             "INNER JOIN course_distribution cd ON l.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM lab WHERE l.course_code = lab.course_code) " +
             "AND l.course_code LIKE ? " +
             "ORDER BY l.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarks2value(JTable table,String currentemail,String searchval){
       String sql = "SELECT * FROM marks2 m2 " +
             "INNER JOIN course_distribution cd ON m2.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks2 WHERE m2.course_code = marks2.course_code) " +
             "AND m2.student_id LIKE ? " +
             "ORDER BY m2.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[9];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarks2valuecourse(JTable table,String currentemail,String searchval){
        String sql = "SELECT * FROM marks2 m2 " +
             "INNER JOIN course_distribution cd ON m2.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks2 WHERE m2.course_code = marks2.course_code) " +
             "AND m2.course_code LIKE ? " +
             "ORDER BY m2.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[9];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     
     
     public void getmarksvalue1(JTable table,String currentemail,String searchval1,String searchval2){
       String sql = "SELECT * FROM marks m " +
             "INNER JOIN course_distribution cd ON m.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks WHERE m.course_code = marks.course_code) " +
             "AND m.student_id LIKE ? " +
             "AND m.course_code LIKE ? " +
             "ORDER BY m.student_id ASC;";

       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval1+"%");
       ps.setString(3,"%"+searchval2+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarksvalue2(JTable table,String currentemail,String searchval1,String searchval2){
       String sql = "SELECT * FROM marks2 m2 " +
             "INNER JOIN course_distribution cd ON m2.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM marks2 WHERE m2.course_code = marks2.course_code) " +
              "AND m2.student_id LIKE ? " +
             "AND m2.course_code LIKE ? " +
             "ORDER BY m2.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval1+"%");
       ps.setString(3,"%"+searchval2+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[9];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     public void getmarksvalue3(JTable table,String currentemail,String searchval1,String searchval2){
        String sql = "SELECT * FROM lab l " +
             "INNER JOIN course_distribution cd ON l.course_code = cd.course_code " +
             "WHERE cd.teacher_email = ? " +
             "AND EXISTS (SELECT 1 FROM lab WHERE l.course_code = lab.course_code) " +
            "AND l.student_id LIKE ? " +
             "AND l.course_code LIKE ? " +
             "ORDER BY l.student_id ASC;";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ps.setString(2,"%"+searchval1+"%");
       ps.setString(3,"%"+searchval2+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
    public void insert(int student_id,int semester,String ccode,String cname,float mid1,float mid2,float ass,float q,float pres,
           float atten,float sum){
       String sql = "insert into marks values(?,?,?,?,?,?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
            ps.setInt(1, student_id);
             ps.setInt(2, semester);
              ps.setString(3, ccode);
               ps.setString(4, cname);
                ps.setFloat(5, mid1);
                ps.setFloat(6, mid2);
                 ps.setFloat(7, ass);
                 ps.setFloat(8, q);
                 ps.setFloat(9, pres);
                 ps.setFloat(10, atten);
                 ps.setFloat(11, sum);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Marks added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public void insertlab(int student_id,int semester,String ccode,String cname,float lt1,float lt2,float atten,float lr,
           float lqv,float sum){
       String sql = "insert into lab values(?,?,?,?,?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
            ps.setInt(1, student_id);
             ps.setInt(2, semester);
              ps.setString(3, ccode);
               ps.setString(4, cname);
                ps.setFloat(5, lt1);
                ps.setFloat(6, lt2);
                 ps.setFloat(7, atten);
                 ps.setFloat(8, lr);
                 ps.setFloat(9, lqv);
                 ps.setFloat(10, sum);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Marks added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public void insertm2(int student_id,int semester,String ccode,String cname,float mid1,float mid2,float atten,
           float ass,float sum){
       String sql = "insert into marks2 values(?,?,?,?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
            ps.setInt(1, student_id);
             ps.setInt(2, semester);
              ps.setString(3, ccode);
               ps.setString(4, cname);
                ps.setFloat(5, mid1);
                ps.setFloat(6, mid2);
                 ps.setFloat(7, atten);
                 ps.setFloat(8, ass);
                 ps.setFloat(9, sum);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Marks added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public void update(int student_id,int semester,String ccode,String cname,float mid1,float mid2,float ass,float q,float pres,
           float atten,float sum){
       String sql = "update marks set course_code=?,course_title=?,mid1=?,mid2=?,assignment=?,quiz=?,presentation=?,attendance=?,total=? where student_id=? and semester=?";
   try{
           ps = con.prepareStatement(sql);
          
              ps.setString(1, ccode);
               ps.setString(2, cname);
                ps.setFloat(3, mid1);
                ps.setFloat(4, mid2);
                 ps.setFloat(5, ass);
                 ps.setFloat(6, q);
                 ps.setFloat(7, pres);
                 ps.setFloat(8, atten);
                 ps.setFloat(9, sum);
                 ps.setInt(10, student_id);
             ps.setInt(11, semester);
              
                if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Updated successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    public void updatelab(int student_id,int semester,String ccode,String cname,float lt1,float lt2,float atten,float lr,
           float lqv,float sum){
       String sql = "update lab set course_code=?,course_title=?,labTest1=?,labTest2=?,attendance=?,labreport=?,labQviva=?,total=? where student_id=? and semester=?";
   try{
           ps = con.prepareStatement(sql);
          
              ps.setString(1, ccode);
               ps.setString(2, cname);
                ps.setFloat(3, lt1);
                ps.setFloat(4, lt2);
                 ps.setFloat(5, atten);
                 ps.setFloat(6, lr);
                 ps.setFloat(7, lqv);
                 ps.setFloat(8, sum);
                 ps.setInt(9, student_id);
             ps.setInt(10, semester);
              
                if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Updated successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
    }
    public void updatem2(int student_id,int semester,String ccode,String cname,float mid1,float mid2,
           float atten,float ass,float sum){
       String sql = "update marks2 set course_code=?,course_title=?,mid1=?,mid2=?,attendance=?,a_p_q=?,total=? where student_id=? and semester=?";
   try{
           ps = con.prepareStatement(sql);
          
              ps.setString(1, ccode);
               ps.setString(2, cname);
                ps.setFloat(3, mid1);
                ps.setFloat(4, mid2);
                 ps.setFloat(5, atten);
                  ps.setFloat(6, ass);
                 ps.setFloat(7, sum);
                 ps.setInt(8, student_id);
             ps.setInt(9, semester);
              
                if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Updated successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
   public void getmv(JTable table,String currentemail){
         String sql = "SELECT * FROM marks m INNER JOIN course_distribution cd ON m.course_code = cd.course_code WHERE cd.teacher_email =? AND EXISTS (SELECT 1 FROM marks WHERE m.course_code = marks.course_code);";

       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,currentemail);
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[10];
           row[0]=rs.getInt(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getString(3);
           row[3]=rs.getString(4);
           row[4]=rs.getFloat(5);
           row[5]=rs.getFloat(6);
           row[6]=rs.getFloat(7);
           row[7]=rs.getFloat(8);
           row[8]=rs.getFloat(9);
           row[9]=rs.getFloat(10);
           
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
     
      
    
}

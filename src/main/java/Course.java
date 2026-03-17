
import db.myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Course {
     Connection con=myconnection.connect();
   PreparedStatement ps;
   
   public String getsession(int id){
        String session=null;
       try{
       ps=con.prepareStatement("select session from student where student_id=?");
       
       ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
                session= rs.getString("session");
           }else{
               JOptionPane.showMessageDialog(null, "Student id does not exists"); 
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return session;
   }
   
   public boolean getid(String session,int id){
       try{
       ps=con.prepareStatement("select * from student where session=? and student_id=?");
       ps.setString(1,session);
       ps.setInt(2, id);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
               adminhome.jTextField9.setText(rs.getString(1));
                adminhome.jTextField10.setText(String.valueOf(rs.getInt(2)));
                return true;
           }else{
               JOptionPane.showMessageDialog(null, "Student id does not exists"); 
           }
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return false;
   }
   public int countsem(int id){
       int total=0;
       try{
       ps=con.prepareStatement("select count(*) as 'total' from course where student_id=?");
       ps.setInt(1, id);
       ResultSet rs= ps.executeQuery();
       while(rs.next()){
           total=rs.getInt(1);
       }
       if(total==8)
       {
           JOptionPane.showMessageDialog(null, "This student completed all course"); 
           return -1;
       }
        }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       return total;
   }
   
   public boolean issemesterexist(int id,int sem){
       try{
           ps = con.prepareStatement("select * from course where student_id = ? and semester=?");
           ps.setInt(1, id);
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
   
   public boolean iscourseexist(int id,String cc,String ccode){ 
       String sql="select * from course where student_id = ? and " + cc + " = ?";
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
            ps.setString(2, ccode);
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
   
    public void insert(String session,int student_id,int semester,String  c1_code,String  c1_name,String  c2_code,
           String  c2_name,String  c3_code,String  c3_name,String c4_code,String c4_name,String c5_code,String c5_name,String c6_code,
           String c6_name,String c7_code,String c7_name,String c8_code,String c8_name,String c9_code,String c9_name){
       String sql = "insert into course values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try{
           ps = con.prepareStatement(sql);
           ps.setString(1, session);
            ps.setInt(2, student_id);
             ps.setInt(3, semester);
             ps.setString(4, c1_code);
              ps.setString(5, c1_name);
               ps.setString(6, c2_code);
                ps.setString(7, c2_name);
                 ps.setString(8, c3_code);
                  ps.setString(9, c3_name);
                  ps.setString(10, c4_code);
                  ps.setString(11, c4_name);
                  ps.setString(12, c5_code);
                  ps.setString(13, c5_name);
                  ps.setString(14, c6_code);
                  ps.setString(15, c6_name);
                  ps.setString(16, c7_code);
                  ps.setString(17, c7_name);
                  ps.setString(18, c8_code);
                  ps.setString(19, c8_name);
                  ps.setString(20, c9_code);
                  ps.setString(21, c9_name);
              
                  if(ps.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null, "Course added successfully");
                  }
       }
       catch(SQLException ex)
       {
            ex.printStackTrace();
       }
   }
    
    public void getcoursevalue(JTable table,String searchval){
       String sql = "select session,student_id,semester,course1name,course2name,course3name,course4name,course5name,course6name,course7name,course8name,course9name from course where concat(session,student_id,semester)like ? order by student_id asc";
       try{
       ps = con.prepareStatement(sql);
       ps.setString(1,"%"+searchval+"%");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.setRowCount(0);
       Object[] row;
       while(rs.next()){
           row = new Object[12];
           row[0]=rs.getString(1);
           row[1]=rs.getInt(2);
           row[2]=rs.getInt(3);
           row[3]=rs.getString(4);
           row[4]=rs.getString(5);
           row[5]=rs.getString(6);
           row[6]=rs.getString(7);
           row[7]=rs.getString(8);
           row[8]=rs.getString(9);
           row[9]=rs.getString(10);
           row[10]=rs.getString(11);
           row[11]=rs.getString(12);
          
           model.addRow(row);
       }
       }
       
     catch(SQLException ex){
           ex.printStackTrace();
       }  
   }
    public void deletecoursecomb(String session,int student_id,int semester ){
       int yn= JOptionPane.showConfirmDialog(null, "Selected record will be deleted","Record delete",JOptionPane.OK_CANCEL_OPTION,0);
   if(yn==JOptionPane.OK_OPTION){
       try{
       ps=con.prepareStatement("delete from course where session=? and student_id=? and semester=?");
           ps.setString(1, session);
            ps.setInt(2, student_id);
             ps.setInt(3, semester);
             
              
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
    
}

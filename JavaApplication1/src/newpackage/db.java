package newpackage;


import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


 class db{
 public Connection connect;
              
 public Connection connection(){
     try {
         Class.forName("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
     }
         try {
             connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb","root","");
                     
                     //check
         } catch (SQLException ex) {
             Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
         }
 return connect;   
 }
 
 }

                         
                  
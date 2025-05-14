//
//package main;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import javax.swing.JOptionPane;
//
//public class Connect {
//
//  public static Connection connect(){
//       try{
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy?useSSL=false","root","");
//    if(con!=null)return con ;
//   }catch(Exception e){
//    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
//   }
//   return null ;
//}
//  }
//
//

  package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {

    public static Connection connect() {
        try {
            // Use the newer driver class name
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pharmacy?useSSL=false&serverTimezone=UTC",
                    "root",
                    "Rishu@sql"
            );


            System.out.println("✅ Connected to database successfully!");
            return con;

        } catch (Exception e) {
            e.printStackTrace(); // See full error trace
        }
        return null;
    }
}

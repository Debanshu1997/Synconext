
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DebanshuVENDORMajumd
 */
public class JDBC_Connection {
    
    Connection con=null;
    Statement stmt=null;
    ResultSet rs= null;
    
    public static void main(String args[]){
        
        
        
        
    
    }
    
    
    
    public void getConnection(){
    try{  
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/syncotextdb","root","");  
stmt=con.createStatement();  





 
}catch(Exception e){ System.out.println(e);}  
}
    
    
    
    public String[] getValues(int col) throws SQLException{
        
        String [] res;
        String store="";
        
        rs=stmt.executeQuery("select * from service_providers");
        
        
        int z=-1;
    while(rs.next()){
        z++;
          store+=rs.getString(col)+";";
    
    
            }

    res=store.split(";");
    
    
     
    z=0;
    return res;
    
    
    }
    
    
    public void closeConnection() throws SQLException{
    
    con.close();
    rs.close();
    stmt.close();
    
    }


}//Class
    
    
    


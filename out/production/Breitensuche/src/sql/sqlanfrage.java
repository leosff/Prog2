package sql;


import java.sql.*;

public class sqlanfrage {



public static void main (String[] args){

try {
    Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rispdb1","s937612","student");
    Statement statement = myCon.createStatement();
    ResultSet rs = statement.executeQuery("select * from Pferd");

    while(rs.next()){
        System.out.println(rs.getString("Pferdename"));
    }
}catch(Exception e){
    e.printStackTrace();
}
}
}


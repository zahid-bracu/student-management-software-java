import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection("jdbc:mysql://localhost/student_managment","root","");
            System.out.println("Connection Established");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    public static void main(String [] args){
        getConnection();
    }
}
package conexion;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import sun.util.logging.PlatformLogger;

public class Conexion {

    private String severname = "localhost";
    private String database = "ejemplo";
    private String url = "jdbc:mysql://localhost:3306/" + database;
    private String username = "root";
    private String password = "123";
    private Connection con = null;
    private Statement stm = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }    

    public void Conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            System.out.println("Conectando a la base...");
        } catch (Exception ex) {
            String ErrString = "error al conectar a la base de datos" + ex.getMessage();
            System.out.println(ErrString);

        }
    }
    
    public void Desconectar(){
        if(this.con != null){
            try{
                this.stm.close();
                this.con.close();
            }catch(SQLException ex){
                System.out.println("Error al desconectar");
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

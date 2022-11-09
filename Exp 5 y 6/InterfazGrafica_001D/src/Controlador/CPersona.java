package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CPersona {
    private Conexion conexion = new Conexion();
    public boolean agregar(Persona persona)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "INSERT INTO PERSONA (rut, nombre, apellido, direccion) values(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, persona.getRut());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellido());
            stmt.setString(4, persona.getDireccion());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

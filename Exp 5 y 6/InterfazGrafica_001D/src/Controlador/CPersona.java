package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public Persona buscarPorRut(String rut)
    {
        try {
            Persona persona = new Persona();
            Connection cnx = conexion.obtenerConexion();
            String sql = "SELECT * FROM PERSONA WHERE RUT = ?";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, rut);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next())
            {
                persona.setRut(rs.getString("rut"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDireccion(rs.getString("direccion"));
                return persona;
            }
            else
                return null;
            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean modificar(Persona persona)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "UPDATE PERSONA SET nombre = ?, apellido = ?, direccion=? WHERE RUT = ?";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getDireccion());
            stmt.setString(4, persona.getRut());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminar(String rut)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "DELETE FROM PERSONA WHERE RUT = ?";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, rut);
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 


    public ArrayList<Persona> buscarTodos()
    {
        ArrayList<Persona> listado = new ArrayList<Persona>();
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "SELECT * FROM PERSONA";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            // stmt.setString(1, rut); // aplicar si es que se requiere filtrar
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Persona persona = new Persona();
                persona.setRut(rs.getString("rut"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDireccion(rs.getString("direccion"));
                listado.add(persona);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
}

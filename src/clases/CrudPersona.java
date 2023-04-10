package clases;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CrudPersona {

    private Persona dtoPersona;

    public Persona getDtoPersona() {
        return dtoPersona;
    }

    public void setDtoPersona(Persona dtoPersona) {
        this.dtoPersona = dtoPersona;
    }

    public String guardarNuevo(Persona dtoPersona) {
        this.setDtoPersona(dtoPersona);
        String mensaje = "";
        try {
            Conexion cn = new Conexion();
            String sentencia = "Insert into persona (idpersona, nombres, apellidos, cedula, direccion, telefono) values(?,?,?,?,?,?)";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, this.dtoPersona.getId());
            pst.setString(2, this.dtoPersona.getNombres());
            pst.setString(3, this.dtoPersona.getApellidos());
            pst.setInt(4, this.dtoPersona.getCedula());
            pst.setString(5, this.dtoPersona.getDireccion());
            pst.setInt(6, this.dtoPersona.getTelefono());
            pst.execute();
            mensaje = "registro guardado...";
        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public ArrayList<Persona> getLista() {
        ArrayList<Persona> listado = new ArrayList<Persona>();
        try{
            Conexion cn = new Conexion();
            String sentencia = "Select * from persona";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Persona dto = new Persona(rs.getInt("idpersona"), rs.getString("nombres"), rs.getString("apellidos"),rs.getInt("cedula"),
                rs.getString("direccion"),rs.getInt("telefono"));
                listado.add(dto);
            }
            cn.Desconectar();
        }catch(Exception ex){
            System.out.println("No se pudo consultar...");
        }
        return listado;
    }

    public Persona Buscarxid(int id) {
        Persona dto = new Persona();

        try {
            Conexion cn = new Conexion();
            String sentencia = "Select * from persona where idpersona = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                dto.setId(rs.getInt("idpersona"));
                dto.setNombres(rs.getString("nombres"));
                dto.setApellidos(rs.getString("apellidos"));
                dto.setCedula(rs.getInt("cedula"));
                dto.setDireccion(rs.getString("direccion"));
                dto.setTelefono(rs.getInt("telefono"));
            }
            cn.Desconectar();
        } catch (Exception ex) {
            System.out.println("No se pudo consultar...");
        }
        return dto;
    }
    
    public String Actualizar(Persona dtoPersona) {
        this.setDtoPersona(dtoPersona);
        String mensaje = "";

        try {
            Conexion cn = new Conexion();
            String sentencia = "Update persona set nombres = ?, apellidos = ?, cedula = ?, direccion = ?, telefono = ? where idpersona = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);

            pst.setString(1, this.dtoPersona.getNombres());
            pst.setString(2, this.dtoPersona.getApellidos());
            pst.setInt(3, this.dtoPersona.getCedula());
            pst.setString(4, this.dtoPersona.getDireccion());
            pst.setInt(5, this.dtoPersona.getTelefono());
            pst.setInt(6, this.dtoPersona.getId());

            pst.execute();
            mensaje = "registro actualizado...";
            cn.Desconectar();

        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }
    
    public String Eliminarxcodigo(int id) {
        String mensaje;

        try {
            Conexion cn = new Conexion();
            String sentencia = "Delete from persona where idpersona = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, id);
            pst.execute();
            cn.Desconectar();
            mensaje = "Registro eliminado...";

        } catch (Exception ex) {
            mensaje = "No se pudo eliminar...";
        }
        return mensaje;
    }

}

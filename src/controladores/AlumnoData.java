package controladores;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;

/**
 *
 * @author Grupo2
 */
public class AlumnoData {

    private Connection connection;

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public AlumnoData() {
        try {
            connection = Conexion.getConexion();
        } catch (SQLException ex) {
            mensaje("Error al obtener la conexion en PatologiaData. Error: " + ex.getMessage());
        } catch (ClassNotFoundException cnf) {
            mensaje("Error al cargar los drivers.");
        }
    }

    public void Alta(Alumno alumno) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mensaje("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " ha sido guardada correctamente en la BD.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            mensaje("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " no ha sido guardada correctamente en la BD.");
        }
    }

    public ArrayList<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> lista = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement("SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno")) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    /*int idAlumno = rs.getInt("idAlumno");
                    String dni = rs.getString("dni");
                    String apellido = rs.getString("apellido");
                    String nombre = rs.getString("nombre");
                    LocalDate fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                    boolean estado = rs.getBoolean("estado");*/
                    lista.add(new Alumno(rs.getInt("idAlumno"), rs.getString("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado")));
                }
            } catch (SQLException ex) {
                mensaje("Error al obtener la lista de las patologias en la BD: " + ex.getMessage());
            }
        } catch (SQLException ex) {
            mensaje("Error al obtener la lista de las patologias en la BD: " + ex.getMessage());
        }
        //Collections.sort(lista);
        return lista;
    }
    
    public Alumno buscarAlumno(int id){
        String sql="SELECT dni, apellido, nombre, fechaNacimiento"
                + "FROM alumno WHERE id=? AND estado=1";
        Alumno alumno=null;
        try {
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getString("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                 //alumno.setEstado(true);
                alumno.setEstado(rs.getBoolean("estado"));
            }else{
                 JOptionPane.showMessageDialog(null, "no existe ese alumno");
             }
             ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
        return alumno;
    }
}

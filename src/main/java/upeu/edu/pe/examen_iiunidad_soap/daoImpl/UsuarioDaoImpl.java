/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.edu.pe.examen_iiunidad_soap.config.Conexion;
import upeu.edu.pe.examen_iiunidad_soap.dao.UsuarioDao;
import upeu.edu.pe.examen_iiunidad_soap.model.Usuario;
       
/**
 *
 * @author ziro
 */
public class UsuarioDaoImpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Usuario user) {
        String sql = "select fc_create_usuario(?, ?, ?, ?)";
        int x = 0;
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getIdpersona());
            ps.setInt(4, user.getIdrol());
            x = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Usuario user) {
        int x = 0;
        String sql = "select fc_update_usuario(?, ?, ?, ?)";
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getIdrol());
            ps.setInt(4, user.getIdusuario());
            x = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        int x = 0;
        String sql = "select fc_delete_usuario(?)";
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Usuario read(String username) {
        Usuario usr = new Usuario();
        String sql = "select * from usuarios where username = ?";
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            while(rs.next()){
                usr.setIdusuario(rs.getInt("idusuario"));
                usr.setUsername(rs.getString("username"));
                usr.setPassword(rs.getString("password"));
                usr.setIdpersona(rs.getInt("idpersona"));
                usr.setIdrol(rs.getInt("idrol"));
                usr.setEstado(rs.getBoolean("estado"));
                usr.setFechacreacion(rs.getString("fechacreacion"));
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return usr;
    }

    @Override
    public List<Usuario> readAll() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "select * from usuarios";
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario usr = new Usuario();
                usr.setIdusuario(rs.getInt("idusuario"));
                usr.setUsername(rs.getString("username"));
                usr.setPassword(rs.getString("password"));
                usr.setIdpersona(rs.getInt("idpersona"));
                usr.setIdrol(rs.getInt("idrol"));
                usr.setEstado(rs.getBoolean("estado"));
                lista.add(usr);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}

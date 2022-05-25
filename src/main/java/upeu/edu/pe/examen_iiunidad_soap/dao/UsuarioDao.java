/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.dao;

import java.util.List;
import upeu.edu.pe.examen_iiunidad_soap.model.Usuario;

/**
 *
 * @author ziro
 */
public interface UsuarioDao {
    int create(Usuario user);
    int update(Usuario user);
    int delete(int id);
    Usuario read(String username);
    List<Usuario> readAll();
}

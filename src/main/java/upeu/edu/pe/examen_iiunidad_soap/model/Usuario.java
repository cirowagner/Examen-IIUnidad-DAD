/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ziro
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private int idpersona;
    private int idrol;
    private String fechacreacion;
    private boolean estado;
}

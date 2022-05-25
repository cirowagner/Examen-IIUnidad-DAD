/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.test;
import com.google.gson.Gson;
import upeu.edu.pe.examen_iiunidad_soap.config.Conexion;
import upeu.edu.pe.examen_iiunidad_soap.dao.UsuarioDao;
import upeu.edu.pe.examen_iiunidad_soap.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author ziro
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static Gson gson = new Gson();
    static UsuarioDao u = new UsuarioDaoImpl();
    
    public static void main(String[] args) {
        if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
        System.out.println(gson.toJson(u.readAll()));
    }
    
}

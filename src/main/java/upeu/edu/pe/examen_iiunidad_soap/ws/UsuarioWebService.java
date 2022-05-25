/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package upeu.edu.pe.examen_iiunidad_soap.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import upeu.edu.pe.examen_iiunidad_soap.model.Usuario;
import upeu.edu.pe.examen_iiunidad_soap.dao.UsuarioDao;
import upeu.edu.pe.examen_iiunidad_soap.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author ziro
 */
@WebService(serviceName = "UsuarioWebService")
public class UsuarioWebService {
    static UsuarioDao usrDao = new UsuarioDaoImpl();
    
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "idpersona") int idpersona, @WebParam(name = "idrol") int idrol, @WebParam(name = "fechacreacion") String fechacreacion, @WebParam(name = "estado") boolean estado) {
        //TODO write your implementation code here:
        return usrDao.create(new Usuario(0, username, password, idpersona, idrol, fechacreacion, estado));
    }
    
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "idpersona") int idpersona, @WebParam(name = "idrol") int idrol, @WebParam(name = "fechacreacion") String fechacreacion, @WebParam(name = "estado") boolean estado) {
        //TODO write your implementation code here:
        return usrDao.update(new Usuario(idusuario, username, password, idpersona, idrol, fechacreacion, estado));
    }
    
    
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return usrDao.delete(id);
    }

    @WebMethod(operationName = "read")
    public Usuario read(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        return usrDao.read(username);
    }

    @WebMethod(operationName = "readAll")
    public List<Usuario> readAll() {
        //TODO write your implementation code here:
        return usrDao.readAll();
    }
}

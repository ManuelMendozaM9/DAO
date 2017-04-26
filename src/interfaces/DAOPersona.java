/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import principal.Persona;

/**
 *
 * @author Manuel
 */
public interface DAOPersona {
    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public List<Persona> listar() throws Exception;
}

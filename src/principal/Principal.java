/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.DAOPersonaImpl;
import interfaces.DAOPersona;

/**
 *
 * @author Manuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per = new Persona();
        /*
        //Registrar
         per.setNombre("Rodrigo");
         
         try{
             DAOPersona dao = new DAOPersonaImpl();
             dao.registrar(per);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
        
        //Modificar
        per.setNombre("jesus");
        per.setId(4);
         
         try{
             DAOPersona dao = new DAOPersonaImpl();
             dao.modificar(per);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
        
        //Eliminar
        per.setId(6);
         
         try{
             DAOPersona dao = new DAOPersonaImpl();
             dao.eliminar(per);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
                */
        //Listar
               
         try{
             DAOPersona dao = new DAOPersonaImpl();
             for(Persona p : dao.listar()){
                 System.out.println(p.getNombre());
             }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
    }
}
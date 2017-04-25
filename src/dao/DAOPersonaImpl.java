/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.Conexion;
import interfaces.DAOPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import principal.Persona;

/**
 *
 * @author Manuel
 */
public class DAOPersonaImpl extends Conexion implements DAOPersona {

    @Override
    public void registrar(Persona per) throws Exception {
        try{
            this.conctar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO persona(nombre) VALUES(?)");
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Persona per) throws Exception {
        try{
            this.conctar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE persona set nombre where id = ?");
            st.setString(1, per.getNombre());
            st.setInt(2, per.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        try{
            this.conctar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE from persona where id = ?");
            st.setInt(1, per.getId());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> lista = null;
        try{
            this.conctar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * from persona");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.mapper.impl;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.mapper.UsuarioMapper;

/**
 *
 * @author Java-LM
 */
@Component
public class UsuarioMapperDefaultImpl implements UsuarioMapper{

    @Override
    public UsuarioDto map(Usuario object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario map(UsuarioDto object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}

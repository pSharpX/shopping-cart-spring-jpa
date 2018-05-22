/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.mapper.impl;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.dto.CategoriaDto;
import pe.edu.cibertec.mapper.CategoriaMapper;

/**
 *
 * @author Java-LM
 */
@Component
public class CategoriaMapperDefaultImpl implements CategoriaMapper {

    @Override
    public CategoriaDto map(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria map(CategoriaDto object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

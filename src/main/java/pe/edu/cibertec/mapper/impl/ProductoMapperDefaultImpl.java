/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.mapper.impl;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dto.ProductoDto;
import pe.edu.cibertec.mapper.ProductoMapper;

/**
 *
 * @author Java-LM
 */
@Component
public class ProductoMapperDefaultImpl implements ProductoMapper {

    @Override
    public ProductoDto map(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto map(ProductoDto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.mapper.DetalleCarritoMapper;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;

/**
 *
 * @author Java-LM
 */
@Service
@Transactional
public class DetalleCarritoServicioImpl {
    
    @Autowired
    private DetalleCarritoRepositorio detalleCarritoRepositorio;    
    @Autowired
    private DetalleCarritoMapper detalleCarritoMapper;
    
}

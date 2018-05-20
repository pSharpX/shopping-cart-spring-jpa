package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.repositorio.CategoriaRepositorio;

@Repository
public class CategoriaJpaRepositorioImpl implements CategoriaRepositorio {

	@PersistenceContext
	private EntityManager em;

	private static final String SELECT_CATEGORIAS = "SELECT c FROM Categoria c";

	@Override
	public Categoria buscar(Long id) {
		// TODO Auto-generated method stub
		return this.em.find(Categoria.class, id);
	}

	@Override
	public List<Categoria> obtenerTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Categoria> query = this.em.createQuery(SELECT_CATEGORIAS, Categoria.class);
        return query.getResultList();
	}

}

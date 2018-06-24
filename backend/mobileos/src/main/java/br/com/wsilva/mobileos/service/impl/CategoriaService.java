package br.com.wsilva.mobileos.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wsilva.mobileos.entity.CategoriaEntity;
import br.com.wsilva.mobileos.repository.CategoriaRepository;
import br.com.wsilva.mobileos.service.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService {

	private CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	public CategoriaEntity save(CategoriaEntity entity) {
		return categoriaRepository.save(entity);
	}

	public Optional<CategoriaEntity> findById(Integer id) {
		return categoriaRepository.findById(id);
	}

	public boolean existsById(Integer id) {
		return categoriaRepository.existsById(id);
	}

	public Iterable<CategoriaEntity> findAll() {
		return categoriaRepository.findAll();
	}

	public void deleteById(Integer id) {
		categoriaRepository.deleteById(id);
	}

	public void delete(CategoriaEntity entity) {
		categoriaRepository.delete(entity);
	}

	public void deleteAll() {
		categoriaRepository.deleteAll();
	}
}

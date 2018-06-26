package br.com.wsilva.mobileos.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wsilva.mobileos.entity.AreaTipoEntity;
import br.com.wsilva.mobileos.repository.AreaTipoRepository;
import br.com.wsilva.mobileos.service.IAreaTipoService;

@Service
public class AreaTipoService implements IAreaTipoService {
	
	private AreaTipoRepository repository;
	
	@Autowired
	public AreaTipoService(AreaTipoRepository repository) {
		this.repository = repository;
	}
	
	public AreaTipoEntity save(AreaTipoEntity entity) {
		return repository.save(entity);
	}

	public Optional<AreaTipoEntity> findById(Integer id) {
		return repository.findById(id);
	}

	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	public Iterable<AreaTipoEntity> findAll() {
		return repository.findAll();
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	public void delete(AreaTipoEntity entity) {
		repository.delete(entity);
	}

	public void deleteAll() {
		repository.deleteAll();
	}
}

package br.com.wsilva.mobileos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.wsilva.mobileos.entity.CategoriaEntity;

@Repository
public interface CategoriaRepository extends CrudRepository<CategoriaEntity, Integer>{

}

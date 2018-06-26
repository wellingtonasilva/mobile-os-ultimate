package br.com.wsilva.mobileos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.wsilva.mobileos.entity.AreaTipoEntity;

@Repository
public interface AreaTipoRepository extends CrudRepository<AreaTipoEntity, Integer> {

}

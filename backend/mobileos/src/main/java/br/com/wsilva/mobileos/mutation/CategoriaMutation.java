package br.com.wsilva.mobileos.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.wsilva.mobileos.entity.CategoriaEntity;
import br.com.wsilva.mobileos.service.ICategoriaService;

@Component
public class CategoriaMutation implements GraphQLMutationResolver {

	private ICategoriaService service;
	
	public CategoriaMutation(ICategoriaService service) {
		this.service = service;
	}
	
	public CategoriaEntity saveCategoria(CategoriaEntity entity) {
		return service.save(entity);
	}
}

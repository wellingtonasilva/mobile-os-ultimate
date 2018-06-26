package br.com.wsilva.mobileos.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.wsilva.mobileos.entity.AreaTipoEntity;
import br.com.wsilva.mobileos.service.IAreaTipoService;

@Component
public class AreaTipoMutation implements GraphQLMutationResolver {

	private IAreaTipoService service;
	
	@Autowired
	public AreaTipoMutation(IAreaTipoService service) {
		this.service = service;
	}
	
	public AreaTipoEntity saveAreatipo(AreaTipoEntity entity) {
		return service.save(entity);
	}
}

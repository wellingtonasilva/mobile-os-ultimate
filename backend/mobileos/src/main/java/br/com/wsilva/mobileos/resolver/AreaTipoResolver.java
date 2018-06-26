package br.com.wsilva.mobileos.resolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import br.com.wsilva.mobileos.entity.AreaTipoEntity;
import br.com.wsilva.mobileos.service.IAreaTipoService;

@Component
public class AreaTipoResolver implements GraphQLQueryResolver {

	private IAreaTipoService service;
	
	@Autowired
	public AreaTipoResolver(IAreaTipoService service) {
		this.service = service;
	}
	
	public List<AreaTipoEntity> listAllAreaTipo() {
		Iterator<AreaTipoEntity> it = service.findAll().iterator();
		if (it != null) {
			List<AreaTipoEntity> list = new ArrayList<>();
			while (it.hasNext())
				list.add(it.next());
			return list;
		}

		return new ArrayList<>(0);
	}
	
	public AreaTipoEntity getAreaTipo(Integer id) {
		return service.findById(id).get();
	}
}

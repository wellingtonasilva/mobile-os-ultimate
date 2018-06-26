package br.com.wsilva.mobileos.resolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import br.com.wsilva.mobileos.entity.CategoriaEntity;
import br.com.wsilva.mobileos.service.ICategoriaService;

@Component
public class CategoriaResolver implements GraphQLQueryResolver {
	
	private ICategoriaService categoriaService;
	
	@Autowired
	public CategoriaResolver(ICategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	public List<CategoriaEntity> categorias() {
		Iterator<CategoriaEntity> it = categoriaService.findAll().iterator();
		if (it != null) {
			List<CategoriaEntity> list = new ArrayList<>();
			while (it.hasNext())
				list.add(it.next());
			return list;
		}

		return new ArrayList<>(0);
	}
	
	public CategoriaEntity categoria(Integer id) {
		return categoriaService.findById(id).get();
	}
}

package br.com.wsilva.mobileos.controller.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.wsilva.mobileos.controller.ICategoriaController;
import br.com.wsilva.mobileos.entity.CategoriaEntity;
import br.com.wsilva.mobileos.service.ICategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController implements ICategoriaController {

	private ICategoriaService categoriaService;

	@Autowired
	public CategoriaController(ICategoriaService categoriaService) throws IOException {
		this.categoriaService = categoriaService;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public CategoriaEntity obterPorId(@PathVariable(value = "id") Integer id) {
		return categoriaService.findById(id).get();
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<CategoriaEntity> listar() {
		Iterator<CategoriaEntity> it = categoriaService.findAll().iterator();
		if (it != null) {
			List<CategoriaEntity> list = new ArrayList<>();
			while (it.hasNext())
				list.add(it.next());
			return list;
		}

		return new ArrayList<>(0);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public CategoriaEntity inserir(@RequestBody CategoriaEntity entity) {
		return categoriaService.save(entity);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public boolean atualizar(@RequestBody CategoriaEntity entity) {
		try {
			categoriaService.save(entity);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean excluir(@PathVariable(value = "id") Integer id) {
		try {
			categoriaService.deleteById(id);
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
